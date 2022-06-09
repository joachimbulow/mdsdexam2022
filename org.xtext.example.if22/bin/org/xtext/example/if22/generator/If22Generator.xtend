/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.if22.if22.Program
import org.xtext.example.if22.if22.Scenario
import org.xtext.example.if22.if22.TypeBoolean
import org.xtext.example.if22.if22.TypeText
import org.xtext.example.if22.if22.TypeNumber
import org.xtext.example.if22.if22.VariableDeclaration
import org.xtext.example.if22.if22.Announcement
import org.xtext.example.if22.if22.End
import org.xtext.example.if22.if22.Question
import org.xtext.example.if22.if22.Type
import java.util.List
import org.xtext.example.if22.if22.Statement
import org.xtext.example.if22.if22.Target
import org.xtext.example.if22.if22.Expression
import org.xtext.example.if22.if22.Logic
import org.xtext.example.if22.if22.Function
import org.xtext.example.if22.if22.ExternalFunctionCall

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class If22Generator extends AbstractGenerator {

	public static String currentVariableName = "";

	static String PACKAGE_PATH = 'interactive_fiction_test/';
	static String PACKAGE_PATH_NO_SLASH = PACKAGE_PATH.substring(0, PACKAGE_PATH.length() - 1);

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val program = resource.allContents.filter(Program).next

		compileGameFile(fsa, program.name, program.scenarios.get(0).name)
		compileCommonPackage(fsa);
		compileExternalFile(fsa, program.name);

		for (Scenario s : program.scenarios) {
			s.compileScenario(fsa, program.name)
		}

	}

	// Initial setup ------------------------------------------------------
	def static compileGameFile(IFileSystemAccess2 fsa, String storyName, String firstScenarioName) {
		var compilation = '''
			package «PACKAGE_PATH_NO_SLASH».«storyName»;
			
			import java.io.IOException;
			import «PACKAGE_PATH_NO_SLASH».common.*;
			
			public class Game{
				public Scenario start;
				
				// TODO ADD OPTIONAL EXTERNAL
				public Game(){
					this.start = new Scenario«firstScenarioName.toFirstUpper»();
				}
				
				public void play()  throws IOException {
					start.interact();
				}
			}
			
		'''
		fsa.generateFile(PACKAGE_PATH + storyName + "/Game.java", compilation);
	}

	def static compileCommonPackage(IFileSystemAccess2 fsa) {
		var compilation = '''
			package «PACKAGE_PATH_NO_SLASH».common;
			
			import java.io.BufferedReader;
			import java.io.InputStreamReader;
			import java.io.IOException;
			
			public abstract class Scenario {
				protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				protected String nextInteraction;
				protected String calledScenarioEnd;
				
				public abstract String interact() throws IOException ;
				
				public static void changeInput(InputStreamReader streamReader) {
					br = new BufferedReader(streamReader);
				}
			}
			
		'''
		fsa.generateFile(PACKAGE_PATH + "/common/Scenario.java", compilation);
	}

	def static compileExternalFile(IFileSystemAccess2 fsa, String storyName) {
		var compilation = '''
			package interactive_fiction.external_help;
			
			public interface External {
				public boolean isEven(int param0);
				public boolean isFavorite(String param1);
				public int textLength(String param2);
			}
		'''
		fsa.generateFile(PACKAGE_PATH + storyName + "/External.java", compilation);
	}

	// Actual compilation code ------------------------------------------------------
	// Scenario
	def static compileScenario(Scenario scenario, IFileSystemAccess2 fsa, String storyname) {
		var compilation = '''
			package «PACKAGE_PATH_NO_SLASH».«storyname»;
			
			import java.io.IOException;
			import «PACKAGE_PATH_NO_SLASH».common.*;
			
			class Scenario«scenario.name.toFirstUpper» extends Scenario {
				«FOR variableDeclaration : scenario.variableDeclarations»
					«variableDeclaration.compileVariableDeclaration»
				«ENDFOR»
				
				«compileImplicitVariables(scenario.statements)»
				
				«compileExternalFunctionSetup()»
				
				public String interact() throws IOException {
					nextInteraction = "Start";
					while(true){
						switch(nextInteraction){
							«FOR statement : scenario.statements»
								«statement.compileStatement»
							«ENDFOR»
						}
					}
				}
			}
			
		'''
		fsa.generateFile(PACKAGE_PATH + storyname + "/Scenario" + scenario.name.toFirstUpper + ".java", compilation);
	}

	// Variable declaration
	def static compileVariableDeclaration(VariableDeclaration variable) {
		var type = variable.type;
		switch type {
			TypeBoolean: "boolean " + variable.name + ";"
			TypeText: "String " + variable.name + ";"
			TypeNumber: "int " + variable.name + ";"
		}
	}

	// Implicit variables for user input
	def static compileImplicitVariables(List<Statement> statements) {
		var r = ""
		for (q : statements.filter[statement|statement instanceof Question]) {
			// Examples don't bother checking for this, but I do! >:)
			if ((q as Question).reffedVar == null) {
				r += ExpResolverUtil.getTypeStringFromExp((q as Question).QType) + " _" + q.name + ";\n"
			}
		}
		return r;
	}

	// External function setup
	def static compileExternalFunctionSetup() {
		'''
			External external;
			
			ScenarioExternalHelp(External external) {
				this.external = external;
			}
		'''
	}

	// --- Compiling statements using dispatch ---
	// Announcement	TODO: COMPILE WITH SUBSTITUTING AMPERSAND
	def static dispatch String compileStatement(Announcement announcement) {
		'''
			case "«announcement.name»":
				System.out.println(«ExpResolverUtil.compileExp(announcement.exp)»);
				«FOR t : announcement.targets»
					«t.compileTargetWithConditional(t.targetCheck, "_" + announcement.name)»
				«ENDFOR»
		'''
	}

	// Question
	def static dispatch String compileStatement(Question question) {
		currentVariableName = question.reffedVar === null ? "_" + question.name : question.reffedVar.name;
		'''
			case "«question.name»":
				System.out.println(«ExpResolverUtil.compileExp(question.QString)»);
				try {
					«currentVariableName» = «ExpResolverUtil.getInputStringFromExp(question.QType)»
					«IF question.QType instanceof Logic || question.QType instanceof ExternalFunctionCall»
					if («compileInputValidationWithVariableName(question.QType, currentVariableName)») {
						break;
					}
					«ENDIF»
					
					«FOR t : question.targets»
						«t.compileTargetWithConditional(t.targetCheck, "_" + question.name)»
					«ENDFOR»
				} catch (Exception ex) {
					break;
				}
		'''
	}

	// End statement
	def static dispatch String compileStatement(End endStatement) {
		'''
			case "«endStatement.name»":
				System.out.println(«ExpResolverUtil.compileExp(endStatement.exp)»);
				return "«endStatement.name»";
		'''

	}

	// --- END Dispatch statement compilation ---
	// Targets with conditionals
	def static compileTargetWithConditional(Target target, Expression targetCheck, String thisReference) {
		var r = "";
		if (targetCheck !== null) {
			r = '''
				if («ExpResolverUtil.compileExp(targetCheck)») {
					nextInteraction = "«target.name»";
					break;
				}
			'''
		} else {
			r = '''
				nextInteraction = "«target.name»";
				break;
			'''
		}
		// Change an occurrence of "this" with the implicit variable name
		r = r.replaceAll("this", thisReference);
		return r;
	}

	// Custom logic compilation for input validation
	def static compileInputValidationWithVariableName(Expression validation, String variableName) {
		if (validation instanceof Logic) {
			return '''!(«variableName» «validation.operator» «ExpResolverUtil.compileExp(validation.right)»)'''
		}
		if (validation instanceof ExternalFunctionCall){
			return '''!(«ExpResolverUtil.compileExp(validation)»)'''
		}
	}

// Question conditional break check
}

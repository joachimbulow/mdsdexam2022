/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.if22.if22.Program;
import org.xtext.example.if22.if22.Scenario;
import org.xtext.example.if22.if22.Type;
import org.xtext.example.if22.if22.TypeBoolean;
import org.xtext.example.if22.if22.TypeNumber;
import org.xtext.example.if22.if22.TypeText;
import org.xtext.example.if22.if22.VariableDeclaration;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class If22Generator extends AbstractGenerator {
  private static String PACKAGE_PATH = "interactive_fiction_test/";
  
  private static String PACKAGE_PATH_NO_SLASH = If22Generator.PACKAGE_PATH.substring(0, (If22Generator.PACKAGE_PATH.length() - 1));
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    If22Generator.compileGameFile(fsa, program.getName(), program.getScenarios().get(0).getName());
    If22Generator.compileCommonPackage(fsa);
    EList<Scenario> _scenarios = program.getScenarios();
    for (final Scenario s : _scenarios) {
      If22Generator.compileScenario(s, fsa, program.getName());
    }
  }
  
  public static void compileGameFile(final IFileSystemAccess2 fsa, final String storyName, final String firstScenarioName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(If22Generator.PACKAGE_PATH_NO_SLASH);
    _builder.append(".");
    _builder.append(storyName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import ");
    _builder.append(If22Generator.PACKAGE_PATH_NO_SLASH);
    _builder.append(".common.*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Game{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Scenario start;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO ADD OPTIONAL EXTERNAL");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Game(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.start = new Scenario");
    String _firstUpper = StringExtensions.toFirstUpper(firstScenarioName);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void play()  throws IOException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("start.interact();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String compilation = _builder.toString();
    fsa.generateFile(((If22Generator.PACKAGE_PATH + storyName) + "/Game.java"), compilation);
  }
  
  public static void compileCommonPackage(final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(If22Generator.PACKAGE_PATH_NO_SLASH);
    _builder.append(".common;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.BufferedReader;");
    _builder.newLine();
    _builder.append("import java.io.InputStreamReader;");
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Scenario {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String nextInteraction;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected String calledScenarioEnd;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract String interact() throws IOException ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void changeInput(InputStreamReader streamReader) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("br = new BufferedReader(streamReader);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String compilation = _builder.toString();
    fsa.generateFile((If22Generator.PACKAGE_PATH + "/common/Scenario.java"), compilation);
  }
  
  public static void compileScenario(final Scenario scenario, final IFileSystemAccess2 fsa, final String storyname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package interactive_fiction.validate_input;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import interactive_fiction.common.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ScenarioValidation extends Scenario {");
    _builder.newLine();
    {
      EList<VariableDeclaration> _variableDeclarations = scenario.getVariableDeclarations();
      for(final VariableDeclaration variableDeclaration : _variableDeclarations) {
        _builder.append("\t");
        String _compileVariableDeclaration = If22Generator.compileVariableDeclaration(variableDeclaration);
        _builder.append(_compileVariableDeclaration, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String interact() throws IOException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("nextInteraction = \"Start\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(true){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("switch(nextInteraction){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case \"Start\":");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.out.println(\"Hi again! This is going to be a short game, as I am just testing something out\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("nextInteraction = \"Promise\";");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case \"Promise\":");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.out.println(\"I promise this will be worthy for a future game\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("nextInteraction = \"AskNumber\";");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case \"AskNumber\":");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.out.println(\"What was your favorite number?\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("__AskNumber = Integer.parseInt(br.readLine());");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("if(!(__AskNumber > 0)){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("nextInteraction = \"End\";");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("} catch (Exception ex) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("case \"End\":");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("System.out.println(\"I am sorry if you like negative numbers more, but positive numbers are going to give us a much better experience\");");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("return \"End\";");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    String compilation = _builder.toString();
    String _firstUpper = StringExtensions.toFirstUpper(scenario.getName());
    String _plus = (((If22Generator.PACKAGE_PATH + storyname) + "/Scenario") + _firstUpper);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, compilation);
  }
  
  public static String compileVariableDeclaration(final VariableDeclaration variable) {
    String _xblockexpression = null;
    {
      Type type = variable.getType();
      String _switchResult = null;
      boolean _matched = false;
      if (type instanceof TypeBoolean) {
        _matched=true;
        String _name = variable.getName();
        String _plus = ("boolean " + _name);
        _switchResult = (_plus + ";");
      }
      if (!_matched) {
        if (type instanceof TypeText) {
          _matched=true;
          String _name = variable.getName();
          String _plus = ("String " + _name);
          _switchResult = (_plus + ";");
        }
      }
      if (!_matched) {
        if (type instanceof TypeNumber) {
          _matched=true;
          String _name = variable.getName();
          String _plus = ("Int " + _name);
          _switchResult = (_plus + ";");
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}

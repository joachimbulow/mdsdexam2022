/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.if22.if22.Announcement;
import org.xtext.example.if22.if22.End;
import org.xtext.example.if22.if22.EndingTarget;
import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.ExternalFunctionCall;
import org.xtext.example.if22.if22.Logic;
import org.xtext.example.if22.if22.Program;
import org.xtext.example.if22.if22.Question;
import org.xtext.example.if22.if22.Scenario;
import org.xtext.example.if22.if22.Statement;
import org.xtext.example.if22.if22.Target;
import org.xtext.example.if22.if22.TargetDestination;
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
  public static String currentVariableName = "";
  
  private static String PACKAGE_PATH = "interactive_fiction_test/";
  
  private static String PACKAGE_PATH_NO_SLASH = If22Generator.PACKAGE_PATH.substring(0, (If22Generator.PACKAGE_PATH.length() - 1));
  
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    If22Generator.compileGameFile(fsa, program.getName(), program.getScenarios().get(0).getName());
    If22Generator.compileCommonPackage(fsa);
    If22Generator.compileExternalFile(fsa, program.getName());
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
  
  public static void compileExternalFile(final IFileSystemAccess2 fsa, final String storyName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package interactive_fiction.external_help;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface External {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean isEven(int param0);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean isFavorite(String param1);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int textLength(String param2);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String compilation = _builder.toString();
    fsa.generateFile(((If22Generator.PACKAGE_PATH + storyName) + "/External.java"), compilation);
  }
  
  public static void compileScenario(final Scenario scenario, final IFileSystemAccess2 fsa, final String storyname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(If22Generator.PACKAGE_PATH_NO_SLASH);
    _builder.append(".");
    _builder.append(storyname);
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
    _builder.append("class Scenario");
    String _firstUpper = StringExtensions.toFirstUpper(scenario.getName());
    _builder.append(_firstUpper);
    _builder.append(" extends Scenario {");
    _builder.newLineIfNotEmpty();
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
    String _compileImplicitVariables = If22Generator.compileImplicitVariables(scenario.getStatements());
    _builder.append(_compileImplicitVariables, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileExternalFunctionSetup = If22Generator.compileExternalFunctionSetup();
    _builder.append(_compileExternalFunctionSetup, "\t");
    _builder.newLineIfNotEmpty();
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
    {
      EList<Statement> _statements = scenario.getStatements();
      for(final Statement statement : _statements) {
        _builder.append("\t\t\t\t");
        String _compileStatement = If22Generator.compileStatement(statement);
        _builder.append(_compileStatement, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
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
    String _firstUpper_1 = StringExtensions.toFirstUpper(scenario.getName());
    String _plus = (((If22Generator.PACKAGE_PATH + storyname) + "/Scenario") + _firstUpper_1);
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
          String _plus = ("int " + _name);
          _switchResult = (_plus + ";");
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static String compileImplicitVariables(final List<Statement> statements) {
    String r = "";
    final Function1<Statement, Boolean> _function = new Function1<Statement, Boolean>() {
      public Boolean apply(final Statement statement) {
        return Boolean.valueOf((statement instanceof Question));
      }
    };
    Iterable<Statement> _filter = IterableExtensions.<Statement>filter(statements, _function);
    for (final Statement q : _filter) {
      VariableDeclaration _reffedVar = ((Question) q).getReffedVar();
      boolean _equals = Objects.equal(_reffedVar, null);
      if (_equals) {
        String _r = r;
        String _typeStringFromExp = ExpResolverUtil.getTypeStringFromExp(((Question) q).getQType());
        String _plus = (_typeStringFromExp + " _");
        String _name = q.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ";\n");
        r = (_r + _plus_2);
      }
    }
    return r;
  }
  
  public static CharSequence compileExternalFunctionSetup() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("External external;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ScenarioExternalHelp(External external) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.external = external;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static String _compileStatement(final Announcement announcement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case \"");
    String _name = announcement.getName();
    _builder.append(_name);
    _builder.append("\":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("System.out.println(");
    String _compileExp = ExpResolverUtil.compileExp(announcement.getExp());
    _builder.append(_compileExp, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      EList<Target> _targets = announcement.getTargets();
      for(final Target t : _targets) {
        _builder.append("\t");
        Expression _targetCheck = t.getTargetCheck();
        String _name_1 = announcement.getName();
        String _plus = ("_" + _name_1);
        String _compileTargetWithConditional = If22Generator.compileTargetWithConditional(t, _targetCheck, _plus);
        _builder.append(_compileTargetWithConditional, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected static String _compileStatement(final Question question) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      VariableDeclaration _reffedVar = question.getReffedVar();
      boolean _tripleEquals = (_reffedVar == null);
      if (_tripleEquals) {
        String _name = question.getName();
        _xifexpression = ("_" + _name);
      } else {
        _xifexpression = question.getReffedVar().getName();
      }
      If22Generator.currentVariableName = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("case \"");
      String _name_1 = question.getName();
      _builder.append(_name_1);
      _builder.append("\":");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("System.out.println(");
      String _compileExp = ExpResolverUtil.compileExp(question.getQString());
      _builder.append(_compileExp, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(If22Generator.currentVariableName, "\t\t");
      _builder.append(" = ");
      String _inputStringFromExp = ExpResolverUtil.getInputStringFromExp(question.getQType());
      _builder.append(_inputStringFromExp, "\t\t");
      _builder.newLineIfNotEmpty();
      {
        if (((question.getQType() instanceof Logic) || (question.getQType() instanceof ExternalFunctionCall))) {
          _builder.append("\t\t");
          _builder.append("if (");
          String _compileInputValidationWithVariableName = If22Generator.compileInputValidationWithVariableName(question.getQType(), If22Generator.currentVariableName);
          _builder.append(_compileInputValidationWithVariableName, "\t\t");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("break;");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      {
        EList<Target> _targets = question.getTargets();
        for(final Target t : _targets) {
          _builder.append("\t\t");
          Expression _targetCheck = t.getTargetCheck();
          String _name_2 = question.getName();
          String _plus = ("_" + _name_2);
          String _compileTargetWithConditional = If22Generator.compileTargetWithConditional(t, _targetCheck, _plus);
          _builder.append(_compileTargetWithConditional, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("} catch (Exception ex) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  protected static String _compileStatement(final End endStatement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case \"");
    String _name = endStatement.getName();
    _builder.append(_name);
    _builder.append("\":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("System.out.println(");
    String _compileExp = ExpResolverUtil.compileExp(endStatement.getExp());
    _builder.append(_compileExp, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return \"");
    String _name_1 = endStatement.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String compileTargetWithConditional(final Target target, final Expression targetCheck, final String thisReference) {
    String r = "";
    if ((targetCheck != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (");
      String _compileExp = ExpResolverUtil.compileExp(targetCheck);
      _builder.append(_compileExp);
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("nextInteraction = \"");
      String _name = If22Generator.name(target);
      _builder.append(_name, "\t");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      r = _builder.toString();
    } else {
      r = If22Generator.compileTargetDestination(target.getDestination(), target.getEndTargets());
    }
    r = r.replaceAll("this", thisReference);
    return r;
  }
  
  public static String compileInputValidationWithVariableName(final Expression validation, final String variableName) {
    if ((validation instanceof Logic)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("!(");
      _builder.append(variableName);
      _builder.append(" ");
      String _operator = ((Logic)validation).getOperator();
      _builder.append(_operator);
      _builder.append(" ");
      String _compileExp = ExpResolverUtil.compileExp(((Logic)validation).getRight());
      _builder.append(_compileExp);
      _builder.append(")");
      return _builder.toString();
    }
    if ((validation instanceof ExternalFunctionCall)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("!(");
      String _compileExp_1 = ExpResolverUtil.compileExp(validation);
      _builder_1.append(_compileExp_1);
      _builder_1.append(")");
      return _builder_1.toString();
    }
    return null;
  }
  
  public static String name(final Target target) {
    String _switchResult = null;
    boolean _matched = false;
    if (target instanceof Statement) {
      _matched=true;
      _switchResult = ((Statement)target).getName();
    }
    if (!_matched) {
      if (target instanceof Scenario) {
        _matched=true;
        _switchResult = ((Scenario)target).getName();
      }
    }
    return _switchResult;
  }
  
  protected static String _compileTargetDestination(final Statement statement, final List<EndingTarget> endingTargets) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("nextInteraction = \"");
    String _name = statement.getName();
    _builder.append(_name);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("break;");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected static String _compileTargetDestination(final Scenario scenario, final List<EndingTarget> endingTargets) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("calledScenarioEnd = new Scenario");
    String _firstUpper = StringExtensions.toFirstUpper(scenario.getName());
    _builder.append(_firstUpper);
    _builder.append("().interact();");
    _builder.newLineIfNotEmpty();
    {
      for(final EndingTarget et : endingTargets) {
        _builder.append("if(calledScenarioEnd.equals(\"");
        String _name = If22Generator.name(et.getCallableEnd());
        _builder.append(_name);
        _builder.append("\")){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("nextInteraction = \"");
        String _name_1 = If22Generator.name(et.getSelfdefinedEnd());
        _builder.append(_name_1, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  public static String compileStatement(final Statement announcement) {
    if (announcement instanceof Announcement) {
      return _compileStatement((Announcement)announcement);
    } else if (announcement instanceof End) {
      return _compileStatement((End)announcement);
    } else if (announcement instanceof Question) {
      return _compileStatement((Question)announcement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(announcement).toString());
    }
  }
  
  public static String compileTargetDestination(final TargetDestination scenario, final List<EndingTarget> endingTargets) {
    if (scenario instanceof Scenario) {
      return _compileTargetDestination((Scenario)scenario, endingTargets);
    } else if (scenario instanceof Statement) {
      return _compileTargetDestination((Statement)scenario, endingTargets);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scenario, endingTargets).toString());
    }
  }
}

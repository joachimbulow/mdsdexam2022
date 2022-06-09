/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.generator;

import com.google.common.base.Objects;
import org.xtext.example.if22.if22.EXPBOOL;
import org.xtext.example.if22.if22.EXPINT;
import org.xtext.example.if22.if22.EXPSTRING;
import org.xtext.example.if22.if22.Expression;
import org.xtext.example.if22.if22.ID;
import org.xtext.example.if22.if22.Logic;
import org.xtext.example.if22.if22.Parenthesis;
import org.xtext.example.if22.if22.TextExp;
import org.xtext.example.if22.if22.This;
import org.xtext.example.if22.if22.Type;
import org.xtext.example.if22.if22.TypeBoolean;
import org.xtext.example.if22.if22.TypeNumber;
import org.xtext.example.if22.if22.TypeText;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExpResolverUtil {
  public static String compileExp(final Expression exp) {
    String r = "";
    if ((exp instanceof Logic)) {
      String _compileExp = ExpResolverUtil.compileExp(((Logic)exp).getLeft());
      String _plus = (_compileExp + " ");
      String _operator = ((Logic)exp).getOperator();
      String _plus_1 = (_plus + _operator);
      String _plus_2 = (_plus_1 + " ");
      String _compileExp_1 = ExpResolverUtil.compileExp(((Logic)exp).getRight());
      String _plus_3 = (_plus_2 + _compileExp_1);
      r = _plus_3;
    } else {
      if ((exp instanceof org.xtext.example.if22.if22.Math)) {
        String _compileExp_2 = ExpResolverUtil.compileExp(((org.xtext.example.if22.if22.Math)exp).getLeft());
        String _plus_4 = (_compileExp_2 + " ");
        String _operator_1 = ((org.xtext.example.if22.if22.Math)exp).getOperator();
        String _plus_5 = (_plus_4 + _operator_1);
        String _plus_6 = (_plus_5 + " ");
        String _compileExp_3 = ExpResolverUtil.compileExp(((org.xtext.example.if22.if22.Math)exp).getRight());
        String _plus_7 = (_plus_6 + _compileExp_3);
        r = _plus_7;
      } else {
        if ((exp instanceof TextExp)) {
          r = "TextExp is still todo :)))";
        } else {
          boolean _matched = false;
          if (exp instanceof This) {
            _matched=true;
            r = ((This)exp).getValue();
          }
          if (!_matched) {
            if (exp instanceof EXPSTRING) {
              _matched=true;
              String _value = ((EXPSTRING)exp).getValue();
              String _plus_8 = ("\"" + _value);
              String _plus_9 = (_plus_8 + "\"");
              r = _plus_9;
            }
          }
          if (!_matched) {
            if (exp instanceof EXPINT) {
              _matched=true;
              r = Integer.valueOf(((EXPINT)exp).getValue()).toString();
            }
          }
          if (!_matched) {
            if (exp instanceof EXPBOOL) {
              _matched=true;
              String _xifexpression = null;
              String _value = ((EXPBOOL)exp).getValue();
              boolean _equals = Objects.equal(_value, "true");
              if (_equals) {
                _xifexpression = "true";
              } else {
                _xifexpression = "false";
              }
              r = _xifexpression;
            }
          }
          if (!_matched) {
            if (exp instanceof ID) {
              _matched=true;
              r = ((ID)exp).getValue();
            }
          }
          if (!_matched) {
            if (exp instanceof Type) {
              _matched=true;
              r = ExpResolverUtil.compileType(((Type)exp));
            }
          }
          if (!_matched) {
            if (exp instanceof Parenthesis) {
              _matched=true;
              String _compileExp_4 = ExpResolverUtil.compileExp(((Parenthesis)exp).getExp());
              String _plus_8 = ("(" + _compileExp_4);
              String _plus_9 = (_plus_8 + ")");
              r = _plus_9;
            }
          }
          if (!_matched) {
            r = "We failed to hit a switch case and defaulted...";
          }
        }
      }
    }
    return r;
  }
  
  public static String compileType(final Type type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof TypeBoolean) {
      _matched=true;
      _switchResult = "boolean";
    }
    if (!_matched) {
      if (type instanceof TypeText) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (type instanceof TypeNumber) {
        _matched=true;
        _switchResult = "int";
      }
    }
    return _switchResult;
  }
  
  public static Type getTypeFromExp(final Expression exp) {
    if ((exp instanceof Type)) {
      return ((Type) exp);
    }
    return null;
  }
  
  public static String compileTypeFromExp(final Expression exp) {
    if ((exp instanceof Type)) {
      return ExpResolverUtil.compileType(((Type)exp));
    }
    return null;
  }
  
  public static String getInputStringFromExp(final Expression exp) {
    String _xblockexpression = null;
    {
      if ((exp instanceof Type)) {
        return ExpResolverUtil.readInputString(((Type)exp));
      }
      String _xifexpression = null;
      if ((exp instanceof Logic)) {
        Expression _left = ((Logic)exp).getLeft();
        _xifexpression = ExpResolverUtil.readInputString(((Type) _left));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String readInputString(final Type type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof TypeBoolean) {
      _matched=true;
      _switchResult = "Boolean.parseBoolean(br.readLine());";
    }
    if (!_matched) {
      if (type instanceof TypeText) {
        _matched=true;
        _switchResult = "br.readLine();";
      }
    }
    if (!_matched) {
      if (type instanceof TypeNumber) {
        _matched=true;
        _switchResult = "Integer.parseInt(br.readLine());";
      }
    }
    return _switchResult;
  }
  
  public static String getTypeStringFromExp(final Expression exp) {
    String _xblockexpression = null;
    {
      if ((exp instanceof Type)) {
        return ExpResolverUtil.compileExp(exp);
      }
      String _xifexpression = null;
      if ((exp instanceof Logic)) {
        Expression _left = ((Logic)exp).getLeft();
        _xifexpression = ExpResolverUtil.compileExp(((Type) _left));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}

/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.generator

import org.xtext.example.if22.if22.This
import org.xtext.example.if22.if22.EXPBOOL
import org.xtext.example.if22.if22.EXPINT
import org.xtext.example.if22.if22.EXPSTRING
import org.xtext.example.if22.if22.ID
import org.xtext.example.if22.if22.Type
import org.xtext.example.if22.if22.TypeBoolean
import org.xtext.example.if22.if22.TypeText
import org.xtext.example.if22.if22.TypeNumber
import org.xtext.example.if22.if22.Parenthesis
import org.xtext.example.if22.if22.Expression
import org.xtext.example.if22.if22.Logic
import org.xtext.example.if22.if22.Math
import org.xtext.example.if22.if22.TextExp
import org.xtext.example.if22.if22.ExternalFunctionCall

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ExpResolverUtil {

	// TODO: Move into one switch instead, this was due to earlier where primary was in left
	def static String compileExp(Expression exp) {
		var r = "";
		if (exp instanceof Logic) {
			var left = exp.left.compileExp
			var right = exp.right.compileExp
			if ((exp.left instanceof EXPSTRING || exp.right instanceof EXPSTRING) && exp.operator.equals("==")){
				r = left + ".equals(" + right+")"
			}
			else {
				r = left + " " + exp.operator + " " + right
			}
		} else if (exp instanceof Math) {
			r = exp.left.compileExp + " " + exp.operator + " " + exp.right.compileExp
		} else if (exp instanceof TextExp) {
			//Sub with variable name
			r = (exp.left as TextExp).left.compileExp + "+" + (exp.left as TextExp).right.compileExp+ "+" + exp.right.compileExp
		} else {
			// It must be a primary
			switch exp {
				This: r = If22Generator.currentVariableName
				EXPSTRING: r = "\"" + exp.value + "\""
				EXPINT: r = exp.value.toString()
				EXPBOOL: r = exp.value == "true" ? "true" : "false"
				ID: r = exp.value
				Type: r = exp.compileType
				Parenthesis: r = "(" + exp.exp.compileExp + ")"
				ExternalFunctionCall: r = "external." + exp.efName+"(" + (exp.efParameter instanceof Type ? If22Generator.currentVariableName : exp.efParameter.compileExp) + ")"
				default: r = ""
			}
		}

		return r;
	}

	def static compileType(Type type) {
		switch (type) {
			TypeBoolean: "boolean"
			TypeText: "String"
			TypeNumber: "int"
		}
	}

	def static Type getTypeFromExp(Expression exp) {
		if (exp instanceof Type) {
			return exp as Type
		}
		return null;
	}

	def static String compileTypeFromExp(Expression exp) {
		if (exp instanceof Type) {
			return exp.compileType
		}
	}

	def static getInputStringFromExp(Expression exp) {
		if (exp instanceof Type) {
			return exp.readInputString
		}
		if (exp instanceof Logic) {
			return (exp.left as Type).readInputString
		}
		if (exp instanceof ExternalFunctionCall) {
			return (exp.efParameter as Type).readInputString
		}
	}

	def static readInputString(Type type) {
		switch type {
			TypeBoolean: "Boolean.parseBoolean(br.readLine());"
			TypeText: "br.readLine();"
			TypeNumber: "Integer.parseInt(br.readLine());"
		}
	}
	
	def static getTypeStringFromExp(Expression exp) {
		if (exp instanceof Type) {
			return exp.compileExp
		}
		if (exp instanceof Logic) {
			(exp.left as Type).compileExp
		}
	}

}

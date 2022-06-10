/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.if22.if22.Scenario
import org.xtext.example.if22.if22.Question
import org.xtext.example.if22.if22.End
import org.xtext.example.if22.if22.If22Package
import org.xtext.example.if22.if22.Program
import org.xtext.example.if22.if22.Target

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class If22Validator extends AbstractIf22Validator {

	@Check
	def checkAllScenariosHaveEnds(Scenario scenario) {
		var amountOfEnds = scenario.statements.filter[s|s instanceof End].length
		if (amountOfEnds == 0) {
			error('Scenario has no end', If22Package.Literals.SCENARIO__STATEMENTS,
				"You must provide an end");
		}
	}

	// Globally checking
	@Check
	def noSameNameStatements(Program program) {
		var allStatements = program.scenarios.map[s|s.statements].flatten()
		// Brute force check TODO: Use Set data structure
		for (s1 : allStatements) {
			var duplicateCount = 0;
			for (s2 : allStatements){
				if (s1.name.equals(s2.name)) {
					duplicateCount++;
					if (duplicateCount > 1) {
						error('Two statements have the same name', If22Package.Literals.PROGRAM__SCENARIOS,
				"Please name your statements differently, so the program knows where to go.");
					}
				}
			}
			duplicateCount = 0;
		}
	}
	
	@Check
	def checkAllScenariosHaveUniqueNames(Program program) {
		var allScenarios = program.scenarios
		// Brute force as I am short on time
		for (s1 : allScenarios) {
			var duplicateCount = 0;
			for (s2 : allScenarios){
				if (s1.name.equals(s2.name)) {
					duplicateCount++;
					if (duplicateCount > 1) {
						error('Two scenarios have the same name', If22Package.Literals.PROGRAM__SCENARIOS,
				"Please name your scenarios differently, so the program knows where to go.");
					}
				}
			}
			duplicateCount = 0;	
		}
	}
	
	@Check
	def checkAllFunctionsHaveUniqueNames(Program program) {
		var allFunctions = program.externalFunctions
		// Brute force as I am short on time
		for (f1 : allFunctions) {
			var duplicateCount = 0;
			for (f2 : allFunctions){
				if (f1.name.equals(f2.name)) {
					duplicateCount++;
					if (duplicateCount > 1) {
						error('Two functions have the same name', If22Package.Literals.PROGRAM__SCENARIOS,
				"Please name your functions differently, so the program knows where to go.");
					}
				}
			}
			duplicateCount = 0;	
		}
	}
	
	
	@Check
	def checkEndingTargetsNotSpecifiedForStatementRedirection(Target target) {
		var hasEndingTarget = target.endTargets !== null; // I.e. we use the "on" keyword
		var isActuallyScenarioTarget = target.destination instanceof Scenario;
		if (hasEndingTarget && !isActuallyScenarioTarget){
			error('Ending targets defined for non-scenario', If22Package.Literals.PROGRAM__SCENARIOS,
				"It does not make sense to define ending targets for targets that are not scenarios.");
		}
	}
	

}

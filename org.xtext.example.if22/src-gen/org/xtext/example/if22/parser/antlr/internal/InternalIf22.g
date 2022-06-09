/*
 * generated by Xtext 2.26.0
 */
grammar InternalIf22;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.if22.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.if22.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.if22.services.If22GrammarAccess;

}

@parser::members {

 	private If22GrammarAccess grammarAccess;

    public InternalIf22Parser(TokenStream input, If22GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected If22GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='story'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getStoryKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getExternalFunctionsFunctionParserRuleCall_2_0());
				}
				lv_externalFunctions_2_0=ruleFunction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"externalFunctions",
						lv_externalFunctions_2_0,
						"org.xtext.example.if22.If22.Function");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getScenariosScenarioParserRuleCall_3_0());
				}
				lv_scenarios_3_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_3_0,
						"org.xtext.example.if22.If22.Scenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getInputTypeExpParserRuleCall_3_0());
				}
				lv_inputType_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"inputType",
						lv_inputType_3_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getColonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeTypeParserRuleCall_6_0());
				}
				lv_returnType_6_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"returnType",
						lv_returnType_6_0,
						"org.xtext.example.if22.If22.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='scenario'
		{
			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenarioRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_3_0());
				}
				lv_variableDeclarations_3_0=ruleVariableDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"variableDeclarations",
						lv_variableDeclarations_3_0,
						"org.xtext.example.if22.If22.VariableDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"org.xtext.example.if22.If22.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	iv_ruleVariableDeclaration=ruleVariableDeclaration
	{ $current=$iv_ruleVariableDeclaration.current; }
	EOF;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"org.xtext.example.if22.If22.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAnnouncementParserRuleCall_0());
		}
		this_Announcement_0=ruleAnnouncement
		{
			$current = $this_Announcement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getQuestionParserRuleCall_1());
		}
		this_Question_1=ruleQuestion
		{
			$current = $this_Question_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getEndParserRuleCall_2());
		}
		this_End_2=ruleEnd
		{
			$current = $this_End_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAnnouncement
entryRuleAnnouncement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnouncementRule()); }
	iv_ruleAnnouncement=ruleAnnouncement
	{ $current=$iv_ruleAnnouncement.current; }
	EOF;

// Rule Announcement
ruleAnnouncement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='announce'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnouncementAccess().getAnnounceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAnnouncementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnouncementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnouncementAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnouncementRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAnnouncementAccess().getTargetsTargetParserRuleCall_3_0());
				}
				lv_targets_3_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnouncementRule());
					}
					add(
						$current,
						"targets",
						lv_targets_3_0,
						"org.xtext.example.if22.If22.Target");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	iv_ruleQuestion=ruleQuestion
	{ $current=$iv_ruleQuestion.current; }
	EOF;

// Rule Question
ruleQuestion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='question'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuestionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getQStringExpParserRuleCall_2_0());
				}
				lv_qString_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					set(
						$current,
						"qString",
						lv_qString_2_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='as'
		{
			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getQTypeExpParserRuleCall_4_0());
				}
				lv_qType_4_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					set(
						$current,
						"qType",
						lv_qType_4_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='in'
			{
				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getInKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQuestionRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getReffedVarVariableDeclarationCrossReference_5_1_0());
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getTargetsTargetParserRuleCall_6_0());
				}
				lv_targets_7_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					add(
						$current,
						"targets",
						lv_targets_7_0,
						"org.xtext.example.if22.If22.Target");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleEnd
entryRuleEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndRule()); }
	iv_ruleEnd=ruleEnd
	{ $current=$iv_ruleEnd.current; }
	EOF;

// Rule End
ruleEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='end'
		{
			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEndRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEndAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEndRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	iv_ruleTarget=ruleTarget
	{ $current=$iv_ruleTarget.current; }
	EOF;

// Rule Target
ruleTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='to'
		{
			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTargetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='if'
			{
				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getIfKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTargetAccess().getTargetCheckExpParserRuleCall_2_1_0());
					}
					lv_targetCheck_3_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTargetRule());
						}
						set(
							$current,
							"targetCheck",
							lv_targetCheck_3_0,
							"org.xtext.example.if22.If22.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getLogicLeftAction_1_0_0_0(),
								$current);
						}
					)
					(
						(
							(
								lv_operator_2_1='=='
								{
									newLeafNode(lv_operator_2_1, grammarAccess.getExpAccess().getOperatorEqualsSignEqualsSignKeyword_1_0_0_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_1, null);
								}
								    |
								lv_operator_2_2='!='
								{
									newLeafNode(lv_operator_2_2, grammarAccess.getExpAccess().getOperatorExclamationMarkEqualsSignKeyword_1_0_0_1_0_1());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_2, null);
								}
								    |
								lv_operator_2_3='<'
								{
									newLeafNode(lv_operator_2_3, grammarAccess.getExpAccess().getOperatorLessThanSignKeyword_1_0_0_1_0_2());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_3, null);
								}
								    |
								lv_operator_2_4='>'
								{
									newLeafNode(lv_operator_2_4, grammarAccess.getExpAccess().getOperatorGreaterThanSignKeyword_1_0_0_1_0_3());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_4, null);
								}
								    |
								lv_operator_2_5='<='
								{
									newLeafNode(lv_operator_2_5, grammarAccess.getExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_0_1_0_4());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_5, null);
								}
								    |
								lv_operator_2_6='>='
								{
									newLeafNode(lv_operator_2_6, grammarAccess.getExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_0_1_0_5());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_6, null);
								}
								    |
								lv_operator_2_7='&&'
								{
									newLeafNode(lv_operator_2_7, grammarAccess.getExpAccess().getOperatorAmpersandAmpersandKeyword_1_0_0_1_0_6());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_7, null);
								}
								    |
								lv_operator_2_8='||'
								{
									newLeafNode(lv_operator_2_8, grammarAccess.getExpAccess().getOperatorVerticalLineVerticalLineKeyword_1_0_0_1_0_7());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_2_8, null);
								}
							)
						)
					)
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMathLeftAction_1_0_1_0(),
								$current);
						}
					)
					(
						(
							(
								lv_operator_4_1='+'
								{
									newLeafNode(lv_operator_4_1, grammarAccess.getExpAccess().getOperatorPlusSignKeyword_1_0_1_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_4_1, null);
								}
								    |
								lv_operator_4_2='-'
								{
									newLeafNode(lv_operator_4_2, grammarAccess.getExpAccess().getOperatorHyphenMinusKeyword_1_0_1_1_0_1());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_4_2, null);
								}
								    |
								lv_operator_4_3='*'
								{
									newLeafNode(lv_operator_4_3, grammarAccess.getExpAccess().getOperatorAsteriskKeyword_1_0_1_1_0_2());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_4_3, null);
								}
								    |
								lv_operator_4_4='/'
								{
									newLeafNode(lv_operator_4_4, grammarAccess.getExpAccess().getOperatorSolidusKeyword_1_0_1_1_0_3());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getExpRule());
									}
									setWithLastConsumed($current, "operator", lv_operator_4_4, null);
								}
							)
						)
					)
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getTextExpLeftAction_1_0_2_0(),
								$current);
						}
					)
					otherlv_6='&'
					{
						newLeafNode(otherlv_6, grammarAccess.getExpAccess().getAmpersandKeyword_1_0_2_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_1_1_0());
					}
					lv_right_7_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_7_0,
							"org.xtext.example.if22.If22.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_0());
		}
		this_Parenthesis_0=ruleParenthesis
		{
			$current = $this_Parenthesis_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_1());
		}
		this_Type_1=ruleType
		{
			$current = $this_Type_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getThisAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0='this'
					{
						newLeafNode(lv_value_3_0, grammarAccess.getPrimaryAccess().getValueThisKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed($current, "value", lv_value_3_0, "this");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getEXPSTRINGAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_value_5_0=RULE_STRING
					{
						newLeafNode(lv_value_5_0, grammarAccess.getPrimaryAccess().getValueSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getEXPINTAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_value_7_0=RULE_INT
					{
						newLeafNode(lv_value_7_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_7_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getEXPBOOLAction_5_0(),
						$current);
				}
			)
			(
				(
					lv_value_9_0=RULE_BOOLEAN
					{
						newLeafNode(lv_value_9_0, grammarAccess.getPrimaryAccess().getValueBOOLEANTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_9_0,
							"org.xtext.example.if22.If22.BOOLEAN");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getIDAction_6_0(),
						$current);
				}
			)
			(
				(
					lv_value_11_0=RULE_ID
					{
						newLeafNode(lv_value_11_0, grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_11_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalFunctionCallParserRuleCall_7());
		}
		this_ExternalFunctionCall_12=ruleExternalFunctionCall
		{
			$current = $this_ExternalFunctionCall_12.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExternalFunctionCall
entryRuleExternalFunctionCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalFunctionCallRule()); }
	iv_ruleExternalFunctionCall=ruleExternalFunctionCall
	{ $current=$iv_ruleExternalFunctionCall.current; }
	EOF;

// Rule ExternalFunctionCall
ruleExternalFunctionCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExternalFunctionCallAccess().getExternalFunctionCallAction_0(),
					$current);
			}
		)
		(
			(
				lv_efName_1_0=RULE_ID
				{
					newLeafNode(lv_efName_1_0, grammarAccess.getExternalFunctionCallAccess().getEfNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalFunctionCallRule());
					}
					setWithLastConsumed(
						$current,
						"efName",
						lv_efName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalFunctionCallAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalFunctionCallAccess().getEfParameterExpParserRuleCall_3_0());
				}
				lv_efParameter_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalFunctionCallRule());
					}
					set(
						$current,
						"efParameter",
						lv_efParameter_3_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getExternalFunctionCallAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParenthesisRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.xtext.example.if22.If22.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getTypeBooleanAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0='boolean'
					{
						newLeafNode(lv_value_1_0, grammarAccess.getTypeAccess().getValueBooleanKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed($current, "value", lv_value_1_0, "boolean");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getTypeTextAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0='text'
					{
						newLeafNode(lv_value_3_0, grammarAccess.getTypeAccess().getValueTextKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed($current, "value", lv_value_3_0, "text");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getTypeNumberAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_5_0='number'
					{
						newLeafNode(lv_value_5_0, grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
						setWithLastConsumed($current, "value", lv_value_5_0, "number");
					}
				)
			)
		)
	)
;

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

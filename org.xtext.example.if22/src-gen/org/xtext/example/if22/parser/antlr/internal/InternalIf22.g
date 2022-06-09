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
					newCompositeNode(grammarAccess.getProgramAccess().getScenariosScenarioParserRuleCall_2_0());
				}
				lv_scenarios_2_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_2_0,
						"org.xtext.example.if22.If22.Scenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
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
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"org.xtext.example.if22.If22.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
		}
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
					newCompositeNode(grammarAccess.getAnnouncementAccess().getTargetTargetParserRuleCall_3_0());
				}
				lv_target_3_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAnnouncementRule());
					}
					add(
						$current,
						"target",
						lv_target_3_0,
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
			(
				{
					newCompositeNode(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_5_0());
				}
				lv_target_5_0=ruleTarget
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuestionRule());
					}
					add(
						$current,
						"target",
						lv_target_5_0,
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
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0());
		}
		    |
		kw='text'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1());
		}
		    |
		kw='number'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_2());
		}
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
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExpAccess().getExpAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_1_0());
				}
				lv_left_1_0=rulePrimary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpRule());
					}
					set(
						$current,
						"left",
						lv_left_1_0,
						"org.xtext.example.if22.If22.Primary");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getLogicLeftAction_2_0_0_0(),
								$current);
						}
					)
					(
						otherlv_3='=='
						{
							newLeafNode(otherlv_3, grammarAccess.getExpAccess().getEqualsSignEqualsSignKeyword_2_0_0_1_0());
						}
						    |
						otherlv_4='!='
						{
							newLeafNode(otherlv_4, grammarAccess.getExpAccess().getExclamationMarkEqualsSignKeyword_2_0_0_1_1());
						}
						    |
						otherlv_5='<'
						{
							newLeafNode(otherlv_5, grammarAccess.getExpAccess().getLessThanSignKeyword_2_0_0_1_2());
						}
						    |
						otherlv_6='>'
						{
							newLeafNode(otherlv_6, grammarAccess.getExpAccess().getGreaterThanSignKeyword_2_0_0_1_3());
						}
						    |
						otherlv_7='<='
						{
							newLeafNode(otherlv_7, grammarAccess.getExpAccess().getLessThanSignEqualsSignKeyword_2_0_0_1_4());
						}
						    |
						otherlv_8='>='
						{
							newLeafNode(otherlv_8, grammarAccess.getExpAccess().getGreaterThanSignEqualsSignKeyword_2_0_0_1_5());
						}
						    |
						otherlv_9='&&'
						{
							newLeafNode(otherlv_9, grammarAccess.getExpAccess().getAmpersandAmpersandKeyword_2_0_0_1_6());
						}
						    |
						otherlv_10='||'
						{
							newLeafNode(otherlv_10, grammarAccess.getExpAccess().getVerticalLineVerticalLineKeyword_2_0_0_1_7());
						}
					)
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMathLeftAction_2_0_1_0(),
								$current);
						}
					)
					(
						otherlv_12='+'
						{
							newLeafNode(otherlv_12, grammarAccess.getExpAccess().getPlusSignKeyword_2_0_1_1_0());
						}
						    |
						otherlv_13='-'
						{
							newLeafNode(otherlv_13, grammarAccess.getExpAccess().getHyphenMinusKeyword_2_0_1_1_1());
						}
						    |
						otherlv_14='*'
						{
							newLeafNode(otherlv_14, grammarAccess.getExpAccess().getAsteriskKeyword_2_0_1_1_2());
						}
						    |
						otherlv_15='/'
						{
							newLeafNode(otherlv_15, grammarAccess.getExpAccess().getSolidusKeyword_2_0_1_1_3());
						}
					)
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getTextExpLeftAction_2_0_2_0(),
								$current);
						}
					)
					otherlv_17='&'
					{
						newLeafNode(otherlv_17, grammarAccess.getExpAccess().getAmpersandKeyword_2_0_2_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_2_1_0());
					}
					lv_right_18_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_18_0,
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
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getTypeAction_1_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_1_1());
			}
			ruleType
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getThisAction_2_0(),
						$current);
				}
			)
			otherlv_4='this'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getThisKeyword_2_1());
			}
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
			this_STRING_6=RULE_STRING
			{
				newLeafNode(this_STRING_6, grammarAccess.getPrimaryAccess().getSTRINGTerminalRuleCall_3_1());
			}
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
			this_INT_8=RULE_INT
			{
				newLeafNode(this_INT_8, grammarAccess.getPrimaryAccess().getINTTerminalRuleCall_4_1());
			}
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
			this_BOOLEAN_10=RULE_BOOLEAN
			{
				newLeafNode(this_BOOLEAN_10, grammarAccess.getPrimaryAccess().getBOOLEANTerminalRuleCall_5_1());
			}
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
			this_ID_12=RULE_ID
			{
				newLeafNode(this_ID_12, grammarAccess.getPrimaryAccess().getIDTerminalRuleCall_6_1());
			}
		)
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

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.if22.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class If22GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cScenariosAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cScenariosScenarioParserRuleCall_2_0 = (RuleCall)cScenariosAssignment_2.eContents().get(0);
		
		//Program:
		//    'story' name=ID (scenarios+=Scenario)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'story' name=ID (scenarios+=Scenario)*
		public Group getGroup() { return cGroup; }
		
		//'story'
		public Keyword getStoryKeyword_0() { return cStoryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(scenarios+=Scenario)*
		public Assignment getScenariosAssignment_2() { return cScenariosAssignment_2; }
		
		//Scenario
		public RuleCall getScenariosScenarioParserRuleCall_2_0() { return cScenariosScenarioParserRuleCall_2_0; }
	}
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVariableDefinitinosAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVariableDefinitinosVariableDefinitionParserRuleCall_3_0 = (RuleCall)cVariableDefinitinosAssignment_3.eContents().get(0);
		private final Assignment cStatementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatementsStatementParserRuleCall_4_0 = (RuleCall)cStatementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Scenario:
		//    'scenario' name=ID '{'
		//    (variableDefinitinos+=VariableDefinition)*
		//    (statements+=Statement)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'scenario' name=ID '{'
		//(variableDefinitinos+=VariableDefinition)*
		//(statements+=Statement)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'scenario'
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(variableDefinitinos+=VariableDefinition)*
		public Assignment getVariableDefinitinosAssignment_3() { return cVariableDefinitinosAssignment_3; }
		
		//VariableDefinition
		public RuleCall getVariableDefinitinosVariableDefinitionParserRuleCall_3_0() { return cVariableDefinitinosVariableDefinitionParserRuleCall_3_0; }
		
		//(statements+=Statement)*
		public Assignment getStatementsAssignment_4() { return cStatementsAssignment_4; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_4_0() { return cStatementsStatementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class VariableDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.VariableDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//VariableDefinition:
		//    'var' name=ID ':' type=Type
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID ':' type=Type
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_3_0() { return cTypeTypeParserRuleCall_3_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAnnouncementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cQuestionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEndParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Statement:
		//    Announcement | Question | End;
		@Override public ParserRule getRule() { return rule; }
		
		//Announcement | Question | End
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Announcement
		public RuleCall getAnnouncementParserRuleCall_0() { return cAnnouncementParserRuleCall_0; }
		
		//Question
		public RuleCall getQuestionParserRuleCall_1() { return cQuestionParserRuleCall_1; }
		
		//End
		public RuleCall getEndParserRuleCall_2() { return cEndParserRuleCall_2; }
	}
	public class AnnouncementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Announcement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnnounceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTargetTargetParserRuleCall_3_0 = (RuleCall)cTargetAssignment_3.eContents().get(0);
		
		//Announcement:
		//    'announce' name=ID exp=Exp (target+=Target)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'announce' name=ID exp=Exp (target+=Target)+
		public Group getGroup() { return cGroup; }
		
		//'announce'
		public Keyword getAnnounceKeyword_0() { return cAnnounceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
		
		//(target+=Target)+
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }
		
		//Target
		public RuleCall getTargetTargetParserRuleCall_3_0() { return cTargetTargetParserRuleCall_3_0; }
	}
	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cQStringAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQStringExpParserRuleCall_2_0 = (RuleCall)cQStringAssignment_2.eContents().get(0);
		private final Keyword cAsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cQTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cQTypeExpParserRuleCall_4_0 = (RuleCall)cQTypeAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cInKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cReffedVarAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cReffedVarVariableDefinitionCrossReference_5_1_0 = (CrossReference)cReffedVarAssignment_5_1.eContents().get(0);
		private final RuleCall cReffedVarVariableDefinitionIDTerminalRuleCall_5_1_0_1 = (RuleCall)cReffedVarVariableDefinitionCrossReference_5_1_0.eContents().get(1);
		private final Assignment cTargetAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTargetTargetParserRuleCall_6_0 = (RuleCall)cTargetAssignment_6.eContents().get(0);
		
		//// qType=Type instead?
		//Question:
		//    'question' name=ID qString=Exp 'as' qType=Exp ('in' reffedVar=[VariableDefinition])? (target+=Target)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'question' name=ID qString=Exp 'as' qType=Exp ('in' reffedVar=[VariableDefinition])? (target+=Target)+
		public Group getGroup() { return cGroup; }
		
		//'question'
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//qString=Exp
		public Assignment getQStringAssignment_2() { return cQStringAssignment_2; }
		
		//Exp
		public RuleCall getQStringExpParserRuleCall_2_0() { return cQStringExpParserRuleCall_2_0; }
		
		//'as'
		public Keyword getAsKeyword_3() { return cAsKeyword_3; }
		
		//qType=Exp
		public Assignment getQTypeAssignment_4() { return cQTypeAssignment_4; }
		
		//Exp
		public RuleCall getQTypeExpParserRuleCall_4_0() { return cQTypeExpParserRuleCall_4_0; }
		
		//('in' reffedVar=[VariableDefinition])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'in'
		public Keyword getInKeyword_5_0() { return cInKeyword_5_0; }
		
		//reffedVar=[VariableDefinition]
		public Assignment getReffedVarAssignment_5_1() { return cReffedVarAssignment_5_1; }
		
		//[VariableDefinition]
		public CrossReference getReffedVarVariableDefinitionCrossReference_5_1_0() { return cReffedVarVariableDefinitionCrossReference_5_1_0; }
		
		//ID
		public RuleCall getReffedVarVariableDefinitionIDTerminalRuleCall_5_1_0_1() { return cReffedVarVariableDefinitionIDTerminalRuleCall_5_1_0_1; }
		
		//(target+=Target)+
		public Assignment getTargetAssignment_6() { return cTargetAssignment_6; }
		
		//Target
		public RuleCall getTargetTargetParserRuleCall_6_0() { return cTargetTargetParserRuleCall_6_0; }
	}
	public class EndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.End");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		
		//End:
		//    'end' name=ID exp=Exp?;
		@Override public ParserRule getRule() { return rule; }
		
		//'end' name=ID exp=Exp?
		public Group getGroup() { return cGroup; }
		
		//'end'
		public Keyword getEndKeyword_0() { return cEndKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//exp=Exp?
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
	}
	public class TargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Target");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cToKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cIfKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTargetCheckAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTargetCheckExpParserRuleCall_2_1_0 = (RuleCall)cTargetCheckAssignment_2_1.eContents().get(0);
		
		//Target:
		//    'to' name=ID ('if' targetCheck=Exp)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'to' name=ID ('if' targetCheck=Exp)?
		public Group getGroup() { return cGroup; }
		
		//'to'
		public Keyword getToKeyword_0() { return cToKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('if' targetCheck=Exp)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'if'
		public Keyword getIfKeyword_2_0() { return cIfKeyword_2_0; }
		
		//targetCheck=Exp
		public Assignment getTargetCheckAssignment_2_1() { return cTargetCheckAssignment_2_1; }
		
		//Exp
		public RuleCall getTargetCheckExpParserRuleCall_2_1_0() { return cTargetCheckExpParserRuleCall_2_1_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExpAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLeftAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLeftPrimaryParserRuleCall_1_0 = (RuleCall)cLeftAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Group cGroup_2_0_0 = (Group)cAlternatives_2_0.eContents().get(0);
		private final Action cLogicLeftAction_2_0_0_0 = (Action)cGroup_2_0_0.eContents().get(0);
		private final Alternatives cAlternatives_2_0_0_1 = (Alternatives)cGroup_2_0_0.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignKeyword_2_0_0_1_0 = (Keyword)cAlternatives_2_0_0_1.eContents().get(0);
		private final Keyword cExclamationMarkEqualsSignKeyword_2_0_0_1_1 = (Keyword)cAlternatives_2_0_0_1.eContents().get(1);
		private final Keyword cLessThanSignKeyword_2_0_0_1_2 = (Keyword)cAlternatives_2_0_0_1.eContents().get(2);
		private final Keyword cGreaterThanSignKeyword_2_0_0_1_3 = (Keyword)cAlternatives_2_0_0_1.eContents().get(3);
		private final Keyword cLessThanSignEqualsSignKeyword_2_0_0_1_4 = (Keyword)cAlternatives_2_0_0_1.eContents().get(4);
		private final Keyword cGreaterThanSignEqualsSignKeyword_2_0_0_1_5 = (Keyword)cAlternatives_2_0_0_1.eContents().get(5);
		private final Keyword cAmpersandAmpersandKeyword_2_0_0_1_6 = (Keyword)cAlternatives_2_0_0_1.eContents().get(6);
		private final Keyword cVerticalLineVerticalLineKeyword_2_0_0_1_7 = (Keyword)cAlternatives_2_0_0_1.eContents().get(7);
		private final Group cGroup_2_0_1 = (Group)cAlternatives_2_0.eContents().get(1);
		private final Action cMathLeftAction_2_0_1_0 = (Action)cGroup_2_0_1.eContents().get(0);
		private final Alternatives cAlternatives_2_0_1_1 = (Alternatives)cGroup_2_0_1.eContents().get(1);
		private final Keyword cPlusSignKeyword_2_0_1_1_0 = (Keyword)cAlternatives_2_0_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_0_1_1_1 = (Keyword)cAlternatives_2_0_1_1.eContents().get(1);
		private final Keyword cAsteriskKeyword_2_0_1_1_2 = (Keyword)cAlternatives_2_0_1_1.eContents().get(2);
		private final Keyword cSolidusKeyword_2_0_1_1_3 = (Keyword)cAlternatives_2_0_1_1.eContents().get(3);
		private final Group cGroup_2_0_2 = (Group)cAlternatives_2_0.eContents().get(2);
		private final Action cTextExpLeftAction_2_0_2_0 = (Action)cGroup_2_0_2.eContents().get(0);
		private final Keyword cAmpersandKeyword_2_0_2_1 = (Keyword)cGroup_2_0_2.eContents().get(1);
		private final Assignment cRightAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_2_1_0 = (RuleCall)cRightAssignment_2_1.eContents().get(0);
		
		//Exp returns Expression:
		//    {Exp}
		//    left=Primary
		//    (({Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||') | {Math.left=current} ('+' | '-' | '*'
		//    | '/') | {TextExp.left=current} '&') right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Exp}
		//left=Primary
		//(({Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||') | {Math.left=current} ('+' | '-' | '*'
		//| '/') | {TextExp.left=current} '&') right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//{Exp}
		public Action getExpAction_0() { return cExpAction_0; }
		
		//left=Primary
		public Assignment getLeftAssignment_1() { return cLeftAssignment_1; }
		
		//Primary
		public RuleCall getLeftPrimaryParserRuleCall_1_0() { return cLeftPrimaryParserRuleCall_1_0; }
		
		//(({Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||') | {Math.left=current} ('+' | '-' | '*'
		//| '/') | {TextExp.left=current} '&') right=Primary)*
		public Group getGroup_2() { return cGroup_2; }
		
		//({Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||') | {Math.left=current} ('+' | '-' | '*'
		//    | '/') | {TextExp.left=current} '&')
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }
		
		//{Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||')
		public Group getGroup_2_0_0() { return cGroup_2_0_0; }
		
		//{Logic.left=current}
		public Action getLogicLeftAction_2_0_0_0() { return cLogicLeftAction_2_0_0_0; }
		
		//('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||')
		public Alternatives getAlternatives_2_0_0_1() { return cAlternatives_2_0_0_1; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_2_0_0_1_0() { return cEqualsSignEqualsSignKeyword_2_0_0_1_0; }
		
		//'!='
		public Keyword getExclamationMarkEqualsSignKeyword_2_0_0_1_1() { return cExclamationMarkEqualsSignKeyword_2_0_0_1_1; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2_0_0_1_2() { return cLessThanSignKeyword_2_0_0_1_2; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_2_0_0_1_3() { return cGreaterThanSignKeyword_2_0_0_1_3; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_2_0_0_1_4() { return cLessThanSignEqualsSignKeyword_2_0_0_1_4; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_2_0_0_1_5() { return cGreaterThanSignEqualsSignKeyword_2_0_0_1_5; }
		
		//'&&'
		public Keyword getAmpersandAmpersandKeyword_2_0_0_1_6() { return cAmpersandAmpersandKeyword_2_0_0_1_6; }
		
		//'||'
		public Keyword getVerticalLineVerticalLineKeyword_2_0_0_1_7() { return cVerticalLineVerticalLineKeyword_2_0_0_1_7; }
		
		//{Math.left=current} ('+' | '-' | '*'
		//   | '/')
		public Group getGroup_2_0_1() { return cGroup_2_0_1; }
		
		//{Math.left=current}
		public Action getMathLeftAction_2_0_1_0() { return cMathLeftAction_2_0_1_0; }
		
		//('+' | '-' | '*'
		//   | '/')
		public Alternatives getAlternatives_2_0_1_1() { return cAlternatives_2_0_1_1; }
		
		//'+'
		public Keyword getPlusSignKeyword_2_0_1_1_0() { return cPlusSignKeyword_2_0_1_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_2_0_1_1_1() { return cHyphenMinusKeyword_2_0_1_1_1; }
		
		//'*'
		public Keyword getAsteriskKeyword_2_0_1_1_2() { return cAsteriskKeyword_2_0_1_1_2; }
		
		//'/'
		public Keyword getSolidusKeyword_2_0_1_1_3() { return cSolidusKeyword_2_0_1_1_3; }
		
		//{TextExp.left=current} '&'
		public Group getGroup_2_0_2() { return cGroup_2_0_2; }
		
		//{TextExp.left=current}
		public Action getTextExpLeftAction_2_0_2_0() { return cTextExpLeftAction_2_0_2_0; }
		
		//'&'
		public Keyword getAmpersandKeyword_2_0_2_1() { return cAmpersandKeyword_2_0_2_1; }
		
		//right=Primary
		public Assignment getRightAssignment_2_1() { return cRightAssignment_2_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_2_1_0() { return cRightPrimaryParserRuleCall_2_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParenthesisParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cTypeAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cThisAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cThisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cEXPSTRINGAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cEXPINTAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cEXPBOOLAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final RuleCall cBOOLEANTerminalRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Action cIDAction_6_0 = (Action)cGroup_6.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		
		////Wtf er det her
		////| ID '(' (Exp (',' Exp)*)?')'))*;
		//Primary returns Expression:
		//    Parenthesis | {Type} Type | {This} 'this' | {EXPSTRING} STRING | {EXPINT} INT | {EXPBOOL} BOOLEAN | {ID} ID;
		@Override public ParserRule getRule() { return rule; }
		
		//Parenthesis | {Type} Type | {This} 'this' | {EXPSTRING} STRING | {EXPINT} INT | {EXPBOOL} BOOLEAN | {ID} ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_0() { return cParenthesisParserRuleCall_0; }
		
		//{Type} Type
		public Group getGroup_1() { return cGroup_1; }
		
		//{Type}
		public Action getTypeAction_1_0() { return cTypeAction_1_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1_1() { return cTypeParserRuleCall_1_1; }
		
		//{This} 'this'
		public Group getGroup_2() { return cGroup_2; }
		
		//{This}
		public Action getThisAction_2_0() { return cThisAction_2_0; }
		
		//'this'
		public Keyword getThisKeyword_2_1() { return cThisKeyword_2_1; }
		
		//{EXPSTRING} STRING
		public Group getGroup_3() { return cGroup_3; }
		
		//{EXPSTRING}
		public Action getEXPSTRINGAction_3_0() { return cEXPSTRINGAction_3_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3_1() { return cSTRINGTerminalRuleCall_3_1; }
		
		//{EXPINT} INT
		public Group getGroup_4() { return cGroup_4; }
		
		//{EXPINT}
		public Action getEXPINTAction_4_0() { return cEXPINTAction_4_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_1() { return cINTTerminalRuleCall_4_1; }
		
		//{EXPBOOL} BOOLEAN
		public Group getGroup_5() { return cGroup_5; }
		
		//{EXPBOOL}
		public Action getEXPBOOLAction_5_0() { return cEXPBOOLAction_5_0; }
		
		//BOOLEAN
		public RuleCall getBOOLEANTerminalRuleCall_5_1() { return cBOOLEANTerminalRuleCall_5_1; }
		
		//{ID} ID
		public Group getGroup_6() { return cGroup_6; }
		
		//{ID}
		public Action getIDAction_6_0() { return cIDAction_6_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_6_1() { return cIDTerminalRuleCall_6_1; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParenthesisAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Parenthesis returns Expression:
		//    {Parenthesis} '(' exp=Exp ')';
		@Override public ParserRule getRule() { return rule; }
		
		//{Parenthesis} '(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		//{Parenthesis}
		public Action getParenthesisAction_0() { return cParenthesisAction_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBooleanKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cTextKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cNumberKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//Type:
		//    'boolean' | 'text' | 'number';
		@Override public ParserRule getRule() { return rule; }
		
		//'boolean' | 'text' | 'number'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'boolean'
		public Keyword getBooleanKeyword_0() { return cBooleanKeyword_0; }
		
		//'text'
		public Keyword getTextKeyword_1() { return cTextKeyword_1; }
		
		//'number'
		public Keyword getNumberKeyword_2() { return cNumberKeyword_2; }
	}
	
	
	private final ProgramElements pProgram;
	private final ScenarioElements pScenario;
	private final VariableDefinitionElements pVariableDefinition;
	private final StatementElements pStatement;
	private final AnnouncementElements pAnnouncement;
	private final QuestionElements pQuestion;
	private final EndElements pEnd;
	private final TargetElements pTarget;
	private final ExpElements pExp;
	private final PrimaryElements pPrimary;
	private final ParenthesisElements pParenthesis;
	private final TypeElements pType;
	private final TerminalRule tBOOLEAN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public If22GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pScenario = new ScenarioElements();
		this.pVariableDefinition = new VariableDefinitionElements();
		this.pStatement = new StatementElements();
		this.pAnnouncement = new AnnouncementElements();
		this.pQuestion = new QuestionElements();
		this.pEnd = new EndElements();
		this.pTarget = new TargetElements();
		this.pExp = new ExpElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesis = new ParenthesisElements();
		this.pType = new TypeElements();
		this.tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.if22.If22.BOOLEAN");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.if22.If22".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//    'story' name=ID (scenarios+=Scenario)*;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Scenario:
	//    'scenario' name=ID '{'
	//    (variableDefinitinos+=VariableDefinition)*
	//    (statements+=Statement)*
	//    '}';
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	//VariableDefinition:
	//    'var' name=ID ':' type=Type
	//;
	public VariableDefinitionElements getVariableDefinitionAccess() {
		return pVariableDefinition;
	}
	
	public ParserRule getVariableDefinitionRule() {
		return getVariableDefinitionAccess().getRule();
	}
	
	//Statement:
	//    Announcement | Question | End;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Announcement:
	//    'announce' name=ID exp=Exp (target+=Target)+;
	public AnnouncementElements getAnnouncementAccess() {
		return pAnnouncement;
	}
	
	public ParserRule getAnnouncementRule() {
		return getAnnouncementAccess().getRule();
	}
	
	//// qType=Type instead?
	//Question:
	//    'question' name=ID qString=Exp 'as' qType=Exp ('in' reffedVar=[VariableDefinition])? (target+=Target)+;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}
	
	//End:
	//    'end' name=ID exp=Exp?;
	public EndElements getEndAccess() {
		return pEnd;
	}
	
	public ParserRule getEndRule() {
		return getEndAccess().getRule();
	}
	
	//Target:
	//    'to' name=ID ('if' targetCheck=Exp)?;
	public TargetElements getTargetAccess() {
		return pTarget;
	}
	
	public ParserRule getTargetRule() {
		return getTargetAccess().getRule();
	}
	
	//Exp returns Expression:
	//    {Exp}
	//    left=Primary
	//    (({Logic.left=current} ('==' | '!=' | '<' | '>' | '<=' | '>=' | '&&' | '||') | {Math.left=current} ('+' | '-' | '*'
	//    | '/') | {TextExp.left=current} '&') right=Primary)*;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	////Wtf er det her
	////| ID '(' (Exp (',' Exp)*)?')'))*;
	//Primary returns Expression:
	//    Parenthesis | {Type} Type | {This} 'this' | {EXPSTRING} STRING | {EXPINT} INT | {EXPBOOL} BOOLEAN | {ID} ID;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesis returns Expression:
	//    {Parenthesis} '(' exp=Exp ')';
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Type:
	//    'boolean' | 'text' | 'number';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//terminal BOOLEAN:
	//    'true' | 'false';
	public TerminalRule getBOOLEANRule() {
		return tBOOLEAN;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

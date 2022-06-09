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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIf22Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'story'", "'scenario'", "'{'", "'}'", "'announce'", "'question'", "'end'", "'to'", "'boolean'", "'text'", "'number'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIf22Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIf22Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIf22Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalIf22.g"; }



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




    // $ANTLR start "entryRuleProgram"
    // InternalIf22.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalIf22.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalIf22.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalIf22.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_scenarios_2_0= ruleScenario ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_scenarios_2_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:77:2: ( (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_scenarios_2_0= ruleScenario ) )* ) )
            // InternalIf22.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_scenarios_2_0= ruleScenario ) )* )
            {
            // InternalIf22.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_scenarios_2_0= ruleScenario ) )* )
            // InternalIf22.g:79:3: otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_scenarios_2_0= ruleScenario ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getStoryKeyword_0());
            		
            // InternalIf22.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIf22.g:101:3: ( (lv_scenarios_2_0= ruleScenario ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIf22.g:102:4: (lv_scenarios_2_0= ruleScenario )
            	    {
            	    // InternalIf22.g:102:4: (lv_scenarios_2_0= ruleScenario )
            	    // InternalIf22.g:103:5: lv_scenarios_2_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getScenariosScenarioParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_2_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_2_0,
            	    						"org.xtext.example.if22.If22.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleScenario"
    // InternalIf22.g:124:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalIf22.g:124:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalIf22.g:125:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalIf22.g:131:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:137:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalIf22.g:138:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalIf22.g:138:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalIf22.g:139:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalIf22.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIf22.g:165:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIf22.g:166:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalIf22.g:166:4: (lv_statements_3_0= ruleStatement )
            	    // InternalIf22.g:167:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"org.xtext.example.if22.If22.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStatement"
    // InternalIf22.g:192:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalIf22.g:192:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalIf22.g:193:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalIf22.g:199:1: ruleStatement returns [EObject current=null] : (this_Announcement_0= ruleAnnouncement | this_Question_1= ruleQuestion | this_End_2= ruleEnd ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Announcement_0 = null;

        EObject this_Question_1 = null;

        EObject this_End_2 = null;



        	enterRule();

        try {
            // InternalIf22.g:205:2: ( (this_Announcement_0= ruleAnnouncement | this_Question_1= ruleQuestion | this_End_2= ruleEnd ) )
            // InternalIf22.g:206:2: (this_Announcement_0= ruleAnnouncement | this_Question_1= ruleQuestion | this_End_2= ruleEnd )
            {
            // InternalIf22.g:206:2: (this_Announcement_0= ruleAnnouncement | this_Question_1= ruleQuestion | this_End_2= ruleEnd )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIf22.g:207:3: this_Announcement_0= ruleAnnouncement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAnnouncementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Announcement_0=ruleAnnouncement();

                    state._fsp--;


                    			current = this_Announcement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIf22.g:216:3: this_Question_1= ruleQuestion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQuestionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Question_1=ruleQuestion();

                    state._fsp--;


                    			current = this_Question_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIf22.g:225:3: this_End_2= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_2=ruleEnd();

                    state._fsp--;


                    			current = this_End_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAnnouncement"
    // InternalIf22.g:237:1: entryRuleAnnouncement returns [EObject current=null] : iv_ruleAnnouncement= ruleAnnouncement EOF ;
    public final EObject entryRuleAnnouncement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnouncement = null;


        try {
            // InternalIf22.g:237:53: (iv_ruleAnnouncement= ruleAnnouncement EOF )
            // InternalIf22.g:238:2: iv_ruleAnnouncement= ruleAnnouncement EOF
            {
             newCompositeNode(grammarAccess.getAnnouncementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnouncement=ruleAnnouncement();

            state._fsp--;

             current =iv_ruleAnnouncement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnouncement"


    // $ANTLR start "ruleAnnouncement"
    // InternalIf22.g:244:1: ruleAnnouncement returns [EObject current=null] : (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )+ ) ;
    public final EObject ruleAnnouncement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:250:2: ( (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )+ ) )
            // InternalIf22.g:251:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )+ )
            {
            // InternalIf22.g:251:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )+ )
            // InternalIf22.g:252:3: otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnouncementAccess().getAnnounceKeyword_0());
            		
            // InternalIf22.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnouncementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnouncementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIf22.g:274:3: ( (lv_target_2_0= ruleTarget ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIf22.g:275:4: (lv_target_2_0= ruleTarget )
            	    {
            	    // InternalIf22.g:275:4: (lv_target_2_0= ruleTarget )
            	    // InternalIf22.g:276:5: lv_target_2_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAnnouncementAccess().getTargetTargetParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_target_2_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnouncementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_2_0,
            	    						"org.xtext.example.if22.If22.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnouncement"


    // $ANTLR start "entryRuleQuestion"
    // InternalIf22.g:297:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalIf22.g:297:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalIf22.g:298:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalIf22.g:304:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIf22.g:310:2: ( (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIf22.g:311:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIf22.g:311:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIf22.g:312:3: otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalIf22.g:316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:317:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEnd"
    // InternalIf22.g:338:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalIf22.g:338:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalIf22.g:339:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalIf22.g:345:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:351:2: ( (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? ) )
            // InternalIf22.g:352:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? )
            {
            // InternalIf22.g:352:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? )
            // InternalIf22.g:353:3: otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
            		
            // InternalIf22.g:357:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:358:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:358:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:359:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIf22.g:375:3: ( (lv_exp_2_0= ruleExp ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_INT)||(LA5_0>=19 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIf22.g:376:4: (lv_exp_2_0= ruleExp )
                    {
                    // InternalIf22.g:376:4: (lv_exp_2_0= ruleExp )
                    // InternalIf22.g:377:5: lv_exp_2_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getEndAccess().getExpExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_2_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_2_0,
                    						"org.xtext.example.if22.If22.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleTarget"
    // InternalIf22.g:398:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalIf22.g:398:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalIf22.g:399:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalIf22.g:405:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIf22.g:411:2: ( (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIf22.g:412:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIf22.g:412:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIf22.g:413:3: otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
            		
            // InternalIf22.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleExp"
    // InternalIf22.g:439:1: entryRuleExp returns [String current=null] : iv_ruleExp= ruleExp EOF ;
    public final String entryRuleExp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExp = null;


        try {
            // InternalIf22.g:439:43: (iv_ruleExp= ruleExp EOF )
            // InternalIf22.g:440:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalIf22.g:446:1: ruleExp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleExp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalIf22.g:452:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Type_2= ruleType ) )
            // InternalIf22.g:453:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Type_2= ruleType )
            {
            // InternalIf22.g:453:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_Type_2= ruleType )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 19:
            case 20:
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIf22.g:454:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getExpAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIf22.g:462:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getExpAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIf22.g:470:3: this_Type_2= ruleType
                    {

                    			newCompositeNode(grammarAccess.getExpAccess().getTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_2=ruleType();

                    state._fsp--;


                    			current.merge(this_Type_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleType"
    // InternalIf22.g:484:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalIf22.g:484:44: (iv_ruleType= ruleType EOF )
            // InternalIf22.g:485:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalIf22.g:491:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'text' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIf22.g:497:2: ( (kw= 'boolean' | kw= 'text' | kw= 'number' ) )
            // InternalIf22.g:498:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            {
            // InternalIf22.g:498:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIf22.g:499:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIf22.g:505:3: kw= 'text'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIf22.g:511:3: kw= 'number'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000380062L});

}
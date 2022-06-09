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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'story'", "'scenario'", "'{'", "'}'", "'announce'", "'question'", "'as'", "'end'", "'to'", "'boolean'", "'text'", "'number'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'&'", "'this'", "'('", "')'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

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

                if ( (LA1_0==13) ) {
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
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalIf22.g:165:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)||LA2_0==19) ) {
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
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
    // InternalIf22.g:244:1: ruleAnnouncement returns [EObject current=null] : (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) ) ( (lv_target_3_0= ruleTarget ) )+ ) ;
    public final EObject ruleAnnouncement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;

        EObject lv_target_3_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:250:2: ( (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) ) ( (lv_target_3_0= ruleTarget ) )+ ) )
            // InternalIf22.g:251:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) ) ( (lv_target_3_0= ruleTarget ) )+ )
            {
            // InternalIf22.g:251:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) ) ( (lv_target_3_0= ruleTarget ) )+ )
            // InternalIf22.g:252:3: otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) ) ( (lv_target_3_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

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

            // InternalIf22.g:274:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalIf22.g:275:4: (lv_exp_2_0= ruleExp )
            {
            // InternalIf22.g:275:4: (lv_exp_2_0= ruleExp )
            // InternalIf22.g:276:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAnnouncementAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnouncementRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.if22.If22.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIf22.g:293:3: ( (lv_target_3_0= ruleTarget ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIf22.g:294:4: (lv_target_3_0= ruleTarget )
            	    {
            	    // InternalIf22.g:294:4: (lv_target_3_0= ruleTarget )
            	    // InternalIf22.g:295:5: lv_target_3_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAnnouncementAccess().getTargetTargetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_target_3_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnouncementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_3_0,
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
    // InternalIf22.g:316:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalIf22.g:316:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalIf22.g:317:2: iv_ruleQuestion= ruleQuestion EOF
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
    // InternalIf22.g:323:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qString_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_qType_4_0= ruleExp ) ) ( (lv_target_5_0= ruleTarget ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_qString_2_0 = null;

        EObject lv_qType_4_0 = null;

        EObject lv_target_5_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:329:2: ( (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qString_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_qType_4_0= ruleExp ) ) ( (lv_target_5_0= ruleTarget ) )+ ) )
            // InternalIf22.g:330:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qString_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_qType_4_0= ruleExp ) ) ( (lv_target_5_0= ruleTarget ) )+ )
            {
            // InternalIf22.g:330:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qString_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_qType_4_0= ruleExp ) ) ( (lv_target_5_0= ruleTarget ) )+ )
            // InternalIf22.g:331:3: otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qString_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_qType_4_0= ruleExp ) ) ( (lv_target_5_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalIf22.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalIf22.g:353:3: ( (lv_qString_2_0= ruleExp ) )
            // InternalIf22.g:354:4: (lv_qString_2_0= ruleExp )
            {
            // InternalIf22.g:354:4: (lv_qString_2_0= ruleExp )
            // InternalIf22.g:355:5: lv_qString_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getQStringExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_qString_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"qString",
            						lv_qString_2_0,
            						"org.xtext.example.if22.If22.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3());
            		
            // InternalIf22.g:376:3: ( (lv_qType_4_0= ruleExp ) )
            // InternalIf22.g:377:4: (lv_qType_4_0= ruleExp )
            {
            // InternalIf22.g:377:4: (lv_qType_4_0= ruleExp )
            // InternalIf22.g:378:5: lv_qType_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getQTypeExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_qType_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"qType",
            						lv_qType_4_0,
            						"org.xtext.example.if22.If22.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIf22.g:395:3: ( (lv_target_5_0= ruleTarget ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIf22.g:396:4: (lv_target_5_0= ruleTarget )
            	    {
            	    // InternalIf22.g:396:4: (lv_target_5_0= ruleTarget )
            	    // InternalIf22.g:397:5: lv_target_5_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getTargetTargetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_target_5_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"target",
            	    						lv_target_5_0,
            	    						"org.xtext.example.if22.If22.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEnd"
    // InternalIf22.g:418:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalIf22.g:418:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalIf22.g:419:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalIf22.g:425:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:431:2: ( (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? ) )
            // InternalIf22.g:432:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? )
            {
            // InternalIf22.g:432:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )? )
            // InternalIf22.g:433:3: otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_exp_2_0= ruleExp ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
            		
            // InternalIf22.g:437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:438:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalIf22.g:455:3: ( (lv_exp_2_0= ruleExp ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||(LA6_0>=21 && LA6_0<=23)||(LA6_0>=37 && LA6_0<=38)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIf22.g:456:4: (lv_exp_2_0= ruleExp )
                    {
                    // InternalIf22.g:456:4: (lv_exp_2_0= ruleExp )
                    // InternalIf22.g:457:5: lv_exp_2_0= ruleExp
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
    // InternalIf22.g:478:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalIf22.g:478:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalIf22.g:479:2: iv_ruleTarget= ruleTarget EOF
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
    // InternalIf22.g:485:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIf22.g:491:2: ( (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalIf22.g:492:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalIf22.g:492:2: (otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalIf22.g:493:3: otherlv_0= 'to' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
            		
            // InternalIf22.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIf22.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIf22.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalIf22.g:499:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleType"
    // InternalIf22.g:519:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalIf22.g:519:44: (iv_ruleType= ruleType EOF )
            // InternalIf22.g:520:2: iv_ruleType= ruleType EOF
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
    // InternalIf22.g:526:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'text' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIf22.g:532:2: ( (kw= 'boolean' | kw= 'text' | kw= 'number' ) )
            // InternalIf22.g:533:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            {
            // InternalIf22.g:533:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
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
                    // InternalIf22.g:534:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIf22.g:540:3: kw= 'text'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalIf22.g:546:3: kw= 'number'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExp"
    // InternalIf22.g:555:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalIf22.g:555:44: (iv_ruleExp= ruleExp EOF )
            // InternalIf22.g:556:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // InternalIf22.g:562:1: ruleExp returns [EObject current=null] : ( () ( (lv_left_1_0= rulePrimary ) ) ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_18_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:568:2: ( ( () ( (lv_left_1_0= rulePrimary ) ) ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )* ) )
            // InternalIf22.g:569:2: ( () ( (lv_left_1_0= rulePrimary ) ) ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )* )
            {
            // InternalIf22.g:569:2: ( () ( (lv_left_1_0= rulePrimary ) ) ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )* )
            // InternalIf22.g:570:3: () ( (lv_left_1_0= rulePrimary ) ) ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )*
            {
            // InternalIf22.g:570:3: ()
            // InternalIf22.g:571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpAccess().getExpAction_0(),
            					current);
            			

            }

            // InternalIf22.g:577:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalIf22.g:578:4: (lv_left_1_0= rulePrimary )
            {
            // InternalIf22.g:578:4: (lv_left_1_0= rulePrimary )
            // InternalIf22.g:579:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.xtext.example.if22.If22.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIf22.g:596:3: ( ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=24 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIf22.g:597:4: ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) ) ( (lv_right_18_0= rulePrimary ) )
            	    {
            	    // InternalIf22.g:597:4: ( ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) ) | ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) ) | ( () otherlv_17= '&' ) )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	    case 25:
            	    case 26:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 30:
            	    case 31:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalIf22.g:598:5: ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) )
            	            {
            	            // InternalIf22.g:598:5: ( () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' ) )
            	            // InternalIf22.g:599:6: () (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' )
            	            {
            	            // InternalIf22.g:599:6: ()
            	            // InternalIf22.g:600:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getLogicLeftAction_2_0_0_0(),
            	            								current);
            	            						

            	            }

            	            // InternalIf22.g:606:6: (otherlv_3= '==' | otherlv_4= '!=' | otherlv_5= '<' | otherlv_6= '>' | otherlv_7= '<=' | otherlv_8= '>=' | otherlv_9= '&&' | otherlv_10= '||' )
            	            int alt8=8;
            	            switch ( input.LA(1) ) {
            	            case 24:
            	                {
            	                alt8=1;
            	                }
            	                break;
            	            case 25:
            	                {
            	                alt8=2;
            	                }
            	                break;
            	            case 26:
            	                {
            	                alt8=3;
            	                }
            	                break;
            	            case 27:
            	                {
            	                alt8=4;
            	                }
            	                break;
            	            case 28:
            	                {
            	                alt8=5;
            	                }
            	                break;
            	            case 29:
            	                {
            	                alt8=6;
            	                }
            	                break;
            	            case 30:
            	                {
            	                alt8=7;
            	                }
            	                break;
            	            case 31:
            	                {
            	                alt8=8;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 8, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt8) {
            	                case 1 :
            	                    // InternalIf22.g:607:7: otherlv_3= '=='
            	                    {
            	                    otherlv_3=(Token)match(input,24,FOLLOW_7); 

            	                    							newLeafNode(otherlv_3, grammarAccess.getExpAccess().getEqualsSignEqualsSignKeyword_2_0_0_1_0());
            	                    						

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalIf22.g:612:7: otherlv_4= '!='
            	                    {
            	                    otherlv_4=(Token)match(input,25,FOLLOW_7); 

            	                    							newLeafNode(otherlv_4, grammarAccess.getExpAccess().getExclamationMarkEqualsSignKeyword_2_0_0_1_1());
            	                    						

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalIf22.g:617:7: otherlv_5= '<'
            	                    {
            	                    otherlv_5=(Token)match(input,26,FOLLOW_7); 

            	                    							newLeafNode(otherlv_5, grammarAccess.getExpAccess().getLessThanSignKeyword_2_0_0_1_2());
            	                    						

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalIf22.g:622:7: otherlv_6= '>'
            	                    {
            	                    otherlv_6=(Token)match(input,27,FOLLOW_7); 

            	                    							newLeafNode(otherlv_6, grammarAccess.getExpAccess().getGreaterThanSignKeyword_2_0_0_1_3());
            	                    						

            	                    }
            	                    break;
            	                case 5 :
            	                    // InternalIf22.g:627:7: otherlv_7= '<='
            	                    {
            	                    otherlv_7=(Token)match(input,28,FOLLOW_7); 

            	                    							newLeafNode(otherlv_7, grammarAccess.getExpAccess().getLessThanSignEqualsSignKeyword_2_0_0_1_4());
            	                    						

            	                    }
            	                    break;
            	                case 6 :
            	                    // InternalIf22.g:632:7: otherlv_8= '>='
            	                    {
            	                    otherlv_8=(Token)match(input,29,FOLLOW_7); 

            	                    							newLeafNode(otherlv_8, grammarAccess.getExpAccess().getGreaterThanSignEqualsSignKeyword_2_0_0_1_5());
            	                    						

            	                    }
            	                    break;
            	                case 7 :
            	                    // InternalIf22.g:637:7: otherlv_9= '&&'
            	                    {
            	                    otherlv_9=(Token)match(input,30,FOLLOW_7); 

            	                    							newLeafNode(otherlv_9, grammarAccess.getExpAccess().getAmpersandAmpersandKeyword_2_0_0_1_6());
            	                    						

            	                    }
            	                    break;
            	                case 8 :
            	                    // InternalIf22.g:642:7: otherlv_10= '||'
            	                    {
            	                    otherlv_10=(Token)match(input,31,FOLLOW_7); 

            	                    							newLeafNode(otherlv_10, grammarAccess.getExpAccess().getVerticalLineVerticalLineKeyword_2_0_0_1_7());
            	                    						

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIf22.g:649:5: ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) )
            	            {
            	            // InternalIf22.g:649:5: ( () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' ) )
            	            // InternalIf22.g:650:6: () (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' )
            	            {
            	            // InternalIf22.g:650:6: ()
            	            // InternalIf22.g:651:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMathLeftAction_2_0_1_0(),
            	            								current);
            	            						

            	            }

            	            // InternalIf22.g:657:6: (otherlv_12= '+' | otherlv_13= '-' | otherlv_14= '*' | otherlv_15= '/' )
            	            int alt9=4;
            	            switch ( input.LA(1) ) {
            	            case 32:
            	                {
            	                alt9=1;
            	                }
            	                break;
            	            case 33:
            	                {
            	                alt9=2;
            	                }
            	                break;
            	            case 34:
            	                {
            	                alt9=3;
            	                }
            	                break;
            	            case 35:
            	                {
            	                alt9=4;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 9, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt9) {
            	                case 1 :
            	                    // InternalIf22.g:658:7: otherlv_12= '+'
            	                    {
            	                    otherlv_12=(Token)match(input,32,FOLLOW_7); 

            	                    							newLeafNode(otherlv_12, grammarAccess.getExpAccess().getPlusSignKeyword_2_0_1_1_0());
            	                    						

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalIf22.g:663:7: otherlv_13= '-'
            	                    {
            	                    otherlv_13=(Token)match(input,33,FOLLOW_7); 

            	                    							newLeafNode(otherlv_13, grammarAccess.getExpAccess().getHyphenMinusKeyword_2_0_1_1_1());
            	                    						

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalIf22.g:668:7: otherlv_14= '*'
            	                    {
            	                    otherlv_14=(Token)match(input,34,FOLLOW_7); 

            	                    							newLeafNode(otherlv_14, grammarAccess.getExpAccess().getAsteriskKeyword_2_0_1_1_2());
            	                    						

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalIf22.g:673:7: otherlv_15= '/'
            	                    {
            	                    otherlv_15=(Token)match(input,35,FOLLOW_7); 

            	                    							newLeafNode(otherlv_15, grammarAccess.getExpAccess().getSolidusKeyword_2_0_1_1_3());
            	                    						

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalIf22.g:680:5: ( () otherlv_17= '&' )
            	            {
            	            // InternalIf22.g:680:5: ( () otherlv_17= '&' )
            	            // InternalIf22.g:681:6: () otherlv_17= '&'
            	            {
            	            // InternalIf22.g:681:6: ()
            	            // InternalIf22.g:682:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getTextExpLeftAction_2_0_2_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_17=(Token)match(input,36,FOLLOW_7); 

            	            						newLeafNode(otherlv_17, grammarAccess.getExpAccess().getAmpersandKeyword_2_0_2_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalIf22.g:694:4: ( (lv_right_18_0= rulePrimary ) )
            	    // InternalIf22.g:695:5: (lv_right_18_0= rulePrimary )
            	    {
            	    // InternalIf22.g:695:5: (lv_right_18_0= rulePrimary )
            	    // InternalIf22.g:696:6: lv_right_18_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_18_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_18_0,
            	    							"org.xtext.example.if22.If22.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePrimary"
    // InternalIf22.g:718:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIf22.g:718:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIf22.g:719:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalIf22.g:725:1: rulePrimary returns [EObject current=null] : (this_Parenthesis_0= ruleParenthesis | ( () ruleType ) | ( () otherlv_4= 'this' ) | ( () this_STRING_6= RULE_STRING ) | ( () this_INT_8= RULE_INT ) | ( () this_BOOLEAN_10= RULE_BOOLEAN ) | ( () this_ID_12= RULE_ID ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token this_STRING_6=null;
        Token this_INT_8=null;
        Token this_BOOLEAN_10=null;
        Token this_ID_12=null;
        EObject this_Parenthesis_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:731:2: ( (this_Parenthesis_0= ruleParenthesis | ( () ruleType ) | ( () otherlv_4= 'this' ) | ( () this_STRING_6= RULE_STRING ) | ( () this_INT_8= RULE_INT ) | ( () this_BOOLEAN_10= RULE_BOOLEAN ) | ( () this_ID_12= RULE_ID ) ) )
            // InternalIf22.g:732:2: (this_Parenthesis_0= ruleParenthesis | ( () ruleType ) | ( () otherlv_4= 'this' ) | ( () this_STRING_6= RULE_STRING ) | ( () this_INT_8= RULE_INT ) | ( () this_BOOLEAN_10= RULE_BOOLEAN ) | ( () this_ID_12= RULE_ID ) )
            {
            // InternalIf22.g:732:2: (this_Parenthesis_0= ruleParenthesis | ( () ruleType ) | ( () otherlv_4= 'this' ) | ( () this_STRING_6= RULE_STRING ) | ( () this_INT_8= RULE_INT ) | ( () this_BOOLEAN_10= RULE_BOOLEAN ) | ( () this_ID_12= RULE_ID ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt12=1;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
                {
                alt12=4;
                }
                break;
            case RULE_INT:
                {
                alt12=5;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=6;
                }
                break;
            case RULE_ID:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIf22.g:733:3: this_Parenthesis_0= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_0=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIf22.g:742:3: ( () ruleType )
                    {
                    // InternalIf22.g:742:3: ( () ruleType )
                    // InternalIf22.g:743:4: () ruleType
                    {
                    // InternalIf22.g:743:4: ()
                    // InternalIf22.g:744:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getTypeAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalIf22.g:759:3: ( () otherlv_4= 'this' )
                    {
                    // InternalIf22.g:759:3: ( () otherlv_4= 'this' )
                    // InternalIf22.g:760:4: () otherlv_4= 'this'
                    {
                    // InternalIf22.g:760:4: ()
                    // InternalIf22.g:761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getThisAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getThisKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalIf22.g:773:3: ( () this_STRING_6= RULE_STRING )
                    {
                    // InternalIf22.g:773:3: ( () this_STRING_6= RULE_STRING )
                    // InternalIf22.g:774:4: () this_STRING_6= RULE_STRING
                    {
                    // InternalIf22.g:774:4: ()
                    // InternalIf22.g:775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getEXPSTRINGAction_3_0(),
                    						current);
                    				

                    }

                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_6, grammarAccess.getPrimaryAccess().getSTRINGTerminalRuleCall_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalIf22.g:787:3: ( () this_INT_8= RULE_INT )
                    {
                    // InternalIf22.g:787:3: ( () this_INT_8= RULE_INT )
                    // InternalIf22.g:788:4: () this_INT_8= RULE_INT
                    {
                    // InternalIf22.g:788:4: ()
                    // InternalIf22.g:789:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getEXPINTAction_4_0(),
                    						current);
                    				

                    }

                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_8, grammarAccess.getPrimaryAccess().getINTTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalIf22.g:801:3: ( () this_BOOLEAN_10= RULE_BOOLEAN )
                    {
                    // InternalIf22.g:801:3: ( () this_BOOLEAN_10= RULE_BOOLEAN )
                    // InternalIf22.g:802:4: () this_BOOLEAN_10= RULE_BOOLEAN
                    {
                    // InternalIf22.g:802:4: ()
                    // InternalIf22.g:803:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getEXPBOOLAction_5_0(),
                    						current);
                    				

                    }

                    this_BOOLEAN_10=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    				newLeafNode(this_BOOLEAN_10, grammarAccess.getPrimaryAccess().getBOOLEANTerminalRuleCall_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalIf22.g:815:3: ( () this_ID_12= RULE_ID )
                    {
                    // InternalIf22.g:815:3: ( () this_ID_12= RULE_ID )
                    // InternalIf22.g:816:4: () this_ID_12= RULE_ID
                    {
                    // InternalIf22.g:816:4: ()
                    // InternalIf22.g:817:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getIDAction_6_0(),
                    						current);
                    				

                    }

                    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_12, grammarAccess.getPrimaryAccess().getIDTerminalRuleCall_6_1());
                    			

                    }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalIf22.g:832:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalIf22.g:832:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalIf22.g:833:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalIf22.g:839:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalIf22.g:845:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalIf22.g:846:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalIf22.g:846:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalIf22.g:847:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalIf22.g:847:3: ()
            // InternalIf22.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalIf22.g:858:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalIf22.g:859:4: (lv_exp_2_0= ruleExp )
            {
            // InternalIf22.g:859:4: (lv_exp_2_0= ruleExp )
            // InternalIf22.g:860:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.if22.If22.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000006000E000F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006000E000F2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001FFF000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});

}
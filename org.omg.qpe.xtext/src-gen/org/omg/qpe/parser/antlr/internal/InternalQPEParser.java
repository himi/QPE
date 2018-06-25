package org.omg.qpe.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.qpe.services.QPEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQPEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_VALUE", "RULE_LONG", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'as'", "'.'", "'/'", "'::'", "'['", "','", "']'", "'='"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_VALUE=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_LONG=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQPEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQPEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQPEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQPE.g"; }



     	private QPEGrammarAccess grammarAccess;

        public InternalQPEParser(TokenStream input, QPEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QPE";
       	}

       	@Override
       	protected QPEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQPE"
    // InternalQPE.g:64:1: entryRuleQPE returns [EObject current=null] : iv_ruleQPE= ruleQPE EOF ;
    public final EObject entryRuleQPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQPE = null;


        try {
            // InternalQPE.g:64:44: (iv_ruleQPE= ruleQPE EOF )
            // InternalQPE.g:65:2: iv_ruleQPE= ruleQPE EOF
            {
             newCompositeNode(grammarAccess.getQPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQPE=ruleQPE();

            state._fsp--;

             current =iv_ruleQPE; 
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
    // $ANTLR end "entryRuleQPE"


    // $ANTLR start "ruleQPE"
    // InternalQPE.g:71:1: ruleQPE returns [EObject current=null] : ( ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathExpressions_1_0= rulePathExpression ) ) ) ;
    public final EObject ruleQPE() throws RecognitionException {
        EObject current = null;

        EObject lv_queryNamespaces_0_0 = null;

        EObject lv_pathExpressions_1_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:77:2: ( ( ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathExpressions_1_0= rulePathExpression ) ) ) )
            // InternalQPE.g:78:2: ( ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathExpressions_1_0= rulePathExpression ) ) )
            {
            // InternalQPE.g:78:2: ( ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathExpressions_1_0= rulePathExpression ) ) )
            // InternalQPE.g:79:3: ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathExpressions_1_0= rulePathExpression ) )
            {
            // InternalQPE.g:79:3: ( (lv_queryNamespaces_0_0= ruleQueryNamespace ) )
            // InternalQPE.g:80:4: (lv_queryNamespaces_0_0= ruleQueryNamespace )
            {
            // InternalQPE.g:80:4: (lv_queryNamespaces_0_0= ruleQueryNamespace )
            // InternalQPE.g:81:5: lv_queryNamespaces_0_0= ruleQueryNamespace
            {

            					newCompositeNode(grammarAccess.getQPEAccess().getQueryNamespacesQueryNamespaceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_queryNamespaces_0_0=ruleQueryNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQPERule());
            					}
            					add(
            						current,
            						"queryNamespaces",
            						lv_queryNamespaces_0_0,
            						"org.omg.qpe.QPE.QueryNamespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQPE.g:98:3: ( (lv_pathExpressions_1_0= rulePathExpression ) )
            // InternalQPE.g:99:4: (lv_pathExpressions_1_0= rulePathExpression )
            {
            // InternalQPE.g:99:4: (lv_pathExpressions_1_0= rulePathExpression )
            // InternalQPE.g:100:5: lv_pathExpressions_1_0= rulePathExpression
            {

            					newCompositeNode(grammarAccess.getQPEAccess().getPathExpressionsPathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathExpressions_1_0=rulePathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQPERule());
            					}
            					add(
            						current,
            						"pathExpressions",
            						lv_pathExpressions_1_0,
            						"org.omg.qpe.QPE.PathExpression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleQPE"


    // $ANTLR start "entryRuleQueryNamespace"
    // InternalQPE.g:121:1: entryRuleQueryNamespace returns [EObject current=null] : iv_ruleQueryNamespace= ruleQueryNamespace EOF ;
    public final EObject entryRuleQueryNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryNamespace = null;


        try {
            // InternalQPE.g:121:55: (iv_ruleQueryNamespace= ruleQueryNamespace EOF )
            // InternalQPE.g:122:2: iv_ruleQueryNamespace= ruleQueryNamespace EOF
            {
             newCompositeNode(grammarAccess.getQueryNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryNamespace=ruleQueryNamespace();

            state._fsp--;

             current =iv_ruleQueryNamespace; 
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
    // $ANTLR end "entryRuleQueryNamespace"


    // $ANTLR start "ruleQueryNamespace"
    // InternalQPE.g:128:1: ruleQueryNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_IRI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleQueryNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_IRI_1_0=null;
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;


        	enterRule();

        try {
            // InternalQPE.g:134:2: ( (otherlv_0= 'namespace' ( (lv_IRI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )? ) )
            // InternalQPE.g:135:2: (otherlv_0= 'namespace' ( (lv_IRI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )? )
            {
            // InternalQPE.g:135:2: (otherlv_0= 'namespace' ( (lv_IRI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )? )
            // InternalQPE.g:136:3: otherlv_0= 'namespace' ( (lv_IRI_1_0= RULE_STRING ) ) (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalQPE.g:140:3: ( (lv_IRI_1_0= RULE_STRING ) )
            // InternalQPE.g:141:4: (lv_IRI_1_0= RULE_STRING )
            {
            // InternalQPE.g:141:4: (lv_IRI_1_0= RULE_STRING )
            // InternalQPE.g:142:5: lv_IRI_1_0= RULE_STRING
            {
            lv_IRI_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_IRI_1_0, grammarAccess.getQueryNamespaceAccess().getIRISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryNamespaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"IRI",
            						lv_IRI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQPE.g:158:3: (otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQPE.g:159:4: otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getQueryNamespaceAccess().getAsKeyword_2_0());
                    			
                    // InternalQPE.g:163:4: ( (lv_prefix_3_0= RULE_ID ) )
                    // InternalQPE.g:164:5: (lv_prefix_3_0= RULE_ID )
                    {
                    // InternalQPE.g:164:5: (lv_prefix_3_0= RULE_ID )
                    // InternalQPE.g:165:6: lv_prefix_3_0= RULE_ID
                    {
                    lv_prefix_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_prefix_3_0, grammarAccess.getQueryNamespaceAccess().getPrefixIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryNamespaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prefix",
                    							lv_prefix_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleQueryNamespace"


    // $ANTLR start "entryRulePathExpression"
    // InternalQPE.g:186:1: entryRulePathExpression returns [EObject current=null] : iv_rulePathExpression= rulePathExpression EOF ;
    public final EObject entryRulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpression = null;


        try {
            // InternalQPE.g:186:55: (iv_rulePathExpression= rulePathExpression EOF )
            // InternalQPE.g:187:2: iv_rulePathExpression= rulePathExpression EOF
            {
             newCompositeNode(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathExpression=rulePathExpression();

            state._fsp--;

             current =iv_rulePathExpression; 
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
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // InternalQPE.g:193:1: rulePathExpression returns [EObject current=null] : ( () ( (lv_isRelative_1_0= '.' ) )? ( (lv_qualifier_2_0= ruleQualifier ) )? otherlv_3= '/' ( (lv_head_4_0= ruleQueryElement ) )? ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isRelative_1_0=null;
        Token otherlv_3=null;
        EObject lv_qualifier_2_0 = null;

        EObject lv_head_4_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:199:2: ( ( () ( (lv_isRelative_1_0= '.' ) )? ( (lv_qualifier_2_0= ruleQualifier ) )? otherlv_3= '/' ( (lv_head_4_0= ruleQueryElement ) )? ) )
            // InternalQPE.g:200:2: ( () ( (lv_isRelative_1_0= '.' ) )? ( (lv_qualifier_2_0= ruleQualifier ) )? otherlv_3= '/' ( (lv_head_4_0= ruleQueryElement ) )? )
            {
            // InternalQPE.g:200:2: ( () ( (lv_isRelative_1_0= '.' ) )? ( (lv_qualifier_2_0= ruleQualifier ) )? otherlv_3= '/' ( (lv_head_4_0= ruleQueryElement ) )? )
            // InternalQPE.g:201:3: () ( (lv_isRelative_1_0= '.' ) )? ( (lv_qualifier_2_0= ruleQualifier ) )? otherlv_3= '/' ( (lv_head_4_0= ruleQueryElement ) )?
            {
            // InternalQPE.g:201:3: ()
            // InternalQPE.g:202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPathExpressionAccess().getPathExpressionAction_0(),
            					current);
            			

            }

            // InternalQPE.g:208:3: ( (lv_isRelative_1_0= '.' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQPE.g:209:4: (lv_isRelative_1_0= '.' )
                    {
                    // InternalQPE.g:209:4: (lv_isRelative_1_0= '.' )
                    // InternalQPE.g:210:5: lv_isRelative_1_0= '.'
                    {
                    lv_isRelative_1_0=(Token)match(input,17,FOLLOW_7); 

                    					newLeafNode(lv_isRelative_1_0, grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPathExpressionRule());
                    					}
                    					setWithLastConsumed(current, "isRelative", true, ".");
                    				

                    }


                    }
                    break;

            }

            // InternalQPE.g:222:3: ( (lv_qualifier_2_0= ruleQualifier ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQPE.g:223:4: (lv_qualifier_2_0= ruleQualifier )
                    {
                    // InternalQPE.g:223:4: (lv_qualifier_2_0= ruleQualifier )
                    // InternalQPE.g:224:5: lv_qualifier_2_0= ruleQualifier
                    {

                    					newCompositeNode(grammarAccess.getPathExpressionAccess().getQualifierQualifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_qualifier_2_0=ruleQualifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    					}
                    					set(
                    						current,
                    						"qualifier",
                    						lv_qualifier_2_0,
                    						"org.omg.qpe.QPE.Qualifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPathExpressionAccess().getSolidusKeyword_3());
            		
            // InternalQPE.g:245:3: ( (lv_head_4_0= ruleQueryElement ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQPE.g:246:4: (lv_head_4_0= ruleQueryElement )
                    {
                    // InternalQPE.g:246:4: (lv_head_4_0= ruleQueryElement )
                    // InternalQPE.g:247:5: lv_head_4_0= ruleQueryElement
                    {

                    					newCompositeNode(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_head_4_0=ruleQueryElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPathExpressionRule());
                    					}
                    					set(
                    						current,
                    						"head",
                    						lv_head_4_0,
                    						"org.omg.qpe.QPE.QueryElement");
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
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRuleQueryElement"
    // InternalQPE.g:268:1: entryRuleQueryElement returns [EObject current=null] : iv_ruleQueryElement= ruleQueryElement EOF ;
    public final EObject entryRuleQueryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryElement = null;


        try {
            // InternalQPE.g:268:53: (iv_ruleQueryElement= ruleQueryElement EOF )
            // InternalQPE.g:269:2: iv_ruleQueryElement= ruleQueryElement EOF
            {
             newCompositeNode(grammarAccess.getQueryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryElement=ruleQueryElement();

            state._fsp--;

             current =iv_ruleQueryElement; 
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
    // $ANTLR end "entryRuleQueryElement"


    // $ANTLR start "ruleQueryElement"
    // InternalQPE.g:275:1: ruleQueryElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? ) ;
    public final EObject ruleQueryElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_qualifier_3_0 = null;

        EObject lv_next_5_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:281:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? ) )
            // InternalQPE.g:282:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? )
            {
            // InternalQPE.g:282:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? )
            // InternalQPE.g:283:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )?
            {
            // InternalQPE.g:283:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalQPE.g:284:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:284:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:285:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:285:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:286:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryElementRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_0, grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:302:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:303:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:303:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:304:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0());
            				

            }


            }

            // InternalQPE.g:315:3: ( (lv_qualifier_3_0= ruleQualifier ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQPE.g:316:4: (lv_qualifier_3_0= ruleQualifier )
                    {
                    // InternalQPE.g:316:4: (lv_qualifier_3_0= ruleQualifier )
                    // InternalQPE.g:317:5: lv_qualifier_3_0= ruleQualifier
                    {

                    					newCompositeNode(grammarAccess.getQueryElementAccess().getQualifierQualifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_qualifier_3_0=ruleQualifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryElementRule());
                    					}
                    					set(
                    						current,
                    						"qualifier",
                    						lv_qualifier_3_0,
                    						"org.omg.qpe.QPE.Qualifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQPE.g:334:3: (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQPE.g:335:4: otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0());
                    			
                    // InternalQPE.g:339:4: ( (lv_next_5_0= ruleQueryElement ) )
                    // InternalQPE.g:340:5: (lv_next_5_0= ruleQueryElement )
                    {
                    // InternalQPE.g:340:5: (lv_next_5_0= ruleQueryElement )
                    // InternalQPE.g:341:6: lv_next_5_0= ruleQueryElement
                    {

                    						newCompositeNode(grammarAccess.getQueryElementAccess().getNextQueryElementParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=ruleQueryElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryElementRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_5_0,
                    							"org.omg.qpe.QPE.QueryElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleQueryElement"


    // $ANTLR start "entryRuleQualifier"
    // InternalQPE.g:363:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalQPE.g:363:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalQPE.g:364:2: iv_ruleQualifier= ruleQualifier EOF
            {
             newCompositeNode(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifier=ruleQualifier();

            state._fsp--;

             current =iv_ruleQualifier; 
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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalQPE.g:370:1: ruleQualifier returns [EObject current=null] : (otherlv_0= '[' ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) ) otherlv_7= ']' ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_index_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_predicates_3_0 = null;

        EObject lv_predicates_4_0 = null;

        EObject lv_predicates_6_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:376:2: ( (otherlv_0= '[' ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) ) otherlv_7= ']' ) )
            // InternalQPE.g:377:2: (otherlv_0= '[' ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) ) otherlv_7= ']' )
            {
            // InternalQPE.g:377:2: (otherlv_0= '[' ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) ) otherlv_7= ']' )
            // InternalQPE.g:378:3: otherlv_0= '[' ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalQPE.g:382:3: ( ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* ) | ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQPE.g:383:4: ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* )
                    {
                    // InternalQPE.g:383:4: ( ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )* )
                    // InternalQPE.g:384:5: ( (lv_index_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )*
                    {
                    // InternalQPE.g:384:5: ( (lv_index_1_0= RULE_INT ) )
                    // InternalQPE.g:385:6: (lv_index_1_0= RULE_INT )
                    {
                    // InternalQPE.g:385:6: (lv_index_1_0= RULE_INT )
                    // InternalQPE.g:386:7: lv_index_1_0= RULE_INT
                    {
                    lv_index_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    							newLeafNode(lv_index_1_0, grammarAccess.getQualifierAccess().getIndexINTTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getQualifierRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"index",
                    								lv_index_1_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalQPE.g:402:5: (otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalQPE.g:403:6: otherlv_2= ',' ( (lv_predicates_3_0= rulePredicate ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_13); 

                    	    						newLeafNode(otherlv_2, grammarAccess.getQualifierAccess().getCommaKeyword_1_0_1_0());
                    	    					
                    	    // InternalQPE.g:407:6: ( (lv_predicates_3_0= rulePredicate ) )
                    	    // InternalQPE.g:408:7: (lv_predicates_3_0= rulePredicate )
                    	    {
                    	    // InternalQPE.g:408:7: (lv_predicates_3_0= rulePredicate )
                    	    // InternalQPE.g:409:8: lv_predicates_3_0= rulePredicate
                    	    {

                    	    								newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_predicates_3_0=rulePredicate();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getQualifierRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"predicates",
                    	    									lv_predicates_3_0,
                    	    									"org.omg.qpe.QPE.Predicate");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:429:4: ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* )
                    {
                    // InternalQPE.g:429:4: ( ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )* )
                    // InternalQPE.g:430:5: ( (lv_predicates_4_0= rulePredicate ) ) (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )*
                    {
                    // InternalQPE.g:430:5: ( (lv_predicates_4_0= rulePredicate ) )
                    // InternalQPE.g:431:6: (lv_predicates_4_0= rulePredicate )
                    {
                    // InternalQPE.g:431:6: (lv_predicates_4_0= rulePredicate )
                    // InternalQPE.g:432:7: lv_predicates_4_0= rulePredicate
                    {

                    							newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_predicates_4_0=rulePredicate();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getQualifierRule());
                    							}
                    							add(
                    								current,
                    								"predicates",
                    								lv_predicates_4_0,
                    								"org.omg.qpe.QPE.Predicate");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalQPE.g:449:5: (otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalQPE.g:450:6: otherlv_5= ',' ( (lv_predicates_6_0= rulePredicate ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getQualifierAccess().getCommaKeyword_1_1_1_0());
                    	    					
                    	    // InternalQPE.g:454:6: ( (lv_predicates_6_0= rulePredicate ) )
                    	    // InternalQPE.g:455:7: (lv_predicates_6_0= rulePredicate )
                    	    {
                    	    // InternalQPE.g:455:7: (lv_predicates_6_0= rulePredicate )
                    	    // InternalQPE.g:456:8: lv_predicates_6_0= rulePredicate
                    	    {

                    	    								newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_predicates_6_0=rulePredicate();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getQualifierRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"predicates",
                    	    									lv_predicates_6_0,
                    	    									"org.omg.qpe.QPE.Predicate");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRulePredicate"
    // InternalQPE.g:484:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalQPE.g:484:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalQPE.g:485:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalQPE.g:491:1: rulePredicate returns [EObject current=null] : (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_ClassifierPredicate_0 = null;

        EObject this_AttributePredicate_1 = null;

        EObject this_ReferencePredicate_2 = null;



        	enterRule();

        try {
            // InternalQPE.g:497:2: ( (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate ) )
            // InternalQPE.g:498:2: (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate )
            {
            // InternalQPE.g:498:2: (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt11=2;
                    }
                    break;
                case 19:
                    {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 23:
                            {
                            alt11=2;
                            }
                            break;
                        case EOF:
                        case 21:
                        case 22:
                            {
                            alt11=1;
                            }
                            break;
                        case 20:
                            {
                            alt11=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 21:
                case 22:
                    {
                    alt11=1;
                    }
                    break;
                case 20:
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQPE.g:499:3: this_ClassifierPredicate_0= ruleClassifierPredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getClassifierPredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassifierPredicate_0=ruleClassifierPredicate();

                    state._fsp--;


                    			current = this_ClassifierPredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQPE.g:508:3: this_AttributePredicate_1= ruleAttributePredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getAttributePredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributePredicate_1=ruleAttributePredicate();

                    state._fsp--;


                    			current = this_AttributePredicate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQPE.g:517:3: this_ReferencePredicate_2= ruleReferencePredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getReferencePredicateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReferencePredicate_2=ruleReferencePredicate();

                    state._fsp--;


                    			current = this_ReferencePredicate_2;
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleClassifierPredicate"
    // InternalQPE.g:529:1: entryRuleClassifierPredicate returns [EObject current=null] : iv_ruleClassifierPredicate= ruleClassifierPredicate EOF ;
    public final EObject entryRuleClassifierPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierPredicate = null;


        try {
            // InternalQPE.g:529:60: (iv_ruleClassifierPredicate= ruleClassifierPredicate EOF )
            // InternalQPE.g:530:2: iv_ruleClassifierPredicate= ruleClassifierPredicate EOF
            {
             newCompositeNode(grammarAccess.getClassifierPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifierPredicate=ruleClassifierPredicate();

            state._fsp--;

             current =iv_ruleClassifierPredicate; 
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
    // $ANTLR end "entryRuleClassifierPredicate"


    // $ANTLR start "ruleClassifierPredicate"
    // InternalQPE.g:536:1: ruleClassifierPredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassifierPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQPE.g:542:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalQPE.g:543:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalQPE.g:543:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalQPE.g:544:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalQPE.g:544:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==19) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalQPE.g:545:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:545:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:546:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:546:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:547:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassifierPredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_0, grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:563:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:564:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:564:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:565:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassifierPredicateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0());
            				

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
    // $ANTLR end "ruleClassifierPredicate"


    // $ANTLR start "entryRuleAttributePredicate"
    // InternalQPE.g:580:1: entryRuleAttributePredicate returns [EObject current=null] : iv_ruleAttributePredicate= ruleAttributePredicate EOF ;
    public final EObject entryRuleAttributePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePredicate = null;


        try {
            // InternalQPE.g:580:59: (iv_ruleAttributePredicate= ruleAttributePredicate EOF )
            // InternalQPE.g:581:2: iv_ruleAttributePredicate= ruleAttributePredicate EOF
            {
             newCompositeNode(grammarAccess.getAttributePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributePredicate=ruleAttributePredicate();

            state._fsp--;

             current =iv_ruleAttributePredicate; 
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
    // $ANTLR end "entryRuleAttributePredicate"


    // $ANTLR start "ruleAttributePredicate"
    // InternalQPE.g:587:1: ruleAttributePredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_VALUE ) ) ) ;
    public final EObject ruleAttributePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalQPE.g:593:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_VALUE ) ) ) )
            // InternalQPE.g:594:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_VALUE ) ) )
            {
            // InternalQPE.g:594:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_VALUE ) ) )
            // InternalQPE.g:595:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_VALUE ) )
            {
            // InternalQPE.g:595:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==19) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalQPE.g:596:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:596:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:597:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:597:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:598:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributePredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_0, grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:614:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:615:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:615:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:616:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributePredicateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2());
            		
            // InternalQPE.g:631:3: ( (lv_value_4_0= RULE_VALUE ) )
            // InternalQPE.g:632:4: (lv_value_4_0= RULE_VALUE )
            {
            // InternalQPE.g:632:4: (lv_value_4_0= RULE_VALUE )
            // InternalQPE.g:633:5: lv_value_4_0= RULE_VALUE
            {
            lv_value_4_0=(Token)match(input,RULE_VALUE,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getAttributePredicateAccess().getValueVALUETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributePredicateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.omg.qpe.QPE.VALUE");
            				

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
    // $ANTLR end "ruleAttributePredicate"


    // $ANTLR start "entryRuleReferencePredicate"
    // InternalQPE.g:653:1: entryRuleReferencePredicate returns [EObject current=null] : iv_ruleReferencePredicate= ruleReferencePredicate EOF ;
    public final EObject entryRuleReferencePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencePredicate = null;


        try {
            // InternalQPE.g:653:59: (iv_ruleReferencePredicate= ruleReferencePredicate EOF )
            // InternalQPE.g:654:2: iv_ruleReferencePredicate= ruleReferencePredicate EOF
            {
             newCompositeNode(grammarAccess.getReferencePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferencePredicate=ruleReferencePredicate();

            state._fsp--;

             current =iv_ruleReferencePredicate; 
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
    // $ANTLR end "entryRuleReferencePredicate"


    // $ANTLR start "ruleReferencePredicate"
    // InternalQPE.g:660:1: ruleReferencePredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) ) ;
    public final EObject ruleReferencePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_qualifier_3_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:666:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) ) )
            // InternalQPE.g:667:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) )
            {
            // InternalQPE.g:667:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) )
            // InternalQPE.g:668:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )
            {
            // InternalQPE.g:668:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==19) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalQPE.g:669:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:669:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:670:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:670:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:671:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferencePredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_0, grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:687:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:688:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:688:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:689:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencePredicateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_2, grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0());
            				

            }


            }

            // InternalQPE.g:700:3: ( (lv_qualifier_3_0= ruleQualifier ) )
            // InternalQPE.g:701:4: (lv_qualifier_3_0= ruleQualifier )
            {
            // InternalQPE.g:701:4: (lv_qualifier_3_0= ruleQualifier )
            // InternalQPE.g:702:5: lv_qualifier_3_0= ruleQualifier
            {

            					newCompositeNode(grammarAccess.getReferencePredicateAccess().getQualifierQualifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_qualifier_3_0=ruleQualifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferencePredicateRule());
            					}
            					set(
            						current,
            						"qualifier",
            						lv_qualifier_3_0,
            						"org.omg.qpe.QPE.Qualifier");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleReferencePredicate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});

}
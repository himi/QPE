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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'as'", "'.'", "'/'", "'::'", "'['", "','", "']'", "'='", "'L'", "'l'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalQPE.g:71:1: ruleQPE returns [EObject current=null] : ( ( (lv_querynamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathexpressions_1_0= rulePathExpression ) ) ) ;
    public final EObject ruleQPE() throws RecognitionException {
        EObject current = null;

        EObject lv_querynamespaces_0_0 = null;

        EObject lv_pathexpressions_1_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:77:2: ( ( ( (lv_querynamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathexpressions_1_0= rulePathExpression ) ) ) )
            // InternalQPE.g:78:2: ( ( (lv_querynamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathexpressions_1_0= rulePathExpression ) ) )
            {
            // InternalQPE.g:78:2: ( ( (lv_querynamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathexpressions_1_0= rulePathExpression ) ) )
            // InternalQPE.g:79:3: ( (lv_querynamespaces_0_0= ruleQueryNamespace ) ) ( (lv_pathexpressions_1_0= rulePathExpression ) )
            {
            // InternalQPE.g:79:3: ( (lv_querynamespaces_0_0= ruleQueryNamespace ) )
            // InternalQPE.g:80:4: (lv_querynamespaces_0_0= ruleQueryNamespace )
            {
            // InternalQPE.g:80:4: (lv_querynamespaces_0_0= ruleQueryNamespace )
            // InternalQPE.g:81:5: lv_querynamespaces_0_0= ruleQueryNamespace
            {

            					newCompositeNode(grammarAccess.getQPEAccess().getQuerynamespacesQueryNamespaceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_querynamespaces_0_0=ruleQueryNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQPERule());
            					}
            					add(
            						current,
            						"querynamespaces",
            						lv_querynamespaces_0_0,
            						"org.omg.qpe.QPE.QueryNamespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQPE.g:98:3: ( (lv_pathexpressions_1_0= rulePathExpression ) )
            // InternalQPE.g:99:4: (lv_pathexpressions_1_0= rulePathExpression )
            {
            // InternalQPE.g:99:4: (lv_pathexpressions_1_0= rulePathExpression )
            // InternalQPE.g:100:5: lv_pathexpressions_1_0= rulePathExpression
            {

            					newCompositeNode(grammarAccess.getQPEAccess().getPathexpressionsPathExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathexpressions_1_0=rulePathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQPERule());
            					}
            					add(
            						current,
            						"pathexpressions",
            						lv_pathexpressions_1_0,
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
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

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

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQPE.g:159:4: otherlv_2= 'as' ( (lv_prefix_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

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
    // InternalQPE.g:193:1: rulePathExpression returns [EObject current=null] : ( ( (lv_isRelative_0_0= '.' ) ) otherlv_1= '/' ( (lv_head_2_0= ruleQueryElement ) ) ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isRelative_0_0=null;
        Token otherlv_1=null;
        EObject lv_head_2_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:199:2: ( ( ( (lv_isRelative_0_0= '.' ) ) otherlv_1= '/' ( (lv_head_2_0= ruleQueryElement ) ) ) )
            // InternalQPE.g:200:2: ( ( (lv_isRelative_0_0= '.' ) ) otherlv_1= '/' ( (lv_head_2_0= ruleQueryElement ) ) )
            {
            // InternalQPE.g:200:2: ( ( (lv_isRelative_0_0= '.' ) ) otherlv_1= '/' ( (lv_head_2_0= ruleQueryElement ) ) )
            // InternalQPE.g:201:3: ( (lv_isRelative_0_0= '.' ) ) otherlv_1= '/' ( (lv_head_2_0= ruleQueryElement ) )
            {
            // InternalQPE.g:201:3: ( (lv_isRelative_0_0= '.' ) )
            // InternalQPE.g:202:4: (lv_isRelative_0_0= '.' )
            {
            // InternalQPE.g:202:4: (lv_isRelative_0_0= '.' )
            // InternalQPE.g:203:5: lv_isRelative_0_0= '.'
            {
            lv_isRelative_0_0=(Token)match(input,13,FOLLOW_7); 

            					newLeafNode(lv_isRelative_0_0, grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathExpressionRule());
            					}
            					setWithLastConsumed(current, "isRelative", true, ".");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPathExpressionAccess().getSolidusKeyword_1());
            		
            // InternalQPE.g:219:3: ( (lv_head_2_0= ruleQueryElement ) )
            // InternalQPE.g:220:4: (lv_head_2_0= ruleQueryElement )
            {
            // InternalQPE.g:220:4: (lv_head_2_0= ruleQueryElement )
            // InternalQPE.g:221:5: lv_head_2_0= ruleQueryElement
            {

            					newCompositeNode(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_head_2_0=ruleQueryElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathExpressionRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_2_0,
            						"org.omg.qpe.QPE.QueryElement");
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
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRuleQueryElement"
    // InternalQPE.g:242:1: entryRuleQueryElement returns [EObject current=null] : iv_ruleQueryElement= ruleQueryElement EOF ;
    public final EObject entryRuleQueryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryElement = null;


        try {
            // InternalQPE.g:242:53: (iv_ruleQueryElement= ruleQueryElement EOF )
            // InternalQPE.g:243:2: iv_ruleQueryElement= ruleQueryElement EOF
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
    // InternalQPE.g:249:1: ruleQueryElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? ) ;
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
            // InternalQPE.g:255:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? ) )
            // InternalQPE.g:256:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? )
            {
            // InternalQPE.g:256:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )? )
            // InternalQPE.g:257:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )? (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )?
            {
            // InternalQPE.g:257:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // InternalQPE.g:258:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:258:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:259:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:259:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:260:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQueryElementRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_0, grammarAccess.getQueryElementAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:276:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:277:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:277:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:278:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0());
            				

            }


            }

            // InternalQPE.g:289:3: ( (lv_qualifier_3_0= ruleQualifier ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQPE.g:290:4: (lv_qualifier_3_0= ruleQualifier )
                    {
                    // InternalQPE.g:290:4: (lv_qualifier_3_0= ruleQualifier )
                    // InternalQPE.g:291:5: lv_qualifier_3_0= ruleQualifier
                    {

                    					newCompositeNode(grammarAccess.getQueryElementAccess().getQualifierQualifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_10);
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

            // InternalQPE.g:308:3: (otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQPE.g:309:4: otherlv_4= '/' ( (lv_next_5_0= ruleQueryElement ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0());
                    			
                    // InternalQPE.g:313:4: ( (lv_next_5_0= ruleQueryElement ) )
                    // InternalQPE.g:314:5: (lv_next_5_0= ruleQueryElement )
                    {
                    // InternalQPE.g:314:5: (lv_next_5_0= ruleQueryElement )
                    // InternalQPE.g:315:6: lv_next_5_0= ruleQueryElement
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
    // InternalQPE.g:337:1: entryRuleQualifier returns [EObject current=null] : iv_ruleQualifier= ruleQualifier EOF ;
    public final EObject entryRuleQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifier = null;


        try {
            // InternalQPE.g:337:50: (iv_ruleQualifier= ruleQualifier EOF )
            // InternalQPE.g:338:2: iv_ruleQualifier= ruleQualifier EOF
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
    // InternalQPE.g:344:1: ruleQualifier returns [EObject current=null] : (otherlv_0= '[' ( (lv_predicate_1_0= rulePredicate ) ) (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleQualifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_1_0 = null;

        EObject lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:350:2: ( (otherlv_0= '[' ( (lv_predicate_1_0= rulePredicate ) ) (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )* otherlv_4= ']' ) )
            // InternalQPE.g:351:2: (otherlv_0= '[' ( (lv_predicate_1_0= rulePredicate ) ) (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )* otherlv_4= ']' )
            {
            // InternalQPE.g:351:2: (otherlv_0= '[' ( (lv_predicate_1_0= rulePredicate ) ) (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )* otherlv_4= ']' )
            // InternalQPE.g:352:3: otherlv_0= '[' ( (lv_predicate_1_0= rulePredicate ) ) (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalQPE.g:356:3: ( (lv_predicate_1_0= rulePredicate ) )
            // InternalQPE.g:357:4: (lv_predicate_1_0= rulePredicate )
            {
            // InternalQPE.g:357:4: (lv_predicate_1_0= rulePredicate )
            // InternalQPE.g:358:5: lv_predicate_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_predicate_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifierRule());
            					}
            					add(
            						current,
            						"predicate",
            						lv_predicate_1_0,
            						"org.omg.qpe.QPE.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQPE.g:375:3: (otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQPE.g:376:4: otherlv_2= ',' ( (lv_predicate_3_0= rulePredicate ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getQualifierAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalQPE.g:380:4: ( (lv_predicate_3_0= rulePredicate ) )
            	    // InternalQPE.g:381:5: (lv_predicate_3_0= rulePredicate )
            	    {
            	    // InternalQPE.g:381:5: (lv_predicate_3_0= rulePredicate )
            	    // InternalQPE.g:382:6: lv_predicate_3_0= rulePredicate
            	    {

            	    						newCompositeNode(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_predicate_3_0=rulePredicate();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualifierRule());
            	    						}
            	    						add(
            	    							current,
            	    							"predicate",
            	    							lv_predicate_3_0,
            	    							"org.omg.qpe.QPE.Predicate");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_3());
            		

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
    // InternalQPE.g:408:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalQPE.g:408:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalQPE.g:409:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalQPE.g:415:1: rulePredicate returns [EObject current=null] : (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_ClassifierPredicate_0 = null;

        EObject this_AttributePredicate_1 = null;

        EObject this_ReferencePredicate_2 = null;



        	enterRule();

        try {
            // InternalQPE.g:421:2: ( (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate ) )
            // InternalQPE.g:422:2: (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate )
            {
            // InternalQPE.g:422:2: (this_ClassifierPredicate_0= ruleClassifierPredicate | this_AttributePredicate_1= ruleAttributePredicate | this_ReferencePredicate_2= ruleReferencePredicate )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt6=2;
                    }
                    break;
                case 15:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 19:
                            {
                            alt6=2;
                            }
                            break;
                        case EOF:
                        case 17:
                        case 18:
                            {
                            alt6=1;
                            }
                            break;
                        case 16:
                            {
                            alt6=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 17:
                case 18:
                    {
                    alt6=1;
                    }
                    break;
                case 16:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQPE.g:423:3: this_ClassifierPredicate_0= ruleClassifierPredicate
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
                    // InternalQPE.g:432:3: this_AttributePredicate_1= ruleAttributePredicate
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
                    // InternalQPE.g:441:3: this_ReferencePredicate_2= ruleReferencePredicate
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
    // InternalQPE.g:453:1: entryRuleClassifierPredicate returns [EObject current=null] : iv_ruleClassifierPredicate= ruleClassifierPredicate EOF ;
    public final EObject entryRuleClassifierPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierPredicate = null;


        try {
            // InternalQPE.g:453:60: (iv_ruleClassifierPredicate= ruleClassifierPredicate EOF )
            // InternalQPE.g:454:2: iv_ruleClassifierPredicate= ruleClassifierPredicate EOF
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
    // InternalQPE.g:460:1: ruleClassifierPredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleClassifierPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQPE.g:466:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalQPE.g:467:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalQPE.g:467:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalQPE.g:468:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalQPE.g:468:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==15) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalQPE.g:469:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:469:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:470:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:470:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:471:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassifierPredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_0, grammarAccess.getClassifierPredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:487:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:488:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:488:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:489:5: otherlv_2= RULE_ID
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
    // InternalQPE.g:504:1: entryRuleAttributePredicate returns [EObject current=null] : iv_ruleAttributePredicate= ruleAttributePredicate EOF ;
    public final EObject entryRuleAttributePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePredicate = null;


        try {
            // InternalQPE.g:504:59: (iv_ruleAttributePredicate= ruleAttributePredicate EOF )
            // InternalQPE.g:505:2: iv_ruleAttributePredicate= ruleAttributePredicate EOF
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
    // InternalQPE.g:511:1: ruleAttributePredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleVALUE ) ) ) ;
    public final EObject ruleAttributePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:517:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleVALUE ) ) ) )
            // InternalQPE.g:518:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleVALUE ) ) )
            {
            // InternalQPE.g:518:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleVALUE ) ) )
            // InternalQPE.g:519:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleVALUE ) )
            {
            // InternalQPE.g:519:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==15) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalQPE.g:520:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:520:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:521:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:521:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:522:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributePredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_0, grammarAccess.getAttributePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:538:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:539:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:539:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:540:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributePredicateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2());
            		
            // InternalQPE.g:555:3: ( (lv_value_4_0= ruleVALUE ) )
            // InternalQPE.g:556:4: (lv_value_4_0= ruleVALUE )
            {
            // InternalQPE.g:556:4: (lv_value_4_0= ruleVALUE )
            // InternalQPE.g:557:5: lv_value_4_0= ruleVALUE
            {

            					newCompositeNode(grammarAccess.getAttributePredicateAccess().getValueVALUEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributePredicateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.omg.qpe.QPE.VALUE");
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
    // $ANTLR end "ruleAttributePredicate"


    // $ANTLR start "entryRuleReferencePredicate"
    // InternalQPE.g:578:1: entryRuleReferencePredicate returns [EObject current=null] : iv_ruleReferencePredicate= ruleReferencePredicate EOF ;
    public final EObject entryRuleReferencePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencePredicate = null;


        try {
            // InternalQPE.g:578:59: (iv_ruleReferencePredicate= ruleReferencePredicate EOF )
            // InternalQPE.g:579:2: iv_ruleReferencePredicate= ruleReferencePredicate EOF
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
    // InternalQPE.g:585:1: ruleReferencePredicate returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) ) ;
    public final EObject ruleReferencePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_qualifier_3_0 = null;



        	enterRule();

        try {
            // InternalQPE.g:591:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) ) )
            // InternalQPE.g:592:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) )
            {
            // InternalQPE.g:592:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) ) )
            // InternalQPE.g:593:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )? ( (otherlv_2= RULE_ID ) ) ( (lv_qualifier_3_0= ruleQualifier ) )
            {
            // InternalQPE.g:593:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '::' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==15) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalQPE.g:594:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '::'
                    {
                    // InternalQPE.g:594:4: ( (otherlv_0= RULE_ID ) )
                    // InternalQPE.g:595:5: (otherlv_0= RULE_ID )
                    {
                    // InternalQPE.g:595:5: (otherlv_0= RULE_ID )
                    // InternalQPE.g:596:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferencePredicateRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_0, grammarAccess.getReferencePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalQPE.g:612:3: ( (otherlv_2= RULE_ID ) )
            // InternalQPE.g:613:4: (otherlv_2= RULE_ID )
            {
            // InternalQPE.g:613:4: (otherlv_2= RULE_ID )
            // InternalQPE.g:614:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferencePredicateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0());
            				

            }


            }

            // InternalQPE.g:625:3: ( (lv_qualifier_3_0= ruleQualifier ) )
            // InternalQPE.g:626:4: (lv_qualifier_3_0= ruleQualifier )
            {
            // InternalQPE.g:626:4: (lv_qualifier_3_0= ruleQualifier )
            // InternalQPE.g:627:5: lv_qualifier_3_0= ruleQualifier
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


    // $ANTLR start "entryRuleVALUE"
    // InternalQPE.g:648:1: entryRuleVALUE returns [String current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final String entryRuleVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE = null;


        try {
            // InternalQPE.g:648:45: (iv_ruleVALUE= ruleVALUE EOF )
            // InternalQPE.g:649:2: iv_ruleVALUE= ruleVALUE EOF
            {
             newCompositeNode(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALUE=ruleVALUE();

            state._fsp--;

             current =iv_ruleVALUE.getText(); 
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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // InternalQPE.g:655:1: ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_LONG_2= ruleLONG | this_DOUBLE_3= ruleDOUBLE | this_BOOLEAN_4= ruleBOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_LONG_2 = null;

        AntlrDatatypeRuleToken this_DOUBLE_3 = null;

        AntlrDatatypeRuleToken this_BOOLEAN_4 = null;



        	enterRule();

        try {
            // InternalQPE.g:661:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_LONG_2= ruleLONG | this_DOUBLE_3= ruleDOUBLE | this_BOOLEAN_4= ruleBOOLEAN ) )
            // InternalQPE.g:662:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_LONG_2= ruleLONG | this_DOUBLE_3= ruleDOUBLE | this_BOOLEAN_4= ruleBOOLEAN )
            {
            // InternalQPE.g:662:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_LONG_2= ruleLONG | this_DOUBLE_3= ruleDOUBLE | this_BOOLEAN_4= ruleBOOLEAN )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 17:
                case 18:
                    {
                    alt10=2;
                    }
                    break;
                case 20:
                case 21:
                    {
                    alt10=3;
                    }
                    break;
                case 13:
                    {
                    alt10=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }

                }
                break;
            case 22:
            case 23:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalQPE.g:663:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQPE.g:671:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalQPE.g:679:3: this_LONG_2= ruleLONG
                    {

                    			newCompositeNode(grammarAccess.getVALUEAccess().getLONGParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LONG_2=ruleLONG();

                    state._fsp--;


                    			current.merge(this_LONG_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQPE.g:690:3: this_DOUBLE_3= ruleDOUBLE
                    {

                    			newCompositeNode(grammarAccess.getVALUEAccess().getDOUBLEParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DOUBLE_3=ruleDOUBLE();

                    state._fsp--;


                    			current.merge(this_DOUBLE_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQPE.g:701:3: this_BOOLEAN_4= ruleBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getVALUEAccess().getBOOLEANParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BOOLEAN_4=ruleBOOLEAN();

                    state._fsp--;


                    			current.merge(this_BOOLEAN_4);
                    		

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
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleLONG"
    // InternalQPE.g:715:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalQPE.g:715:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalQPE.g:716:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalQPE.g:722:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= 'L' | kw= 'l' ) ) ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalQPE.g:728:2: ( (this_INT_0= RULE_INT (kw= 'L' | kw= 'l' ) ) )
            // InternalQPE.g:729:2: (this_INT_0= RULE_INT (kw= 'L' | kw= 'l' ) )
            {
            // InternalQPE.g:729:2: (this_INT_0= RULE_INT (kw= 'L' | kw= 'l' ) )
            // InternalQPE.g:730:3: this_INT_0= RULE_INT (kw= 'L' | kw= 'l' )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall_0());
            		
            // InternalQPE.g:737:3: (kw= 'L' | kw= 'l' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalQPE.g:738:4: kw= 'L'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLONGAccess().getLKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQPE.g:744:4: kw= 'l'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLONGAccess().getLKeyword_1_1());
                    			

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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalQPE.g:754:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalQPE.g:754:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalQPE.g:755:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalQPE.g:761:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalQPE.g:767:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalQPE.g:768:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalQPE.g:768:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalQPE.g:769:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,13,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalQPE.g:792:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // InternalQPE.g:792:47: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // InternalQPE.g:793:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalQPE.g:799:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQPE.g:805:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQPE.g:806:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQPE.g:806:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQPE.g:807:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQPE.g:813:3: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}
package org.omg.qpe.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.omg.qpe.services.QPEGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQPEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_VALUE", "RULE_LONG", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'as'", "'/'", "'::'", "'['", "']'", "','", "'='", "'.'"
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

    	public void setGrammarAccess(QPEGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQPE"
    // InternalQPE.g:53:1: entryRuleQPE : ruleQPE EOF ;
    public final void entryRuleQPE() throws RecognitionException {
        try {
            // InternalQPE.g:54:1: ( ruleQPE EOF )
            // InternalQPE.g:55:1: ruleQPE EOF
            {
             before(grammarAccess.getQPERule()); 
            pushFollow(FOLLOW_1);
            ruleQPE();

            state._fsp--;

             after(grammarAccess.getQPERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQPE"


    // $ANTLR start "ruleQPE"
    // InternalQPE.g:62:1: ruleQPE : ( ( rule__QPE__Group__0 ) ) ;
    public final void ruleQPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:66:2: ( ( ( rule__QPE__Group__0 ) ) )
            // InternalQPE.g:67:2: ( ( rule__QPE__Group__0 ) )
            {
            // InternalQPE.g:67:2: ( ( rule__QPE__Group__0 ) )
            // InternalQPE.g:68:3: ( rule__QPE__Group__0 )
            {
             before(grammarAccess.getQPEAccess().getGroup()); 
            // InternalQPE.g:69:3: ( rule__QPE__Group__0 )
            // InternalQPE.g:69:4: rule__QPE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQPE"


    // $ANTLR start "entryRuleQueryNamespace"
    // InternalQPE.g:78:1: entryRuleQueryNamespace : ruleQueryNamespace EOF ;
    public final void entryRuleQueryNamespace() throws RecognitionException {
        try {
            // InternalQPE.g:79:1: ( ruleQueryNamespace EOF )
            // InternalQPE.g:80:1: ruleQueryNamespace EOF
            {
             before(grammarAccess.getQueryNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryNamespace();

            state._fsp--;

             after(grammarAccess.getQueryNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryNamespace"


    // $ANTLR start "ruleQueryNamespace"
    // InternalQPE.g:87:1: ruleQueryNamespace : ( ( rule__QueryNamespace__Group__0 ) ) ;
    public final void ruleQueryNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:91:2: ( ( ( rule__QueryNamespace__Group__0 ) ) )
            // InternalQPE.g:92:2: ( ( rule__QueryNamespace__Group__0 ) )
            {
            // InternalQPE.g:92:2: ( ( rule__QueryNamespace__Group__0 ) )
            // InternalQPE.g:93:3: ( rule__QueryNamespace__Group__0 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getGroup()); 
            // InternalQPE.g:94:3: ( rule__QueryNamespace__Group__0 )
            // InternalQPE.g:94:4: rule__QueryNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryNamespace"


    // $ANTLR start "entryRulePathExpression"
    // InternalQPE.g:103:1: entryRulePathExpression : rulePathExpression EOF ;
    public final void entryRulePathExpression() throws RecognitionException {
        try {
            // InternalQPE.g:104:1: ( rulePathExpression EOF )
            // InternalQPE.g:105:1: rulePathExpression EOF
            {
             before(grammarAccess.getPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getPathExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathExpression"


    // $ANTLR start "rulePathExpression"
    // InternalQPE.g:112:1: rulePathExpression : ( ( rule__PathExpression__Group__0 ) ) ;
    public final void rulePathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:116:2: ( ( ( rule__PathExpression__Group__0 ) ) )
            // InternalQPE.g:117:2: ( ( rule__PathExpression__Group__0 ) )
            {
            // InternalQPE.g:117:2: ( ( rule__PathExpression__Group__0 ) )
            // InternalQPE.g:118:3: ( rule__PathExpression__Group__0 )
            {
             before(grammarAccess.getPathExpressionAccess().getGroup()); 
            // InternalQPE.g:119:3: ( rule__PathExpression__Group__0 )
            // InternalQPE.g:119:4: rule__PathExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathExpression"


    // $ANTLR start "entryRuleQueryElement"
    // InternalQPE.g:128:1: entryRuleQueryElement : ruleQueryElement EOF ;
    public final void entryRuleQueryElement() throws RecognitionException {
        try {
            // InternalQPE.g:129:1: ( ruleQueryElement EOF )
            // InternalQPE.g:130:1: ruleQueryElement EOF
            {
             before(grammarAccess.getQueryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryElement();

            state._fsp--;

             after(grammarAccess.getQueryElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryElement"


    // $ANTLR start "ruleQueryElement"
    // InternalQPE.g:137:1: ruleQueryElement : ( ( rule__QueryElement__Group__0 ) ) ;
    public final void ruleQueryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:141:2: ( ( ( rule__QueryElement__Group__0 ) ) )
            // InternalQPE.g:142:2: ( ( rule__QueryElement__Group__0 ) )
            {
            // InternalQPE.g:142:2: ( ( rule__QueryElement__Group__0 ) )
            // InternalQPE.g:143:3: ( rule__QueryElement__Group__0 )
            {
             before(grammarAccess.getQueryElementAccess().getGroup()); 
            // InternalQPE.g:144:3: ( rule__QueryElement__Group__0 )
            // InternalQPE.g:144:4: rule__QueryElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryElement"


    // $ANTLR start "entryRuleQualifier"
    // InternalQPE.g:153:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // InternalQPE.g:154:1: ( ruleQualifier EOF )
            // InternalQPE.g:155:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getQualifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalQPE.g:162:1: ruleQualifier : ( ( rule__Qualifier__Group__0 ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:166:2: ( ( ( rule__Qualifier__Group__0 ) ) )
            // InternalQPE.g:167:2: ( ( rule__Qualifier__Group__0 ) )
            {
            // InternalQPE.g:167:2: ( ( rule__Qualifier__Group__0 ) )
            // InternalQPE.g:168:3: ( rule__Qualifier__Group__0 )
            {
             before(grammarAccess.getQualifierAccess().getGroup()); 
            // InternalQPE.g:169:3: ( rule__Qualifier__Group__0 )
            // InternalQPE.g:169:4: rule__Qualifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRulePredicate"
    // InternalQPE.g:178:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalQPE.g:179:1: ( rulePredicate EOF )
            // InternalQPE.g:180:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalQPE.g:187:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:191:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalQPE.g:192:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalQPE.g:192:2: ( ( rule__Predicate__Alternatives ) )
            // InternalQPE.g:193:3: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // InternalQPE.g:194:3: ( rule__Predicate__Alternatives )
            // InternalQPE.g:194:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleClassifierPredicate"
    // InternalQPE.g:203:1: entryRuleClassifierPredicate : ruleClassifierPredicate EOF ;
    public final void entryRuleClassifierPredicate() throws RecognitionException {
        try {
            // InternalQPE.g:204:1: ( ruleClassifierPredicate EOF )
            // InternalQPE.g:205:1: ruleClassifierPredicate EOF
            {
             before(grammarAccess.getClassifierPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleClassifierPredicate();

            state._fsp--;

             after(grammarAccess.getClassifierPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassifierPredicate"


    // $ANTLR start "ruleClassifierPredicate"
    // InternalQPE.g:212:1: ruleClassifierPredicate : ( ( rule__ClassifierPredicate__Group__0 ) ) ;
    public final void ruleClassifierPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:216:2: ( ( ( rule__ClassifierPredicate__Group__0 ) ) )
            // InternalQPE.g:217:2: ( ( rule__ClassifierPredicate__Group__0 ) )
            {
            // InternalQPE.g:217:2: ( ( rule__ClassifierPredicate__Group__0 ) )
            // InternalQPE.g:218:3: ( rule__ClassifierPredicate__Group__0 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getGroup()); 
            // InternalQPE.g:219:3: ( rule__ClassifierPredicate__Group__0 )
            // InternalQPE.g:219:4: rule__ClassifierPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassifierPredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifierPredicate"


    // $ANTLR start "entryRuleAttributePredicate"
    // InternalQPE.g:228:1: entryRuleAttributePredicate : ruleAttributePredicate EOF ;
    public final void entryRuleAttributePredicate() throws RecognitionException {
        try {
            // InternalQPE.g:229:1: ( ruleAttributePredicate EOF )
            // InternalQPE.g:230:1: ruleAttributePredicate EOF
            {
             before(grammarAccess.getAttributePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributePredicate();

            state._fsp--;

             after(grammarAccess.getAttributePredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributePredicate"


    // $ANTLR start "ruleAttributePredicate"
    // InternalQPE.g:237:1: ruleAttributePredicate : ( ( rule__AttributePredicate__Group__0 ) ) ;
    public final void ruleAttributePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:241:2: ( ( ( rule__AttributePredicate__Group__0 ) ) )
            // InternalQPE.g:242:2: ( ( rule__AttributePredicate__Group__0 ) )
            {
            // InternalQPE.g:242:2: ( ( rule__AttributePredicate__Group__0 ) )
            // InternalQPE.g:243:3: ( rule__AttributePredicate__Group__0 )
            {
             before(grammarAccess.getAttributePredicateAccess().getGroup()); 
            // InternalQPE.g:244:3: ( rule__AttributePredicate__Group__0 )
            // InternalQPE.g:244:4: rule__AttributePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributePredicate"


    // $ANTLR start "entryRuleReferencePredicate"
    // InternalQPE.g:253:1: entryRuleReferencePredicate : ruleReferencePredicate EOF ;
    public final void entryRuleReferencePredicate() throws RecognitionException {
        try {
            // InternalQPE.g:254:1: ( ruleReferencePredicate EOF )
            // InternalQPE.g:255:1: ruleReferencePredicate EOF
            {
             before(grammarAccess.getReferencePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleReferencePredicate();

            state._fsp--;

             after(grammarAccess.getReferencePredicateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferencePredicate"


    // $ANTLR start "ruleReferencePredicate"
    // InternalQPE.g:262:1: ruleReferencePredicate : ( ( rule__ReferencePredicate__Group__0 ) ) ;
    public final void ruleReferencePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:266:2: ( ( ( rule__ReferencePredicate__Group__0 ) ) )
            // InternalQPE.g:267:2: ( ( rule__ReferencePredicate__Group__0 ) )
            {
            // InternalQPE.g:267:2: ( ( rule__ReferencePredicate__Group__0 ) )
            // InternalQPE.g:268:3: ( rule__ReferencePredicate__Group__0 )
            {
             before(grammarAccess.getReferencePredicateAccess().getGroup()); 
            // InternalQPE.g:269:3: ( rule__ReferencePredicate__Group__0 )
            // InternalQPE.g:269:4: rule__ReferencePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferencePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferencePredicate"


    // $ANTLR start "rule__Qualifier__Alternatives_1"
    // InternalQPE.g:277:1: rule__Qualifier__Alternatives_1 : ( ( ( rule__Qualifier__Group_1_0__0 ) ) | ( ( rule__Qualifier__Group_1_1__0 ) ) );
    public final void rule__Qualifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:281:1: ( ( ( rule__Qualifier__Group_1_0__0 ) ) | ( ( rule__Qualifier__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQPE.g:282:2: ( ( rule__Qualifier__Group_1_0__0 ) )
                    {
                    // InternalQPE.g:282:2: ( ( rule__Qualifier__Group_1_0__0 ) )
                    // InternalQPE.g:283:3: ( rule__Qualifier__Group_1_0__0 )
                    {
                     before(grammarAccess.getQualifierAccess().getGroup_1_0()); 
                    // InternalQPE.g:284:3: ( rule__Qualifier__Group_1_0__0 )
                    // InternalQPE.g:284:4: rule__Qualifier__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qualifier__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifierAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:288:2: ( ( rule__Qualifier__Group_1_1__0 ) )
                    {
                    // InternalQPE.g:288:2: ( ( rule__Qualifier__Group_1_1__0 ) )
                    // InternalQPE.g:289:3: ( rule__Qualifier__Group_1_1__0 )
                    {
                     before(grammarAccess.getQualifierAccess().getGroup_1_1()); 
                    // InternalQPE.g:290:3: ( rule__Qualifier__Group_1_1__0 )
                    // InternalQPE.g:290:4: rule__Qualifier__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qualifier__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifierAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Alternatives_1"


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalQPE.g:298:1: rule__Predicate__Alternatives : ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:302:1: ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case 20:
                        case 21:
                            {
                            alt2=1;
                            }
                            break;
                        case 19:
                            {
                            alt2=3;
                            }
                            break;
                        case 22:
                            {
                            alt2=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 20:
                case 21:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQPE.g:303:2: ( ruleClassifierPredicate )
                    {
                    // InternalQPE.g:303:2: ( ruleClassifierPredicate )
                    // InternalQPE.g:304:3: ruleClassifierPredicate
                    {
                     before(grammarAccess.getPredicateAccess().getClassifierPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassifierPredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getClassifierPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:309:2: ( ruleAttributePredicate )
                    {
                    // InternalQPE.g:309:2: ( ruleAttributePredicate )
                    // InternalQPE.g:310:3: ruleAttributePredicate
                    {
                     before(grammarAccess.getPredicateAccess().getAttributePredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getAttributePredicateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQPE.g:315:2: ( ruleReferencePredicate )
                    {
                    // InternalQPE.g:315:2: ( ruleReferencePredicate )
                    // InternalQPE.g:316:3: ruleReferencePredicate
                    {
                     before(grammarAccess.getPredicateAccess().getReferencePredicateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReferencePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getReferencePredicateParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__QPE__Group__0"
    // InternalQPE.g:325:1: rule__QPE__Group__0 : rule__QPE__Group__0__Impl rule__QPE__Group__1 ;
    public final void rule__QPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:329:1: ( rule__QPE__Group__0__Impl rule__QPE__Group__1 )
            // InternalQPE.g:330:2: rule__QPE__Group__0__Impl rule__QPE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__Group__0"


    // $ANTLR start "rule__QPE__Group__0__Impl"
    // InternalQPE.g:337:1: rule__QPE__Group__0__Impl : ( ( rule__QPE__QueryNamespacesAssignment_0 ) ) ;
    public final void rule__QPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:341:1: ( ( ( rule__QPE__QueryNamespacesAssignment_0 ) ) )
            // InternalQPE.g:342:1: ( ( rule__QPE__QueryNamespacesAssignment_0 ) )
            {
            // InternalQPE.g:342:1: ( ( rule__QPE__QueryNamespacesAssignment_0 ) )
            // InternalQPE.g:343:2: ( rule__QPE__QueryNamespacesAssignment_0 )
            {
             before(grammarAccess.getQPEAccess().getQueryNamespacesAssignment_0()); 
            // InternalQPE.g:344:2: ( rule__QPE__QueryNamespacesAssignment_0 )
            // InternalQPE.g:344:3: rule__QPE__QueryNamespacesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QPE__QueryNamespacesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQPEAccess().getQueryNamespacesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__Group__0__Impl"


    // $ANTLR start "rule__QPE__Group__1"
    // InternalQPE.g:352:1: rule__QPE__Group__1 : rule__QPE__Group__1__Impl ;
    public final void rule__QPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:356:1: ( rule__QPE__Group__1__Impl )
            // InternalQPE.g:357:2: rule__QPE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QPE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__Group__1"


    // $ANTLR start "rule__QPE__Group__1__Impl"
    // InternalQPE.g:363:1: rule__QPE__Group__1__Impl : ( ( rule__QPE__PathExpressionsAssignment_1 ) ) ;
    public final void rule__QPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:367:1: ( ( ( rule__QPE__PathExpressionsAssignment_1 ) ) )
            // InternalQPE.g:368:1: ( ( rule__QPE__PathExpressionsAssignment_1 ) )
            {
            // InternalQPE.g:368:1: ( ( rule__QPE__PathExpressionsAssignment_1 ) )
            // InternalQPE.g:369:2: ( rule__QPE__PathExpressionsAssignment_1 )
            {
             before(grammarAccess.getQPEAccess().getPathExpressionsAssignment_1()); 
            // InternalQPE.g:370:2: ( rule__QPE__PathExpressionsAssignment_1 )
            // InternalQPE.g:370:3: rule__QPE__PathExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QPE__PathExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQPEAccess().getPathExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__Group__1__Impl"


    // $ANTLR start "rule__QueryNamespace__Group__0"
    // InternalQPE.g:379:1: rule__QueryNamespace__Group__0 : rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 ;
    public final void rule__QueryNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:383:1: ( rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 )
            // InternalQPE.g:384:2: rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QueryNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__0"


    // $ANTLR start "rule__QueryNamespace__Group__0__Impl"
    // InternalQPE.g:391:1: rule__QueryNamespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__QueryNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:395:1: ( ( 'namespace' ) )
            // InternalQPE.g:396:1: ( 'namespace' )
            {
            // InternalQPE.g:396:1: ( 'namespace' )
            // InternalQPE.g:397:2: 'namespace'
            {
             before(grammarAccess.getQueryNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQueryNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__0__Impl"


    // $ANTLR start "rule__QueryNamespace__Group__1"
    // InternalQPE.g:406:1: rule__QueryNamespace__Group__1 : rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 ;
    public final void rule__QueryNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:410:1: ( rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 )
            // InternalQPE.g:411:2: rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QueryNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__1"


    // $ANTLR start "rule__QueryNamespace__Group__1__Impl"
    // InternalQPE.g:418:1: rule__QueryNamespace__Group__1__Impl : ( ( rule__QueryNamespace__IRIAssignment_1 ) ) ;
    public final void rule__QueryNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:422:1: ( ( ( rule__QueryNamespace__IRIAssignment_1 ) ) )
            // InternalQPE.g:423:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            {
            // InternalQPE.g:423:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            // InternalQPE.g:424:2: ( rule__QueryNamespace__IRIAssignment_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getIRIAssignment_1()); 
            // InternalQPE.g:425:2: ( rule__QueryNamespace__IRIAssignment_1 )
            // InternalQPE.g:425:3: rule__QueryNamespace__IRIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryNamespace__IRIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryNamespaceAccess().getIRIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__1__Impl"


    // $ANTLR start "rule__QueryNamespace__Group__2"
    // InternalQPE.g:433:1: rule__QueryNamespace__Group__2 : rule__QueryNamespace__Group__2__Impl ;
    public final void rule__QueryNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:437:1: ( rule__QueryNamespace__Group__2__Impl )
            // InternalQPE.g:438:2: rule__QueryNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__2"


    // $ANTLR start "rule__QueryNamespace__Group__2__Impl"
    // InternalQPE.g:444:1: rule__QueryNamespace__Group__2__Impl : ( ( rule__QueryNamespace__Group_2__0 )? ) ;
    public final void rule__QueryNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:448:1: ( ( ( rule__QueryNamespace__Group_2__0 )? ) )
            // InternalQPE.g:449:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            {
            // InternalQPE.g:449:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            // InternalQPE.g:450:2: ( rule__QueryNamespace__Group_2__0 )?
            {
             before(grammarAccess.getQueryNamespaceAccess().getGroup_2()); 
            // InternalQPE.g:451:2: ( rule__QueryNamespace__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQPE.g:451:3: rule__QueryNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryNamespaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group__2__Impl"


    // $ANTLR start "rule__QueryNamespace__Group_2__0"
    // InternalQPE.g:460:1: rule__QueryNamespace__Group_2__0 : rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 ;
    public final void rule__QueryNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:464:1: ( rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 )
            // InternalQPE.g:465:2: rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__QueryNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group_2__0"


    // $ANTLR start "rule__QueryNamespace__Group_2__0__Impl"
    // InternalQPE.g:472:1: rule__QueryNamespace__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__QueryNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:476:1: ( ( 'as' ) )
            // InternalQPE.g:477:1: ( 'as' )
            {
            // InternalQPE.g:477:1: ( 'as' )
            // InternalQPE.g:478:2: 'as'
            {
             before(grammarAccess.getQueryNamespaceAccess().getAsKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQueryNamespaceAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__QueryNamespace__Group_2__1"
    // InternalQPE.g:487:1: rule__QueryNamespace__Group_2__1 : rule__QueryNamespace__Group_2__1__Impl ;
    public final void rule__QueryNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:491:1: ( rule__QueryNamespace__Group_2__1__Impl )
            // InternalQPE.g:492:2: rule__QueryNamespace__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryNamespace__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group_2__1"


    // $ANTLR start "rule__QueryNamespace__Group_2__1__Impl"
    // InternalQPE.g:498:1: rule__QueryNamespace__Group_2__1__Impl : ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) ;
    public final void rule__QueryNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:502:1: ( ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) )
            // InternalQPE.g:503:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            {
            // InternalQPE.g:503:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            // InternalQPE.g:504:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getPrefixAssignment_2_1()); 
            // InternalQPE.g:505:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            // InternalQPE.g:505:3: rule__QueryNamespace__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryNamespace__PrefixAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryNamespaceAccess().getPrefixAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__PathExpression__Group__0"
    // InternalQPE.g:514:1: rule__PathExpression__Group__0 : rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 ;
    public final void rule__PathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:518:1: ( rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 )
            // InternalQPE.g:519:2: rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__0"


    // $ANTLR start "rule__PathExpression__Group__0__Impl"
    // InternalQPE.g:526:1: rule__PathExpression__Group__0__Impl : ( () ) ;
    public final void rule__PathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:530:1: ( ( () ) )
            // InternalQPE.g:531:1: ( () )
            {
            // InternalQPE.g:531:1: ( () )
            // InternalQPE.g:532:2: ()
            {
             before(grammarAccess.getPathExpressionAccess().getPathExpressionAction_0()); 
            // InternalQPE.g:533:2: ()
            // InternalQPE.g:533:3: 
            {
            }

             after(grammarAccess.getPathExpressionAccess().getPathExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__0__Impl"


    // $ANTLR start "rule__PathExpression__Group__1"
    // InternalQPE.g:541:1: rule__PathExpression__Group__1 : rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 ;
    public final void rule__PathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:545:1: ( rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 )
            // InternalQPE.g:546:2: rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PathExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__1"


    // $ANTLR start "rule__PathExpression__Group__1__Impl"
    // InternalQPE.g:553:1: rule__PathExpression__Group__1__Impl : ( ( rule__PathExpression__IsRelativeAssignment_1 )? ) ;
    public final void rule__PathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:557:1: ( ( ( rule__PathExpression__IsRelativeAssignment_1 )? ) )
            // InternalQPE.g:558:1: ( ( rule__PathExpression__IsRelativeAssignment_1 )? )
            {
            // InternalQPE.g:558:1: ( ( rule__PathExpression__IsRelativeAssignment_1 )? )
            // InternalQPE.g:559:2: ( rule__PathExpression__IsRelativeAssignment_1 )?
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeAssignment_1()); 
            // InternalQPE.g:560:2: ( rule__PathExpression__IsRelativeAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQPE.g:560:3: rule__PathExpression__IsRelativeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PathExpression__IsRelativeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathExpressionAccess().getIsRelativeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__1__Impl"


    // $ANTLR start "rule__PathExpression__Group__2"
    // InternalQPE.g:568:1: rule__PathExpression__Group__2 : rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 ;
    public final void rule__PathExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:572:1: ( rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 )
            // InternalQPE.g:573:2: rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__PathExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__2"


    // $ANTLR start "rule__PathExpression__Group__2__Impl"
    // InternalQPE.g:580:1: rule__PathExpression__Group__2__Impl : ( ( rule__PathExpression__QualifierAssignment_2 )? ) ;
    public final void rule__PathExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:584:1: ( ( ( rule__PathExpression__QualifierAssignment_2 )? ) )
            // InternalQPE.g:585:1: ( ( rule__PathExpression__QualifierAssignment_2 )? )
            {
            // InternalQPE.g:585:1: ( ( rule__PathExpression__QualifierAssignment_2 )? )
            // InternalQPE.g:586:2: ( rule__PathExpression__QualifierAssignment_2 )?
            {
             before(grammarAccess.getPathExpressionAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:587:2: ( rule__PathExpression__QualifierAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQPE.g:587:3: rule__PathExpression__QualifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PathExpression__QualifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathExpressionAccess().getQualifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__2__Impl"


    // $ANTLR start "rule__PathExpression__Group__3"
    // InternalQPE.g:595:1: rule__PathExpression__Group__3 : rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4 ;
    public final void rule__PathExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:599:1: ( rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4 )
            // InternalQPE.g:600:2: rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PathExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__3"


    // $ANTLR start "rule__PathExpression__Group__3__Impl"
    // InternalQPE.g:607:1: rule__PathExpression__Group__3__Impl : ( '/' ) ;
    public final void rule__PathExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:611:1: ( ( '/' ) )
            // InternalQPE.g:612:1: ( '/' )
            {
            // InternalQPE.g:612:1: ( '/' )
            // InternalQPE.g:613:2: '/'
            {
             before(grammarAccess.getPathExpressionAccess().getSolidusKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__3__Impl"


    // $ANTLR start "rule__PathExpression__Group__4"
    // InternalQPE.g:622:1: rule__PathExpression__Group__4 : rule__PathExpression__Group__4__Impl ;
    public final void rule__PathExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:626:1: ( rule__PathExpression__Group__4__Impl )
            // InternalQPE.g:627:2: rule__PathExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__4"


    // $ANTLR start "rule__PathExpression__Group__4__Impl"
    // InternalQPE.g:633:1: rule__PathExpression__Group__4__Impl : ( ( rule__PathExpression__HeadAssignment_4 )? ) ;
    public final void rule__PathExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:637:1: ( ( ( rule__PathExpression__HeadAssignment_4 )? ) )
            // InternalQPE.g:638:1: ( ( rule__PathExpression__HeadAssignment_4 )? )
            {
            // InternalQPE.g:638:1: ( ( rule__PathExpression__HeadAssignment_4 )? )
            // InternalQPE.g:639:2: ( rule__PathExpression__HeadAssignment_4 )?
            {
             before(grammarAccess.getPathExpressionAccess().getHeadAssignment_4()); 
            // InternalQPE.g:640:2: ( rule__PathExpression__HeadAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQPE.g:640:3: rule__PathExpression__HeadAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PathExpression__HeadAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathExpressionAccess().getHeadAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__Group__4__Impl"


    // $ANTLR start "rule__QueryElement__Group__0"
    // InternalQPE.g:649:1: rule__QueryElement__Group__0 : rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 ;
    public final void rule__QueryElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:653:1: ( rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 )
            // InternalQPE.g:654:2: rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QueryElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__0"


    // $ANTLR start "rule__QueryElement__Group__0__Impl"
    // InternalQPE.g:661:1: rule__QueryElement__Group__0__Impl : ( ( rule__QueryElement__Group_0__0 )? ) ;
    public final void rule__QueryElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:665:1: ( ( ( rule__QueryElement__Group_0__0 )? ) )
            // InternalQPE.g:666:1: ( ( rule__QueryElement__Group_0__0 )? )
            {
            // InternalQPE.g:666:1: ( ( rule__QueryElement__Group_0__0 )? )
            // InternalQPE.g:667:2: ( rule__QueryElement__Group_0__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_0()); 
            // InternalQPE.g:668:2: ( rule__QueryElement__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalQPE.g:668:3: rule__QueryElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryElement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryElementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__0__Impl"


    // $ANTLR start "rule__QueryElement__Group__1"
    // InternalQPE.g:676:1: rule__QueryElement__Group__1 : rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 ;
    public final void rule__QueryElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:680:1: ( rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 )
            // InternalQPE.g:681:2: rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__QueryElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__1"


    // $ANTLR start "rule__QueryElement__Group__1__Impl"
    // InternalQPE.g:688:1: rule__QueryElement__Group__1__Impl : ( ( rule__QueryElement__FeatureAssignment_1 ) ) ;
    public final void rule__QueryElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:692:1: ( ( ( rule__QueryElement__FeatureAssignment_1 ) ) )
            // InternalQPE.g:693:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            {
            // InternalQPE.g:693:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            // InternalQPE.g:694:2: ( rule__QueryElement__FeatureAssignment_1 )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureAssignment_1()); 
            // InternalQPE.g:695:2: ( rule__QueryElement__FeatureAssignment_1 )
            // InternalQPE.g:695:3: rule__QueryElement__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryElementAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__1__Impl"


    // $ANTLR start "rule__QueryElement__Group__2"
    // InternalQPE.g:703:1: rule__QueryElement__Group__2 : rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 ;
    public final void rule__QueryElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:707:1: ( rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 )
            // InternalQPE.g:708:2: rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__QueryElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__2"


    // $ANTLR start "rule__QueryElement__Group__2__Impl"
    // InternalQPE.g:715:1: rule__QueryElement__Group__2__Impl : ( ( rule__QueryElement__QualifierAssignment_2 )? ) ;
    public final void rule__QueryElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:719:1: ( ( ( rule__QueryElement__QualifierAssignment_2 )? ) )
            // InternalQPE.g:720:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            {
            // InternalQPE.g:720:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            // InternalQPE.g:721:2: ( rule__QueryElement__QualifierAssignment_2 )?
            {
             before(grammarAccess.getQueryElementAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:722:2: ( rule__QueryElement__QualifierAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQPE.g:722:3: rule__QueryElement__QualifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryElement__QualifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryElementAccess().getQualifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__2__Impl"


    // $ANTLR start "rule__QueryElement__Group__3"
    // InternalQPE.g:730:1: rule__QueryElement__Group__3 : rule__QueryElement__Group__3__Impl ;
    public final void rule__QueryElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:734:1: ( rule__QueryElement__Group__3__Impl )
            // InternalQPE.g:735:2: rule__QueryElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__3"


    // $ANTLR start "rule__QueryElement__Group__3__Impl"
    // InternalQPE.g:741:1: rule__QueryElement__Group__3__Impl : ( ( rule__QueryElement__Group_3__0 )? ) ;
    public final void rule__QueryElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:745:1: ( ( ( rule__QueryElement__Group_3__0 )? ) )
            // InternalQPE.g:746:1: ( ( rule__QueryElement__Group_3__0 )? )
            {
            // InternalQPE.g:746:1: ( ( rule__QueryElement__Group_3__0 )? )
            // InternalQPE.g:747:2: ( rule__QueryElement__Group_3__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_3()); 
            // InternalQPE.g:748:2: ( rule__QueryElement__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQPE.g:748:3: rule__QueryElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group__3__Impl"


    // $ANTLR start "rule__QueryElement__Group_0__0"
    // InternalQPE.g:757:1: rule__QueryElement__Group_0__0 : rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 ;
    public final void rule__QueryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:761:1: ( rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 )
            // InternalQPE.g:762:2: rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__QueryElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_0__0"


    // $ANTLR start "rule__QueryElement__Group_0__0__Impl"
    // InternalQPE.g:769:1: rule__QueryElement__Group_0__0__Impl : ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__QueryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:773:1: ( ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:774:1: ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:774:1: ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:775:2: ( rule__QueryElement__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getQueryElementAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:776:2: ( rule__QueryElement__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:776:3: rule__QueryElement__QueryNamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__QueryNamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryElementAccess().getQueryNamespaceAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_0__0__Impl"


    // $ANTLR start "rule__QueryElement__Group_0__1"
    // InternalQPE.g:784:1: rule__QueryElement__Group_0__1 : rule__QueryElement__Group_0__1__Impl ;
    public final void rule__QueryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:788:1: ( rule__QueryElement__Group_0__1__Impl )
            // InternalQPE.g:789:2: rule__QueryElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_0__1"


    // $ANTLR start "rule__QueryElement__Group_0__1__Impl"
    // InternalQPE.g:795:1: rule__QueryElement__Group_0__1__Impl : ( '::' ) ;
    public final void rule__QueryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:799:1: ( ( '::' ) )
            // InternalQPE.g:800:1: ( '::' )
            {
            // InternalQPE.g:800:1: ( '::' )
            // InternalQPE.g:801:2: '::'
            {
             before(grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_0__1__Impl"


    // $ANTLR start "rule__QueryElement__Group_3__0"
    // InternalQPE.g:811:1: rule__QueryElement__Group_3__0 : rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 ;
    public final void rule__QueryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:815:1: ( rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 )
            // InternalQPE.g:816:2: rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__QueryElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_3__0"


    // $ANTLR start "rule__QueryElement__Group_3__0__Impl"
    // InternalQPE.g:823:1: rule__QueryElement__Group_3__0__Impl : ( '/' ) ;
    public final void rule__QueryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:827:1: ( ( '/' ) )
            // InternalQPE.g:828:1: ( '/' )
            {
            // InternalQPE.g:828:1: ( '/' )
            // InternalQPE.g:829:2: '/'
            {
             before(grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_3__0__Impl"


    // $ANTLR start "rule__QueryElement__Group_3__1"
    // InternalQPE.g:838:1: rule__QueryElement__Group_3__1 : rule__QueryElement__Group_3__1__Impl ;
    public final void rule__QueryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:842:1: ( rule__QueryElement__Group_3__1__Impl )
            // InternalQPE.g:843:2: rule__QueryElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_3__1"


    // $ANTLR start "rule__QueryElement__Group_3__1__Impl"
    // InternalQPE.g:849:1: rule__QueryElement__Group_3__1__Impl : ( ( rule__QueryElement__NextAssignment_3_1 ) ) ;
    public final void rule__QueryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:853:1: ( ( ( rule__QueryElement__NextAssignment_3_1 ) ) )
            // InternalQPE.g:854:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            {
            // InternalQPE.g:854:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            // InternalQPE.g:855:2: ( rule__QueryElement__NextAssignment_3_1 )
            {
             before(grammarAccess.getQueryElementAccess().getNextAssignment_3_1()); 
            // InternalQPE.g:856:2: ( rule__QueryElement__NextAssignment_3_1 )
            // InternalQPE.g:856:3: rule__QueryElement__NextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__NextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryElementAccess().getNextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__Group_3__1__Impl"


    // $ANTLR start "rule__Qualifier__Group__0"
    // InternalQPE.g:865:1: rule__Qualifier__Group__0 : rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 ;
    public final void rule__Qualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:869:1: ( rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 )
            // InternalQPE.g:870:2: rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Qualifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__0"


    // $ANTLR start "rule__Qualifier__Group__0__Impl"
    // InternalQPE.g:877:1: rule__Qualifier__Group__0__Impl : ( '[' ) ;
    public final void rule__Qualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:881:1: ( ( '[' ) )
            // InternalQPE.g:882:1: ( '[' )
            {
            // InternalQPE.g:882:1: ( '[' )
            // InternalQPE.g:883:2: '['
            {
             before(grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__0__Impl"


    // $ANTLR start "rule__Qualifier__Group__1"
    // InternalQPE.g:892:1: rule__Qualifier__Group__1 : rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 ;
    public final void rule__Qualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:896:1: ( rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 )
            // InternalQPE.g:897:2: rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Qualifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__1"


    // $ANTLR start "rule__Qualifier__Group__1__Impl"
    // InternalQPE.g:904:1: rule__Qualifier__Group__1__Impl : ( ( rule__Qualifier__Alternatives_1 ) ) ;
    public final void rule__Qualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:908:1: ( ( ( rule__Qualifier__Alternatives_1 ) ) )
            // InternalQPE.g:909:1: ( ( rule__Qualifier__Alternatives_1 ) )
            {
            // InternalQPE.g:909:1: ( ( rule__Qualifier__Alternatives_1 ) )
            // InternalQPE.g:910:2: ( rule__Qualifier__Alternatives_1 )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives_1()); 
            // InternalQPE.g:911:2: ( rule__Qualifier__Alternatives_1 )
            // InternalQPE.g:911:3: rule__Qualifier__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__1__Impl"


    // $ANTLR start "rule__Qualifier__Group__2"
    // InternalQPE.g:919:1: rule__Qualifier__Group__2 : rule__Qualifier__Group__2__Impl ;
    public final void rule__Qualifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:923:1: ( rule__Qualifier__Group__2__Impl )
            // InternalQPE.g:924:2: rule__Qualifier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__2"


    // $ANTLR start "rule__Qualifier__Group__2__Impl"
    // InternalQPE.g:930:1: rule__Qualifier__Group__2__Impl : ( ']' ) ;
    public final void rule__Qualifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:934:1: ( ( ']' ) )
            // InternalQPE.g:935:1: ( ']' )
            {
            // InternalQPE.g:935:1: ( ']' )
            // InternalQPE.g:936:2: ']'
            {
             before(grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group__2__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_0__0"
    // InternalQPE.g:946:1: rule__Qualifier__Group_1_0__0 : rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1 ;
    public final void rule__Qualifier__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:950:1: ( rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1 )
            // InternalQPE.g:951:2: rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Qualifier__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0__0"


    // $ANTLR start "rule__Qualifier__Group_1_0__0__Impl"
    // InternalQPE.g:958:1: rule__Qualifier__Group_1_0__0__Impl : ( ( rule__Qualifier__IndexAssignment_1_0_0 ) ) ;
    public final void rule__Qualifier__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:962:1: ( ( ( rule__Qualifier__IndexAssignment_1_0_0 ) ) )
            // InternalQPE.g:963:1: ( ( rule__Qualifier__IndexAssignment_1_0_0 ) )
            {
            // InternalQPE.g:963:1: ( ( rule__Qualifier__IndexAssignment_1_0_0 ) )
            // InternalQPE.g:964:2: ( rule__Qualifier__IndexAssignment_1_0_0 )
            {
             before(grammarAccess.getQualifierAccess().getIndexAssignment_1_0_0()); 
            // InternalQPE.g:965:2: ( rule__Qualifier__IndexAssignment_1_0_0 )
            // InternalQPE.g:965:3: rule__Qualifier__IndexAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__IndexAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getIndexAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_0__1"
    // InternalQPE.g:973:1: rule__Qualifier__Group_1_0__1 : rule__Qualifier__Group_1_0__1__Impl ;
    public final void rule__Qualifier__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:977:1: ( rule__Qualifier__Group_1_0__1__Impl )
            // InternalQPE.g:978:2: rule__Qualifier__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0__1"


    // $ANTLR start "rule__Qualifier__Group_1_0__1__Impl"
    // InternalQPE.g:984:1: rule__Qualifier__Group_1_0__1__Impl : ( ( rule__Qualifier__Group_1_0_1__0 )* ) ;
    public final void rule__Qualifier__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:988:1: ( ( ( rule__Qualifier__Group_1_0_1__0 )* ) )
            // InternalQPE.g:989:1: ( ( rule__Qualifier__Group_1_0_1__0 )* )
            {
            // InternalQPE.g:989:1: ( ( rule__Qualifier__Group_1_0_1__0 )* )
            // InternalQPE.g:990:2: ( rule__Qualifier__Group_1_0_1__0 )*
            {
             before(grammarAccess.getQualifierAccess().getGroup_1_0_1()); 
            // InternalQPE.g:991:2: ( rule__Qualifier__Group_1_0_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQPE.g:991:3: rule__Qualifier__Group_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Qualifier__Group_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifierAccess().getGroup_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0__1__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_0_1__0"
    // InternalQPE.g:1000:1: rule__Qualifier__Group_1_0_1__0 : rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1 ;
    public final void rule__Qualifier__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1004:1: ( rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1 )
            // InternalQPE.g:1005:2: rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Qualifier__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0_1__0"


    // $ANTLR start "rule__Qualifier__Group_1_0_1__0__Impl"
    // InternalQPE.g:1012:1: rule__Qualifier__Group_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__Qualifier__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1016:1: ( ( ',' ) )
            // InternalQPE.g:1017:1: ( ',' )
            {
            // InternalQPE.g:1017:1: ( ',' )
            // InternalQPE.g:1018:2: ','
            {
             before(grammarAccess.getQualifierAccess().getCommaKeyword_1_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getCommaKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_0_1__1"
    // InternalQPE.g:1027:1: rule__Qualifier__Group_1_0_1__1 : rule__Qualifier__Group_1_0_1__1__Impl ;
    public final void rule__Qualifier__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1031:1: ( rule__Qualifier__Group_1_0_1__1__Impl )
            // InternalQPE.g:1032:2: rule__Qualifier__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0_1__1"


    // $ANTLR start "rule__Qualifier__Group_1_0_1__1__Impl"
    // InternalQPE.g:1038:1: rule__Qualifier__Group_1_0_1__1__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) ) ;
    public final void rule__Qualifier__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1042:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) ) )
            // InternalQPE.g:1043:1: ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) )
            {
            // InternalQPE.g:1043:1: ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) )
            // InternalQPE.g:1044:2: ( rule__Qualifier__PredicatesAssignment_1_0_1_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_0_1_1()); 
            // InternalQPE.g:1045:2: ( rule__Qualifier__PredicatesAssignment_1_0_1_1 )
            // InternalQPE.g:1045:3: rule__Qualifier__PredicatesAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__PredicatesAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_1__0"
    // InternalQPE.g:1054:1: rule__Qualifier__Group_1_1__0 : rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1 ;
    public final void rule__Qualifier__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1058:1: ( rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1 )
            // InternalQPE.g:1059:2: rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Qualifier__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1__0"


    // $ANTLR start "rule__Qualifier__Group_1_1__0__Impl"
    // InternalQPE.g:1066:1: rule__Qualifier__Group_1_1__0__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) ) ;
    public final void rule__Qualifier__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1070:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) ) )
            // InternalQPE.g:1071:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) )
            {
            // InternalQPE.g:1071:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) )
            // InternalQPE.g:1072:2: ( rule__Qualifier__PredicatesAssignment_1_1_0 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_0()); 
            // InternalQPE.g:1073:2: ( rule__Qualifier__PredicatesAssignment_1_1_0 )
            // InternalQPE.g:1073:3: rule__Qualifier__PredicatesAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__PredicatesAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_1__1"
    // InternalQPE.g:1081:1: rule__Qualifier__Group_1_1__1 : rule__Qualifier__Group_1_1__1__Impl ;
    public final void rule__Qualifier__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1085:1: ( rule__Qualifier__Group_1_1__1__Impl )
            // InternalQPE.g:1086:2: rule__Qualifier__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1__1"


    // $ANTLR start "rule__Qualifier__Group_1_1__1__Impl"
    // InternalQPE.g:1092:1: rule__Qualifier__Group_1_1__1__Impl : ( ( rule__Qualifier__Group_1_1_1__0 )* ) ;
    public final void rule__Qualifier__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1096:1: ( ( ( rule__Qualifier__Group_1_1_1__0 )* ) )
            // InternalQPE.g:1097:1: ( ( rule__Qualifier__Group_1_1_1__0 )* )
            {
            // InternalQPE.g:1097:1: ( ( rule__Qualifier__Group_1_1_1__0 )* )
            // InternalQPE.g:1098:2: ( rule__Qualifier__Group_1_1_1__0 )*
            {
             before(grammarAccess.getQualifierAccess().getGroup_1_1_1()); 
            // InternalQPE.g:1099:2: ( rule__Qualifier__Group_1_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQPE.g:1099:3: rule__Qualifier__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Qualifier__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifierAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1__1__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_1_1__0"
    // InternalQPE.g:1108:1: rule__Qualifier__Group_1_1_1__0 : rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1 ;
    public final void rule__Qualifier__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1112:1: ( rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1 )
            // InternalQPE.g:1113:2: rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Qualifier__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1_1__0"


    // $ANTLR start "rule__Qualifier__Group_1_1_1__0__Impl"
    // InternalQPE.g:1120:1: rule__Qualifier__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Qualifier__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1124:1: ( ( ',' ) )
            // InternalQPE.g:1125:1: ( ',' )
            {
            // InternalQPE.g:1125:1: ( ',' )
            // InternalQPE.g:1126:2: ','
            {
             before(grammarAccess.getQualifierAccess().getCommaKeyword_1_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getCommaKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_1_1_1__1"
    // InternalQPE.g:1135:1: rule__Qualifier__Group_1_1_1__1 : rule__Qualifier__Group_1_1_1__1__Impl ;
    public final void rule__Qualifier__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1139:1: ( rule__Qualifier__Group_1_1_1__1__Impl )
            // InternalQPE.g:1140:2: rule__Qualifier__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1_1__1"


    // $ANTLR start "rule__Qualifier__Group_1_1_1__1__Impl"
    // InternalQPE.g:1146:1: rule__Qualifier__Group_1_1_1__1__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) ) ;
    public final void rule__Qualifier__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1150:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) ) )
            // InternalQPE.g:1151:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) )
            {
            // InternalQPE.g:1151:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) )
            // InternalQPE.g:1152:2: ( rule__Qualifier__PredicatesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_1_1()); 
            // InternalQPE.g:1153:2: ( rule__Qualifier__PredicatesAssignment_1_1_1_1 )
            // InternalQPE.g:1153:3: rule__Qualifier__PredicatesAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__PredicatesAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__ClassifierPredicate__Group__0"
    // InternalQPE.g:1162:1: rule__ClassifierPredicate__Group__0 : rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 ;
    public final void rule__ClassifierPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1166:1: ( rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 )
            // InternalQPE.g:1167:2: rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ClassifierPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group__0"


    // $ANTLR start "rule__ClassifierPredicate__Group__0__Impl"
    // InternalQPE.g:1174:1: rule__ClassifierPredicate__Group__0__Impl : ( ( rule__ClassifierPredicate__Group_0__0 )? ) ;
    public final void rule__ClassifierPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1178:1: ( ( ( rule__ClassifierPredicate__Group_0__0 )? ) )
            // InternalQPE.g:1179:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1179:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            // InternalQPE.g:1180:2: ( rule__ClassifierPredicate__Group_0__0 )?
            {
             before(grammarAccess.getClassifierPredicateAccess().getGroup_0()); 
            // InternalQPE.g:1181:2: ( rule__ClassifierPredicate__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==18) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalQPE.g:1181:3: rule__ClassifierPredicate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassifierPredicate__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassifierPredicateAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group__0__Impl"


    // $ANTLR start "rule__ClassifierPredicate__Group__1"
    // InternalQPE.g:1189:1: rule__ClassifierPredicate__Group__1 : rule__ClassifierPredicate__Group__1__Impl ;
    public final void rule__ClassifierPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1193:1: ( rule__ClassifierPredicate__Group__1__Impl )
            // InternalQPE.g:1194:2: rule__ClassifierPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group__1"


    // $ANTLR start "rule__ClassifierPredicate__Group__1__Impl"
    // InternalQPE.g:1200:1: rule__ClassifierPredicate__Group__1__Impl : ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) ;
    public final void rule__ClassifierPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1204:1: ( ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) )
            // InternalQPE.g:1205:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            {
            // InternalQPE.g:1205:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            // InternalQPE.g:1206:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierAssignment_1()); 
            // InternalQPE.g:1207:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            // InternalQPE.g:1207:3: rule__ClassifierPredicate__ClassifierAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__ClassifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassifierPredicateAccess().getClassifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group__1__Impl"


    // $ANTLR start "rule__ClassifierPredicate__Group_0__0"
    // InternalQPE.g:1216:1: rule__ClassifierPredicate__Group_0__0 : rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 ;
    public final void rule__ClassifierPredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1220:1: ( rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 )
            // InternalQPE.g:1221:2: rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ClassifierPredicate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group_0__0"


    // $ANTLR start "rule__ClassifierPredicate__Group_0__0__Impl"
    // InternalQPE.g:1228:1: rule__ClassifierPredicate__Group_0__0__Impl : ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__ClassifierPredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1232:1: ( ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1233:1: ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1233:1: ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1234:2: ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1235:2: ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1235:3: rule__ClassifierPredicate__QueryNamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__QueryNamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group_0__0__Impl"


    // $ANTLR start "rule__ClassifierPredicate__Group_0__1"
    // InternalQPE.g:1243:1: rule__ClassifierPredicate__Group_0__1 : rule__ClassifierPredicate__Group_0__1__Impl ;
    public final void rule__ClassifierPredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1247:1: ( rule__ClassifierPredicate__Group_0__1__Impl )
            // InternalQPE.g:1248:2: rule__ClassifierPredicate__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group_0__1"


    // $ANTLR start "rule__ClassifierPredicate__Group_0__1__Impl"
    // InternalQPE.g:1254:1: rule__ClassifierPredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ClassifierPredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1258:1: ( ( '::' ) )
            // InternalQPE.g:1259:1: ( '::' )
            {
            // InternalQPE.g:1259:1: ( '::' )
            // InternalQPE.g:1260:2: '::'
            {
             before(grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__Group_0__1__Impl"


    // $ANTLR start "rule__AttributePredicate__Group__0"
    // InternalQPE.g:1270:1: rule__AttributePredicate__Group__0 : rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 ;
    public final void rule__AttributePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1274:1: ( rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 )
            // InternalQPE.g:1275:2: rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__0"


    // $ANTLR start "rule__AttributePredicate__Group__0__Impl"
    // InternalQPE.g:1282:1: rule__AttributePredicate__Group__0__Impl : ( ( rule__AttributePredicate__Group_0__0 )? ) ;
    public final void rule__AttributePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1286:1: ( ( ( rule__AttributePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1287:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1287:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            // InternalQPE.g:1288:2: ( rule__AttributePredicate__Group_0__0 )?
            {
             before(grammarAccess.getAttributePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1289:2: ( rule__AttributePredicate__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==18) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalQPE.g:1289:3: rule__AttributePredicate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributePredicate__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributePredicateAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__0__Impl"


    // $ANTLR start "rule__AttributePredicate__Group__1"
    // InternalQPE.g:1297:1: rule__AttributePredicate__Group__1 : rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 ;
    public final void rule__AttributePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1301:1: ( rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 )
            // InternalQPE.g:1302:2: rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AttributePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__1"


    // $ANTLR start "rule__AttributePredicate__Group__1__Impl"
    // InternalQPE.g:1309:1: rule__AttributePredicate__Group__1__Impl : ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) ;
    public final void rule__AttributePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1313:1: ( ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) )
            // InternalQPE.g:1314:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            {
            // InternalQPE.g:1314:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            // InternalQPE.g:1315:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeAssignment_1()); 
            // InternalQPE.g:1316:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            // InternalQPE.g:1316:3: rule__AttributePredicate__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributePredicateAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__1__Impl"


    // $ANTLR start "rule__AttributePredicate__Group__2"
    // InternalQPE.g:1324:1: rule__AttributePredicate__Group__2 : rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 ;
    public final void rule__AttributePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1328:1: ( rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 )
            // InternalQPE.g:1329:2: rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AttributePredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__2"


    // $ANTLR start "rule__AttributePredicate__Group__2__Impl"
    // InternalQPE.g:1336:1: rule__AttributePredicate__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1340:1: ( ( '=' ) )
            // InternalQPE.g:1341:1: ( '=' )
            {
            // InternalQPE.g:1341:1: ( '=' )
            // InternalQPE.g:1342:2: '='
            {
             before(grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__2__Impl"


    // $ANTLR start "rule__AttributePredicate__Group__3"
    // InternalQPE.g:1351:1: rule__AttributePredicate__Group__3 : rule__AttributePredicate__Group__3__Impl ;
    public final void rule__AttributePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1355:1: ( rule__AttributePredicate__Group__3__Impl )
            // InternalQPE.g:1356:2: rule__AttributePredicate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__3"


    // $ANTLR start "rule__AttributePredicate__Group__3__Impl"
    // InternalQPE.g:1362:1: rule__AttributePredicate__Group__3__Impl : ( ( rule__AttributePredicate__ValueAssignment_3 ) ) ;
    public final void rule__AttributePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1366:1: ( ( ( rule__AttributePredicate__ValueAssignment_3 ) ) )
            // InternalQPE.g:1367:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            {
            // InternalQPE.g:1367:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            // InternalQPE.g:1368:2: ( rule__AttributePredicate__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributePredicateAccess().getValueAssignment_3()); 
            // InternalQPE.g:1369:2: ( rule__AttributePredicate__ValueAssignment_3 )
            // InternalQPE.g:1369:3: rule__AttributePredicate__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributePredicateAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group__3__Impl"


    // $ANTLR start "rule__AttributePredicate__Group_0__0"
    // InternalQPE.g:1378:1: rule__AttributePredicate__Group_0__0 : rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 ;
    public final void rule__AttributePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1382:1: ( rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 )
            // InternalQPE.g:1383:2: rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__AttributePredicate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group_0__0"


    // $ANTLR start "rule__AttributePredicate__Group_0__0__Impl"
    // InternalQPE.g:1390:1: rule__AttributePredicate__Group_0__0__Impl : ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1394:1: ( ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1395:1: ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1395:1: ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1396:2: ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getAttributePredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1397:2: ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1397:3: rule__AttributePredicate__QueryNamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__QueryNamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePredicateAccess().getQueryNamespaceAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group_0__0__Impl"


    // $ANTLR start "rule__AttributePredicate__Group_0__1"
    // InternalQPE.g:1405:1: rule__AttributePredicate__Group_0__1 : rule__AttributePredicate__Group_0__1__Impl ;
    public final void rule__AttributePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1409:1: ( rule__AttributePredicate__Group_0__1__Impl )
            // InternalQPE.g:1410:2: rule__AttributePredicate__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group_0__1"


    // $ANTLR start "rule__AttributePredicate__Group_0__1__Impl"
    // InternalQPE.g:1416:1: rule__AttributePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1420:1: ( ( '::' ) )
            // InternalQPE.g:1421:1: ( '::' )
            {
            // InternalQPE.g:1421:1: ( '::' )
            // InternalQPE.g:1422:2: '::'
            {
             before(grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__Group_0__1__Impl"


    // $ANTLR start "rule__ReferencePredicate__Group__0"
    // InternalQPE.g:1432:1: rule__ReferencePredicate__Group__0 : rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 ;
    public final void rule__ReferencePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1436:1: ( rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 )
            // InternalQPE.g:1437:2: rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ReferencePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__0"


    // $ANTLR start "rule__ReferencePredicate__Group__0__Impl"
    // InternalQPE.g:1444:1: rule__ReferencePredicate__Group__0__Impl : ( ( rule__ReferencePredicate__Group_0__0 )? ) ;
    public final void rule__ReferencePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1448:1: ( ( ( rule__ReferencePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1449:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1449:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            // InternalQPE.g:1450:2: ( rule__ReferencePredicate__Group_0__0 )?
            {
             before(grammarAccess.getReferencePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1451:2: ( rule__ReferencePredicate__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==18) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalQPE.g:1451:3: rule__ReferencePredicate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ReferencePredicate__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferencePredicateAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__0__Impl"


    // $ANTLR start "rule__ReferencePredicate__Group__1"
    // InternalQPE.g:1459:1: rule__ReferencePredicate__Group__1 : rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 ;
    public final void rule__ReferencePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1463:1: ( rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 )
            // InternalQPE.g:1464:2: rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ReferencePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__1"


    // $ANTLR start "rule__ReferencePredicate__Group__1__Impl"
    // InternalQPE.g:1471:1: rule__ReferencePredicate__Group__1__Impl : ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferencePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1475:1: ( ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) )
            // InternalQPE.g:1476:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            {
            // InternalQPE.g:1476:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            // InternalQPE.g:1477:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceAssignment_1()); 
            // InternalQPE.g:1478:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            // InternalQPE.g:1478:3: rule__ReferencePredicate__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferencePredicateAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__1__Impl"


    // $ANTLR start "rule__ReferencePredicate__Group__2"
    // InternalQPE.g:1486:1: rule__ReferencePredicate__Group__2 : rule__ReferencePredicate__Group__2__Impl ;
    public final void rule__ReferencePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1490:1: ( rule__ReferencePredicate__Group__2__Impl )
            // InternalQPE.g:1491:2: rule__ReferencePredicate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__2"


    // $ANTLR start "rule__ReferencePredicate__Group__2__Impl"
    // InternalQPE.g:1497:1: rule__ReferencePredicate__Group__2__Impl : ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) ;
    public final void rule__ReferencePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1501:1: ( ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) )
            // InternalQPE.g:1502:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            {
            // InternalQPE.g:1502:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            // InternalQPE.g:1503:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:1504:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            // InternalQPE.g:1504:3: rule__ReferencePredicate__QualifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__QualifierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferencePredicateAccess().getQualifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group__2__Impl"


    // $ANTLR start "rule__ReferencePredicate__Group_0__0"
    // InternalQPE.g:1513:1: rule__ReferencePredicate__Group_0__0 : rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 ;
    public final void rule__ReferencePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1517:1: ( rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 )
            // InternalQPE.g:1518:2: rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__ReferencePredicate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group_0__0"


    // $ANTLR start "rule__ReferencePredicate__Group_0__0__Impl"
    // InternalQPE.g:1525:1: rule__ReferencePredicate__Group_0__0__Impl : ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__ReferencePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1529:1: ( ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1530:1: ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1530:1: ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1531:2: ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1532:2: ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1532:3: rule__ReferencePredicate__QueryNamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__QueryNamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getReferencePredicateAccess().getQueryNamespaceAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group_0__0__Impl"


    // $ANTLR start "rule__ReferencePredicate__Group_0__1"
    // InternalQPE.g:1540:1: rule__ReferencePredicate__Group_0__1 : rule__ReferencePredicate__Group_0__1__Impl ;
    public final void rule__ReferencePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1544:1: ( rule__ReferencePredicate__Group_0__1__Impl )
            // InternalQPE.g:1545:2: rule__ReferencePredicate__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group_0__1"


    // $ANTLR start "rule__ReferencePredicate__Group_0__1__Impl"
    // InternalQPE.g:1551:1: rule__ReferencePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ReferencePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1555:1: ( ( '::' ) )
            // InternalQPE.g:1556:1: ( '::' )
            {
            // InternalQPE.g:1556:1: ( '::' )
            // InternalQPE.g:1557:2: '::'
            {
             before(grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__Group_0__1__Impl"


    // $ANTLR start "rule__QPE__QueryNamespacesAssignment_0"
    // InternalQPE.g:1567:1: rule__QPE__QueryNamespacesAssignment_0 : ( ruleQueryNamespace ) ;
    public final void rule__QPE__QueryNamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1571:1: ( ( ruleQueryNamespace ) )
            // InternalQPE.g:1572:2: ( ruleQueryNamespace )
            {
            // InternalQPE.g:1572:2: ( ruleQueryNamespace )
            // InternalQPE.g:1573:3: ruleQueryNamespace
            {
             before(grammarAccess.getQPEAccess().getQueryNamespacesQueryNamespaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryNamespace();

            state._fsp--;

             after(grammarAccess.getQPEAccess().getQueryNamespacesQueryNamespaceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__QueryNamespacesAssignment_0"


    // $ANTLR start "rule__QPE__PathExpressionsAssignment_1"
    // InternalQPE.g:1582:1: rule__QPE__PathExpressionsAssignment_1 : ( rulePathExpression ) ;
    public final void rule__QPE__PathExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1586:1: ( ( rulePathExpression ) )
            // InternalQPE.g:1587:2: ( rulePathExpression )
            {
            // InternalQPE.g:1587:2: ( rulePathExpression )
            // InternalQPE.g:1588:3: rulePathExpression
            {
             before(grammarAccess.getQPEAccess().getPathExpressionsPathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getQPEAccess().getPathExpressionsPathExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QPE__PathExpressionsAssignment_1"


    // $ANTLR start "rule__QueryNamespace__IRIAssignment_1"
    // InternalQPE.g:1597:1: rule__QueryNamespace__IRIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QueryNamespace__IRIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1601:1: ( ( RULE_STRING ) )
            // InternalQPE.g:1602:2: ( RULE_STRING )
            {
            // InternalQPE.g:1602:2: ( RULE_STRING )
            // InternalQPE.g:1603:3: RULE_STRING
            {
             before(grammarAccess.getQueryNamespaceAccess().getIRISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQueryNamespaceAccess().getIRISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__IRIAssignment_1"


    // $ANTLR start "rule__QueryNamespace__PrefixAssignment_2_1"
    // InternalQPE.g:1612:1: rule__QueryNamespace__PrefixAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__QueryNamespace__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1616:1: ( ( RULE_ID ) )
            // InternalQPE.g:1617:2: ( RULE_ID )
            {
            // InternalQPE.g:1617:2: ( RULE_ID )
            // InternalQPE.g:1618:3: RULE_ID
            {
             before(grammarAccess.getQueryNamespaceAccess().getPrefixIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryNamespaceAccess().getPrefixIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryNamespace__PrefixAssignment_2_1"


    // $ANTLR start "rule__PathExpression__IsRelativeAssignment_1"
    // InternalQPE.g:1627:1: rule__PathExpression__IsRelativeAssignment_1 : ( ( '.' ) ) ;
    public final void rule__PathExpression__IsRelativeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1631:1: ( ( ( '.' ) ) )
            // InternalQPE.g:1632:2: ( ( '.' ) )
            {
            // InternalQPE.g:1632:2: ( ( '.' ) )
            // InternalQPE.g:1633:3: ( '.' )
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 
            // InternalQPE.g:1634:3: ( '.' )
            // InternalQPE.g:1635:4: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 

            }

             after(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__IsRelativeAssignment_1"


    // $ANTLR start "rule__PathExpression__QualifierAssignment_2"
    // InternalQPE.g:1646:1: rule__PathExpression__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__PathExpression__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1650:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1651:2: ( ruleQualifier )
            {
            // InternalQPE.g:1651:2: ( ruleQualifier )
            // InternalQPE.g:1652:3: ruleQualifier
            {
             before(grammarAccess.getPathExpressionAccess().getQualifierQualifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getQualifierQualifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__QualifierAssignment_2"


    // $ANTLR start "rule__PathExpression__HeadAssignment_4"
    // InternalQPE.g:1661:1: rule__PathExpression__HeadAssignment_4 : ( ruleQueryElement ) ;
    public final void rule__PathExpression__HeadAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1665:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1666:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1666:2: ( ruleQueryElement )
            // InternalQPE.g:1667:3: ruleQueryElement
            {
             before(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpression__HeadAssignment_4"


    // $ANTLR start "rule__QueryElement__QueryNamespaceAssignment_0_0"
    // InternalQPE.g:1676:1: rule__QueryElement__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1680:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1681:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1681:2: ( ( RULE_ID ) )
            // InternalQPE.g:1682:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1683:3: ( RULE_ID )
            // InternalQPE.g:1684:4: RULE_ID
            {
             before(grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__QueryNamespaceAssignment_0_0"


    // $ANTLR start "rule__QueryElement__FeatureAssignment_1"
    // InternalQPE.g:1695:1: rule__QueryElement__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1699:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1700:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1700:2: ( ( RULE_ID ) )
            // InternalQPE.g:1701:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0()); 
            // InternalQPE.g:1702:3: ( RULE_ID )
            // InternalQPE.g:1703:4: RULE_ID
            {
             before(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__FeatureAssignment_1"


    // $ANTLR start "rule__QueryElement__QualifierAssignment_2"
    // InternalQPE.g:1714:1: rule__QueryElement__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__QueryElement__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1718:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1719:2: ( ruleQualifier )
            {
            // InternalQPE.g:1719:2: ( ruleQualifier )
            // InternalQPE.g:1720:3: ruleQualifier
            {
             before(grammarAccess.getQueryElementAccess().getQualifierQualifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getQueryElementAccess().getQualifierQualifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__QualifierAssignment_2"


    // $ANTLR start "rule__QueryElement__NextAssignment_3_1"
    // InternalQPE.g:1729:1: rule__QueryElement__NextAssignment_3_1 : ( ruleQueryElement ) ;
    public final void rule__QueryElement__NextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1733:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1734:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1734:2: ( ruleQueryElement )
            // InternalQPE.g:1735:3: ruleQueryElement
            {
             before(grammarAccess.getQueryElementAccess().getNextQueryElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryElement();

            state._fsp--;

             after(grammarAccess.getQueryElementAccess().getNextQueryElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryElement__NextAssignment_3_1"


    // $ANTLR start "rule__Qualifier__IndexAssignment_1_0_0"
    // InternalQPE.g:1744:1: rule__Qualifier__IndexAssignment_1_0_0 : ( RULE_INT ) ;
    public final void rule__Qualifier__IndexAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1748:1: ( ( RULE_INT ) )
            // InternalQPE.g:1749:2: ( RULE_INT )
            {
            // InternalQPE.g:1749:2: ( RULE_INT )
            // InternalQPE.g:1750:3: RULE_INT
            {
             before(grammarAccess.getQualifierAccess().getIndexINTTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getIndexINTTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__IndexAssignment_1_0_0"


    // $ANTLR start "rule__Qualifier__PredicatesAssignment_1_0_1_1"
    // InternalQPE.g:1759:1: rule__Qualifier__PredicatesAssignment_1_0_1_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1763:1: ( ( rulePredicate ) )
            // InternalQPE.g:1764:2: ( rulePredicate )
            {
            // InternalQPE.g:1764:2: ( rulePredicate )
            // InternalQPE.g:1765:3: rulePredicate
            {
             before(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__PredicatesAssignment_1_0_1_1"


    // $ANTLR start "rule__Qualifier__PredicatesAssignment_1_1_0"
    // InternalQPE.g:1774:1: rule__Qualifier__PredicatesAssignment_1_1_0 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1778:1: ( ( rulePredicate ) )
            // InternalQPE.g:1779:2: ( rulePredicate )
            {
            // InternalQPE.g:1779:2: ( rulePredicate )
            // InternalQPE.g:1780:3: rulePredicate
            {
             before(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__PredicatesAssignment_1_1_0"


    // $ANTLR start "rule__Qualifier__PredicatesAssignment_1_1_1_1"
    // InternalQPE.g:1789:1: rule__Qualifier__PredicatesAssignment_1_1_1_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1793:1: ( ( rulePredicate ) )
            // InternalQPE.g:1794:2: ( rulePredicate )
            {
            // InternalQPE.g:1794:2: ( rulePredicate )
            // InternalQPE.g:1795:3: rulePredicate
            {
             before(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qualifier__PredicatesAssignment_1_1_1_1"


    // $ANTLR start "rule__ClassifierPredicate__QueryNamespaceAssignment_0_0"
    // InternalQPE.g:1804:1: rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1808:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1809:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1809:2: ( ( RULE_ID ) )
            // InternalQPE.g:1810:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1811:3: ( RULE_ID )
            // InternalQPE.g:1812:4: RULE_ID
            {
             before(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__QueryNamespaceAssignment_0_0"


    // $ANTLR start "rule__ClassifierPredicate__ClassifierAssignment_1"
    // InternalQPE.g:1823:1: rule__ClassifierPredicate__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1827:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1828:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1828:2: ( ( RULE_ID ) )
            // InternalQPE.g:1829:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalQPE.g:1830:3: ( RULE_ID )
            // InternalQPE.g:1831:4: RULE_ID
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassifierPredicate__ClassifierAssignment_1"


    // $ANTLR start "rule__AttributePredicate__QueryNamespaceAssignment_0_0"
    // InternalQPE.g:1842:1: rule__AttributePredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1846:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1847:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1847:2: ( ( RULE_ID ) )
            // InternalQPE.g:1848:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1849:3: ( RULE_ID )
            // InternalQPE.g:1850:4: RULE_ID
            {
             before(grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__QueryNamespaceAssignment_0_0"


    // $ANTLR start "rule__AttributePredicate__AttributeAssignment_1"
    // InternalQPE.g:1861:1: rule__AttributePredicate__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1865:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1866:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1866:2: ( ( RULE_ID ) )
            // InternalQPE.g:1867:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0()); 
            // InternalQPE.g:1868:3: ( RULE_ID )
            // InternalQPE.g:1869:4: RULE_ID
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__AttributeAssignment_1"


    // $ANTLR start "rule__AttributePredicate__ValueAssignment_3"
    // InternalQPE.g:1880:1: rule__AttributePredicate__ValueAssignment_3 : ( RULE_VALUE ) ;
    public final void rule__AttributePredicate__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1884:1: ( ( RULE_VALUE ) )
            // InternalQPE.g:1885:2: ( RULE_VALUE )
            {
            // InternalQPE.g:1885:2: ( RULE_VALUE )
            // InternalQPE.g:1886:3: RULE_VALUE
            {
             before(grammarAccess.getAttributePredicateAccess().getValueVALUETerminalRuleCall_3_0()); 
            match(input,RULE_VALUE,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getValueVALUETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePredicate__ValueAssignment_3"


    // $ANTLR start "rule__ReferencePredicate__QueryNamespaceAssignment_0_0"
    // InternalQPE.g:1895:1: rule__ReferencePredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1899:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1900:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1900:2: ( ( RULE_ID ) )
            // InternalQPE.g:1901:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1902:3: ( RULE_ID )
            // InternalQPE.g:1903:4: RULE_ID
            {
             before(grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__QueryNamespaceAssignment_0_0"


    // $ANTLR start "rule__ReferencePredicate__ReferenceAssignment_1"
    // InternalQPE.g:1914:1: rule__ReferencePredicate__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1918:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1919:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1919:2: ( ( RULE_ID ) )
            // InternalQPE.g:1920:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalQPE.g:1921:3: ( RULE_ID )
            // InternalQPE.g:1922:4: RULE_ID
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__ReferenceAssignment_1"


    // $ANTLR start "rule__ReferencePredicate__QualifierAssignment_2"
    // InternalQPE.g:1933:1: rule__ReferencePredicate__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__ReferencePredicate__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1937:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1938:2: ( ruleQualifier )
            {
            // InternalQPE.g:1938:2: ( ruleQualifier )
            // InternalQPE.g:1939:3: ruleQualifier
            {
             before(grammarAccess.getReferencePredicateAccess().getQualifierQualifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getReferencePredicateAccess().getQualifierQualifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferencePredicate__QualifierAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000008A0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});

}
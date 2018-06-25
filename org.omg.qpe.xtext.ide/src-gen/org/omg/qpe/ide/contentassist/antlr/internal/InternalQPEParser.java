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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_LONG", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'as'", "'/'", "'::'", "'['", "']'", "','", "'='", "'.'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_LONG=6;
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


    // $ANTLR start "entryRuleVALUE"
    // InternalQPE.g:278:1: entryRuleVALUE : ruleVALUE EOF ;
    public final void entryRuleVALUE() throws RecognitionException {
        try {
            // InternalQPE.g:279:1: ( ruleVALUE EOF )
            // InternalQPE.g:280:1: ruleVALUE EOF
            {
             before(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_1);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getVALUERule()); 
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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // InternalQPE.g:287:1: ruleVALUE : ( ( rule__VALUE__Alternatives ) ) ;
    public final void ruleVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:291:2: ( ( ( rule__VALUE__Alternatives ) ) )
            // InternalQPE.g:292:2: ( ( rule__VALUE__Alternatives ) )
            {
            // InternalQPE.g:292:2: ( ( rule__VALUE__Alternatives ) )
            // InternalQPE.g:293:3: ( rule__VALUE__Alternatives )
            {
             before(grammarAccess.getVALUEAccess().getAlternatives()); 
            // InternalQPE.g:294:3: ( rule__VALUE__Alternatives )
            // InternalQPE.g:294:4: rule__VALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALUE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALUEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "rule__Qualifier__Alternatives_1"
    // InternalQPE.g:302:1: rule__Qualifier__Alternatives_1 : ( ( ( rule__Qualifier__Group_1_0__0 ) ) | ( ( rule__Qualifier__Group_1_1__0 ) ) );
    public final void rule__Qualifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:306:1: ( ( ( rule__Qualifier__Group_1_0__0 ) ) | ( ( rule__Qualifier__Group_1_1__0 ) ) )
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
                    // InternalQPE.g:307:2: ( ( rule__Qualifier__Group_1_0__0 ) )
                    {
                    // InternalQPE.g:307:2: ( ( rule__Qualifier__Group_1_0__0 ) )
                    // InternalQPE.g:308:3: ( rule__Qualifier__Group_1_0__0 )
                    {
                     before(grammarAccess.getQualifierAccess().getGroup_1_0()); 
                    // InternalQPE.g:309:3: ( rule__Qualifier__Group_1_0__0 )
                    // InternalQPE.g:309:4: rule__Qualifier__Group_1_0__0
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
                    // InternalQPE.g:313:2: ( ( rule__Qualifier__Group_1_1__0 ) )
                    {
                    // InternalQPE.g:313:2: ( ( rule__Qualifier__Group_1_1__0 ) )
                    // InternalQPE.g:314:3: ( rule__Qualifier__Group_1_1__0 )
                    {
                     before(grammarAccess.getQualifierAccess().getGroup_1_1()); 
                    // InternalQPE.g:315:3: ( rule__Qualifier__Group_1_1__0 )
                    // InternalQPE.g:315:4: rule__Qualifier__Group_1_1__0
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
    // InternalQPE.g:323:1: rule__Predicate__Alternatives : ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:327:1: ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 21:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case 21:
                            {
                            alt2=2;
                            }
                            break;
                        case EOF:
                        case 19:
                        case 20:
                            {
                            alt2=1;
                            }
                            break;
                        case 18:
                            {
                            alt2=3;
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
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 19:
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case 18:
                    {
                    alt2=3;
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
                    // InternalQPE.g:328:2: ( ruleClassifierPredicate )
                    {
                    // InternalQPE.g:328:2: ( ruleClassifierPredicate )
                    // InternalQPE.g:329:3: ruleClassifierPredicate
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
                    // InternalQPE.g:334:2: ( ruleAttributePredicate )
                    {
                    // InternalQPE.g:334:2: ( ruleAttributePredicate )
                    // InternalQPE.g:335:3: ruleAttributePredicate
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
                    // InternalQPE.g:340:2: ( ruleReferencePredicate )
                    {
                    // InternalQPE.g:340:2: ( ruleReferencePredicate )
                    // InternalQPE.g:341:3: ruleReferencePredicate
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


    // $ANTLR start "rule__VALUE__Alternatives"
    // InternalQPE.g:350:1: rule__VALUE__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_LONG ) | ( RULE_DOUBLE ) | ( RULE_BOOLEAN ) );
    public final void rule__VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:354:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_LONG ) | ( RULE_DOUBLE ) | ( RULE_BOOLEAN ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case RULE_LONG:
                {
                alt3=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt3=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQPE.g:355:2: ( RULE_STRING )
                    {
                    // InternalQPE.g:355:2: ( RULE_STRING )
                    // InternalQPE.g:356:3: RULE_STRING
                    {
                     before(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:361:2: ( RULE_INT )
                    {
                    // InternalQPE.g:361:2: ( RULE_INT )
                    // InternalQPE.g:362:3: RULE_INT
                    {
                     before(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQPE.g:367:2: ( RULE_LONG )
                    {
                    // InternalQPE.g:367:2: ( RULE_LONG )
                    // InternalQPE.g:368:3: RULE_LONG
                    {
                     before(grammarAccess.getVALUEAccess().getLONGTerminalRuleCall_2()); 
                    match(input,RULE_LONG,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getLONGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQPE.g:373:2: ( RULE_DOUBLE )
                    {
                    // InternalQPE.g:373:2: ( RULE_DOUBLE )
                    // InternalQPE.g:374:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getVALUEAccess().getDOUBLETerminalRuleCall_3()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getDOUBLETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQPE.g:379:2: ( RULE_BOOLEAN )
                    {
                    // InternalQPE.g:379:2: ( RULE_BOOLEAN )
                    // InternalQPE.g:380:3: RULE_BOOLEAN
                    {
                     before(grammarAccess.getVALUEAccess().getBOOLEANTerminalRuleCall_4()); 
                    match(input,RULE_BOOLEAN,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getBOOLEANTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__VALUE__Alternatives"


    // $ANTLR start "rule__QPE__Group__0"
    // InternalQPE.g:389:1: rule__QPE__Group__0 : rule__QPE__Group__0__Impl rule__QPE__Group__1 ;
    public final void rule__QPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:393:1: ( rule__QPE__Group__0__Impl rule__QPE__Group__1 )
            // InternalQPE.g:394:2: rule__QPE__Group__0__Impl rule__QPE__Group__1
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
    // InternalQPE.g:401:1: rule__QPE__Group__0__Impl : ( ( rule__QPE__QueryNamespacesAssignment_0 ) ) ;
    public final void rule__QPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:405:1: ( ( ( rule__QPE__QueryNamespacesAssignment_0 ) ) )
            // InternalQPE.g:406:1: ( ( rule__QPE__QueryNamespacesAssignment_0 ) )
            {
            // InternalQPE.g:406:1: ( ( rule__QPE__QueryNamespacesAssignment_0 ) )
            // InternalQPE.g:407:2: ( rule__QPE__QueryNamespacesAssignment_0 )
            {
             before(grammarAccess.getQPEAccess().getQueryNamespacesAssignment_0()); 
            // InternalQPE.g:408:2: ( rule__QPE__QueryNamespacesAssignment_0 )
            // InternalQPE.g:408:3: rule__QPE__QueryNamespacesAssignment_0
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
    // InternalQPE.g:416:1: rule__QPE__Group__1 : rule__QPE__Group__1__Impl ;
    public final void rule__QPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:420:1: ( rule__QPE__Group__1__Impl )
            // InternalQPE.g:421:2: rule__QPE__Group__1__Impl
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
    // InternalQPE.g:427:1: rule__QPE__Group__1__Impl : ( ( rule__QPE__PathExpressionsAssignment_1 ) ) ;
    public final void rule__QPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:431:1: ( ( ( rule__QPE__PathExpressionsAssignment_1 ) ) )
            // InternalQPE.g:432:1: ( ( rule__QPE__PathExpressionsAssignment_1 ) )
            {
            // InternalQPE.g:432:1: ( ( rule__QPE__PathExpressionsAssignment_1 ) )
            // InternalQPE.g:433:2: ( rule__QPE__PathExpressionsAssignment_1 )
            {
             before(grammarAccess.getQPEAccess().getPathExpressionsAssignment_1()); 
            // InternalQPE.g:434:2: ( rule__QPE__PathExpressionsAssignment_1 )
            // InternalQPE.g:434:3: rule__QPE__PathExpressionsAssignment_1
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
    // InternalQPE.g:443:1: rule__QueryNamespace__Group__0 : rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 ;
    public final void rule__QueryNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:447:1: ( rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 )
            // InternalQPE.g:448:2: rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1
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
    // InternalQPE.g:455:1: rule__QueryNamespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__QueryNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:459:1: ( ( 'namespace' ) )
            // InternalQPE.g:460:1: ( 'namespace' )
            {
            // InternalQPE.g:460:1: ( 'namespace' )
            // InternalQPE.g:461:2: 'namespace'
            {
             before(grammarAccess.getQueryNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalQPE.g:470:1: rule__QueryNamespace__Group__1 : rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 ;
    public final void rule__QueryNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:474:1: ( rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 )
            // InternalQPE.g:475:2: rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2
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
    // InternalQPE.g:482:1: rule__QueryNamespace__Group__1__Impl : ( ( rule__QueryNamespace__IRIAssignment_1 ) ) ;
    public final void rule__QueryNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:486:1: ( ( ( rule__QueryNamespace__IRIAssignment_1 ) ) )
            // InternalQPE.g:487:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            {
            // InternalQPE.g:487:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            // InternalQPE.g:488:2: ( rule__QueryNamespace__IRIAssignment_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getIRIAssignment_1()); 
            // InternalQPE.g:489:2: ( rule__QueryNamespace__IRIAssignment_1 )
            // InternalQPE.g:489:3: rule__QueryNamespace__IRIAssignment_1
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
    // InternalQPE.g:497:1: rule__QueryNamespace__Group__2 : rule__QueryNamespace__Group__2__Impl ;
    public final void rule__QueryNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:501:1: ( rule__QueryNamespace__Group__2__Impl )
            // InternalQPE.g:502:2: rule__QueryNamespace__Group__2__Impl
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
    // InternalQPE.g:508:1: rule__QueryNamespace__Group__2__Impl : ( ( rule__QueryNamespace__Group_2__0 )? ) ;
    public final void rule__QueryNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:512:1: ( ( ( rule__QueryNamespace__Group_2__0 )? ) )
            // InternalQPE.g:513:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            {
            // InternalQPE.g:513:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            // InternalQPE.g:514:2: ( rule__QueryNamespace__Group_2__0 )?
            {
             before(grammarAccess.getQueryNamespaceAccess().getGroup_2()); 
            // InternalQPE.g:515:2: ( rule__QueryNamespace__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQPE.g:515:3: rule__QueryNamespace__Group_2__0
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
    // InternalQPE.g:524:1: rule__QueryNamespace__Group_2__0 : rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 ;
    public final void rule__QueryNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:528:1: ( rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 )
            // InternalQPE.g:529:2: rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1
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
    // InternalQPE.g:536:1: rule__QueryNamespace__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__QueryNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:540:1: ( ( 'as' ) )
            // InternalQPE.g:541:1: ( 'as' )
            {
            // InternalQPE.g:541:1: ( 'as' )
            // InternalQPE.g:542:2: 'as'
            {
             before(grammarAccess.getQueryNamespaceAccess().getAsKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalQPE.g:551:1: rule__QueryNamespace__Group_2__1 : rule__QueryNamespace__Group_2__1__Impl ;
    public final void rule__QueryNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:555:1: ( rule__QueryNamespace__Group_2__1__Impl )
            // InternalQPE.g:556:2: rule__QueryNamespace__Group_2__1__Impl
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
    // InternalQPE.g:562:1: rule__QueryNamespace__Group_2__1__Impl : ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) ;
    public final void rule__QueryNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:566:1: ( ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) )
            // InternalQPE.g:567:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            {
            // InternalQPE.g:567:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            // InternalQPE.g:568:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getPrefixAssignment_2_1()); 
            // InternalQPE.g:569:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            // InternalQPE.g:569:3: rule__QueryNamespace__PrefixAssignment_2_1
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
    // InternalQPE.g:578:1: rule__PathExpression__Group__0 : rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 ;
    public final void rule__PathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:582:1: ( rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 )
            // InternalQPE.g:583:2: rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1
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
    // InternalQPE.g:590:1: rule__PathExpression__Group__0__Impl : ( () ) ;
    public final void rule__PathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:594:1: ( ( () ) )
            // InternalQPE.g:595:1: ( () )
            {
            // InternalQPE.g:595:1: ( () )
            // InternalQPE.g:596:2: ()
            {
             before(grammarAccess.getPathExpressionAccess().getPathExpressionAction_0()); 
            // InternalQPE.g:597:2: ()
            // InternalQPE.g:597:3: 
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
    // InternalQPE.g:605:1: rule__PathExpression__Group__1 : rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 ;
    public final void rule__PathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:609:1: ( rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 )
            // InternalQPE.g:610:2: rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2
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
    // InternalQPE.g:617:1: rule__PathExpression__Group__1__Impl : ( ( rule__PathExpression__IsRelativeAssignment_1 )? ) ;
    public final void rule__PathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:621:1: ( ( ( rule__PathExpression__IsRelativeAssignment_1 )? ) )
            // InternalQPE.g:622:1: ( ( rule__PathExpression__IsRelativeAssignment_1 )? )
            {
            // InternalQPE.g:622:1: ( ( rule__PathExpression__IsRelativeAssignment_1 )? )
            // InternalQPE.g:623:2: ( rule__PathExpression__IsRelativeAssignment_1 )?
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeAssignment_1()); 
            // InternalQPE.g:624:2: ( rule__PathExpression__IsRelativeAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQPE.g:624:3: rule__PathExpression__IsRelativeAssignment_1
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
    // InternalQPE.g:632:1: rule__PathExpression__Group__2 : rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 ;
    public final void rule__PathExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:636:1: ( rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3 )
            // InternalQPE.g:637:2: rule__PathExpression__Group__2__Impl rule__PathExpression__Group__3
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
    // InternalQPE.g:644:1: rule__PathExpression__Group__2__Impl : ( ( rule__PathExpression__QualifierAssignment_2 )? ) ;
    public final void rule__PathExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:648:1: ( ( ( rule__PathExpression__QualifierAssignment_2 )? ) )
            // InternalQPE.g:649:1: ( ( rule__PathExpression__QualifierAssignment_2 )? )
            {
            // InternalQPE.g:649:1: ( ( rule__PathExpression__QualifierAssignment_2 )? )
            // InternalQPE.g:650:2: ( rule__PathExpression__QualifierAssignment_2 )?
            {
             before(grammarAccess.getPathExpressionAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:651:2: ( rule__PathExpression__QualifierAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQPE.g:651:3: rule__PathExpression__QualifierAssignment_2
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
    // InternalQPE.g:659:1: rule__PathExpression__Group__3 : rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4 ;
    public final void rule__PathExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:663:1: ( rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4 )
            // InternalQPE.g:664:2: rule__PathExpression__Group__3__Impl rule__PathExpression__Group__4
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
    // InternalQPE.g:671:1: rule__PathExpression__Group__3__Impl : ( '/' ) ;
    public final void rule__PathExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:675:1: ( ( '/' ) )
            // InternalQPE.g:676:1: ( '/' )
            {
            // InternalQPE.g:676:1: ( '/' )
            // InternalQPE.g:677:2: '/'
            {
             before(grammarAccess.getPathExpressionAccess().getSolidusKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQPE.g:686:1: rule__PathExpression__Group__4 : rule__PathExpression__Group__4__Impl ;
    public final void rule__PathExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:690:1: ( rule__PathExpression__Group__4__Impl )
            // InternalQPE.g:691:2: rule__PathExpression__Group__4__Impl
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
    // InternalQPE.g:697:1: rule__PathExpression__Group__4__Impl : ( ( rule__PathExpression__HeadAssignment_4 )? ) ;
    public final void rule__PathExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:701:1: ( ( ( rule__PathExpression__HeadAssignment_4 )? ) )
            // InternalQPE.g:702:1: ( ( rule__PathExpression__HeadAssignment_4 )? )
            {
            // InternalQPE.g:702:1: ( ( rule__PathExpression__HeadAssignment_4 )? )
            // InternalQPE.g:703:2: ( rule__PathExpression__HeadAssignment_4 )?
            {
             before(grammarAccess.getPathExpressionAccess().getHeadAssignment_4()); 
            // InternalQPE.g:704:2: ( rule__PathExpression__HeadAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQPE.g:704:3: rule__PathExpression__HeadAssignment_4
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
    // InternalQPE.g:713:1: rule__QueryElement__Group__0 : rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 ;
    public final void rule__QueryElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:717:1: ( rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 )
            // InternalQPE.g:718:2: rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1
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
    // InternalQPE.g:725:1: rule__QueryElement__Group__0__Impl : ( ( rule__QueryElement__Group_0__0 )? ) ;
    public final void rule__QueryElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:729:1: ( ( ( rule__QueryElement__Group_0__0 )? ) )
            // InternalQPE.g:730:1: ( ( rule__QueryElement__Group_0__0 )? )
            {
            // InternalQPE.g:730:1: ( ( rule__QueryElement__Group_0__0 )? )
            // InternalQPE.g:731:2: ( rule__QueryElement__Group_0__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_0()); 
            // InternalQPE.g:732:2: ( rule__QueryElement__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==17) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalQPE.g:732:3: rule__QueryElement__Group_0__0
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
    // InternalQPE.g:740:1: rule__QueryElement__Group__1 : rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 ;
    public final void rule__QueryElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:744:1: ( rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 )
            // InternalQPE.g:745:2: rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2
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
    // InternalQPE.g:752:1: rule__QueryElement__Group__1__Impl : ( ( rule__QueryElement__FeatureAssignment_1 ) ) ;
    public final void rule__QueryElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:756:1: ( ( ( rule__QueryElement__FeatureAssignment_1 ) ) )
            // InternalQPE.g:757:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            {
            // InternalQPE.g:757:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            // InternalQPE.g:758:2: ( rule__QueryElement__FeatureAssignment_1 )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureAssignment_1()); 
            // InternalQPE.g:759:2: ( rule__QueryElement__FeatureAssignment_1 )
            // InternalQPE.g:759:3: rule__QueryElement__FeatureAssignment_1
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
    // InternalQPE.g:767:1: rule__QueryElement__Group__2 : rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 ;
    public final void rule__QueryElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:771:1: ( rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 )
            // InternalQPE.g:772:2: rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3
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
    // InternalQPE.g:779:1: rule__QueryElement__Group__2__Impl : ( ( rule__QueryElement__QualifierAssignment_2 )? ) ;
    public final void rule__QueryElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:783:1: ( ( ( rule__QueryElement__QualifierAssignment_2 )? ) )
            // InternalQPE.g:784:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            {
            // InternalQPE.g:784:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            // InternalQPE.g:785:2: ( rule__QueryElement__QualifierAssignment_2 )?
            {
             before(grammarAccess.getQueryElementAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:786:2: ( rule__QueryElement__QualifierAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQPE.g:786:3: rule__QueryElement__QualifierAssignment_2
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
    // InternalQPE.g:794:1: rule__QueryElement__Group__3 : rule__QueryElement__Group__3__Impl ;
    public final void rule__QueryElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:798:1: ( rule__QueryElement__Group__3__Impl )
            // InternalQPE.g:799:2: rule__QueryElement__Group__3__Impl
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
    // InternalQPE.g:805:1: rule__QueryElement__Group__3__Impl : ( ( rule__QueryElement__Group_3__0 )? ) ;
    public final void rule__QueryElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:809:1: ( ( ( rule__QueryElement__Group_3__0 )? ) )
            // InternalQPE.g:810:1: ( ( rule__QueryElement__Group_3__0 )? )
            {
            // InternalQPE.g:810:1: ( ( rule__QueryElement__Group_3__0 )? )
            // InternalQPE.g:811:2: ( rule__QueryElement__Group_3__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_3()); 
            // InternalQPE.g:812:2: ( rule__QueryElement__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQPE.g:812:3: rule__QueryElement__Group_3__0
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
    // InternalQPE.g:821:1: rule__QueryElement__Group_0__0 : rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 ;
    public final void rule__QueryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:825:1: ( rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 )
            // InternalQPE.g:826:2: rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1
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
    // InternalQPE.g:833:1: rule__QueryElement__Group_0__0__Impl : ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__QueryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:837:1: ( ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:838:1: ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:838:1: ( ( rule__QueryElement__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:839:2: ( rule__QueryElement__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getQueryElementAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:840:2: ( rule__QueryElement__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:840:3: rule__QueryElement__QueryNamespaceAssignment_0_0
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
    // InternalQPE.g:848:1: rule__QueryElement__Group_0__1 : rule__QueryElement__Group_0__1__Impl ;
    public final void rule__QueryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:852:1: ( rule__QueryElement__Group_0__1__Impl )
            // InternalQPE.g:853:2: rule__QueryElement__Group_0__1__Impl
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
    // InternalQPE.g:859:1: rule__QueryElement__Group_0__1__Impl : ( '::' ) ;
    public final void rule__QueryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:863:1: ( ( '::' ) )
            // InternalQPE.g:864:1: ( '::' )
            {
            // InternalQPE.g:864:1: ( '::' )
            // InternalQPE.g:865:2: '::'
            {
             before(grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQPE.g:875:1: rule__QueryElement__Group_3__0 : rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 ;
    public final void rule__QueryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:879:1: ( rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 )
            // InternalQPE.g:880:2: rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1
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
    // InternalQPE.g:887:1: rule__QueryElement__Group_3__0__Impl : ( '/' ) ;
    public final void rule__QueryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:891:1: ( ( '/' ) )
            // InternalQPE.g:892:1: ( '/' )
            {
            // InternalQPE.g:892:1: ( '/' )
            // InternalQPE.g:893:2: '/'
            {
             before(grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalQPE.g:902:1: rule__QueryElement__Group_3__1 : rule__QueryElement__Group_3__1__Impl ;
    public final void rule__QueryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:906:1: ( rule__QueryElement__Group_3__1__Impl )
            // InternalQPE.g:907:2: rule__QueryElement__Group_3__1__Impl
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
    // InternalQPE.g:913:1: rule__QueryElement__Group_3__1__Impl : ( ( rule__QueryElement__NextAssignment_3_1 ) ) ;
    public final void rule__QueryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:917:1: ( ( ( rule__QueryElement__NextAssignment_3_1 ) ) )
            // InternalQPE.g:918:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            {
            // InternalQPE.g:918:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            // InternalQPE.g:919:2: ( rule__QueryElement__NextAssignment_3_1 )
            {
             before(grammarAccess.getQueryElementAccess().getNextAssignment_3_1()); 
            // InternalQPE.g:920:2: ( rule__QueryElement__NextAssignment_3_1 )
            // InternalQPE.g:920:3: rule__QueryElement__NextAssignment_3_1
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
    // InternalQPE.g:929:1: rule__Qualifier__Group__0 : rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 ;
    public final void rule__Qualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:933:1: ( rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 )
            // InternalQPE.g:934:2: rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1
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
    // InternalQPE.g:941:1: rule__Qualifier__Group__0__Impl : ( '[' ) ;
    public final void rule__Qualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:945:1: ( ( '[' ) )
            // InternalQPE.g:946:1: ( '[' )
            {
            // InternalQPE.g:946:1: ( '[' )
            // InternalQPE.g:947:2: '['
            {
             before(grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalQPE.g:956:1: rule__Qualifier__Group__1 : rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 ;
    public final void rule__Qualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:960:1: ( rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 )
            // InternalQPE.g:961:2: rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2
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
    // InternalQPE.g:968:1: rule__Qualifier__Group__1__Impl : ( ( rule__Qualifier__Alternatives_1 ) ) ;
    public final void rule__Qualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:972:1: ( ( ( rule__Qualifier__Alternatives_1 ) ) )
            // InternalQPE.g:973:1: ( ( rule__Qualifier__Alternatives_1 ) )
            {
            // InternalQPE.g:973:1: ( ( rule__Qualifier__Alternatives_1 ) )
            // InternalQPE.g:974:2: ( rule__Qualifier__Alternatives_1 )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives_1()); 
            // InternalQPE.g:975:2: ( rule__Qualifier__Alternatives_1 )
            // InternalQPE.g:975:3: rule__Qualifier__Alternatives_1
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
    // InternalQPE.g:983:1: rule__Qualifier__Group__2 : rule__Qualifier__Group__2__Impl ;
    public final void rule__Qualifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:987:1: ( rule__Qualifier__Group__2__Impl )
            // InternalQPE.g:988:2: rule__Qualifier__Group__2__Impl
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
    // InternalQPE.g:994:1: rule__Qualifier__Group__2__Impl : ( ']' ) ;
    public final void rule__Qualifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:998:1: ( ( ']' ) )
            // InternalQPE.g:999:1: ( ']' )
            {
            // InternalQPE.g:999:1: ( ']' )
            // InternalQPE.g:1000:2: ']'
            {
             before(grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalQPE.g:1010:1: rule__Qualifier__Group_1_0__0 : rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1 ;
    public final void rule__Qualifier__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1014:1: ( rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1 )
            // InternalQPE.g:1015:2: rule__Qualifier__Group_1_0__0__Impl rule__Qualifier__Group_1_0__1
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
    // InternalQPE.g:1022:1: rule__Qualifier__Group_1_0__0__Impl : ( ( rule__Qualifier__IndexAssignment_1_0_0 ) ) ;
    public final void rule__Qualifier__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1026:1: ( ( ( rule__Qualifier__IndexAssignment_1_0_0 ) ) )
            // InternalQPE.g:1027:1: ( ( rule__Qualifier__IndexAssignment_1_0_0 ) )
            {
            // InternalQPE.g:1027:1: ( ( rule__Qualifier__IndexAssignment_1_0_0 ) )
            // InternalQPE.g:1028:2: ( rule__Qualifier__IndexAssignment_1_0_0 )
            {
             before(grammarAccess.getQualifierAccess().getIndexAssignment_1_0_0()); 
            // InternalQPE.g:1029:2: ( rule__Qualifier__IndexAssignment_1_0_0 )
            // InternalQPE.g:1029:3: rule__Qualifier__IndexAssignment_1_0_0
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
    // InternalQPE.g:1037:1: rule__Qualifier__Group_1_0__1 : rule__Qualifier__Group_1_0__1__Impl ;
    public final void rule__Qualifier__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1041:1: ( rule__Qualifier__Group_1_0__1__Impl )
            // InternalQPE.g:1042:2: rule__Qualifier__Group_1_0__1__Impl
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
    // InternalQPE.g:1048:1: rule__Qualifier__Group_1_0__1__Impl : ( ( rule__Qualifier__Group_1_0_1__0 )* ) ;
    public final void rule__Qualifier__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1052:1: ( ( ( rule__Qualifier__Group_1_0_1__0 )* ) )
            // InternalQPE.g:1053:1: ( ( rule__Qualifier__Group_1_0_1__0 )* )
            {
            // InternalQPE.g:1053:1: ( ( rule__Qualifier__Group_1_0_1__0 )* )
            // InternalQPE.g:1054:2: ( rule__Qualifier__Group_1_0_1__0 )*
            {
             before(grammarAccess.getQualifierAccess().getGroup_1_0_1()); 
            // InternalQPE.g:1055:2: ( rule__Qualifier__Group_1_0_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQPE.g:1055:3: rule__Qualifier__Group_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Qualifier__Group_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalQPE.g:1064:1: rule__Qualifier__Group_1_0_1__0 : rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1 ;
    public final void rule__Qualifier__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1068:1: ( rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1 )
            // InternalQPE.g:1069:2: rule__Qualifier__Group_1_0_1__0__Impl rule__Qualifier__Group_1_0_1__1
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
    // InternalQPE.g:1076:1: rule__Qualifier__Group_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__Qualifier__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1080:1: ( ( ',' ) )
            // InternalQPE.g:1081:1: ( ',' )
            {
            // InternalQPE.g:1081:1: ( ',' )
            // InternalQPE.g:1082:2: ','
            {
             before(grammarAccess.getQualifierAccess().getCommaKeyword_1_0_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQPE.g:1091:1: rule__Qualifier__Group_1_0_1__1 : rule__Qualifier__Group_1_0_1__1__Impl ;
    public final void rule__Qualifier__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1095:1: ( rule__Qualifier__Group_1_0_1__1__Impl )
            // InternalQPE.g:1096:2: rule__Qualifier__Group_1_0_1__1__Impl
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
    // InternalQPE.g:1102:1: rule__Qualifier__Group_1_0_1__1__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) ) ;
    public final void rule__Qualifier__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1106:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) ) )
            // InternalQPE.g:1107:1: ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) )
            {
            // InternalQPE.g:1107:1: ( ( rule__Qualifier__PredicatesAssignment_1_0_1_1 ) )
            // InternalQPE.g:1108:2: ( rule__Qualifier__PredicatesAssignment_1_0_1_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_0_1_1()); 
            // InternalQPE.g:1109:2: ( rule__Qualifier__PredicatesAssignment_1_0_1_1 )
            // InternalQPE.g:1109:3: rule__Qualifier__PredicatesAssignment_1_0_1_1
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
    // InternalQPE.g:1118:1: rule__Qualifier__Group_1_1__0 : rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1 ;
    public final void rule__Qualifier__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1122:1: ( rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1 )
            // InternalQPE.g:1123:2: rule__Qualifier__Group_1_1__0__Impl rule__Qualifier__Group_1_1__1
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
    // InternalQPE.g:1130:1: rule__Qualifier__Group_1_1__0__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) ) ;
    public final void rule__Qualifier__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1134:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) ) )
            // InternalQPE.g:1135:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) )
            {
            // InternalQPE.g:1135:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_0 ) )
            // InternalQPE.g:1136:2: ( rule__Qualifier__PredicatesAssignment_1_1_0 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_0()); 
            // InternalQPE.g:1137:2: ( rule__Qualifier__PredicatesAssignment_1_1_0 )
            // InternalQPE.g:1137:3: rule__Qualifier__PredicatesAssignment_1_1_0
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
    // InternalQPE.g:1145:1: rule__Qualifier__Group_1_1__1 : rule__Qualifier__Group_1_1__1__Impl ;
    public final void rule__Qualifier__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1149:1: ( rule__Qualifier__Group_1_1__1__Impl )
            // InternalQPE.g:1150:2: rule__Qualifier__Group_1_1__1__Impl
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
    // InternalQPE.g:1156:1: rule__Qualifier__Group_1_1__1__Impl : ( ( rule__Qualifier__Group_1_1_1__0 )* ) ;
    public final void rule__Qualifier__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1160:1: ( ( ( rule__Qualifier__Group_1_1_1__0 )* ) )
            // InternalQPE.g:1161:1: ( ( rule__Qualifier__Group_1_1_1__0 )* )
            {
            // InternalQPE.g:1161:1: ( ( rule__Qualifier__Group_1_1_1__0 )* )
            // InternalQPE.g:1162:2: ( rule__Qualifier__Group_1_1_1__0 )*
            {
             before(grammarAccess.getQualifierAccess().getGroup_1_1_1()); 
            // InternalQPE.g:1163:2: ( rule__Qualifier__Group_1_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQPE.g:1163:3: rule__Qualifier__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Qualifier__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalQPE.g:1172:1: rule__Qualifier__Group_1_1_1__0 : rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1 ;
    public final void rule__Qualifier__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1176:1: ( rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1 )
            // InternalQPE.g:1177:2: rule__Qualifier__Group_1_1_1__0__Impl rule__Qualifier__Group_1_1_1__1
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
    // InternalQPE.g:1184:1: rule__Qualifier__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Qualifier__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1188:1: ( ( ',' ) )
            // InternalQPE.g:1189:1: ( ',' )
            {
            // InternalQPE.g:1189:1: ( ',' )
            // InternalQPE.g:1190:2: ','
            {
             before(grammarAccess.getQualifierAccess().getCommaKeyword_1_1_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalQPE.g:1199:1: rule__Qualifier__Group_1_1_1__1 : rule__Qualifier__Group_1_1_1__1__Impl ;
    public final void rule__Qualifier__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1203:1: ( rule__Qualifier__Group_1_1_1__1__Impl )
            // InternalQPE.g:1204:2: rule__Qualifier__Group_1_1_1__1__Impl
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
    // InternalQPE.g:1210:1: rule__Qualifier__Group_1_1_1__1__Impl : ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) ) ;
    public final void rule__Qualifier__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1214:1: ( ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) ) )
            // InternalQPE.g:1215:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) )
            {
            // InternalQPE.g:1215:1: ( ( rule__Qualifier__PredicatesAssignment_1_1_1_1 ) )
            // InternalQPE.g:1216:2: ( rule__Qualifier__PredicatesAssignment_1_1_1_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicatesAssignment_1_1_1_1()); 
            // InternalQPE.g:1217:2: ( rule__Qualifier__PredicatesAssignment_1_1_1_1 )
            // InternalQPE.g:1217:3: rule__Qualifier__PredicatesAssignment_1_1_1_1
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
    // InternalQPE.g:1226:1: rule__ClassifierPredicate__Group__0 : rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 ;
    public final void rule__ClassifierPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1230:1: ( rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 )
            // InternalQPE.g:1231:2: rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1
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
    // InternalQPE.g:1238:1: rule__ClassifierPredicate__Group__0__Impl : ( ( rule__ClassifierPredicate__Group_0__0 )? ) ;
    public final void rule__ClassifierPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1242:1: ( ( ( rule__ClassifierPredicate__Group_0__0 )? ) )
            // InternalQPE.g:1243:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1243:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            // InternalQPE.g:1244:2: ( rule__ClassifierPredicate__Group_0__0 )?
            {
             before(grammarAccess.getClassifierPredicateAccess().getGroup_0()); 
            // InternalQPE.g:1245:2: ( rule__ClassifierPredicate__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==17) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalQPE.g:1245:3: rule__ClassifierPredicate__Group_0__0
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
    // InternalQPE.g:1253:1: rule__ClassifierPredicate__Group__1 : rule__ClassifierPredicate__Group__1__Impl ;
    public final void rule__ClassifierPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1257:1: ( rule__ClassifierPredicate__Group__1__Impl )
            // InternalQPE.g:1258:2: rule__ClassifierPredicate__Group__1__Impl
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
    // InternalQPE.g:1264:1: rule__ClassifierPredicate__Group__1__Impl : ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) ;
    public final void rule__ClassifierPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1268:1: ( ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) )
            // InternalQPE.g:1269:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            {
            // InternalQPE.g:1269:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            // InternalQPE.g:1270:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierAssignment_1()); 
            // InternalQPE.g:1271:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            // InternalQPE.g:1271:3: rule__ClassifierPredicate__ClassifierAssignment_1
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
    // InternalQPE.g:1280:1: rule__ClassifierPredicate__Group_0__0 : rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 ;
    public final void rule__ClassifierPredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1284:1: ( rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 )
            // InternalQPE.g:1285:2: rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1
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
    // InternalQPE.g:1292:1: rule__ClassifierPredicate__Group_0__0__Impl : ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__ClassifierPredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1296:1: ( ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1297:1: ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1297:1: ( ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1298:2: ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1299:2: ( rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1299:3: rule__ClassifierPredicate__QueryNamespaceAssignment_0_0
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
    // InternalQPE.g:1307:1: rule__ClassifierPredicate__Group_0__1 : rule__ClassifierPredicate__Group_0__1__Impl ;
    public final void rule__ClassifierPredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1311:1: ( rule__ClassifierPredicate__Group_0__1__Impl )
            // InternalQPE.g:1312:2: rule__ClassifierPredicate__Group_0__1__Impl
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
    // InternalQPE.g:1318:1: rule__ClassifierPredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ClassifierPredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1322:1: ( ( '::' ) )
            // InternalQPE.g:1323:1: ( '::' )
            {
            // InternalQPE.g:1323:1: ( '::' )
            // InternalQPE.g:1324:2: '::'
            {
             before(grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQPE.g:1334:1: rule__AttributePredicate__Group__0 : rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 ;
    public final void rule__AttributePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1338:1: ( rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 )
            // InternalQPE.g:1339:2: rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1
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
    // InternalQPE.g:1346:1: rule__AttributePredicate__Group__0__Impl : ( ( rule__AttributePredicate__Group_0__0 )? ) ;
    public final void rule__AttributePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1350:1: ( ( ( rule__AttributePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1351:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1351:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            // InternalQPE.g:1352:2: ( rule__AttributePredicate__Group_0__0 )?
            {
             before(grammarAccess.getAttributePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1353:2: ( rule__AttributePredicate__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==17) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalQPE.g:1353:3: rule__AttributePredicate__Group_0__0
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
    // InternalQPE.g:1361:1: rule__AttributePredicate__Group__1 : rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 ;
    public final void rule__AttributePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1365:1: ( rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 )
            // InternalQPE.g:1366:2: rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2
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
    // InternalQPE.g:1373:1: rule__AttributePredicate__Group__1__Impl : ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) ;
    public final void rule__AttributePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1377:1: ( ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) )
            // InternalQPE.g:1378:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            {
            // InternalQPE.g:1378:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            // InternalQPE.g:1379:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeAssignment_1()); 
            // InternalQPE.g:1380:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            // InternalQPE.g:1380:3: rule__AttributePredicate__AttributeAssignment_1
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
    // InternalQPE.g:1388:1: rule__AttributePredicate__Group__2 : rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 ;
    public final void rule__AttributePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1392:1: ( rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 )
            // InternalQPE.g:1393:2: rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3
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
    // InternalQPE.g:1400:1: rule__AttributePredicate__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1404:1: ( ( '=' ) )
            // InternalQPE.g:1405:1: ( '=' )
            {
            // InternalQPE.g:1405:1: ( '=' )
            // InternalQPE.g:1406:2: '='
            {
             before(grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalQPE.g:1415:1: rule__AttributePredicate__Group__3 : rule__AttributePredicate__Group__3__Impl ;
    public final void rule__AttributePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1419:1: ( rule__AttributePredicate__Group__3__Impl )
            // InternalQPE.g:1420:2: rule__AttributePredicate__Group__3__Impl
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
    // InternalQPE.g:1426:1: rule__AttributePredicate__Group__3__Impl : ( ( rule__AttributePredicate__ValueAssignment_3 ) ) ;
    public final void rule__AttributePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1430:1: ( ( ( rule__AttributePredicate__ValueAssignment_3 ) ) )
            // InternalQPE.g:1431:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            {
            // InternalQPE.g:1431:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            // InternalQPE.g:1432:2: ( rule__AttributePredicate__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributePredicateAccess().getValueAssignment_3()); 
            // InternalQPE.g:1433:2: ( rule__AttributePredicate__ValueAssignment_3 )
            // InternalQPE.g:1433:3: rule__AttributePredicate__ValueAssignment_3
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
    // InternalQPE.g:1442:1: rule__AttributePredicate__Group_0__0 : rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 ;
    public final void rule__AttributePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1446:1: ( rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 )
            // InternalQPE.g:1447:2: rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1
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
    // InternalQPE.g:1454:1: rule__AttributePredicate__Group_0__0__Impl : ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1458:1: ( ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1459:1: ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1459:1: ( ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1460:2: ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getAttributePredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1461:2: ( rule__AttributePredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1461:3: rule__AttributePredicate__QueryNamespaceAssignment_0_0
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
    // InternalQPE.g:1469:1: rule__AttributePredicate__Group_0__1 : rule__AttributePredicate__Group_0__1__Impl ;
    public final void rule__AttributePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1473:1: ( rule__AttributePredicate__Group_0__1__Impl )
            // InternalQPE.g:1474:2: rule__AttributePredicate__Group_0__1__Impl
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
    // InternalQPE.g:1480:1: rule__AttributePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1484:1: ( ( '::' ) )
            // InternalQPE.g:1485:1: ( '::' )
            {
            // InternalQPE.g:1485:1: ( '::' )
            // InternalQPE.g:1486:2: '::'
            {
             before(grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQPE.g:1496:1: rule__ReferencePredicate__Group__0 : rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 ;
    public final void rule__ReferencePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1500:1: ( rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 )
            // InternalQPE.g:1501:2: rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1
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
    // InternalQPE.g:1508:1: rule__ReferencePredicate__Group__0__Impl : ( ( rule__ReferencePredicate__Group_0__0 )? ) ;
    public final void rule__ReferencePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1512:1: ( ( ( rule__ReferencePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1513:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1513:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            // InternalQPE.g:1514:2: ( rule__ReferencePredicate__Group_0__0 )?
            {
             before(grammarAccess.getReferencePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1515:2: ( rule__ReferencePredicate__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==17) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalQPE.g:1515:3: rule__ReferencePredicate__Group_0__0
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
    // InternalQPE.g:1523:1: rule__ReferencePredicate__Group__1 : rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 ;
    public final void rule__ReferencePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1527:1: ( rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 )
            // InternalQPE.g:1528:2: rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2
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
    // InternalQPE.g:1535:1: rule__ReferencePredicate__Group__1__Impl : ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferencePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1539:1: ( ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) )
            // InternalQPE.g:1540:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            {
            // InternalQPE.g:1540:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            // InternalQPE.g:1541:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceAssignment_1()); 
            // InternalQPE.g:1542:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            // InternalQPE.g:1542:3: rule__ReferencePredicate__ReferenceAssignment_1
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
    // InternalQPE.g:1550:1: rule__ReferencePredicate__Group__2 : rule__ReferencePredicate__Group__2__Impl ;
    public final void rule__ReferencePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1554:1: ( rule__ReferencePredicate__Group__2__Impl )
            // InternalQPE.g:1555:2: rule__ReferencePredicate__Group__2__Impl
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
    // InternalQPE.g:1561:1: rule__ReferencePredicate__Group__2__Impl : ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) ;
    public final void rule__ReferencePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1565:1: ( ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) )
            // InternalQPE.g:1566:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            {
            // InternalQPE.g:1566:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            // InternalQPE.g:1567:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:1568:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            // InternalQPE.g:1568:3: rule__ReferencePredicate__QualifierAssignment_2
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
    // InternalQPE.g:1577:1: rule__ReferencePredicate__Group_0__0 : rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 ;
    public final void rule__ReferencePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1581:1: ( rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 )
            // InternalQPE.g:1582:2: rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1
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
    // InternalQPE.g:1589:1: rule__ReferencePredicate__Group_0__0__Impl : ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) ) ;
    public final void rule__ReferencePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1593:1: ( ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1594:1: ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1594:1: ( ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 ) )
            // InternalQPE.g:1595:2: ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQueryNamespaceAssignment_0_0()); 
            // InternalQPE.g:1596:2: ( rule__ReferencePredicate__QueryNamespaceAssignment_0_0 )
            // InternalQPE.g:1596:3: rule__ReferencePredicate__QueryNamespaceAssignment_0_0
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
    // InternalQPE.g:1604:1: rule__ReferencePredicate__Group_0__1 : rule__ReferencePredicate__Group_0__1__Impl ;
    public final void rule__ReferencePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1608:1: ( rule__ReferencePredicate__Group_0__1__Impl )
            // InternalQPE.g:1609:2: rule__ReferencePredicate__Group_0__1__Impl
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
    // InternalQPE.g:1615:1: rule__ReferencePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ReferencePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1619:1: ( ( '::' ) )
            // InternalQPE.g:1620:1: ( '::' )
            {
            // InternalQPE.g:1620:1: ( '::' )
            // InternalQPE.g:1621:2: '::'
            {
             before(grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalQPE.g:1631:1: rule__QPE__QueryNamespacesAssignment_0 : ( ruleQueryNamespace ) ;
    public final void rule__QPE__QueryNamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1635:1: ( ( ruleQueryNamespace ) )
            // InternalQPE.g:1636:2: ( ruleQueryNamespace )
            {
            // InternalQPE.g:1636:2: ( ruleQueryNamespace )
            // InternalQPE.g:1637:3: ruleQueryNamespace
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
    // InternalQPE.g:1646:1: rule__QPE__PathExpressionsAssignment_1 : ( rulePathExpression ) ;
    public final void rule__QPE__PathExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1650:1: ( ( rulePathExpression ) )
            // InternalQPE.g:1651:2: ( rulePathExpression )
            {
            // InternalQPE.g:1651:2: ( rulePathExpression )
            // InternalQPE.g:1652:3: rulePathExpression
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
    // InternalQPE.g:1661:1: rule__QueryNamespace__IRIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QueryNamespace__IRIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1665:1: ( ( RULE_STRING ) )
            // InternalQPE.g:1666:2: ( RULE_STRING )
            {
            // InternalQPE.g:1666:2: ( RULE_STRING )
            // InternalQPE.g:1667:3: RULE_STRING
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
    // InternalQPE.g:1676:1: rule__QueryNamespace__PrefixAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__QueryNamespace__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1680:1: ( ( RULE_ID ) )
            // InternalQPE.g:1681:2: ( RULE_ID )
            {
            // InternalQPE.g:1681:2: ( RULE_ID )
            // InternalQPE.g:1682:3: RULE_ID
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
    // InternalQPE.g:1691:1: rule__PathExpression__IsRelativeAssignment_1 : ( ( '.' ) ) ;
    public final void rule__PathExpression__IsRelativeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1695:1: ( ( ( '.' ) ) )
            // InternalQPE.g:1696:2: ( ( '.' ) )
            {
            // InternalQPE.g:1696:2: ( ( '.' ) )
            // InternalQPE.g:1697:3: ( '.' )
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 
            // InternalQPE.g:1698:3: ( '.' )
            // InternalQPE.g:1699:4: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalQPE.g:1710:1: rule__PathExpression__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__PathExpression__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1714:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1715:2: ( ruleQualifier )
            {
            // InternalQPE.g:1715:2: ( ruleQualifier )
            // InternalQPE.g:1716:3: ruleQualifier
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
    // InternalQPE.g:1725:1: rule__PathExpression__HeadAssignment_4 : ( ruleQueryElement ) ;
    public final void rule__PathExpression__HeadAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1729:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1730:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1730:2: ( ruleQueryElement )
            // InternalQPE.g:1731:3: ruleQueryElement
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
    // InternalQPE.g:1740:1: rule__QueryElement__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1744:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1745:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1745:2: ( ( RULE_ID ) )
            // InternalQPE.g:1746:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1747:3: ( RULE_ID )
            // InternalQPE.g:1748:4: RULE_ID
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
    // InternalQPE.g:1759:1: rule__QueryElement__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1763:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1764:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1764:2: ( ( RULE_ID ) )
            // InternalQPE.g:1765:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0()); 
            // InternalQPE.g:1766:3: ( RULE_ID )
            // InternalQPE.g:1767:4: RULE_ID
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
    // InternalQPE.g:1778:1: rule__QueryElement__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__QueryElement__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1782:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1783:2: ( ruleQualifier )
            {
            // InternalQPE.g:1783:2: ( ruleQualifier )
            // InternalQPE.g:1784:3: ruleQualifier
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
    // InternalQPE.g:1793:1: rule__QueryElement__NextAssignment_3_1 : ( ruleQueryElement ) ;
    public final void rule__QueryElement__NextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1797:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1798:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1798:2: ( ruleQueryElement )
            // InternalQPE.g:1799:3: ruleQueryElement
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
    // InternalQPE.g:1808:1: rule__Qualifier__IndexAssignment_1_0_0 : ( RULE_INT ) ;
    public final void rule__Qualifier__IndexAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1812:1: ( ( RULE_INT ) )
            // InternalQPE.g:1813:2: ( RULE_INT )
            {
            // InternalQPE.g:1813:2: ( RULE_INT )
            // InternalQPE.g:1814:3: RULE_INT
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
    // InternalQPE.g:1823:1: rule__Qualifier__PredicatesAssignment_1_0_1_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1827:1: ( ( rulePredicate ) )
            // InternalQPE.g:1828:2: ( rulePredicate )
            {
            // InternalQPE.g:1828:2: ( rulePredicate )
            // InternalQPE.g:1829:3: rulePredicate
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
    // InternalQPE.g:1838:1: rule__Qualifier__PredicatesAssignment_1_1_0 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1842:1: ( ( rulePredicate ) )
            // InternalQPE.g:1843:2: ( rulePredicate )
            {
            // InternalQPE.g:1843:2: ( rulePredicate )
            // InternalQPE.g:1844:3: rulePredicate
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
    // InternalQPE.g:1853:1: rule__Qualifier__PredicatesAssignment_1_1_1_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicatesAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1857:1: ( ( rulePredicate ) )
            // InternalQPE.g:1858:2: ( rulePredicate )
            {
            // InternalQPE.g:1858:2: ( rulePredicate )
            // InternalQPE.g:1859:3: rulePredicate
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
    // InternalQPE.g:1868:1: rule__ClassifierPredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1872:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1873:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1873:2: ( ( RULE_ID ) )
            // InternalQPE.g:1874:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1875:3: ( RULE_ID )
            // InternalQPE.g:1876:4: RULE_ID
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
    // InternalQPE.g:1887:1: rule__ClassifierPredicate__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1891:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1892:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1892:2: ( ( RULE_ID ) )
            // InternalQPE.g:1893:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalQPE.g:1894:3: ( RULE_ID )
            // InternalQPE.g:1895:4: RULE_ID
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
    // InternalQPE.g:1906:1: rule__AttributePredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1910:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1911:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1911:2: ( ( RULE_ID ) )
            // InternalQPE.g:1912:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1913:3: ( RULE_ID )
            // InternalQPE.g:1914:4: RULE_ID
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
    // InternalQPE.g:1925:1: rule__AttributePredicate__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1929:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1930:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1930:2: ( ( RULE_ID ) )
            // InternalQPE.g:1931:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0()); 
            // InternalQPE.g:1932:3: ( RULE_ID )
            // InternalQPE.g:1933:4: RULE_ID
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
    // InternalQPE.g:1944:1: rule__AttributePredicate__ValueAssignment_3 : ( ruleVALUE ) ;
    public final void rule__AttributePredicate__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1948:1: ( ( ruleVALUE ) )
            // InternalQPE.g:1949:2: ( ruleVALUE )
            {
            // InternalQPE.g:1949:2: ( ruleVALUE )
            // InternalQPE.g:1950:3: ruleVALUE
            {
             before(grammarAccess.getAttributePredicateAccess().getValueVALUEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getAttributePredicateAccess().getValueVALUEParserRuleCall_3_0()); 

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
    // InternalQPE.g:1959:1: rule__ReferencePredicate__QueryNamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__QueryNamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1963:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1964:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1964:2: ( ( RULE_ID ) )
            // InternalQPE.g:1965:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1966:3: ( RULE_ID )
            // InternalQPE.g:1967:4: RULE_ID
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
    // InternalQPE.g:1978:1: rule__ReferencePredicate__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1982:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1983:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1983:2: ( ( RULE_ID ) )
            // InternalQPE.g:1984:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalQPE.g:1985:3: ( RULE_ID )
            // InternalQPE.g:1986:4: RULE_ID
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
    // InternalQPE.g:1997:1: rule__ReferencePredicate__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__ReferencePredicate__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:2001:1: ( ( ruleQualifier ) )
            // InternalQPE.g:2002:2: ( ruleQualifier )
            {
            // InternalQPE.g:2002:2: ( ruleQualifier )
            // InternalQPE.g:2003:3: ruleQualifier
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000450000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});

}
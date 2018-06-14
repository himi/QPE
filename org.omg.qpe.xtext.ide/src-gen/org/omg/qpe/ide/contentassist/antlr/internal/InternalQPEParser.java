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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'L'", "'l'", "'true'", "'false'", "'namespace'", "'as'", "'/'", "'::'", "'['", "']'", "','", "'='", "'.'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleLONG"
    // InternalQPE.g:303:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalQPE.g:304:1: ( ruleLONG EOF )
            // InternalQPE.g:305:1: ruleLONG EOF
            {
             before(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getLONGRule()); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalQPE.g:312:1: ruleLONG : ( ( rule__LONG__Group__0 ) ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:316:2: ( ( ( rule__LONG__Group__0 ) ) )
            // InternalQPE.g:317:2: ( ( rule__LONG__Group__0 ) )
            {
            // InternalQPE.g:317:2: ( ( rule__LONG__Group__0 ) )
            // InternalQPE.g:318:3: ( rule__LONG__Group__0 )
            {
             before(grammarAccess.getLONGAccess().getGroup()); 
            // InternalQPE.g:319:3: ( rule__LONG__Group__0 )
            // InternalQPE.g:319:4: rule__LONG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LONG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLONGAccess().getGroup()); 

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
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalQPE.g:328:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalQPE.g:329:1: ( ruleDOUBLE EOF )
            // InternalQPE.g:330:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalQPE.g:337:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:341:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalQPE.g:342:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalQPE.g:342:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalQPE.g:343:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalQPE.g:344:3: ( rule__DOUBLE__Group__0 )
            // InternalQPE.g:344:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleBOOLEAN"
    // InternalQPE.g:353:1: entryRuleBOOLEAN : ruleBOOLEAN EOF ;
    public final void entryRuleBOOLEAN() throws RecognitionException {
        try {
            // InternalQPE.g:354:1: ( ruleBOOLEAN EOF )
            // InternalQPE.g:355:1: ruleBOOLEAN EOF
            {
             before(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getBOOLEANRule()); 
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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // InternalQPE.g:362:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:366:2: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // InternalQPE.g:367:2: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // InternalQPE.g:367:2: ( ( rule__BOOLEAN__Alternatives ) )
            // InternalQPE.g:368:3: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // InternalQPE.g:369:3: ( rule__BOOLEAN__Alternatives )
            // InternalQPE.g:369:4: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalQPE.g:377:1: rule__Predicate__Alternatives : ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:381:1: ( ( ruleClassifierPredicate ) | ( ruleAttributePredicate ) | ( ruleReferencePredicate ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_ID) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case 20:
                        case 21:
                            {
                            alt1=1;
                            }
                            break;
                        case 19:
                            {
                            alt1=3;
                            }
                            break;
                        case 22:
                            {
                            alt1=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 20:
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                case 19:
                    {
                    alt1=3;
                    }
                    break;
                case 22:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQPE.g:382:2: ( ruleClassifierPredicate )
                    {
                    // InternalQPE.g:382:2: ( ruleClassifierPredicate )
                    // InternalQPE.g:383:3: ruleClassifierPredicate
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
                    // InternalQPE.g:388:2: ( ruleAttributePredicate )
                    {
                    // InternalQPE.g:388:2: ( ruleAttributePredicate )
                    // InternalQPE.g:389:3: ruleAttributePredicate
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
                    // InternalQPE.g:394:2: ( ruleReferencePredicate )
                    {
                    // InternalQPE.g:394:2: ( ruleReferencePredicate )
                    // InternalQPE.g:395:3: ruleReferencePredicate
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
    // InternalQPE.g:404:1: rule__VALUE__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleLONG ) | ( ruleDOUBLE ) | ( ruleBOOLEAN ) );
    public final void rule__VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:408:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleLONG ) | ( ruleDOUBLE ) | ( ruleBOOLEAN ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt2=4;
                    }
                    break;
                case EOF:
                case 20:
                case 21:
                    {
                    alt2=2;
                    }
                    break;
                case 11:
                case 12:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 13:
            case 14:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQPE.g:409:2: ( RULE_STRING )
                    {
                    // InternalQPE.g:409:2: ( RULE_STRING )
                    // InternalQPE.g:410:3: RULE_STRING
                    {
                     before(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:415:2: ( RULE_INT )
                    {
                    // InternalQPE.g:415:2: ( RULE_INT )
                    // InternalQPE.g:416:3: RULE_INT
                    {
                     before(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQPE.g:421:2: ( ruleLONG )
                    {
                    // InternalQPE.g:421:2: ( ruleLONG )
                    // InternalQPE.g:422:3: ruleLONG
                    {
                     before(grammarAccess.getVALUEAccess().getLONGParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLONG();

                    state._fsp--;

                     after(grammarAccess.getVALUEAccess().getLONGParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQPE.g:427:2: ( ruleDOUBLE )
                    {
                    // InternalQPE.g:427:2: ( ruleDOUBLE )
                    // InternalQPE.g:428:3: ruleDOUBLE
                    {
                     before(grammarAccess.getVALUEAccess().getDOUBLEParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDOUBLE();

                    state._fsp--;

                     after(grammarAccess.getVALUEAccess().getDOUBLEParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQPE.g:433:2: ( ruleBOOLEAN )
                    {
                    // InternalQPE.g:433:2: ( ruleBOOLEAN )
                    // InternalQPE.g:434:3: ruleBOOLEAN
                    {
                     before(grammarAccess.getVALUEAccess().getBOOLEANParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBOOLEAN();

                    state._fsp--;

                     after(grammarAccess.getVALUEAccess().getBOOLEANParserRuleCall_4()); 

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


    // $ANTLR start "rule__LONG__Alternatives_1"
    // InternalQPE.g:443:1: rule__LONG__Alternatives_1 : ( ( 'L' ) | ( 'l' ) );
    public final void rule__LONG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:447:1: ( ( 'L' ) | ( 'l' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQPE.g:448:2: ( 'L' )
                    {
                    // InternalQPE.g:448:2: ( 'L' )
                    // InternalQPE.g:449:3: 'L'
                    {
                     before(grammarAccess.getLONGAccess().getLKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLONGAccess().getLKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:454:2: ( 'l' )
                    {
                    // InternalQPE.g:454:2: ( 'l' )
                    // InternalQPE.g:455:3: 'l'
                    {
                     before(grammarAccess.getLONGAccess().getLKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLONGAccess().getLKeyword_1_1()); 

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
    // $ANTLR end "rule__LONG__Alternatives_1"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // InternalQPE.g:464:1: rule__BOOLEAN__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:468:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQPE.g:469:2: ( 'true' )
                    {
                    // InternalQPE.g:469:2: ( 'true' )
                    // InternalQPE.g:470:3: 'true'
                    {
                     before(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQPE.g:475:2: ( 'false' )
                    {
                    // InternalQPE.g:475:2: ( 'false' )
                    // InternalQPE.g:476:3: 'false'
                    {
                     before(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__QPE__Group__0"
    // InternalQPE.g:485:1: rule__QPE__Group__0 : rule__QPE__Group__0__Impl rule__QPE__Group__1 ;
    public final void rule__QPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:489:1: ( rule__QPE__Group__0__Impl rule__QPE__Group__1 )
            // InternalQPE.g:490:2: rule__QPE__Group__0__Impl rule__QPE__Group__1
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
    // InternalQPE.g:497:1: rule__QPE__Group__0__Impl : ( ( rule__QPE__QuerynamespacesAssignment_0 ) ) ;
    public final void rule__QPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:501:1: ( ( ( rule__QPE__QuerynamespacesAssignment_0 ) ) )
            // InternalQPE.g:502:1: ( ( rule__QPE__QuerynamespacesAssignment_0 ) )
            {
            // InternalQPE.g:502:1: ( ( rule__QPE__QuerynamespacesAssignment_0 ) )
            // InternalQPE.g:503:2: ( rule__QPE__QuerynamespacesAssignment_0 )
            {
             before(grammarAccess.getQPEAccess().getQuerynamespacesAssignment_0()); 
            // InternalQPE.g:504:2: ( rule__QPE__QuerynamespacesAssignment_0 )
            // InternalQPE.g:504:3: rule__QPE__QuerynamespacesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QPE__QuerynamespacesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQPEAccess().getQuerynamespacesAssignment_0()); 

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
    // InternalQPE.g:512:1: rule__QPE__Group__1 : rule__QPE__Group__1__Impl ;
    public final void rule__QPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:516:1: ( rule__QPE__Group__1__Impl )
            // InternalQPE.g:517:2: rule__QPE__Group__1__Impl
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
    // InternalQPE.g:523:1: rule__QPE__Group__1__Impl : ( ( rule__QPE__PathexpressionsAssignment_1 ) ) ;
    public final void rule__QPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:527:1: ( ( ( rule__QPE__PathexpressionsAssignment_1 ) ) )
            // InternalQPE.g:528:1: ( ( rule__QPE__PathexpressionsAssignment_1 ) )
            {
            // InternalQPE.g:528:1: ( ( rule__QPE__PathexpressionsAssignment_1 ) )
            // InternalQPE.g:529:2: ( rule__QPE__PathexpressionsAssignment_1 )
            {
             before(grammarAccess.getQPEAccess().getPathexpressionsAssignment_1()); 
            // InternalQPE.g:530:2: ( rule__QPE__PathexpressionsAssignment_1 )
            // InternalQPE.g:530:3: rule__QPE__PathexpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QPE__PathexpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQPEAccess().getPathexpressionsAssignment_1()); 

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
    // InternalQPE.g:539:1: rule__QueryNamespace__Group__0 : rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 ;
    public final void rule__QueryNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:543:1: ( rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1 )
            // InternalQPE.g:544:2: rule__QueryNamespace__Group__0__Impl rule__QueryNamespace__Group__1
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
    // InternalQPE.g:551:1: rule__QueryNamespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__QueryNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:555:1: ( ( 'namespace' ) )
            // InternalQPE.g:556:1: ( 'namespace' )
            {
            // InternalQPE.g:556:1: ( 'namespace' )
            // InternalQPE.g:557:2: 'namespace'
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
    // InternalQPE.g:566:1: rule__QueryNamespace__Group__1 : rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 ;
    public final void rule__QueryNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:570:1: ( rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2 )
            // InternalQPE.g:571:2: rule__QueryNamespace__Group__1__Impl rule__QueryNamespace__Group__2
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
    // InternalQPE.g:578:1: rule__QueryNamespace__Group__1__Impl : ( ( rule__QueryNamespace__IRIAssignment_1 ) ) ;
    public final void rule__QueryNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:582:1: ( ( ( rule__QueryNamespace__IRIAssignment_1 ) ) )
            // InternalQPE.g:583:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            {
            // InternalQPE.g:583:1: ( ( rule__QueryNamespace__IRIAssignment_1 ) )
            // InternalQPE.g:584:2: ( rule__QueryNamespace__IRIAssignment_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getIRIAssignment_1()); 
            // InternalQPE.g:585:2: ( rule__QueryNamespace__IRIAssignment_1 )
            // InternalQPE.g:585:3: rule__QueryNamespace__IRIAssignment_1
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
    // InternalQPE.g:593:1: rule__QueryNamespace__Group__2 : rule__QueryNamespace__Group__2__Impl ;
    public final void rule__QueryNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:597:1: ( rule__QueryNamespace__Group__2__Impl )
            // InternalQPE.g:598:2: rule__QueryNamespace__Group__2__Impl
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
    // InternalQPE.g:604:1: rule__QueryNamespace__Group__2__Impl : ( ( rule__QueryNamespace__Group_2__0 )? ) ;
    public final void rule__QueryNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:608:1: ( ( ( rule__QueryNamespace__Group_2__0 )? ) )
            // InternalQPE.g:609:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            {
            // InternalQPE.g:609:1: ( ( rule__QueryNamespace__Group_2__0 )? )
            // InternalQPE.g:610:2: ( rule__QueryNamespace__Group_2__0 )?
            {
             before(grammarAccess.getQueryNamespaceAccess().getGroup_2()); 
            // InternalQPE.g:611:2: ( rule__QueryNamespace__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQPE.g:611:3: rule__QueryNamespace__Group_2__0
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
    // InternalQPE.g:620:1: rule__QueryNamespace__Group_2__0 : rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 ;
    public final void rule__QueryNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:624:1: ( rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1 )
            // InternalQPE.g:625:2: rule__QueryNamespace__Group_2__0__Impl rule__QueryNamespace__Group_2__1
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
    // InternalQPE.g:632:1: rule__QueryNamespace__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__QueryNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:636:1: ( ( 'as' ) )
            // InternalQPE.g:637:1: ( 'as' )
            {
            // InternalQPE.g:637:1: ( 'as' )
            // InternalQPE.g:638:2: 'as'
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
    // InternalQPE.g:647:1: rule__QueryNamespace__Group_2__1 : rule__QueryNamespace__Group_2__1__Impl ;
    public final void rule__QueryNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:651:1: ( rule__QueryNamespace__Group_2__1__Impl )
            // InternalQPE.g:652:2: rule__QueryNamespace__Group_2__1__Impl
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
    // InternalQPE.g:658:1: rule__QueryNamespace__Group_2__1__Impl : ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) ;
    public final void rule__QueryNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:662:1: ( ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) ) )
            // InternalQPE.g:663:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            {
            // InternalQPE.g:663:1: ( ( rule__QueryNamespace__PrefixAssignment_2_1 ) )
            // InternalQPE.g:664:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getQueryNamespaceAccess().getPrefixAssignment_2_1()); 
            // InternalQPE.g:665:2: ( rule__QueryNamespace__PrefixAssignment_2_1 )
            // InternalQPE.g:665:3: rule__QueryNamespace__PrefixAssignment_2_1
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
    // InternalQPE.g:674:1: rule__PathExpression__Group__0 : rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 ;
    public final void rule__PathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:678:1: ( rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1 )
            // InternalQPE.g:679:2: rule__PathExpression__Group__0__Impl rule__PathExpression__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalQPE.g:686:1: rule__PathExpression__Group__0__Impl : ( ( rule__PathExpression__IsRelativeAssignment_0 ) ) ;
    public final void rule__PathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:690:1: ( ( ( rule__PathExpression__IsRelativeAssignment_0 ) ) )
            // InternalQPE.g:691:1: ( ( rule__PathExpression__IsRelativeAssignment_0 ) )
            {
            // InternalQPE.g:691:1: ( ( rule__PathExpression__IsRelativeAssignment_0 ) )
            // InternalQPE.g:692:2: ( rule__PathExpression__IsRelativeAssignment_0 )
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeAssignment_0()); 
            // InternalQPE.g:693:2: ( rule__PathExpression__IsRelativeAssignment_0 )
            // InternalQPE.g:693:3: rule__PathExpression__IsRelativeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__IsRelativeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getIsRelativeAssignment_0()); 

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
    // $ANTLR end "rule__PathExpression__Group__0__Impl"


    // $ANTLR start "rule__PathExpression__Group__1"
    // InternalQPE.g:701:1: rule__PathExpression__Group__1 : rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 ;
    public final void rule__PathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:705:1: ( rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2 )
            // InternalQPE.g:706:2: rule__PathExpression__Group__1__Impl rule__PathExpression__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalQPE.g:713:1: rule__PathExpression__Group__1__Impl : ( '/' ) ;
    public final void rule__PathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:717:1: ( ( '/' ) )
            // InternalQPE.g:718:1: ( '/' )
            {
            // InternalQPE.g:718:1: ( '/' )
            // InternalQPE.g:719:2: '/'
            {
             before(grammarAccess.getPathExpressionAccess().getSolidusKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getSolidusKeyword_1()); 

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
    // InternalQPE.g:728:1: rule__PathExpression__Group__2 : rule__PathExpression__Group__2__Impl ;
    public final void rule__PathExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:732:1: ( rule__PathExpression__Group__2__Impl )
            // InternalQPE.g:733:2: rule__PathExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__Group__2__Impl();

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
    // InternalQPE.g:739:1: rule__PathExpression__Group__2__Impl : ( ( rule__PathExpression__HeadAssignment_2 ) ) ;
    public final void rule__PathExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:743:1: ( ( ( rule__PathExpression__HeadAssignment_2 ) ) )
            // InternalQPE.g:744:1: ( ( rule__PathExpression__HeadAssignment_2 ) )
            {
            // InternalQPE.g:744:1: ( ( rule__PathExpression__HeadAssignment_2 ) )
            // InternalQPE.g:745:2: ( rule__PathExpression__HeadAssignment_2 )
            {
             before(grammarAccess.getPathExpressionAccess().getHeadAssignment_2()); 
            // InternalQPE.g:746:2: ( rule__PathExpression__HeadAssignment_2 )
            // InternalQPE.g:746:3: rule__PathExpression__HeadAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PathExpression__HeadAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPathExpressionAccess().getHeadAssignment_2()); 

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


    // $ANTLR start "rule__QueryElement__Group__0"
    // InternalQPE.g:755:1: rule__QueryElement__Group__0 : rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 ;
    public final void rule__QueryElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:759:1: ( rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1 )
            // InternalQPE.g:760:2: rule__QueryElement__Group__0__Impl rule__QueryElement__Group__1
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
    // InternalQPE.g:767:1: rule__QueryElement__Group__0__Impl : ( ( rule__QueryElement__Group_0__0 )? ) ;
    public final void rule__QueryElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:771:1: ( ( ( rule__QueryElement__Group_0__0 )? ) )
            // InternalQPE.g:772:1: ( ( rule__QueryElement__Group_0__0 )? )
            {
            // InternalQPE.g:772:1: ( ( rule__QueryElement__Group_0__0 )? )
            // InternalQPE.g:773:2: ( rule__QueryElement__Group_0__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_0()); 
            // InternalQPE.g:774:2: ( rule__QueryElement__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalQPE.g:774:3: rule__QueryElement__Group_0__0
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
    // InternalQPE.g:782:1: rule__QueryElement__Group__1 : rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 ;
    public final void rule__QueryElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:786:1: ( rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2 )
            // InternalQPE.g:787:2: rule__QueryElement__Group__1__Impl rule__QueryElement__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalQPE.g:794:1: rule__QueryElement__Group__1__Impl : ( ( rule__QueryElement__FeatureAssignment_1 ) ) ;
    public final void rule__QueryElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:798:1: ( ( ( rule__QueryElement__FeatureAssignment_1 ) ) )
            // InternalQPE.g:799:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            {
            // InternalQPE.g:799:1: ( ( rule__QueryElement__FeatureAssignment_1 ) )
            // InternalQPE.g:800:2: ( rule__QueryElement__FeatureAssignment_1 )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureAssignment_1()); 
            // InternalQPE.g:801:2: ( rule__QueryElement__FeatureAssignment_1 )
            // InternalQPE.g:801:3: rule__QueryElement__FeatureAssignment_1
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
    // InternalQPE.g:809:1: rule__QueryElement__Group__2 : rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 ;
    public final void rule__QueryElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:813:1: ( rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3 )
            // InternalQPE.g:814:2: rule__QueryElement__Group__2__Impl rule__QueryElement__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalQPE.g:821:1: rule__QueryElement__Group__2__Impl : ( ( rule__QueryElement__QualifierAssignment_2 )? ) ;
    public final void rule__QueryElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:825:1: ( ( ( rule__QueryElement__QualifierAssignment_2 )? ) )
            // InternalQPE.g:826:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            {
            // InternalQPE.g:826:1: ( ( rule__QueryElement__QualifierAssignment_2 )? )
            // InternalQPE.g:827:2: ( rule__QueryElement__QualifierAssignment_2 )?
            {
             before(grammarAccess.getQueryElementAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:828:2: ( rule__QueryElement__QualifierAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQPE.g:828:3: rule__QueryElement__QualifierAssignment_2
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
    // InternalQPE.g:836:1: rule__QueryElement__Group__3 : rule__QueryElement__Group__3__Impl ;
    public final void rule__QueryElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:840:1: ( rule__QueryElement__Group__3__Impl )
            // InternalQPE.g:841:2: rule__QueryElement__Group__3__Impl
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
    // InternalQPE.g:847:1: rule__QueryElement__Group__3__Impl : ( ( rule__QueryElement__Group_3__0 )? ) ;
    public final void rule__QueryElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:851:1: ( ( ( rule__QueryElement__Group_3__0 )? ) )
            // InternalQPE.g:852:1: ( ( rule__QueryElement__Group_3__0 )? )
            {
            // InternalQPE.g:852:1: ( ( rule__QueryElement__Group_3__0 )? )
            // InternalQPE.g:853:2: ( rule__QueryElement__Group_3__0 )?
            {
             before(grammarAccess.getQueryElementAccess().getGroup_3()); 
            // InternalQPE.g:854:2: ( rule__QueryElement__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQPE.g:854:3: rule__QueryElement__Group_3__0
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
    // InternalQPE.g:863:1: rule__QueryElement__Group_0__0 : rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 ;
    public final void rule__QueryElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:867:1: ( rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1 )
            // InternalQPE.g:868:2: rule__QueryElement__Group_0__0__Impl rule__QueryElement__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQPE.g:875:1: rule__QueryElement__Group_0__0__Impl : ( ( rule__QueryElement__QuerynamespaceAssignment_0_0 ) ) ;
    public final void rule__QueryElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:879:1: ( ( ( rule__QueryElement__QuerynamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:880:1: ( ( rule__QueryElement__QuerynamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:880:1: ( ( rule__QueryElement__QuerynamespaceAssignment_0_0 ) )
            // InternalQPE.g:881:2: ( rule__QueryElement__QuerynamespaceAssignment_0_0 )
            {
             before(grammarAccess.getQueryElementAccess().getQuerynamespaceAssignment_0_0()); 
            // InternalQPE.g:882:2: ( rule__QueryElement__QuerynamespaceAssignment_0_0 )
            // InternalQPE.g:882:3: rule__QueryElement__QuerynamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryElement__QuerynamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryElementAccess().getQuerynamespaceAssignment_0_0()); 

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
    // InternalQPE.g:890:1: rule__QueryElement__Group_0__1 : rule__QueryElement__Group_0__1__Impl ;
    public final void rule__QueryElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:894:1: ( rule__QueryElement__Group_0__1__Impl )
            // InternalQPE.g:895:2: rule__QueryElement__Group_0__1__Impl
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
    // InternalQPE.g:901:1: rule__QueryElement__Group_0__1__Impl : ( '::' ) ;
    public final void rule__QueryElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:905:1: ( ( '::' ) )
            // InternalQPE.g:906:1: ( '::' )
            {
            // InternalQPE.g:906:1: ( '::' )
            // InternalQPE.g:907:2: '::'
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
    // InternalQPE.g:917:1: rule__QueryElement__Group_3__0 : rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 ;
    public final void rule__QueryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:921:1: ( rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1 )
            // InternalQPE.g:922:2: rule__QueryElement__Group_3__0__Impl rule__QueryElement__Group_3__1
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
    // InternalQPE.g:929:1: rule__QueryElement__Group_3__0__Impl : ( '/' ) ;
    public final void rule__QueryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:933:1: ( ( '/' ) )
            // InternalQPE.g:934:1: ( '/' )
            {
            // InternalQPE.g:934:1: ( '/' )
            // InternalQPE.g:935:2: '/'
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
    // InternalQPE.g:944:1: rule__QueryElement__Group_3__1 : rule__QueryElement__Group_3__1__Impl ;
    public final void rule__QueryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:948:1: ( rule__QueryElement__Group_3__1__Impl )
            // InternalQPE.g:949:2: rule__QueryElement__Group_3__1__Impl
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
    // InternalQPE.g:955:1: rule__QueryElement__Group_3__1__Impl : ( ( rule__QueryElement__NextAssignment_3_1 ) ) ;
    public final void rule__QueryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:959:1: ( ( ( rule__QueryElement__NextAssignment_3_1 ) ) )
            // InternalQPE.g:960:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            {
            // InternalQPE.g:960:1: ( ( rule__QueryElement__NextAssignment_3_1 ) )
            // InternalQPE.g:961:2: ( rule__QueryElement__NextAssignment_3_1 )
            {
             before(grammarAccess.getQueryElementAccess().getNextAssignment_3_1()); 
            // InternalQPE.g:962:2: ( rule__QueryElement__NextAssignment_3_1 )
            // InternalQPE.g:962:3: rule__QueryElement__NextAssignment_3_1
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
    // InternalQPE.g:971:1: rule__Qualifier__Group__0 : rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 ;
    public final void rule__Qualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:975:1: ( rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1 )
            // InternalQPE.g:976:2: rule__Qualifier__Group__0__Impl rule__Qualifier__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQPE.g:983:1: rule__Qualifier__Group__0__Impl : ( '[' ) ;
    public final void rule__Qualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:987:1: ( ( '[' ) )
            // InternalQPE.g:988:1: ( '[' )
            {
            // InternalQPE.g:988:1: ( '[' )
            // InternalQPE.g:989:2: '['
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
    // InternalQPE.g:998:1: rule__Qualifier__Group__1 : rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 ;
    public final void rule__Qualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1002:1: ( rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2 )
            // InternalQPE.g:1003:2: rule__Qualifier__Group__1__Impl rule__Qualifier__Group__2
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
    // InternalQPE.g:1010:1: rule__Qualifier__Group__1__Impl : ( ( rule__Qualifier__PredicateAssignment_1 ) ) ;
    public final void rule__Qualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1014:1: ( ( ( rule__Qualifier__PredicateAssignment_1 ) ) )
            // InternalQPE.g:1015:1: ( ( rule__Qualifier__PredicateAssignment_1 ) )
            {
            // InternalQPE.g:1015:1: ( ( rule__Qualifier__PredicateAssignment_1 ) )
            // InternalQPE.g:1016:2: ( rule__Qualifier__PredicateAssignment_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicateAssignment_1()); 
            // InternalQPE.g:1017:2: ( rule__Qualifier__PredicateAssignment_1 )
            // InternalQPE.g:1017:3: rule__Qualifier__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getPredicateAssignment_1()); 

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
    // InternalQPE.g:1025:1: rule__Qualifier__Group__2 : rule__Qualifier__Group__2__Impl rule__Qualifier__Group__3 ;
    public final void rule__Qualifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1029:1: ( rule__Qualifier__Group__2__Impl rule__Qualifier__Group__3 )
            // InternalQPE.g:1030:2: rule__Qualifier__Group__2__Impl rule__Qualifier__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Qualifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__3();

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
    // InternalQPE.g:1037:1: rule__Qualifier__Group__2__Impl : ( ( rule__Qualifier__Group_2__0 )* ) ;
    public final void rule__Qualifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1041:1: ( ( ( rule__Qualifier__Group_2__0 )* ) )
            // InternalQPE.g:1042:1: ( ( rule__Qualifier__Group_2__0 )* )
            {
            // InternalQPE.g:1042:1: ( ( rule__Qualifier__Group_2__0 )* )
            // InternalQPE.g:1043:2: ( rule__Qualifier__Group_2__0 )*
            {
             before(grammarAccess.getQualifierAccess().getGroup_2()); 
            // InternalQPE.g:1044:2: ( rule__Qualifier__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQPE.g:1044:3: rule__Qualifier__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Qualifier__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifierAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Qualifier__Group__3"
    // InternalQPE.g:1052:1: rule__Qualifier__Group__3 : rule__Qualifier__Group__3__Impl ;
    public final void rule__Qualifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1056:1: ( rule__Qualifier__Group__3__Impl )
            // InternalQPE.g:1057:2: rule__Qualifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group__3__Impl();

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
    // $ANTLR end "rule__Qualifier__Group__3"


    // $ANTLR start "rule__Qualifier__Group__3__Impl"
    // InternalQPE.g:1063:1: rule__Qualifier__Group__3__Impl : ( ']' ) ;
    public final void rule__Qualifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1067:1: ( ( ']' ) )
            // InternalQPE.g:1068:1: ( ']' )
            {
            // InternalQPE.g:1068:1: ( ']' )
            // InternalQPE.g:1069:2: ']'
            {
             before(grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Qualifier__Group__3__Impl"


    // $ANTLR start "rule__Qualifier__Group_2__0"
    // InternalQPE.g:1079:1: rule__Qualifier__Group_2__0 : rule__Qualifier__Group_2__0__Impl rule__Qualifier__Group_2__1 ;
    public final void rule__Qualifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1083:1: ( rule__Qualifier__Group_2__0__Impl rule__Qualifier__Group_2__1 )
            // InternalQPE.g:1084:2: rule__Qualifier__Group_2__0__Impl rule__Qualifier__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Qualifier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_2__1();

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
    // $ANTLR end "rule__Qualifier__Group_2__0"


    // $ANTLR start "rule__Qualifier__Group_2__0__Impl"
    // InternalQPE.g:1091:1: rule__Qualifier__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Qualifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1095:1: ( ( ',' ) )
            // InternalQPE.g:1096:1: ( ',' )
            {
            // InternalQPE.g:1096:1: ( ',' )
            // InternalQPE.g:1097:2: ','
            {
             before(grammarAccess.getQualifierAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQualifierAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Qualifier__Group_2__0__Impl"


    // $ANTLR start "rule__Qualifier__Group_2__1"
    // InternalQPE.g:1106:1: rule__Qualifier__Group_2__1 : rule__Qualifier__Group_2__1__Impl ;
    public final void rule__Qualifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1110:1: ( rule__Qualifier__Group_2__1__Impl )
            // InternalQPE.g:1111:2: rule__Qualifier__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Group_2__1__Impl();

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
    // $ANTLR end "rule__Qualifier__Group_2__1"


    // $ANTLR start "rule__Qualifier__Group_2__1__Impl"
    // InternalQPE.g:1117:1: rule__Qualifier__Group_2__1__Impl : ( ( rule__Qualifier__PredicateAssignment_2_1 ) ) ;
    public final void rule__Qualifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1121:1: ( ( ( rule__Qualifier__PredicateAssignment_2_1 ) ) )
            // InternalQPE.g:1122:1: ( ( rule__Qualifier__PredicateAssignment_2_1 ) )
            {
            // InternalQPE.g:1122:1: ( ( rule__Qualifier__PredicateAssignment_2_1 ) )
            // InternalQPE.g:1123:2: ( rule__Qualifier__PredicateAssignment_2_1 )
            {
             before(grammarAccess.getQualifierAccess().getPredicateAssignment_2_1()); 
            // InternalQPE.g:1124:2: ( rule__Qualifier__PredicateAssignment_2_1 )
            // InternalQPE.g:1124:3: rule__Qualifier__PredicateAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__PredicateAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifierAccess().getPredicateAssignment_2_1()); 

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
    // $ANTLR end "rule__Qualifier__Group_2__1__Impl"


    // $ANTLR start "rule__ClassifierPredicate__Group__0"
    // InternalQPE.g:1133:1: rule__ClassifierPredicate__Group__0 : rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 ;
    public final void rule__ClassifierPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1137:1: ( rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1 )
            // InternalQPE.g:1138:2: rule__ClassifierPredicate__Group__0__Impl rule__ClassifierPredicate__Group__1
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
    // InternalQPE.g:1145:1: rule__ClassifierPredicate__Group__0__Impl : ( ( rule__ClassifierPredicate__Group_0__0 )? ) ;
    public final void rule__ClassifierPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1149:1: ( ( ( rule__ClassifierPredicate__Group_0__0 )? ) )
            // InternalQPE.g:1150:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1150:1: ( ( rule__ClassifierPredicate__Group_0__0 )? )
            // InternalQPE.g:1151:2: ( rule__ClassifierPredicate__Group_0__0 )?
            {
             before(grammarAccess.getClassifierPredicateAccess().getGroup_0()); 
            // InternalQPE.g:1152:2: ( rule__ClassifierPredicate__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==18) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalQPE.g:1152:3: rule__ClassifierPredicate__Group_0__0
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
    // InternalQPE.g:1160:1: rule__ClassifierPredicate__Group__1 : rule__ClassifierPredicate__Group__1__Impl ;
    public final void rule__ClassifierPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1164:1: ( rule__ClassifierPredicate__Group__1__Impl )
            // InternalQPE.g:1165:2: rule__ClassifierPredicate__Group__1__Impl
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
    // InternalQPE.g:1171:1: rule__ClassifierPredicate__Group__1__Impl : ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) ;
    public final void rule__ClassifierPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1175:1: ( ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) ) )
            // InternalQPE.g:1176:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            {
            // InternalQPE.g:1176:1: ( ( rule__ClassifierPredicate__ClassifierAssignment_1 ) )
            // InternalQPE.g:1177:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierAssignment_1()); 
            // InternalQPE.g:1178:2: ( rule__ClassifierPredicate__ClassifierAssignment_1 )
            // InternalQPE.g:1178:3: rule__ClassifierPredicate__ClassifierAssignment_1
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
    // InternalQPE.g:1187:1: rule__ClassifierPredicate__Group_0__0 : rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 ;
    public final void rule__ClassifierPredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1191:1: ( rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1 )
            // InternalQPE.g:1192:2: rule__ClassifierPredicate__Group_0__0__Impl rule__ClassifierPredicate__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQPE.g:1199:1: rule__ClassifierPredicate__Group_0__0__Impl : ( ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 ) ) ;
    public final void rule__ClassifierPredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1203:1: ( ( ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1204:1: ( ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1204:1: ( ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 ) )
            // InternalQPE.g:1205:2: ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceAssignment_0_0()); 
            // InternalQPE.g:1206:2: ( rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 )
            // InternalQPE.g:1206:3: rule__ClassifierPredicate__QuerynamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassifierPredicate__QuerynamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceAssignment_0_0()); 

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
    // InternalQPE.g:1214:1: rule__ClassifierPredicate__Group_0__1 : rule__ClassifierPredicate__Group_0__1__Impl ;
    public final void rule__ClassifierPredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1218:1: ( rule__ClassifierPredicate__Group_0__1__Impl )
            // InternalQPE.g:1219:2: rule__ClassifierPredicate__Group_0__1__Impl
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
    // InternalQPE.g:1225:1: rule__ClassifierPredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ClassifierPredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1229:1: ( ( '::' ) )
            // InternalQPE.g:1230:1: ( '::' )
            {
            // InternalQPE.g:1230:1: ( '::' )
            // InternalQPE.g:1231:2: '::'
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
    // InternalQPE.g:1241:1: rule__AttributePredicate__Group__0 : rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 ;
    public final void rule__AttributePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1245:1: ( rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1 )
            // InternalQPE.g:1246:2: rule__AttributePredicate__Group__0__Impl rule__AttributePredicate__Group__1
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
    // InternalQPE.g:1253:1: rule__AttributePredicate__Group__0__Impl : ( ( rule__AttributePredicate__Group_0__0 )? ) ;
    public final void rule__AttributePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1257:1: ( ( ( rule__AttributePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1258:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1258:1: ( ( rule__AttributePredicate__Group_0__0 )? )
            // InternalQPE.g:1259:2: ( rule__AttributePredicate__Group_0__0 )?
            {
             before(grammarAccess.getAttributePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1260:2: ( rule__AttributePredicate__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==18) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalQPE.g:1260:3: rule__AttributePredicate__Group_0__0
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
    // InternalQPE.g:1268:1: rule__AttributePredicate__Group__1 : rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 ;
    public final void rule__AttributePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1272:1: ( rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2 )
            // InternalQPE.g:1273:2: rule__AttributePredicate__Group__1__Impl rule__AttributePredicate__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalQPE.g:1280:1: rule__AttributePredicate__Group__1__Impl : ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) ;
    public final void rule__AttributePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1284:1: ( ( ( rule__AttributePredicate__AttributeAssignment_1 ) ) )
            // InternalQPE.g:1285:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            {
            // InternalQPE.g:1285:1: ( ( rule__AttributePredicate__AttributeAssignment_1 ) )
            // InternalQPE.g:1286:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeAssignment_1()); 
            // InternalQPE.g:1287:2: ( rule__AttributePredicate__AttributeAssignment_1 )
            // InternalQPE.g:1287:3: rule__AttributePredicate__AttributeAssignment_1
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
    // InternalQPE.g:1295:1: rule__AttributePredicate__Group__2 : rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 ;
    public final void rule__AttributePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1299:1: ( rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3 )
            // InternalQPE.g:1300:2: rule__AttributePredicate__Group__2__Impl rule__AttributePredicate__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalQPE.g:1307:1: rule__AttributePredicate__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1311:1: ( ( '=' ) )
            // InternalQPE.g:1312:1: ( '=' )
            {
            // InternalQPE.g:1312:1: ( '=' )
            // InternalQPE.g:1313:2: '='
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
    // InternalQPE.g:1322:1: rule__AttributePredicate__Group__3 : rule__AttributePredicate__Group__3__Impl ;
    public final void rule__AttributePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1326:1: ( rule__AttributePredicate__Group__3__Impl )
            // InternalQPE.g:1327:2: rule__AttributePredicate__Group__3__Impl
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
    // InternalQPE.g:1333:1: rule__AttributePredicate__Group__3__Impl : ( ( rule__AttributePredicate__ValueAssignment_3 ) ) ;
    public final void rule__AttributePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1337:1: ( ( ( rule__AttributePredicate__ValueAssignment_3 ) ) )
            // InternalQPE.g:1338:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            {
            // InternalQPE.g:1338:1: ( ( rule__AttributePredicate__ValueAssignment_3 ) )
            // InternalQPE.g:1339:2: ( rule__AttributePredicate__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributePredicateAccess().getValueAssignment_3()); 
            // InternalQPE.g:1340:2: ( rule__AttributePredicate__ValueAssignment_3 )
            // InternalQPE.g:1340:3: rule__AttributePredicate__ValueAssignment_3
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
    // InternalQPE.g:1349:1: rule__AttributePredicate__Group_0__0 : rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 ;
    public final void rule__AttributePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1353:1: ( rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1 )
            // InternalQPE.g:1354:2: rule__AttributePredicate__Group_0__0__Impl rule__AttributePredicate__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQPE.g:1361:1: rule__AttributePredicate__Group_0__0__Impl : ( ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 ) ) ;
    public final void rule__AttributePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1365:1: ( ( ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1366:1: ( ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1366:1: ( ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 ) )
            // InternalQPE.g:1367:2: ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 )
            {
             before(grammarAccess.getAttributePredicateAccess().getQuerynamespaceAssignment_0_0()); 
            // InternalQPE.g:1368:2: ( rule__AttributePredicate__QuerynamespaceAssignment_0_0 )
            // InternalQPE.g:1368:3: rule__AttributePredicate__QuerynamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributePredicate__QuerynamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributePredicateAccess().getQuerynamespaceAssignment_0_0()); 

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
    // InternalQPE.g:1376:1: rule__AttributePredicate__Group_0__1 : rule__AttributePredicate__Group_0__1__Impl ;
    public final void rule__AttributePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1380:1: ( rule__AttributePredicate__Group_0__1__Impl )
            // InternalQPE.g:1381:2: rule__AttributePredicate__Group_0__1__Impl
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
    // InternalQPE.g:1387:1: rule__AttributePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1391:1: ( ( '::' ) )
            // InternalQPE.g:1392:1: ( '::' )
            {
            // InternalQPE.g:1392:1: ( '::' )
            // InternalQPE.g:1393:2: '::'
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
    // InternalQPE.g:1403:1: rule__ReferencePredicate__Group__0 : rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 ;
    public final void rule__ReferencePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1407:1: ( rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1 )
            // InternalQPE.g:1408:2: rule__ReferencePredicate__Group__0__Impl rule__ReferencePredicate__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalQPE.g:1415:1: rule__ReferencePredicate__Group__0__Impl : ( ( rule__ReferencePredicate__Group_0__0 )? ) ;
    public final void rule__ReferencePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1419:1: ( ( ( rule__ReferencePredicate__Group_0__0 )? ) )
            // InternalQPE.g:1420:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            {
            // InternalQPE.g:1420:1: ( ( rule__ReferencePredicate__Group_0__0 )? )
            // InternalQPE.g:1421:2: ( rule__ReferencePredicate__Group_0__0 )?
            {
             before(grammarAccess.getReferencePredicateAccess().getGroup_0()); 
            // InternalQPE.g:1422:2: ( rule__ReferencePredicate__Group_0__0 )?
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
                    // InternalQPE.g:1422:3: rule__ReferencePredicate__Group_0__0
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
    // InternalQPE.g:1430:1: rule__ReferencePredicate__Group__1 : rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 ;
    public final void rule__ReferencePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1434:1: ( rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2 )
            // InternalQPE.g:1435:2: rule__ReferencePredicate__Group__1__Impl rule__ReferencePredicate__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalQPE.g:1442:1: rule__ReferencePredicate__Group__1__Impl : ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) ;
    public final void rule__ReferencePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1446:1: ( ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) ) )
            // InternalQPE.g:1447:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            {
            // InternalQPE.g:1447:1: ( ( rule__ReferencePredicate__ReferenceAssignment_1 ) )
            // InternalQPE.g:1448:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceAssignment_1()); 
            // InternalQPE.g:1449:2: ( rule__ReferencePredicate__ReferenceAssignment_1 )
            // InternalQPE.g:1449:3: rule__ReferencePredicate__ReferenceAssignment_1
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
    // InternalQPE.g:1457:1: rule__ReferencePredicate__Group__2 : rule__ReferencePredicate__Group__2__Impl ;
    public final void rule__ReferencePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1461:1: ( rule__ReferencePredicate__Group__2__Impl )
            // InternalQPE.g:1462:2: rule__ReferencePredicate__Group__2__Impl
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
    // InternalQPE.g:1468:1: rule__ReferencePredicate__Group__2__Impl : ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) ;
    public final void rule__ReferencePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1472:1: ( ( ( rule__ReferencePredicate__QualifierAssignment_2 ) ) )
            // InternalQPE.g:1473:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            {
            // InternalQPE.g:1473:1: ( ( rule__ReferencePredicate__QualifierAssignment_2 ) )
            // InternalQPE.g:1474:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQualifierAssignment_2()); 
            // InternalQPE.g:1475:2: ( rule__ReferencePredicate__QualifierAssignment_2 )
            // InternalQPE.g:1475:3: rule__ReferencePredicate__QualifierAssignment_2
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
    // InternalQPE.g:1484:1: rule__ReferencePredicate__Group_0__0 : rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 ;
    public final void rule__ReferencePredicate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1488:1: ( rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1 )
            // InternalQPE.g:1489:2: rule__ReferencePredicate__Group_0__0__Impl rule__ReferencePredicate__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalQPE.g:1496:1: rule__ReferencePredicate__Group_0__0__Impl : ( ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 ) ) ;
    public final void rule__ReferencePredicate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1500:1: ( ( ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 ) ) )
            // InternalQPE.g:1501:1: ( ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 ) )
            {
            // InternalQPE.g:1501:1: ( ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 ) )
            // InternalQPE.g:1502:2: ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 )
            {
             before(grammarAccess.getReferencePredicateAccess().getQuerynamespaceAssignment_0_0()); 
            // InternalQPE.g:1503:2: ( rule__ReferencePredicate__QuerynamespaceAssignment_0_0 )
            // InternalQPE.g:1503:3: rule__ReferencePredicate__QuerynamespaceAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ReferencePredicate__QuerynamespaceAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getReferencePredicateAccess().getQuerynamespaceAssignment_0_0()); 

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
    // InternalQPE.g:1511:1: rule__ReferencePredicate__Group_0__1 : rule__ReferencePredicate__Group_0__1__Impl ;
    public final void rule__ReferencePredicate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1515:1: ( rule__ReferencePredicate__Group_0__1__Impl )
            // InternalQPE.g:1516:2: rule__ReferencePredicate__Group_0__1__Impl
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
    // InternalQPE.g:1522:1: rule__ReferencePredicate__Group_0__1__Impl : ( '::' ) ;
    public final void rule__ReferencePredicate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1526:1: ( ( '::' ) )
            // InternalQPE.g:1527:1: ( '::' )
            {
            // InternalQPE.g:1527:1: ( '::' )
            // InternalQPE.g:1528:2: '::'
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


    // $ANTLR start "rule__LONG__Group__0"
    // InternalQPE.g:1538:1: rule__LONG__Group__0 : rule__LONG__Group__0__Impl rule__LONG__Group__1 ;
    public final void rule__LONG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1542:1: ( rule__LONG__Group__0__Impl rule__LONG__Group__1 )
            // InternalQPE.g:1543:2: rule__LONG__Group__0__Impl rule__LONG__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__LONG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LONG__Group__1();

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
    // $ANTLR end "rule__LONG__Group__0"


    // $ANTLR start "rule__LONG__Group__0__Impl"
    // InternalQPE.g:1550:1: rule__LONG__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__LONG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1554:1: ( ( RULE_INT ) )
            // InternalQPE.g:1555:1: ( RULE_INT )
            {
            // InternalQPE.g:1555:1: ( RULE_INT )
            // InternalQPE.g:1556:2: RULE_INT
            {
             before(grammarAccess.getLONGAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__LONG__Group__0__Impl"


    // $ANTLR start "rule__LONG__Group__1"
    // InternalQPE.g:1565:1: rule__LONG__Group__1 : rule__LONG__Group__1__Impl ;
    public final void rule__LONG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1569:1: ( rule__LONG__Group__1__Impl )
            // InternalQPE.g:1570:2: rule__LONG__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LONG__Group__1__Impl();

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
    // $ANTLR end "rule__LONG__Group__1"


    // $ANTLR start "rule__LONG__Group__1__Impl"
    // InternalQPE.g:1576:1: rule__LONG__Group__1__Impl : ( ( rule__LONG__Alternatives_1 ) ) ;
    public final void rule__LONG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1580:1: ( ( ( rule__LONG__Alternatives_1 ) ) )
            // InternalQPE.g:1581:1: ( ( rule__LONG__Alternatives_1 ) )
            {
            // InternalQPE.g:1581:1: ( ( rule__LONG__Alternatives_1 ) )
            // InternalQPE.g:1582:2: ( rule__LONG__Alternatives_1 )
            {
             before(grammarAccess.getLONGAccess().getAlternatives_1()); 
            // InternalQPE.g:1583:2: ( rule__LONG__Alternatives_1 )
            // InternalQPE.g:1583:3: rule__LONG__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LONG__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLONGAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__LONG__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalQPE.g:1592:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1596:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalQPE.g:1597:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalQPE.g:1604:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1608:1: ( ( RULE_INT ) )
            // InternalQPE.g:1609:1: ( RULE_INT )
            {
            // InternalQPE.g:1609:1: ( RULE_INT )
            // InternalQPE.g:1610:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalQPE.g:1619:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1623:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalQPE.g:1624:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalQPE.g:1631:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1635:1: ( ( '.' ) )
            // InternalQPE.g:1636:1: ( '.' )
            {
            // InternalQPE.g:1636:1: ( '.' )
            // InternalQPE.g:1637:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalQPE.g:1646:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1650:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalQPE.g:1651:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalQPE.g:1657:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1661:1: ( ( RULE_INT ) )
            // InternalQPE.g:1662:1: ( RULE_INT )
            {
            // InternalQPE.g:1662:1: ( RULE_INT )
            // InternalQPE.g:1663:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__QPE__QuerynamespacesAssignment_0"
    // InternalQPE.g:1673:1: rule__QPE__QuerynamespacesAssignment_0 : ( ruleQueryNamespace ) ;
    public final void rule__QPE__QuerynamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1677:1: ( ( ruleQueryNamespace ) )
            // InternalQPE.g:1678:2: ( ruleQueryNamespace )
            {
            // InternalQPE.g:1678:2: ( ruleQueryNamespace )
            // InternalQPE.g:1679:3: ruleQueryNamespace
            {
             before(grammarAccess.getQPEAccess().getQuerynamespacesQueryNamespaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryNamespace();

            state._fsp--;

             after(grammarAccess.getQPEAccess().getQuerynamespacesQueryNamespaceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__QPE__QuerynamespacesAssignment_0"


    // $ANTLR start "rule__QPE__PathexpressionsAssignment_1"
    // InternalQPE.g:1688:1: rule__QPE__PathexpressionsAssignment_1 : ( rulePathExpression ) ;
    public final void rule__QPE__PathexpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1692:1: ( ( rulePathExpression ) )
            // InternalQPE.g:1693:2: ( rulePathExpression )
            {
            // InternalQPE.g:1693:2: ( rulePathExpression )
            // InternalQPE.g:1694:3: rulePathExpression
            {
             before(grammarAccess.getQPEAccess().getPathexpressionsPathExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePathExpression();

            state._fsp--;

             after(grammarAccess.getQPEAccess().getPathexpressionsPathExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QPE__PathexpressionsAssignment_1"


    // $ANTLR start "rule__QueryNamespace__IRIAssignment_1"
    // InternalQPE.g:1703:1: rule__QueryNamespace__IRIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__QueryNamespace__IRIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1707:1: ( ( RULE_STRING ) )
            // InternalQPE.g:1708:2: ( RULE_STRING )
            {
            // InternalQPE.g:1708:2: ( RULE_STRING )
            // InternalQPE.g:1709:3: RULE_STRING
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
    // InternalQPE.g:1718:1: rule__QueryNamespace__PrefixAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__QueryNamespace__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1722:1: ( ( RULE_ID ) )
            // InternalQPE.g:1723:2: ( RULE_ID )
            {
            // InternalQPE.g:1723:2: ( RULE_ID )
            // InternalQPE.g:1724:3: RULE_ID
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


    // $ANTLR start "rule__PathExpression__IsRelativeAssignment_0"
    // InternalQPE.g:1733:1: rule__PathExpression__IsRelativeAssignment_0 : ( ( '.' ) ) ;
    public final void rule__PathExpression__IsRelativeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1737:1: ( ( ( '.' ) ) )
            // InternalQPE.g:1738:2: ( ( '.' ) )
            {
            // InternalQPE.g:1738:2: ( ( '.' ) )
            // InternalQPE.g:1739:3: ( '.' )
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_0_0()); 
            // InternalQPE.g:1740:3: ( '.' )
            // InternalQPE.g:1741:4: '.'
            {
             before(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_0_0()); 

            }

             after(grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__PathExpression__IsRelativeAssignment_0"


    // $ANTLR start "rule__PathExpression__HeadAssignment_2"
    // InternalQPE.g:1752:1: rule__PathExpression__HeadAssignment_2 : ( ruleQueryElement ) ;
    public final void rule__PathExpression__HeadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1756:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1757:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1757:2: ( ruleQueryElement )
            // InternalQPE.g:1758:3: ruleQueryElement
            {
             before(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryElement();

            state._fsp--;

             after(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PathExpression__HeadAssignment_2"


    // $ANTLR start "rule__QueryElement__QuerynamespaceAssignment_0_0"
    // InternalQPE.g:1767:1: rule__QueryElement__QuerynamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__QuerynamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1771:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1772:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1772:2: ( ( RULE_ID ) )
            // InternalQPE.g:1773:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1774:3: ( RULE_ID )
            // InternalQPE.g:1775:4: RULE_ID
            {
             before(grammarAccess.getQueryElementAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryElementAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getQueryElementAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__QueryElement__QuerynamespaceAssignment_0_0"


    // $ANTLR start "rule__QueryElement__FeatureAssignment_1"
    // InternalQPE.g:1786:1: rule__QueryElement__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__QueryElement__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1790:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1791:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1791:2: ( ( RULE_ID ) )
            // InternalQPE.g:1792:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0()); 
            // InternalQPE.g:1793:3: ( RULE_ID )
            // InternalQPE.g:1794:4: RULE_ID
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
    // InternalQPE.g:1805:1: rule__QueryElement__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__QueryElement__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1809:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1810:2: ( ruleQualifier )
            {
            // InternalQPE.g:1810:2: ( ruleQualifier )
            // InternalQPE.g:1811:3: ruleQualifier
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
    // InternalQPE.g:1820:1: rule__QueryElement__NextAssignment_3_1 : ( ruleQueryElement ) ;
    public final void rule__QueryElement__NextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1824:1: ( ( ruleQueryElement ) )
            // InternalQPE.g:1825:2: ( ruleQueryElement )
            {
            // InternalQPE.g:1825:2: ( ruleQueryElement )
            // InternalQPE.g:1826:3: ruleQueryElement
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


    // $ANTLR start "rule__Qualifier__PredicateAssignment_1"
    // InternalQPE.g:1835:1: rule__Qualifier__PredicateAssignment_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1839:1: ( ( rulePredicate ) )
            // InternalQPE.g:1840:2: ( rulePredicate )
            {
            // InternalQPE.g:1840:2: ( rulePredicate )
            // InternalQPE.g:1841:3: rulePredicate
            {
             before(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Qualifier__PredicateAssignment_1"


    // $ANTLR start "rule__Qualifier__PredicateAssignment_2_1"
    // InternalQPE.g:1850:1: rule__Qualifier__PredicateAssignment_2_1 : ( rulePredicate ) ;
    public final void rule__Qualifier__PredicateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1854:1: ( ( rulePredicate ) )
            // InternalQPE.g:1855:2: ( rulePredicate )
            {
            // InternalQPE.g:1855:2: ( rulePredicate )
            // InternalQPE.g:1856:3: rulePredicate
            {
             before(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQualifierAccess().getPredicatePredicateParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Qualifier__PredicateAssignment_2_1"


    // $ANTLR start "rule__ClassifierPredicate__QuerynamespaceAssignment_0_0"
    // InternalQPE.g:1865:1: rule__ClassifierPredicate__QuerynamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__QuerynamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1869:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1870:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1870:2: ( ( RULE_ID ) )
            // InternalQPE.g:1871:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1872:3: ( RULE_ID )
            // InternalQPE.g:1873:4: RULE_ID
            {
             before(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getClassifierPredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__ClassifierPredicate__QuerynamespaceAssignment_0_0"


    // $ANTLR start "rule__ClassifierPredicate__ClassifierAssignment_1"
    // InternalQPE.g:1884:1: rule__ClassifierPredicate__ClassifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ClassifierPredicate__ClassifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1888:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1889:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1889:2: ( ( RULE_ID ) )
            // InternalQPE.g:1890:3: ( RULE_ID )
            {
             before(grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0()); 
            // InternalQPE.g:1891:3: ( RULE_ID )
            // InternalQPE.g:1892:4: RULE_ID
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


    // $ANTLR start "rule__AttributePredicate__QuerynamespaceAssignment_0_0"
    // InternalQPE.g:1903:1: rule__AttributePredicate__QuerynamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__QuerynamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1907:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1908:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1908:2: ( ( RULE_ID ) )
            // InternalQPE.g:1909:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1910:3: ( RULE_ID )
            // InternalQPE.g:1911:4: RULE_ID
            {
             before(grammarAccess.getAttributePredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributePredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getAttributePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__AttributePredicate__QuerynamespaceAssignment_0_0"


    // $ANTLR start "rule__AttributePredicate__AttributeAssignment_1"
    // InternalQPE.g:1922:1: rule__AttributePredicate__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributePredicate__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1926:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1927:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1927:2: ( ( RULE_ID ) )
            // InternalQPE.g:1928:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0()); 
            // InternalQPE.g:1929:3: ( RULE_ID )
            // InternalQPE.g:1930:4: RULE_ID
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
    // InternalQPE.g:1941:1: rule__AttributePredicate__ValueAssignment_3 : ( ruleVALUE ) ;
    public final void rule__AttributePredicate__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1945:1: ( ( ruleVALUE ) )
            // InternalQPE.g:1946:2: ( ruleVALUE )
            {
            // InternalQPE.g:1946:2: ( ruleVALUE )
            // InternalQPE.g:1947:3: ruleVALUE
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


    // $ANTLR start "rule__ReferencePredicate__QuerynamespaceAssignment_0_0"
    // InternalQPE.g:1956:1: rule__ReferencePredicate__QuerynamespaceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__QuerynamespaceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1960:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1961:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1961:2: ( ( RULE_ID ) )
            // InternalQPE.g:1962:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 
            // InternalQPE.g:1963:3: ( RULE_ID )
            // InternalQPE.g:1964:4: RULE_ID
            {
             before(grammarAccess.getReferencePredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferencePredicateAccess().getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getReferencePredicateAccess().getQuerynamespaceQueryNamespaceCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__ReferencePredicate__QuerynamespaceAssignment_0_0"


    // $ANTLR start "rule__ReferencePredicate__ReferenceAssignment_1"
    // InternalQPE.g:1975:1: rule__ReferencePredicate__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReferencePredicate__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1979:1: ( ( ( RULE_ID ) ) )
            // InternalQPE.g:1980:2: ( ( RULE_ID ) )
            {
            // InternalQPE.g:1980:2: ( ( RULE_ID ) )
            // InternalQPE.g:1981:3: ( RULE_ID )
            {
             before(grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0()); 
            // InternalQPE.g:1982:3: ( RULE_ID )
            // InternalQPE.g:1983:4: RULE_ID
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
    // InternalQPE.g:1994:1: rule__ReferencePredicate__QualifierAssignment_2 : ( ruleQualifier ) ;
    public final void rule__ReferencePredicate__QualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQPE.g:1998:1: ( ( ruleQualifier ) )
            // InternalQPE.g:1999:2: ( ruleQualifier )
            {
            // InternalQPE.g:1999:2: ( ruleQualifier )
            // InternalQPE.g:2000:3: ruleQualifier
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});

}
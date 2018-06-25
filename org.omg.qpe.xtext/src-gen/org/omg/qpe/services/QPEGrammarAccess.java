/*
 * generated by Xtext
 */
package org.omg.qpe.services;

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
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class QPEGrammarAccess extends AbstractGrammarElementFinder {
	
	public class QPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.QPE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cQueryNamespacesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQueryNamespacesQueryNamespaceParserRuleCall_0_0 = (RuleCall)cQueryNamespacesAssignment_0.eContents().get(0);
		private final Assignment cPathExpressionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathExpressionsPathExpressionParserRuleCall_1_0 = (RuleCall)cPathExpressionsAssignment_1.eContents().get(0);
		
		//QPE:
		//	queryNamespaces+=QueryNamespace
		//	pathExpressions+=PathExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//queryNamespaces+=QueryNamespace pathExpressions+=PathExpression
		public Group getGroup() { return cGroup; }
		
		//queryNamespaces+=QueryNamespace
		public Assignment getQueryNamespacesAssignment_0() { return cQueryNamespacesAssignment_0; }
		
		//QueryNamespace
		public RuleCall getQueryNamespacesQueryNamespaceParserRuleCall_0_0() { return cQueryNamespacesQueryNamespaceParserRuleCall_0_0; }
		
		//pathExpressions+=PathExpression
		public Assignment getPathExpressionsAssignment_1() { return cPathExpressionsAssignment_1; }
		
		//PathExpression
		public RuleCall getPathExpressionsPathExpressionParserRuleCall_1_0() { return cPathExpressionsPathExpressionParserRuleCall_1_0; }
	}
	public class QueryNamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.QueryNamespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIRIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIRISTRINGTerminalRuleCall_1_0 = (RuleCall)cIRIAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPrefixAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPrefixIDTerminalRuleCall_2_1_0 = (RuleCall)cPrefixAssignment_2_1.eContents().get(0);
		
		//QueryNamespace:
		//	'namespace' IRI=STRING ('as' prefix=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'namespace' IRI=STRING ('as' prefix=ID)?
		public Group getGroup() { return cGroup; }
		
		//'namespace'
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }
		
		//IRI=STRING
		public Assignment getIRIAssignment_1() { return cIRIAssignment_1; }
		
		//STRING
		public RuleCall getIRISTRINGTerminalRuleCall_1_0() { return cIRISTRINGTerminalRuleCall_1_0; }
		
		//('as' prefix=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'as'
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//prefix=ID
		public Assignment getPrefixAssignment_2_1() { return cPrefixAssignment_2_1; }
		
		//ID
		public RuleCall getPrefixIDTerminalRuleCall_2_1_0() { return cPrefixIDTerminalRuleCall_2_1_0; }
	}
	public class PathExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.PathExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPathExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIsRelativeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsRelativeFullStopKeyword_1_0 = (Keyword)cIsRelativeAssignment_1.eContents().get(0);
		private final Assignment cQualifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQualifierQualifierParserRuleCall_2_0 = (RuleCall)cQualifierAssignment_2.eContents().get(0);
		private final Keyword cSolidusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cHeadAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHeadQueryElementParserRuleCall_4_0 = (RuleCall)cHeadAssignment_4.eContents().get(0);
		
		//PathExpression:
		//	{PathExpression} isRelative?='.'? qualifier=Qualifier? '/' head=QueryElement?;
		@Override public ParserRule getRule() { return rule; }
		
		//{PathExpression} isRelative?='.'? qualifier=Qualifier? '/' head=QueryElement?
		public Group getGroup() { return cGroup; }
		
		//{PathExpression}
		public Action getPathExpressionAction_0() { return cPathExpressionAction_0; }
		
		//isRelative?='.'?
		public Assignment getIsRelativeAssignment_1() { return cIsRelativeAssignment_1; }
		
		//'.'
		public Keyword getIsRelativeFullStopKeyword_1_0() { return cIsRelativeFullStopKeyword_1_0; }
		
		//qualifier=Qualifier?
		public Assignment getQualifierAssignment_2() { return cQualifierAssignment_2; }
		
		//Qualifier
		public RuleCall getQualifierQualifierParserRuleCall_2_0() { return cQualifierQualifierParserRuleCall_2_0; }
		
		//'/'
		public Keyword getSolidusKeyword_3() { return cSolidusKeyword_3; }
		
		//head=QueryElement?
		public Assignment getHeadAssignment_4() { return cHeadAssignment_4; }
		
		//QueryElement
		public RuleCall getHeadQueryElementParserRuleCall_4_0() { return cHeadQueryElementParserRuleCall_4_0; }
	}
	public class QueryElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.QueryElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQueryNamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQueryNamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQueryNamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQueryNamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFeatureEStructuralFeatureCrossReference_1_0 = (CrossReference)cFeatureAssignment_1.eContents().get(0);
		private final RuleCall cFeatureEStructuralFeatureIDTerminalRuleCall_1_0_1 = (RuleCall)cFeatureEStructuralFeatureCrossReference_1_0.eContents().get(1);
		private final Assignment cQualifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQualifierQualifierParserRuleCall_2_0 = (RuleCall)cQualifierAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSolidusKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNextAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNextQueryElementParserRuleCall_3_1_0 = (RuleCall)cNextAssignment_3_1.eContents().get(0);
		
		//QueryElement:
		//	(queryNamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
		//	next=QueryElement)?;
		@Override public ParserRule getRule() { return rule; }
		
		//(queryNamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
		//next=QueryElement)?
		public Group getGroup() { return cGroup; }
		
		//(queryNamespace=[QueryNamespace] '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//queryNamespace=[QueryNamespace]
		public Assignment getQueryNamespaceAssignment_0_0() { return cQueryNamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQueryNamespaceQueryNamespaceCrossReference_0_0_0() { return cQueryNamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//feature=[ecore::EStructuralFeature]
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }
		
		//[ecore::EStructuralFeature]
		public CrossReference getFeatureEStructuralFeatureCrossReference_1_0() { return cFeatureEStructuralFeatureCrossReference_1_0; }
		
		//ID
		public RuleCall getFeatureEStructuralFeatureIDTerminalRuleCall_1_0_1() { return cFeatureEStructuralFeatureIDTerminalRuleCall_1_0_1; }
		
		///*CustomScope*/ qualifier=Qualifier?
		public Assignment getQualifierAssignment_2() { return cQualifierAssignment_2; }
		
		//Qualifier
		public RuleCall getQualifierQualifierParserRuleCall_2_0() { return cQualifierQualifierParserRuleCall_2_0; }
		
		//('/' next=QueryElement)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'/'
		public Keyword getSolidusKeyword_3_0() { return cSolidusKeyword_3_0; }
		
		//next=QueryElement
		public Assignment getNextAssignment_3_1() { return cNextAssignment_3_1; }
		
		//QueryElement
		public RuleCall getNextQueryElementParserRuleCall_3_1_0() { return cNextQueryElementParserRuleCall_3_1_0; }
	}
	public class QualifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.Qualifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cIndexAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cIndexINTTerminalRuleCall_1_0_0_0 = (RuleCall)cIndexAssignment_1_0_0.eContents().get(0);
		private final Group cGroup_1_0_1 = (Group)cGroup_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Assignment cPredicatesAssignment_1_0_1_1 = (Assignment)cGroup_1_0_1.eContents().get(1);
		private final RuleCall cPredicatesPredicateParserRuleCall_1_0_1_1_0 = (RuleCall)cPredicatesAssignment_1_0_1_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cPredicatesAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cPredicatesPredicateParserRuleCall_1_1_0_0 = (RuleCall)cPredicatesAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cPredicatesAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cPredicatesPredicateParserRuleCall_1_1_1_1_0 = (RuleCall)cPredicatesAssignment_1_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Qualifier:
		//	'[' (index=INT (',' predicates+=Predicate)* | predicates+=Predicate (',' predicates+=Predicate)*)
		//	']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' (index=INT (',' predicates+=Predicate)* | predicates+=Predicate (',' predicates+=Predicate)*) ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//index=INT (',' predicates+=Predicate)* | predicates+=Predicate (',' predicates+=Predicate)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//index=INT (',' predicates+=Predicate)*
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//index=INT
		public Assignment getIndexAssignment_1_0_0() { return cIndexAssignment_1_0_0; }
		
		//INT
		public RuleCall getIndexINTTerminalRuleCall_1_0_0_0() { return cIndexINTTerminalRuleCall_1_0_0_0; }
		
		//(',' predicates+=Predicate)*
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//','
		public Keyword getCommaKeyword_1_0_1_0() { return cCommaKeyword_1_0_1_0; }
		
		//predicates+=Predicate
		public Assignment getPredicatesAssignment_1_0_1_1() { return cPredicatesAssignment_1_0_1_1; }
		
		//Predicate
		public RuleCall getPredicatesPredicateParserRuleCall_1_0_1_1_0() { return cPredicatesPredicateParserRuleCall_1_0_1_1_0; }
		
		//predicates+=Predicate (',' predicates+=Predicate)*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//predicates+=Predicate
		public Assignment getPredicatesAssignment_1_1_0() { return cPredicatesAssignment_1_1_0; }
		
		//Predicate
		public RuleCall getPredicatesPredicateParserRuleCall_1_1_0_0() { return cPredicatesPredicateParserRuleCall_1_1_0_0; }
		
		//(',' predicates+=Predicate)*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//predicates+=Predicate
		public Assignment getPredicatesAssignment_1_1_1_1() { return cPredicatesAssignment_1_1_1_1; }
		
		//Predicate
		public RuleCall getPredicatesPredicateParserRuleCall_1_1_1_1_0() { return cPredicatesPredicateParserRuleCall_1_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.Predicate");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassifierPredicateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttributePredicateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cReferencePredicateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Predicate:
		//	ClassifierPredicate | AttributePredicate | ReferencePredicate;
		@Override public ParserRule getRule() { return rule; }
		
		//ClassifierPredicate | AttributePredicate | ReferencePredicate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ClassifierPredicate
		public RuleCall getClassifierPredicateParserRuleCall_0() { return cClassifierPredicateParserRuleCall_0; }
		
		//AttributePredicate
		public RuleCall getAttributePredicateParserRuleCall_1() { return cAttributePredicateParserRuleCall_1; }
		
		//ReferencePredicate
		public RuleCall getReferencePredicateParserRuleCall_2() { return cReferencePredicateParserRuleCall_2; }
	}
	public class ClassifierPredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.ClassifierPredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQueryNamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQueryNamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQueryNamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQueryNamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cClassifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClassifierEClassifierCrossReference_1_0 = (CrossReference)cClassifierAssignment_1.eContents().get(0);
		private final RuleCall cClassifierEClassifierIDTerminalRuleCall_1_0_1 = (RuleCall)cClassifierEClassifierCrossReference_1_0.eContents().get(1);
		
		//ClassifierPredicate:
		//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier];
		@Override public ParserRule getRule() { return rule; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier]
		public Group getGroup() { return cGroup; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//queryNamespace=[QueryNamespace]
		public Assignment getQueryNamespaceAssignment_0_0() { return cQueryNamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQueryNamespaceQueryNamespaceCrossReference_0_0_0() { return cQueryNamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
		///*DefaultScope*/ '::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//classifier=[ecore::EClassifier]
		public Assignment getClassifierAssignment_1() { return cClassifierAssignment_1; }
		
		//[ecore::EClassifier]
		public CrossReference getClassifierEClassifierCrossReference_1_0() { return cClassifierEClassifierCrossReference_1_0; }
		
		//ID
		public RuleCall getClassifierEClassifierIDTerminalRuleCall_1_0_1() { return cClassifierEClassifierIDTerminalRuleCall_1_0_1; }
	}
	public class AttributePredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.AttributePredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQueryNamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQueryNamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQueryNamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQueryNamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cAttributeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cAttributeEAttributeCrossReference_1_0 = (CrossReference)cAttributeAssignment_1.eContents().get(0);
		private final RuleCall cAttributeEAttributeIDTerminalRuleCall_1_0_1 = (RuleCall)cAttributeEAttributeCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueVALUEParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//AttributePredicate:
		//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] '=' /*CustomScope*/
		//	value=VALUE;
		@Override public ParserRule getRule() { return rule; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] '=' /*CustomScope*/ value=VALUE
		public Group getGroup() { return cGroup; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//queryNamespace=[QueryNamespace]
		public Assignment getQueryNamespaceAssignment_0_0() { return cQueryNamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQueryNamespaceQueryNamespaceCrossReference_0_0_0() { return cQueryNamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
		///*DefaultScope*/ '::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//attribute=[ecore::EAttribute]
		public Assignment getAttributeAssignment_1() { return cAttributeAssignment_1; }
		
		//[ecore::EAttribute]
		public CrossReference getAttributeEAttributeCrossReference_1_0() { return cAttributeEAttributeCrossReference_1_0; }
		
		//ID
		public RuleCall getAttributeEAttributeIDTerminalRuleCall_1_0_1() { return cAttributeEAttributeIDTerminalRuleCall_1_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		///*CustomScope*/ value=VALUE
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//VALUE
		public RuleCall getValueVALUEParserRuleCall_3_0() { return cValueVALUEParserRuleCall_3_0; }
	}
	public class ReferencePredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.ReferencePredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQueryNamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQueryNamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQueryNamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQueryNamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cReferenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cReferenceEReferenceCrossReference_1_0 = (CrossReference)cReferenceAssignment_1.eContents().get(0);
		private final RuleCall cReferenceEReferenceIDTerminalRuleCall_1_0_1 = (RuleCall)cReferenceEReferenceCrossReference_1_0.eContents().get(1);
		private final Assignment cQualifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQualifierQualifierParserRuleCall_2_0 = (RuleCall)cQualifierAssignment_2.eContents().get(0);
		
		//ReferencePredicate:
		//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier;
		@Override public ParserRule getRule() { return rule; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier
		public Group getGroup() { return cGroup; }
		
		//(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//queryNamespace=[QueryNamespace]
		public Assignment getQueryNamespaceAssignment_0_0() { return cQueryNamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQueryNamespaceQueryNamespaceCrossReference_0_0_0() { return cQueryNamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQueryNamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
		///*DefaultScope*/ '::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//reference=[ecore::EReference]
		public Assignment getReferenceAssignment_1() { return cReferenceAssignment_1; }
		
		//[ecore::EReference]
		public CrossReference getReferenceEReferenceCrossReference_1_0() { return cReferenceEReferenceCrossReference_1_0; }
		
		//ID
		public RuleCall getReferenceEReferenceIDTerminalRuleCall_1_0_1() { return cReferenceEReferenceIDTerminalRuleCall_1_0_1; }
		
		///*CustomScope*/ qualifier=Qualifier
		public Assignment getQualifierAssignment_2() { return cQualifierAssignment_2; }
		
		//Qualifier
		public RuleCall getQualifierQualifierParserRuleCall_2_0() { return cQualifierQualifierParserRuleCall_2_0; }
	}
	public class VALUEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.VALUE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLONGTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDOUBLETerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBOOLEANTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		///* terminal */ VALUE /* returns ecore::EJavaObject */:
		//	STRING | INT | LONG | DOUBLE | BOOLEAN;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | INT | LONG | DOUBLE | BOOLEAN
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//LONG
		public RuleCall getLONGTerminalRuleCall_2() { return cLONGTerminalRuleCall_2; }
		
		//DOUBLE
		public RuleCall getDOUBLETerminalRuleCall_3() { return cDOUBLETerminalRuleCall_3; }
		
		//BOOLEAN
		public RuleCall getBOOLEANTerminalRuleCall_4() { return cBOOLEANTerminalRuleCall_4; }
	}
	
	
	private final QPEElements pQPE;
	private final QueryNamespaceElements pQueryNamespace;
	private final PathExpressionElements pPathExpression;
	private final QueryElementElements pQueryElement;
	private final QualifierElements pQualifier;
	private final PredicateElements pPredicate;
	private final ClassifierPredicateElements pClassifierPredicate;
	private final AttributePredicateElements pAttributePredicate;
	private final ReferencePredicateElements pReferencePredicate;
	private final VALUEElements pVALUE;
	private final TerminalRule tLONG;
	private final TerminalRule tDOUBLE;
	private final TerminalRule tBOOLEAN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public QPEGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQPE = new QPEElements();
		this.pQueryNamespace = new QueryNamespaceElements();
		this.pPathExpression = new PathExpressionElements();
		this.pQueryElement = new QueryElementElements();
		this.pQualifier = new QualifierElements();
		this.pPredicate = new PredicateElements();
		this.pClassifierPredicate = new ClassifierPredicateElements();
		this.pAttributePredicate = new AttributePredicateElements();
		this.pReferencePredicate = new ReferencePredicateElements();
		this.pVALUE = new VALUEElements();
		this.tLONG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.LONG");
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.DOUBLE");
		this.tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.BOOLEAN");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.omg.qpe.QPE".equals(grammar.getName())) {
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

	
	//QPE:
	//	queryNamespaces+=QueryNamespace
	//	pathExpressions+=PathExpression;
	public QPEElements getQPEAccess() {
		return pQPE;
	}
	
	public ParserRule getQPERule() {
		return getQPEAccess().getRule();
	}
	
	//QueryNamespace:
	//	'namespace' IRI=STRING ('as' prefix=ID)?;
	public QueryNamespaceElements getQueryNamespaceAccess() {
		return pQueryNamespace;
	}
	
	public ParserRule getQueryNamespaceRule() {
		return getQueryNamespaceAccess().getRule();
	}
	
	//PathExpression:
	//	{PathExpression} isRelative?='.'? qualifier=Qualifier? '/' head=QueryElement?;
	public PathExpressionElements getPathExpressionAccess() {
		return pPathExpression;
	}
	
	public ParserRule getPathExpressionRule() {
		return getPathExpressionAccess().getRule();
	}
	
	//QueryElement:
	//	(queryNamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
	//	next=QueryElement)?;
	public QueryElementElements getQueryElementAccess() {
		return pQueryElement;
	}
	
	public ParserRule getQueryElementRule() {
		return getQueryElementAccess().getRule();
	}
	
	//Qualifier:
	//	'[' (index=INT (',' predicates+=Predicate)* | predicates+=Predicate (',' predicates+=Predicate)*)
	//	']';
	public QualifierElements getQualifierAccess() {
		return pQualifier;
	}
	
	public ParserRule getQualifierRule() {
		return getQualifierAccess().getRule();
	}
	
	//Predicate:
	//	ClassifierPredicate | AttributePredicate | ReferencePredicate;
	public PredicateElements getPredicateAccess() {
		return pPredicate;
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}
	
	//ClassifierPredicate:
	//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier];
	public ClassifierPredicateElements getClassifierPredicateAccess() {
		return pClassifierPredicate;
	}
	
	public ParserRule getClassifierPredicateRule() {
		return getClassifierPredicateAccess().getRule();
	}
	
	//AttributePredicate:
	//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] '=' /*CustomScope*/
	//	value=VALUE;
	public AttributePredicateElements getAttributePredicateAccess() {
		return pAttributePredicate;
	}
	
	public ParserRule getAttributePredicateRule() {
		return getAttributePredicateAccess().getRule();
	}
	
	//ReferencePredicate:
	//	(queryNamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier;
	public ReferencePredicateElements getReferencePredicateAccess() {
		return pReferencePredicate;
	}
	
	public ParserRule getReferencePredicateRule() {
		return getReferencePredicateAccess().getRule();
	}
	
	///* terminal */ VALUE /* returns ecore::EJavaObject */:
	//	STRING | INT | LONG | DOUBLE | BOOLEAN;
	public VALUEElements getVALUEAccess() {
		return pVALUE;
	}
	
	public ParserRule getVALUERule() {
		return getVALUEAccess().getRule();
	}
	
	//terminal LONG returns ecore::ELong:
	//	INT ("L" | "l");
	public TerminalRule getLONGRule() {
		return tLONG;
	}
	
	//terminal DOUBLE returns ecore::EDouble:
	//	INT '.' INT;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal BOOLEAN returns ecore::EBoolean:
	//	"true" | "false";
	public TerminalRule getBOOLEANRule() {
		return tBOOLEAN;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

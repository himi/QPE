/*
 * generated by Xtext
 */
package org.omg.qpe.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
		private final Assignment cQuerynamespacesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cQuerynamespacesQueryNamespaceParserRuleCall_0_0 = (RuleCall)cQuerynamespacesAssignment_0.eContents().get(0);
		private final Assignment cPathexpressionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathexpressionsPathExpressionParserRuleCall_1_0 = (RuleCall)cPathexpressionsAssignment_1.eContents().get(0);
		
		//QPE:
		//	querynamespaces+=QueryNamespace
		//	pathexpressions+=PathExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//querynamespaces+=QueryNamespace pathexpressions+=PathExpression
		public Group getGroup() { return cGroup; }
		
		//querynamespaces+=QueryNamespace
		public Assignment getQuerynamespacesAssignment_0() { return cQuerynamespacesAssignment_0; }
		
		//QueryNamespace
		public RuleCall getQuerynamespacesQueryNamespaceParserRuleCall_0_0() { return cQuerynamespacesQueryNamespaceParserRuleCall_0_0; }
		
		//pathexpressions+=PathExpression
		public Assignment getPathexpressionsAssignment_1() { return cPathexpressionsAssignment_1; }
		
		//PathExpression
		public RuleCall getPathexpressionsPathExpressionParserRuleCall_1_0() { return cPathexpressionsPathExpressionParserRuleCall_1_0; }
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
		private final Assignment cIsRelativeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsRelativeFullStopKeyword_0_0 = (Keyword)cIsRelativeAssignment_0.eContents().get(0);
		private final Keyword cSolidusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cHeadAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cHeadQueryElementParserRuleCall_2_0 = (RuleCall)cHeadAssignment_2.eContents().get(0);
		
		//PathExpression:
		//	isRelative?='.' '/' head=QueryElement;
		@Override public ParserRule getRule() { return rule; }
		
		//isRelative?='.' '/' head=QueryElement
		public Group getGroup() { return cGroup; }
		
		//isRelative?='.'
		public Assignment getIsRelativeAssignment_0() { return cIsRelativeAssignment_0; }
		
		//'.'
		public Keyword getIsRelativeFullStopKeyword_0_0() { return cIsRelativeFullStopKeyword_0_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1() { return cSolidusKeyword_1; }
		
		//head=QueryElement
		public Assignment getHeadAssignment_2() { return cHeadAssignment_2; }
		
		//QueryElement
		public RuleCall getHeadQueryElementParserRuleCall_2_0() { return cHeadQueryElementParserRuleCall_2_0; }
	}
	public class QueryElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.QueryElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQuerynamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQuerynamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQuerynamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQuerynamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
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
		//	(querynamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
		//	next=QueryElement)?;
		@Override public ParserRule getRule() { return rule; }
		
		//(querynamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
		//next=QueryElement)?
		public Group getGroup() { return cGroup; }
		
		//(querynamespace=[QueryNamespace] '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//querynamespace=[QueryNamespace]
		public Assignment getQuerynamespaceAssignment_0_0() { return cQuerynamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQuerynamespaceQueryNamespaceCrossReference_0_0_0() { return cQuerynamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
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
		private final Assignment cPredicateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPredicatePredicateParserRuleCall_1_0 = (RuleCall)cPredicateAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cPredicateAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPredicatePredicateParserRuleCall_2_1_0 = (RuleCall)cPredicateAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Qualifier:
		//	'[' predicate+=Predicate (',' predicate+=Predicate)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' predicate+=Predicate (',' predicate+=Predicate)* ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//predicate+=Predicate
		public Assignment getPredicateAssignment_1() { return cPredicateAssignment_1; }
		
		//Predicate
		public RuleCall getPredicatePredicateParserRuleCall_1_0() { return cPredicatePredicateParserRuleCall_1_0; }
		
		//(',' predicate+=Predicate)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//predicate+=Predicate
		public Assignment getPredicateAssignment_2_1() { return cPredicateAssignment_2_1; }
		
		//Predicate
		public RuleCall getPredicatePredicateParserRuleCall_2_1_0() { return cPredicatePredicateParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
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
		private final Assignment cQuerynamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQuerynamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQuerynamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQuerynamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cClassifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClassifierEClassifierCrossReference_1_0 = (CrossReference)cClassifierAssignment_1.eContents().get(0);
		private final RuleCall cClassifierEClassifierIDTerminalRuleCall_1_0_1 = (RuleCall)cClassifierEClassifierCrossReference_1_0.eContents().get(1);
		
		//ClassifierPredicate:
		//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier];
		@Override public ParserRule getRule() { return rule; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier]
		public Group getGroup() { return cGroup; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//querynamespace=[QueryNamespace]
		public Assignment getQuerynamespaceAssignment_0_0() { return cQuerynamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQuerynamespaceQueryNamespaceCrossReference_0_0_0() { return cQuerynamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
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
		private final Assignment cQuerynamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQuerynamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQuerynamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQuerynamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cAttributeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cAttributeEAttributeCrossReference_1_0 = (CrossReference)cAttributeAssignment_1.eContents().get(0);
		private final RuleCall cAttributeEAttributeIDTerminalRuleCall_1_0_1 = (RuleCall)cAttributeEAttributeCrossReference_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueVALUEParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//AttributePredicate:
		//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] /*CustomScope*/ '='
		//	value=VALUE;
		@Override public ParserRule getRule() { return rule; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] /*CustomScope*/ '=' value=VALUE
		public Group getGroup() { return cGroup; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//querynamespace=[QueryNamespace]
		public Assignment getQuerynamespaceAssignment_0_0() { return cQuerynamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQuerynamespaceQueryNamespaceCrossReference_0_0_0() { return cQuerynamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
		///*DefaultScope*/ '::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//attribute=[ecore::EAttribute]
		public Assignment getAttributeAssignment_1() { return cAttributeAssignment_1; }
		
		//[ecore::EAttribute]
		public CrossReference getAttributeEAttributeCrossReference_1_0() { return cAttributeEAttributeCrossReference_1_0; }
		
		//ID
		public RuleCall getAttributeEAttributeIDTerminalRuleCall_1_0_1() { return cAttributeEAttributeIDTerminalRuleCall_1_0_1; }
		
		///*CustomScope*/ '='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=VALUE
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//VALUE
		public RuleCall getValueVALUEParserRuleCall_3_0() { return cValueVALUEParserRuleCall_3_0; }
	}
	public class ReferencePredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.ReferencePredicate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cQuerynamespaceAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cQuerynamespaceQueryNamespaceCrossReference_0_0_0 = (CrossReference)cQuerynamespaceAssignment_0_0.eContents().get(0);
		private final RuleCall cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1 = (RuleCall)cQuerynamespaceQueryNamespaceCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cReferenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cReferenceEReferenceCrossReference_1_0 = (CrossReference)cReferenceAssignment_1.eContents().get(0);
		private final RuleCall cReferenceEReferenceIDTerminalRuleCall_1_0_1 = (RuleCall)cReferenceEReferenceCrossReference_1_0.eContents().get(1);
		private final Assignment cQualifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQualifierQualifierParserRuleCall_2_0 = (RuleCall)cQualifierAssignment_2.eContents().get(0);
		
		//ReferencePredicate:
		//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier;
		@Override public ParserRule getRule() { return rule; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier
		public Group getGroup() { return cGroup; }
		
		//(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//querynamespace=[QueryNamespace]
		public Assignment getQuerynamespaceAssignment_0_0() { return cQuerynamespaceAssignment_0_0; }
		
		//[QueryNamespace]
		public CrossReference getQuerynamespaceQueryNamespaceCrossReference_0_0_0() { return cQuerynamespaceQueryNamespaceCrossReference_0_0_0; }
		
		//ID
		public RuleCall getQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1() { return cQuerynamespaceQueryNamespaceIDTerminalRuleCall_0_0_0_1; }
		
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
		private final RuleCall cLONGParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDOUBLEParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBOOLEANParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//VALUE ecore::EJavaObject:
		//	STRING | INT | LONG | DOUBLE | BOOLEAN;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | INT | LONG | DOUBLE | BOOLEAN
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//LONG
		public RuleCall getLONGParserRuleCall_2() { return cLONGParserRuleCall_2; }
		
		//DOUBLE
		public RuleCall getDOUBLEParserRuleCall_3() { return cDOUBLEParserRuleCall_3; }
		
		//BOOLEAN
		public RuleCall getBOOLEANParserRuleCall_4() { return cBOOLEANParserRuleCall_4; }
	}
	public class LONGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.LONG");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cLKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cLKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		
		//LONG ecore::ELong:
		//	INT ("L" | "l");
		@Override public ParserRule getRule() { return rule; }
		
		//INT ("L" | "l")
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//"L" | "l"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"L"
		public Keyword getLKeyword_1_0() { return cLKeyword_1_0; }
		
		//"l"
		public Keyword getLKeyword_1_1() { return cLKeyword_1_1; }
	}
	public class DOUBLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.DOUBLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DOUBLE ecore::EDouble:
		//	INT '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '.' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class BOOLEANElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.omg.qpe.QPE.BOOLEAN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//BOOLEAN ecore::EBoolean:
		//	"true" | "false";
		@Override public ParserRule getRule() { return rule; }
		
		//"true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"true"
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//"false"
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
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
	private final LONGElements pLONG;
	private final DOUBLEElements pDOUBLE;
	private final BOOLEANElements pBOOLEAN;
	
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
		this.pLONG = new LONGElements();
		this.pDOUBLE = new DOUBLEElements();
		this.pBOOLEAN = new BOOLEANElements();
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
	//	querynamespaces+=QueryNamespace
	//	pathexpressions+=PathExpression;
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
	//	isRelative?='.' '/' head=QueryElement;
	public PathExpressionElements getPathExpressionAccess() {
		return pPathExpression;
	}
	
	public ParserRule getPathExpressionRule() {
		return getPathExpressionAccess().getRule();
	}
	
	//QueryElement:
	//	(querynamespace=[QueryNamespace] '::')? feature=[ecore::EStructuralFeature] qualifier=Qualifier? ('/'
	//	next=QueryElement)?;
	public QueryElementElements getQueryElementAccess() {
		return pQueryElement;
	}
	
	public ParserRule getQueryElementRule() {
		return getQueryElementAccess().getRule();
	}
	
	//Qualifier:
	//	'[' predicate+=Predicate (',' predicate+=Predicate)* ']';
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
	//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? classifier=[ecore::EClassifier];
	public ClassifierPredicateElements getClassifierPredicateAccess() {
		return pClassifierPredicate;
	}
	
	public ParserRule getClassifierPredicateRule() {
		return getClassifierPredicateAccess().getRule();
	}
	
	//AttributePredicate:
	//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? attribute=[ecore::EAttribute] /*CustomScope*/ '='
	//	value=VALUE;
	public AttributePredicateElements getAttributePredicateAccess() {
		return pAttributePredicate;
	}
	
	public ParserRule getAttributePredicateRule() {
		return getAttributePredicateAccess().getRule();
	}
	
	//ReferencePredicate:
	//	(querynamespace=[QueryNamespace] /*DefaultScope*/ '::')? reference=[ecore::EReference] qualifier=Qualifier;
	public ReferencePredicateElements getReferencePredicateAccess() {
		return pReferencePredicate;
	}
	
	public ParserRule getReferencePredicateRule() {
		return getReferencePredicateAccess().getRule();
	}
	
	//VALUE ecore::EJavaObject:
	//	STRING | INT | LONG | DOUBLE | BOOLEAN;
	public VALUEElements getVALUEAccess() {
		return pVALUE;
	}
	
	public ParserRule getVALUERule() {
		return getVALUEAccess().getRule();
	}
	
	//LONG ecore::ELong:
	//	INT ("L" | "l");
	public LONGElements getLONGAccess() {
		return pLONG;
	}
	
	public ParserRule getLONGRule() {
		return getLONGAccess().getRule();
	}
	
	//DOUBLE ecore::EDouble:
	//	INT '.' INT;
	public DOUBLEElements getDOUBLEAccess() {
		return pDOUBLE;
	}
	
	public ParserRule getDOUBLERule() {
		return getDOUBLEAccess().getRule();
	}
	
	//BOOLEAN ecore::EBoolean:
	//	"true" | "false";
	public BOOLEANElements getBOOLEANAccess() {
		return pBOOLEAN;
	}
	
	public ParserRule getBOOLEANRule() {
		return getBOOLEANAccess().getRule();
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

/*
 * generated by Xtext
 */
grammar InternalQPE;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.omg.qpe.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleQPE
entryRuleQPE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQPERule()); }
	iv_ruleQPE=ruleQPE
	{ $current=$iv_ruleQPE.current; }
	EOF;

// Rule QPE
ruleQPE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getQPEAccess().getQueryNamespacesQueryNamespaceParserRuleCall_0_0());
				}
				lv_queryNamespaces_0_0=ruleQueryNamespace
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQPERule());
					}
					add(
						$current,
						"queryNamespaces",
						lv_queryNamespaces_0_0,
						"org.omg.qpe.QPE.QueryNamespace");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQPEAccess().getPathExpressionsPathExpressionParserRuleCall_1_0());
				}
				lv_pathExpressions_1_0=rulePathExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQPERule());
					}
					add(
						$current,
						"pathExpressions",
						lv_pathExpressions_1_0,
						"org.omg.qpe.QPE.PathExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQueryNamespace
entryRuleQueryNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryNamespaceRule()); }
	iv_ruleQueryNamespace=ruleQueryNamespace
	{ $current=$iv_ruleQueryNamespace.current; }
	EOF;

// Rule QueryNamespace
ruleQueryNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='namespace'
		{
			newLeafNode(otherlv_0, grammarAccess.getQueryNamespaceAccess().getNamespaceKeyword_0());
		}
		(
			(
				lv_IRI_1_0=RULE_STRING
				{
					newLeafNode(lv_IRI_1_0, grammarAccess.getQueryNamespaceAccess().getIRISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryNamespaceRule());
					}
					setWithLastConsumed(
						$current,
						"IRI",
						lv_IRI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getQueryNamespaceAccess().getAsKeyword_2_0());
			}
			(
				(
					lv_prefix_3_0=RULE_ID
					{
						newLeafNode(lv_prefix_3_0, grammarAccess.getQueryNamespaceAccess().getPrefixIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQueryNamespaceRule());
						}
						setWithLastConsumed(
							$current,
							"prefix",
							lv_prefix_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePathExpression
entryRulePathExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathExpressionRule()); }
	iv_rulePathExpression=rulePathExpression
	{ $current=$iv_rulePathExpression.current; }
	EOF;

// Rule PathExpression
rulePathExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPathExpressionAccess().getPathExpressionAction_0(),
					$current);
			}
		)
		(
			(
				lv_isRelative_1_0='.'
				{
					newLeafNode(lv_isRelative_1_0, grammarAccess.getPathExpressionAccess().getIsRelativeFullStopKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPathExpressionRule());
					}
					setWithLastConsumed($current, "isRelative", true, ".");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPathExpressionAccess().getQualifierQualifierParserRuleCall_2_0());
				}
				lv_qualifier_2_0=ruleQualifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathExpressionRule());
					}
					set(
						$current,
						"qualifier",
						lv_qualifier_2_0,
						"org.omg.qpe.QPE.Qualifier");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='/'
		{
			newLeafNode(otherlv_3, grammarAccess.getPathExpressionAccess().getSolidusKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPathExpressionAccess().getHeadQueryElementParserRuleCall_4_0());
				}
				lv_head_4_0=ruleQueryElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPathExpressionRule());
					}
					set(
						$current,
						"head",
						lv_head_4_0,
						"org.omg.qpe.QPE.QueryElement");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleQueryElement
entryRuleQueryElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryElementRule()); }
	iv_ruleQueryElement=ruleQueryElement
	{ $current=$iv_ruleQueryElement.current; }
	EOF;

// Rule QueryElement
ruleQueryElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getQueryElementRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getQueryElementAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
					}
				)
			)
			otherlv_1='::'
			{
				newLeafNode(otherlv_1, grammarAccess.getQueryElementAccess().getColonColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQueryElementRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getQueryElementAccess().getFeatureEStructuralFeatureCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryElementAccess().getQualifierQualifierParserRuleCall_2_0());
				}
				lv_qualifier_3_0=ruleQualifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryElementRule());
					}
					set(
						$current,
						"qualifier",
						lv_qualifier_3_0,
						"org.omg.qpe.QPE.Qualifier");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_4='/'
			{
				newLeafNode(otherlv_4, grammarAccess.getQueryElementAccess().getSolidusKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getQueryElementAccess().getNextQueryElementParserRuleCall_3_1_0());
					}
					lv_next_5_0=ruleQueryElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQueryElementRule());
						}
						set(
							$current,
							"next",
							lv_next_5_0,
							"org.omg.qpe.QPE.QueryElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleQualifier
entryRuleQualifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQualifierRule()); }
	iv_ruleQualifier=ruleQualifier
	{ $current=$iv_ruleQualifier.current; }
	EOF;

// Rule Qualifier
ruleQualifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getQualifierAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				(
					(
						lv_index_1_0=RULE_INT
						{
							newLeafNode(lv_index_1_0, grammarAccess.getQualifierAccess().getIndexINTTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getQualifierRule());
							}
							setWithLastConsumed(
								$current,
								"index",
								lv_index_1_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				(
					otherlv_2=','
					{
						newLeafNode(otherlv_2, grammarAccess.getQualifierAccess().getCommaKeyword_1_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_0_1_1_0());
							}
							lv_predicates_3_0=rulePredicate
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getQualifierRule());
								}
								add(
									$current,
									"predicates",
									lv_predicates_3_0,
									"org.omg.qpe.QPE.Predicate");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_0_0());
						}
						lv_predicates_4_0=rulePredicate
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getQualifierRule());
							}
							add(
								$current,
								"predicates",
								lv_predicates_4_0,
								"org.omg.qpe.QPE.Predicate");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getQualifierAccess().getCommaKeyword_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getQualifierAccess().getPredicatesPredicateParserRuleCall_1_1_1_1_0());
							}
							lv_predicates_6_0=rulePredicate
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getQualifierRule());
								}
								add(
									$current,
									"predicates",
									lv_predicates_6_0,
									"org.omg.qpe.QPE.Predicate");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
		)
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getQualifierAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRulePredicate
entryRulePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicateRule()); }
	iv_rulePredicate=rulePredicate
	{ $current=$iv_rulePredicate.current; }
	EOF;

// Rule Predicate
rulePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getClassifierPredicateParserRuleCall_0());
		}
		this_ClassifierPredicate_0=ruleClassifierPredicate
		{
			$current = $this_ClassifierPredicate_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getAttributePredicateParserRuleCall_1());
		}
		this_AttributePredicate_1=ruleAttributePredicate
		{
			$current = $this_AttributePredicate_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPredicateAccess().getReferencePredicateParserRuleCall_2());
		}
		this_ReferencePredicate_2=ruleReferencePredicate
		{
			$current = $this_ReferencePredicate_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClassifierPredicate
entryRuleClassifierPredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierPredicateRule()); }
	iv_ruleClassifierPredicate=ruleClassifierPredicate
	{ $current=$iv_ruleClassifierPredicate.current; }
	EOF;

// Rule ClassifierPredicate
ruleClassifierPredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassifierPredicateRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getClassifierPredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
					}
				)
			)
			otherlv_1='::'
			{
				newLeafNode(otherlv_1, grammarAccess.getClassifierPredicateAccess().getColonColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassifierPredicateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getClassifierPredicateAccess().getClassifierEClassifierCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAttributePredicate
entryRuleAttributePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributePredicateRule()); }
	iv_ruleAttributePredicate=ruleAttributePredicate
	{ $current=$iv_ruleAttributePredicate.current; }
	EOF;

// Rule AttributePredicate
ruleAttributePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributePredicateRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getAttributePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
					}
				)
			)
			otherlv_1='::'
			{
				newLeafNode(otherlv_1, grammarAccess.getAttributePredicateAccess().getColonColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributePredicateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getAttributePredicateAccess().getAttributeEAttributeCrossReference_1_0());
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributePredicateAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributePredicateAccess().getValueVALUEParserRuleCall_3_0());
				}
				lv_value_4_0=ruleVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributePredicateRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"org.omg.qpe.QPE.VALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleReferencePredicate
entryRuleReferencePredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferencePredicateRule()); }
	iv_ruleReferencePredicate=ruleReferencePredicate
	{ $current=$iv_ruleReferencePredicate.current; }
	EOF;

// Rule ReferencePredicate
ruleReferencePredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferencePredicateRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getReferencePredicateAccess().getQueryNamespaceQueryNamespaceCrossReference_0_0_0());
					}
				)
			)
			otherlv_1='::'
			{
				newLeafNode(otherlv_1, grammarAccess.getReferencePredicateAccess().getColonColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferencePredicateRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getReferencePredicateAccess().getReferenceEReferenceCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencePredicateAccess().getQualifierQualifierParserRuleCall_2_0());
				}
				lv_qualifier_3_0=ruleQualifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencePredicateRule());
					}
					set(
						$current,
						"qualifier",
						lv_qualifier_3_0,
						"org.omg.qpe.QPE.Qualifier");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVALUE
entryRuleVALUE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALUERule()); }
	iv_ruleVALUE=ruleVALUE
	{ $current=$iv_ruleVALUE.current.getText(); }
	EOF;

// Rule VALUE
ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getVALUEAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getVALUEAccess().getINTTerminalRuleCall_1());
		}
		    |
		this_LONG_2=RULE_LONG
		{
			$current.merge(this_LONG_2);
		}
		{
			newLeafNode(this_LONG_2, grammarAccess.getVALUEAccess().getLONGTerminalRuleCall_2());
		}
		    |
		this_DOUBLE_3=RULE_DOUBLE
		{
			$current.merge(this_DOUBLE_3);
		}
		{
			newLeafNode(this_DOUBLE_3, grammarAccess.getVALUEAccess().getDOUBLETerminalRuleCall_3());
		}
		    |
		this_BOOLEAN_4=RULE_BOOLEAN
		{
			$current.merge(this_BOOLEAN_4);
		}
		{
			newLeafNode(this_BOOLEAN_4, grammarAccess.getVALUEAccess().getBOOLEANTerminalRuleCall_4());
		}
	)
;

RULE_LONG : RULE_INT ('L'|'l');

RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

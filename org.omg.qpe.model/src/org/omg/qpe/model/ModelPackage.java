/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.qpe.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/SST/QPE/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qpe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.omg.qpe.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.QPEImpl <em>QPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.QPEImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQPE()
	 * @generated
	 */
	int QPE = 0;

	/**
	 * The feature id for the '<em><b>Pathexpressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPE__PATHEXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Querynamespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPE__QUERYNAMESPACES = 1;

	/**
	 * The number of structural features of the '<em>QPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>QPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.QueryElementImpl <em>Query Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.QueryElementImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQueryElement()
	 * @generated
	 */
	int QUERY_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Querynamespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__QUERYNAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__PREV = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__QUALIFIER = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT__FEATURE = 4;

	/**
	 * The number of structural features of the '<em>Query Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Query Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.QualifierImpl <em>Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.QualifierImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 2;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.PredicateImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 3;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.ClassifierPredicateImpl <em>Classifier Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.ClassifierPredicateImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getClassifierPredicate()
	 * @generated
	 */
	int CLASSIFIER_PREDICATE = 4;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PREDICATE__CLASSIFIER = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classifier Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.AttributePredicateImpl <em>Attribute Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.AttributePredicateImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getAttributePredicate()
	 * @generated
	 */
	int ATTRIBUTE_PREDICATE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PREDICATE__VALUE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PREDICATE__ATTRIBUTE = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.ReferencePredicateImpl <em>Reference Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.ReferencePredicateImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getReferencePredicate()
	 * @generated
	 */
	int REFERENCE_PREDICATE = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PREDICATE__REFERENCE = PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PREDICATE__QUERY = PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PREDICATE_FEATURE_COUNT = PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_PREDICATE_OPERATION_COUNT = PREDICATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.QueryNamespaceImpl <em>Query Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.QueryNamespaceImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQueryNamespace()
	 * @generated
	 */
	int QUERY_NAMESPACE = 7;

	/**
	 * The feature id for the '<em><b>IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_NAMESPACE__IRI = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_NAMESPACE__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Query Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_NAMESPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Query Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.qpe.model.impl.PathExpressionImpl <em>Path Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.qpe.model.impl.PathExpressionImpl
	 * @see org.omg.qpe.model.impl.ModelPackageImpl#getPathExpression()
	 * @generated
	 */
	int PATH_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION__HEAD = 0;

	/**
	 * The number of structural features of the '<em>Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.QPE <em>QPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QPE</em>'.
	 * @see org.omg.qpe.model.QPE
	 * @generated
	 */
	EClass getQPE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.qpe.model.QPE#getPathexpressions <em>Pathexpressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pathexpressions</em>'.
	 * @see org.omg.qpe.model.QPE#getPathexpressions()
	 * @see #getQPE()
	 * @generated
	 */
	EReference getQPE_Pathexpressions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.qpe.model.QPE#getQuerynamespaces <em>Querynamespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Querynamespaces</em>'.
	 * @see org.omg.qpe.model.QPE#getQuerynamespaces()
	 * @see #getQPE()
	 * @generated
	 */
	EReference getQPE_Querynamespaces();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.QueryElement <em>Query Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Element</em>'.
	 * @see org.omg.qpe.model.QueryElement
	 * @generated
	 */
	EClass getQueryElement();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.QueryElement#getQuerynamespace <em>Querynamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Querynamespace</em>'.
	 * @see org.omg.qpe.model.QueryElement#getQuerynamespace()
	 * @see #getQueryElement()
	 * @generated
	 */
	EReference getQueryElement_Querynamespace();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.qpe.model.QueryElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.omg.qpe.model.QueryElement#getNext()
	 * @see #getQueryElement()
	 * @generated
	 */
	EReference getQueryElement_Next();

	/**
	 * Returns the meta object for the container reference '{@link org.omg.qpe.model.QueryElement#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Prev</em>'.
	 * @see org.omg.qpe.model.QueryElement#getPrev()
	 * @see #getQueryElement()
	 * @generated
	 */
	EReference getQueryElement_Prev();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.qpe.model.QueryElement#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see org.omg.qpe.model.QueryElement#getQualifier()
	 * @see #getQueryElement()
	 * @generated
	 */
	EReference getQueryElement_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.QueryElement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.omg.qpe.model.QueryElement#getFeature()
	 * @see #getQueryElement()
	 * @generated
	 */
	EReference getQueryElement_Feature();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier</em>'.
	 * @see org.omg.qpe.model.Qualifier
	 * @generated
	 */
	EClass getQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.qpe.model.Qualifier#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicate</em>'.
	 * @see org.omg.qpe.model.Qualifier#getPredicate()
	 * @see #getQualifier()
	 * @generated
	 */
	EReference getQualifier_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.qpe.model.Qualifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.omg.qpe.model.Qualifier#getIndex()
	 * @see #getQualifier()
	 * @generated
	 */
	EAttribute getQualifier_Index();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.omg.qpe.model.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.ClassifierPredicate <em>Classifier Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Predicate</em>'.
	 * @see org.omg.qpe.model.ClassifierPredicate
	 * @generated
	 */
	EClass getClassifierPredicate();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.ClassifierPredicate#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see org.omg.qpe.model.ClassifierPredicate#getClassifier()
	 * @see #getClassifierPredicate()
	 * @generated
	 */
	EReference getClassifierPredicate_Classifier();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.AttributePredicate <em>Attribute Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Predicate</em>'.
	 * @see org.omg.qpe.model.AttributePredicate
	 * @generated
	 */
	EClass getAttributePredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.qpe.model.AttributePredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.qpe.model.AttributePredicate#getValue()
	 * @see #getAttributePredicate()
	 * @generated
	 */
	EAttribute getAttributePredicate_Value();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.AttributePredicate#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.omg.qpe.model.AttributePredicate#getAttribute()
	 * @see #getAttributePredicate()
	 * @generated
	 */
	EReference getAttributePredicate_Attribute();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.ReferencePredicate <em>Reference Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Predicate</em>'.
	 * @see org.omg.qpe.model.ReferencePredicate
	 * @generated
	 */
	EClass getReferencePredicate();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.ReferencePredicate#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.omg.qpe.model.ReferencePredicate#getReference()
	 * @see #getReferencePredicate()
	 * @generated
	 */
	EReference getReferencePredicate_Reference();

	/**
	 * Returns the meta object for the reference '{@link org.omg.qpe.model.ReferencePredicate#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see org.omg.qpe.model.ReferencePredicate#getQuery()
	 * @see #getReferencePredicate()
	 * @generated
	 */
	EReference getReferencePredicate_Query();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.QueryNamespace <em>Query Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Namespace</em>'.
	 * @see org.omg.qpe.model.QueryNamespace
	 * @generated
	 */
	EClass getQueryNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.qpe.model.QueryNamespace#getIRI <em>IRI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IRI</em>'.
	 * @see org.omg.qpe.model.QueryNamespace#getIRI()
	 * @see #getQueryNamespace()
	 * @generated
	 */
	EAttribute getQueryNamespace_IRI();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.qpe.model.QueryNamespace#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.omg.qpe.model.QueryNamespace#getPrefix()
	 * @see #getQueryNamespace()
	 * @generated
	 */
	EAttribute getQueryNamespace_Prefix();

	/**
	 * Returns the meta object for class '{@link org.omg.qpe.model.PathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression</em>'.
	 * @see org.omg.qpe.model.PathExpression
	 * @generated
	 */
	EClass getPathExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.qpe.model.PathExpression#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see org.omg.qpe.model.PathExpression#getHead()
	 * @see #getPathExpression()
	 * @generated
	 */
	EReference getPathExpression_Head();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.QPEImpl <em>QPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.QPEImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQPE()
		 * @generated
		 */
		EClass QPE = eINSTANCE.getQPE();

		/**
		 * The meta object literal for the '<em><b>Pathexpressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QPE__PATHEXPRESSIONS = eINSTANCE.getQPE_Pathexpressions();

		/**
		 * The meta object literal for the '<em><b>Querynamespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QPE__QUERYNAMESPACES = eINSTANCE.getQPE_Querynamespaces();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.QueryElementImpl <em>Query Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.QueryElementImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQueryElement()
		 * @generated
		 */
		EClass QUERY_ELEMENT = eINSTANCE.getQueryElement();

		/**
		 * The meta object literal for the '<em><b>Querynamespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ELEMENT__QUERYNAMESPACE = eINSTANCE.getQueryElement_Querynamespace();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ELEMENT__NEXT = eINSTANCE.getQueryElement_Next();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ELEMENT__PREV = eINSTANCE.getQueryElement_Prev();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ELEMENT__QUALIFIER = eINSTANCE.getQueryElement_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ELEMENT__FEATURE = eINSTANCE.getQueryElement_Feature();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.QualifierImpl <em>Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.QualifierImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQualifier()
		 * @generated
		 */
		EClass QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER__PREDICATE = eINSTANCE.getQualifier_Predicate();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIER__INDEX = eINSTANCE.getQualifier_Index();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.PredicateImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.ClassifierPredicateImpl <em>Classifier Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.ClassifierPredicateImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getClassifierPredicate()
		 * @generated
		 */
		EClass CLASSIFIER_PREDICATE = eINSTANCE.getClassifierPredicate();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_PREDICATE__CLASSIFIER = eINSTANCE.getClassifierPredicate_Classifier();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.AttributePredicateImpl <em>Attribute Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.AttributePredicateImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getAttributePredicate()
		 * @generated
		 */
		EClass ATTRIBUTE_PREDICATE = eINSTANCE.getAttributePredicate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_PREDICATE__VALUE = eINSTANCE.getAttributePredicate_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PREDICATE__ATTRIBUTE = eINSTANCE.getAttributePredicate_Attribute();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.ReferencePredicateImpl <em>Reference Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.ReferencePredicateImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getReferencePredicate()
		 * @generated
		 */
		EClass REFERENCE_PREDICATE = eINSTANCE.getReferencePredicate();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_PREDICATE__REFERENCE = eINSTANCE.getReferencePredicate_Reference();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_PREDICATE__QUERY = eINSTANCE.getReferencePredicate_Query();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.QueryNamespaceImpl <em>Query Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.QueryNamespaceImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getQueryNamespace()
		 * @generated
		 */
		EClass QUERY_NAMESPACE = eINSTANCE.getQueryNamespace();

		/**
		 * The meta object literal for the '<em><b>IRI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_NAMESPACE__IRI = eINSTANCE.getQueryNamespace_IRI();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_NAMESPACE__PREFIX = eINSTANCE.getQueryNamespace_Prefix();

		/**
		 * The meta object literal for the '{@link org.omg.qpe.model.impl.PathExpressionImpl <em>Path Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.qpe.model.impl.PathExpressionImpl
		 * @see org.omg.qpe.model.impl.ModelPackageImpl#getPathExpression()
		 * @generated
		 */
		EClass PATH_EXPRESSION = eINSTANCE.getPathExpression();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_EXPRESSION__HEAD = eINSTANCE.getPathExpression_Head();

	}

} //ModelPackage

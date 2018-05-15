/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.qpe.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.omg.qpe.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QPE</em>'.
	 * @generated
	 */
	QPE createQPE();

	/**
	 * Returns a new object of class '<em>Query Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Element</em>'.
	 * @generated
	 */
	QueryElement createQueryElement();

	/**
	 * Returns a new object of class '<em>Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier</em>'.
	 * @generated
	 */
	Qualifier createQualifier();

	/**
	 * Returns a new object of class '<em>Classifier Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Predicate</em>'.
	 * @generated
	 */
	ClassifierPredicate createClassifierPredicate();

	/**
	 * Returns a new object of class '<em>Attribute Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Predicate</em>'.
	 * @generated
	 */
	AttributePredicate createAttributePredicate();

	/**
	 * Returns a new object of class '<em>Reference Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Predicate</em>'.
	 * @generated
	 */
	ReferencePredicate createReferencePredicate();

	/**
	 * Returns a new object of class '<em>Query Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Namespace</em>'.
	 * @generated
	 */
	QueryNamespace createQueryNamespace();

	/**
	 * Returns a new object of class '<em>Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Expression</em>'.
	 * @generated
	 */
	PathExpression createPathExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory

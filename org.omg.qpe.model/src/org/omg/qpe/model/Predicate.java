/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.Predicate#getQueryNamespace <em>Query Namespace</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getPredicate()
 * @model abstract="true"
 * @generated
 */
public interface Predicate extends EObject {

	/**
	 * Returns the value of the '<em><b>Query Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Namespace</em>' reference.
	 * @see #setQueryNamespace(QueryNamespace)
	 * @see org.omg.qpe.model.ModelPackage#getPredicate_QueryNamespace()
	 * @model
	 * @generated
	 */
	QueryNamespace getQueryNamespace();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.Predicate#getQueryNamespace <em>Query Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Namespace</em>' reference.
	 * @see #getQueryNamespace()
	 * @generated
	 */
	void setQueryNamespace(QueryNamespace value);
} // Predicate

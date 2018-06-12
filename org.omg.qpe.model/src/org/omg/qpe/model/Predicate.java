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
 *   <li>{@link org.omg.qpe.model.Predicate#getQuerynamespace <em>Querynamespace</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getPredicate()
 * @model abstract="true"
 * @generated
 */
public interface Predicate extends EObject {

	/**
	 * Returns the value of the '<em><b>Querynamespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Querynamespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Querynamespace</em>' reference.
	 * @see #setQuerynamespace(QueryNamespace)
	 * @see org.omg.qpe.model.ModelPackage#getPredicate_Querynamespace()
	 * @model
	 * @generated
	 */
	QueryNamespace getQuerynamespace();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.Predicate#getQuerynamespace <em>Querynamespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Querynamespace</em>' reference.
	 * @see #getQuerynamespace()
	 * @generated
	 */
	void setQuerynamespace(QueryNamespace value);
} // Predicate

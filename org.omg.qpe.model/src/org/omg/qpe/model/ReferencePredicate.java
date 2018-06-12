/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.ReferencePredicate#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.qpe.model.ReferencePredicate#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getReferencePredicate()
 * @model
 * @generated
 */
public interface ReferencePredicate extends Predicate {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EReference)
	 * @see org.omg.qpe.model.ModelPackage#getReferencePredicate_Reference()
	 * @model required="true"
	 * @generated
	 */
	EReference getReference();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.ReferencePredicate#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(Qualifier)
	 * @see org.omg.qpe.model.ModelPackage#getReferencePredicate_Qualifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Qualifier getQualifier();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.ReferencePredicate#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Qualifier value);

} // ReferencePredicate

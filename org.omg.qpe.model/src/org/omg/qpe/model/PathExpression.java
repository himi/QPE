/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.PathExpression#getHead <em>Head</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getPathExpression()
 * @model
 * @generated
 */
public interface PathExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(QueryElement)
	 * @see org.omg.qpe.model.ModelPackage#getPathExpression_Head()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryElement getHead();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.PathExpression#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(QueryElement value);

} // PathExpression

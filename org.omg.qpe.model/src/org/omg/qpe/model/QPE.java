/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.QPE#getPathexpressions <em>Pathexpressions</em>}</li>
 *   <li>{@link org.omg.qpe.model.QPE#getQuerynamespaces <em>Querynamespaces</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getQPE()
 * @model
 * @generated
 */
public interface QPE extends EObject {
	/**
	 * Returns the value of the '<em><b>Pathexpressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.qpe.model.PathExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathexpressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathexpressions</em>' containment reference list.
	 * @see org.omg.qpe.model.ModelPackage#getQPE_Pathexpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathExpression> getPathexpressions();

	/**
	 * Returns the value of the '<em><b>Querynamespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.qpe.model.QueryNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Querynamespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Querynamespaces</em>' containment reference list.
	 * @see org.omg.qpe.model.ModelPackage#getQPE_Querynamespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryNamespace> getQuerynamespaces();

} // QPE

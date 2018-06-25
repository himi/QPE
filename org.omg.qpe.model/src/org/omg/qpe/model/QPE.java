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
 *   <li>{@link org.omg.qpe.model.QPE#getPathExpressions <em>Path Expressions</em>}</li>
 *   <li>{@link org.omg.qpe.model.QPE#getQueryNamespaces <em>Query Namespaces</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getQPE()
 * @model
 * @generated
 */
public interface QPE extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.qpe.model.PathExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Expressions</em>' containment reference list.
	 * @see org.omg.qpe.model.ModelPackage#getQPE_PathExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathExpression> getPathExpressions();

	/**
	 * Returns the value of the '<em><b>Query Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.qpe.model.QueryNamespace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Namespaces</em>' containment reference list.
	 * @see org.omg.qpe.model.ModelPackage#getQPE_QueryNamespaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryNamespace> getQueryNamespaces();

} // QPE

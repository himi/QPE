/**
 */
package org.omg.qpe.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.qpe.model.ModelPackage;
import org.omg.qpe.model.PathExpression;
import org.omg.qpe.model.QPE;
import org.omg.qpe.model.QueryNamespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.impl.QPEImpl#getPathExpressions <em>Path Expressions</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QPEImpl#getQueryNamespaces <em>Query Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QPEImpl extends EObjectImpl implements QPE {
	/**
	 * The cached value of the '{@link #getPathExpressions() <em>Path Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<PathExpression> pathExpressions;

	/**
	 * The cached value of the '{@link #getQueryNamespaces() <em>Query Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryNamespace> queryNamespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.QPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathExpression> getPathExpressions() {
		if (pathExpressions == null) {
			pathExpressions = new EObjectContainmentEList<PathExpression>(PathExpression.class, this, ModelPackage.QPE__PATH_EXPRESSIONS);
		}
		return pathExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryNamespace> getQueryNamespaces() {
		if (queryNamespaces == null) {
			queryNamespaces = new EObjectContainmentEList<QueryNamespace>(QueryNamespace.class, this, ModelPackage.QPE__QUERY_NAMESPACES);
		}
		return queryNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.QPE__PATH_EXPRESSIONS:
				return ((InternalEList<?>)getPathExpressions()).basicRemove(otherEnd, msgs);
			case ModelPackage.QPE__QUERY_NAMESPACES:
				return ((InternalEList<?>)getQueryNamespaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QPE__PATH_EXPRESSIONS:
				return getPathExpressions();
			case ModelPackage.QPE__QUERY_NAMESPACES:
				return getQueryNamespaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.QPE__PATH_EXPRESSIONS:
				getPathExpressions().clear();
				getPathExpressions().addAll((Collection<? extends PathExpression>)newValue);
				return;
			case ModelPackage.QPE__QUERY_NAMESPACES:
				getQueryNamespaces().clear();
				getQueryNamespaces().addAll((Collection<? extends QueryNamespace>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.QPE__PATH_EXPRESSIONS:
				getPathExpressions().clear();
				return;
			case ModelPackage.QPE__QUERY_NAMESPACES:
				getQueryNamespaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.QPE__PATH_EXPRESSIONS:
				return pathExpressions != null && !pathExpressions.isEmpty();
			case ModelPackage.QPE__QUERY_NAMESPACES:
				return queryNamespaces != null && !queryNamespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QPEImpl

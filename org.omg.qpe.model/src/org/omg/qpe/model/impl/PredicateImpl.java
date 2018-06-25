/**
 */
package org.omg.qpe.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.omg.qpe.model.ModelPackage;
import org.omg.qpe.model.Predicate;
import org.omg.qpe.model.QueryNamespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.impl.PredicateImpl#getQueryNamespace <em>Query Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PredicateImpl extends EObjectImpl implements Predicate {
	/**
	 * The cached value of the '{@link #getQueryNamespace() <em>Query Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryNamespace()
	 * @generated
	 * @ordered
	 */
	protected QueryNamespace queryNamespace;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNamespace getQueryNamespace() {
		if (queryNamespace != null && queryNamespace.eIsProxy()) {
			InternalEObject oldQueryNamespace = (InternalEObject)queryNamespace;
			queryNamespace = (QueryNamespace)eResolveProxy(oldQueryNamespace);
			if (queryNamespace != oldQueryNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PREDICATE__QUERY_NAMESPACE, oldQueryNamespace, queryNamespace));
			}
		}
		return queryNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNamespace basicGetQueryNamespace() {
		return queryNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryNamespace(QueryNamespace newQueryNamespace) {
		QueryNamespace oldQueryNamespace = queryNamespace;
		queryNamespace = newQueryNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PREDICATE__QUERY_NAMESPACE, oldQueryNamespace, queryNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PREDICATE__QUERY_NAMESPACE:
				if (resolve) return getQueryNamespace();
				return basicGetQueryNamespace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PREDICATE__QUERY_NAMESPACE:
				setQueryNamespace((QueryNamespace)newValue);
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
			case ModelPackage.PREDICATE__QUERY_NAMESPACE:
				setQueryNamespace((QueryNamespace)null);
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
			case ModelPackage.PREDICATE__QUERY_NAMESPACE:
				return queryNamespace != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateImpl

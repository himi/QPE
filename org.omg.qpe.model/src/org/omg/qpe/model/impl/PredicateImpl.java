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
 *   <li>{@link org.omg.qpe.model.impl.PredicateImpl#getQuerynamespace <em>Querynamespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PredicateImpl extends EObjectImpl implements Predicate {
	/**
	 * The cached value of the '{@link #getQuerynamespace() <em>Querynamespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuerynamespace()
	 * @generated
	 * @ordered
	 */
	protected QueryNamespace querynamespace;

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
	public QueryNamespace getQuerynamespace() {
		if (querynamespace != null && querynamespace.eIsProxy()) {
			InternalEObject oldQuerynamespace = (InternalEObject)querynamespace;
			querynamespace = (QueryNamespace)eResolveProxy(oldQuerynamespace);
			if (querynamespace != oldQuerynamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PREDICATE__QUERYNAMESPACE, oldQuerynamespace, querynamespace));
			}
		}
		return querynamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNamespace basicGetQuerynamespace() {
		return querynamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuerynamespace(QueryNamespace newQuerynamespace) {
		QueryNamespace oldQuerynamespace = querynamespace;
		querynamespace = newQuerynamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PREDICATE__QUERYNAMESPACE, oldQuerynamespace, querynamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PREDICATE__QUERYNAMESPACE:
				if (resolve) return getQuerynamespace();
				return basicGetQuerynamespace();
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
			case ModelPackage.PREDICATE__QUERYNAMESPACE:
				setQuerynamespace((QueryNamespace)newValue);
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
			case ModelPackage.PREDICATE__QUERYNAMESPACE:
				setQuerynamespace((QueryNamespace)null);
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
			case ModelPackage.PREDICATE__QUERYNAMESPACE:
				return querynamespace != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateImpl

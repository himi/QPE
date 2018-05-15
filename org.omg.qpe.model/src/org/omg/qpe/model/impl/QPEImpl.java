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
 *   <li>{@link org.omg.qpe.model.impl.QPEImpl#getPathexpressions <em>Pathexpressions</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QPEImpl#getQuerynamespaces <em>Querynamespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QPEImpl extends EObjectImpl implements QPE {
	/**
	 * The cached value of the '{@link #getPathexpressions() <em>Pathexpressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathexpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<PathExpression> pathexpressions;

	/**
	 * The cached value of the '{@link #getQuerynamespaces() <em>Querynamespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuerynamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryNamespace> querynamespaces;

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
	public EList<PathExpression> getPathexpressions() {
		if (pathexpressions == null) {
			pathexpressions = new EObjectContainmentEList<PathExpression>(PathExpression.class, this, ModelPackage.QPE__PATHEXPRESSIONS);
		}
		return pathexpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryNamespace> getQuerynamespaces() {
		if (querynamespaces == null) {
			querynamespaces = new EObjectContainmentEList<QueryNamespace>(QueryNamespace.class, this, ModelPackage.QPE__QUERYNAMESPACES);
		}
		return querynamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.QPE__PATHEXPRESSIONS:
				return ((InternalEList<?>)getPathexpressions()).basicRemove(otherEnd, msgs);
			case ModelPackage.QPE__QUERYNAMESPACES:
				return ((InternalEList<?>)getQuerynamespaces()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.QPE__PATHEXPRESSIONS:
				return getPathexpressions();
			case ModelPackage.QPE__QUERYNAMESPACES:
				return getQuerynamespaces();
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
			case ModelPackage.QPE__PATHEXPRESSIONS:
				getPathexpressions().clear();
				getPathexpressions().addAll((Collection<? extends PathExpression>)newValue);
				return;
			case ModelPackage.QPE__QUERYNAMESPACES:
				getQuerynamespaces().clear();
				getQuerynamespaces().addAll((Collection<? extends QueryNamespace>)newValue);
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
			case ModelPackage.QPE__PATHEXPRESSIONS:
				getPathexpressions().clear();
				return;
			case ModelPackage.QPE__QUERYNAMESPACES:
				getQuerynamespaces().clear();
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
			case ModelPackage.QPE__PATHEXPRESSIONS:
				return pathexpressions != null && !pathexpressions.isEmpty();
			case ModelPackage.QPE__QUERYNAMESPACES:
				return querynamespaces != null && !querynamespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QPEImpl

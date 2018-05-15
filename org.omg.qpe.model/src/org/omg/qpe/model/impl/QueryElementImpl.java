/**
 */
package org.omg.qpe.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.omg.qpe.model.ModelPackage;
import org.omg.qpe.model.Qualifier;
import org.omg.qpe.model.QueryElement;
import org.omg.qpe.model.QueryNamespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.impl.QueryElementImpl#getQuerynamespace <em>Querynamespace</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QueryElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QueryElementImpl#getPrev <em>Prev</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QueryElementImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.omg.qpe.model.impl.QueryElementImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryElementImpl extends EObjectImpl implements QueryElement {
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected QueryElement next;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected Qualifier qualifier;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.QUERY_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE, oldQuerynamespace, querynamespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE, oldQuerynamespace, querynamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElement getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(QueryElement newNext, NotificationChain msgs) {
		QueryElement oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(QueryElement newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, ModelPackage.QUERY_ELEMENT__PREV, QueryElement.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ModelPackage.QUERY_ELEMENT__PREV, QueryElement.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElement getPrev() {
		if (eContainerFeatureID() != ModelPackage.QUERY_ELEMENT__PREV) return null;
		return (QueryElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrev(QueryElement newPrev, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrev, ModelPackage.QUERY_ELEMENT__PREV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev(QueryElement newPrev) {
		if (newPrev != eInternalContainer() || (eContainerFeatureID() != ModelPackage.QUERY_ELEMENT__PREV && newPrev != null)) {
			if (EcoreUtil.isAncestor(this, newPrev))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrev != null)
				msgs = ((InternalEObject)newPrev).eInverseAdd(this, ModelPackage.QUERY_ELEMENT__NEXT, QueryElement.class, msgs);
			msgs = basicSetPrev(newPrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__PREV, newPrev, newPrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifier getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualifier(Qualifier newQualifier, NotificationChain msgs) {
		Qualifier oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__QUALIFIER, oldQualifier, newQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(Qualifier newQualifier) {
		if (newQualifier != qualifier) {
			NotificationChain msgs = null;
			if (qualifier != null)
				msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.QUERY_ELEMENT__QUALIFIER, null, msgs);
			if (newQualifier != null)
				msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.QUERY_ELEMENT__QUALIFIER, null, msgs);
			msgs = basicSetQualifier(newQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__QUALIFIER, newQualifier, newQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.QUERY_ELEMENT__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_ELEMENT__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.QUERY_ELEMENT__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.QUERY_ELEMENT__NEXT, null, msgs);
				return basicSetNext((QueryElement)otherEnd, msgs);
			case ModelPackage.QUERY_ELEMENT__PREV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrev((QueryElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.QUERY_ELEMENT__NEXT:
				return basicSetNext(null, msgs);
			case ModelPackage.QUERY_ELEMENT__PREV:
				return basicSetPrev(null, msgs);
			case ModelPackage.QUERY_ELEMENT__QUALIFIER:
				return basicSetQualifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.QUERY_ELEMENT__PREV:
				return eInternalContainer().eInverseRemove(this, ModelPackage.QUERY_ELEMENT__NEXT, QueryElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE:
				if (resolve) return getQuerynamespace();
				return basicGetQuerynamespace();
			case ModelPackage.QUERY_ELEMENT__NEXT:
				return getNext();
			case ModelPackage.QUERY_ELEMENT__PREV:
				return getPrev();
			case ModelPackage.QUERY_ELEMENT__QUALIFIER:
				return getQualifier();
			case ModelPackage.QUERY_ELEMENT__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE:
				setQuerynamespace((QueryNamespace)newValue);
				return;
			case ModelPackage.QUERY_ELEMENT__NEXT:
				setNext((QueryElement)newValue);
				return;
			case ModelPackage.QUERY_ELEMENT__PREV:
				setPrev((QueryElement)newValue);
				return;
			case ModelPackage.QUERY_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)newValue);
				return;
			case ModelPackage.QUERY_ELEMENT__FEATURE:
				setFeature((EStructuralFeature)newValue);
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
			case ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE:
				setQuerynamespace((QueryNamespace)null);
				return;
			case ModelPackage.QUERY_ELEMENT__NEXT:
				setNext((QueryElement)null);
				return;
			case ModelPackage.QUERY_ELEMENT__PREV:
				setPrev((QueryElement)null);
				return;
			case ModelPackage.QUERY_ELEMENT__QUALIFIER:
				setQualifier((Qualifier)null);
				return;
			case ModelPackage.QUERY_ELEMENT__FEATURE:
				setFeature((EStructuralFeature)null);
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
			case ModelPackage.QUERY_ELEMENT__QUERYNAMESPACE:
				return querynamespace != null;
			case ModelPackage.QUERY_ELEMENT__NEXT:
				return next != null;
			case ModelPackage.QUERY_ELEMENT__PREV:
				return getPrev() != null;
			case ModelPackage.QUERY_ELEMENT__QUALIFIER:
				return qualifier != null;
			case ModelPackage.QUERY_ELEMENT__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryElementImpl

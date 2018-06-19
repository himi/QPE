/**
 */
package org.omg.qpe.model;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.qpe.model.QueryElement#getQuerynamespace <em>Querynamespace</em>}</li>
 *   <li>{@link org.omg.qpe.model.QueryElement#getNext <em>Next</em>}</li>
 *   <li>{@link org.omg.qpe.model.QueryElement#getPrev <em>Prev</em>}</li>
 *   <li>{@link org.omg.qpe.model.QueryElement#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.omg.qpe.model.QueryElement#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.qpe.model.ModelPackage#getQueryElement()
 * @model
 * @generated
 */
public interface QueryElement extends EObject {
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
	 * @see org.omg.qpe.model.ModelPackage#getQueryElement_Querynamespace()
	 * @model
	 * @generated
	 */
	QueryNamespace getQuerynamespace();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.QueryElement#getQuerynamespace <em>Querynamespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Querynamespace</em>' reference.
	 * @see #getQuerynamespace()
	 * @generated
	 */
	void setQuerynamespace(QueryNamespace value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.qpe.model.QueryElement#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(QueryElement)
	 * @see org.omg.qpe.model.ModelPackage#getQueryElement_Next()
	 * @see org.omg.qpe.model.QueryElement#getPrev
	 * @model opposite="prev" containment="true"
	 * @generated
	 */
	QueryElement getNext();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.QueryElement#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(QueryElement value);

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.qpe.model.QueryElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' container reference.
	 * @see #setPrev(QueryElement)
	 * @see org.omg.qpe.model.ModelPackage#getQueryElement_Prev()
	 * @see org.omg.qpe.model.QueryElement#getNext
	 * @model opposite="next" transient="false"
	 * @generated
	 */
	QueryElement getPrev();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.QueryElement#getPrev <em>Prev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev</em>' container reference.
	 * @see #getPrev()
	 * @generated
	 */
	void setPrev(QueryElement value);

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
	 * @see org.omg.qpe.model.ModelPackage#getQueryElement_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	Qualifier getQualifier();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.QueryElement#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Qualifier value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.omg.qpe.model.ModelPackage#getQueryElement_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.omg.qpe.model.QueryElement#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EClassifier getEType();

} // QueryElement

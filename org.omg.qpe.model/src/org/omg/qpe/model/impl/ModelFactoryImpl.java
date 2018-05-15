/**
 */
package org.omg.qpe.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.qpe.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.QPE: return createQPE();
			case ModelPackage.QUERY_ELEMENT: return createQueryElement();
			case ModelPackage.QUALIFIER: return createQualifier();
			case ModelPackage.CLASSIFIER_PREDICATE: return createClassifierPredicate();
			case ModelPackage.ATTRIBUTE_PREDICATE: return createAttributePredicate();
			case ModelPackage.REFERENCE_PREDICATE: return createReferencePredicate();
			case ModelPackage.QUERY_NAMESPACE: return createQueryNamespace();
			case ModelPackage.PATH_EXPRESSION: return createPathExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPE createQPE() {
		QPEImpl qpe = new QPEImpl();
		return qpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryElement createQueryElement() {
		QueryElementImpl queryElement = new QueryElementImpl();
		return queryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifier createQualifier() {
		QualifierImpl qualifier = new QualifierImpl();
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierPredicate createClassifierPredicate() {
		ClassifierPredicateImpl classifierPredicate = new ClassifierPredicateImpl();
		return classifierPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePredicate createAttributePredicate() {
		AttributePredicateImpl attributePredicate = new AttributePredicateImpl();
		return attributePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePredicate createReferencePredicate() {
		ReferencePredicateImpl referencePredicate = new ReferencePredicateImpl();
		return referencePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryNamespace createQueryNamespace() {
		QueryNamespaceImpl queryNamespace = new QueryNamespaceImpl();
		return queryNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathExpression createPathExpression() {
		PathExpressionImpl pathExpression = new PathExpressionImpl();
		return pathExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl

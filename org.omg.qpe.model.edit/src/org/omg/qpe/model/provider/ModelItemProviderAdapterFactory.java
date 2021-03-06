/**
 */
package org.omg.qpe.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.omg.qpe.model.util.ModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.QPE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QPEItemProvider qpeItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.QPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQPEAdapter() {
		if (qpeItemProvider == null) {
			qpeItemProvider = new QPEItemProvider(this);
		}

		return qpeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.QueryElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryElementItemProvider queryElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.QueryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryElementAdapter() {
		if (queryElementItemProvider == null) {
			queryElementItemProvider = new QueryElementItemProvider(this);
		}

		return queryElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.Qualifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifierItemProvider qualifierItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualifierAdapter() {
		if (qualifierItemProvider == null) {
			qualifierItemProvider = new QualifierItemProvider(this);
		}

		return qualifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.ClassifierPredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierPredicateItemProvider classifierPredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.ClassifierPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierPredicateAdapter() {
		if (classifierPredicateItemProvider == null) {
			classifierPredicateItemProvider = new ClassifierPredicateItemProvider(this);
		}

		return classifierPredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.AttributePredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePredicateItemProvider attributePredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.AttributePredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributePredicateAdapter() {
		if (attributePredicateItemProvider == null) {
			attributePredicateItemProvider = new AttributePredicateItemProvider(this);
		}

		return attributePredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.ReferencePredicate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencePredicateItemProvider referencePredicateItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.ReferencePredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencePredicateAdapter() {
		if (referencePredicateItemProvider == null) {
			referencePredicateItemProvider = new ReferencePredicateItemProvider(this);
		}

		return referencePredicateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.QueryNamespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryNamespaceItemProvider queryNamespaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.QueryNamespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryNamespaceAdapter() {
		if (queryNamespaceItemProvider == null) {
			queryNamespaceItemProvider = new QueryNamespaceItemProvider(this);
		}

		return queryNamespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.omg.qpe.model.PathExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathExpressionItemProvider pathExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link org.omg.qpe.model.PathExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPathExpressionAdapter() {
		if (pathExpressionItemProvider == null) {
			pathExpressionItemProvider = new PathExpressionItemProvider(this);
		}

		return pathExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (qpeItemProvider != null) qpeItemProvider.dispose();
		if (queryElementItemProvider != null) queryElementItemProvider.dispose();
		if (qualifierItemProvider != null) qualifierItemProvider.dispose();
		if (classifierPredicateItemProvider != null) classifierPredicateItemProvider.dispose();
		if (attributePredicateItemProvider != null) attributePredicateItemProvider.dispose();
		if (referencePredicateItemProvider != null) referencePredicateItemProvider.dispose();
		if (queryNamespaceItemProvider != null) queryNamespaceItemProvider.dispose();
		if (pathExpressionItemProvider != null) pathExpressionItemProvider.dispose();
	}

}

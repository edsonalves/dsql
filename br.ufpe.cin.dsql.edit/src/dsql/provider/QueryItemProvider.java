/**
 */
package dsql.provider;


import dsql.DsqlFactory;
import dsql.DsqlPackage;
import dsql.Query;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsql.Query} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addLimitOffsetPropertyDescriptor(object);
			addLimitRowCountPropertyDescriptor(object);
			addSetQuantifierPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Query_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Query_name_feature", "_UI_Query_type"),
				 DsqlPackage.Literals.QUERY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Limit Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Query_limitOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Query_limitOffset_feature", "_UI_Query_type"),
				 DsqlPackage.Literals.QUERY__LIMIT_OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Limit Row Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLimitRowCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Query_limitRowCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Query_limitRowCount_feature", "_UI_Query_type"),
				 DsqlPackage.Literals.QUERY__LIMIT_ROW_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Set Quantifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetQuantifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Query_setQuantifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Query_setQuantifier_feature", "_UI_Query_type"),
				 DsqlPackage.Literals.QUERY__SET_QUANTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DsqlPackage.Literals.QUERY__SELECT);
			childrenFeatures.add(DsqlPackage.Literals.QUERY__FROM);
			childrenFeatures.add(DsqlPackage.Literals.QUERY__WHERE_HAVING);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Query.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Query"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Query)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Query_type") :
			getString("_UI_Query_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Query.class)) {
			case DsqlPackage.QUERY__NAME:
			case DsqlPackage.QUERY__LIMIT_OFFSET:
			case DsqlPackage.QUERY__LIMIT_ROW_COUNT:
			case DsqlPackage.QUERY__SET_QUANTIFIER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DsqlPackage.QUERY__SELECT:
			case DsqlPackage.QUERY__FROM:
			case DsqlPackage.QUERY__WHERE_HAVING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__SELECT,
				 DsqlFactory.eINSTANCE.createUnary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__SELECT,
				 DsqlFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__SELECT,
				 DsqlFactory.eINSTANCE.createTernary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__SELECT,
				 DsqlFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__FROM,
				 DsqlFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__FROM,
				 DsqlFactory.eINSTANCE.createUnary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__FROM,
				 DsqlFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__FROM,
				 DsqlFactory.eINSTANCE.createTernary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__FROM,
				 DsqlFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__WHERE_HAVING,
				 DsqlFactory.eINSTANCE.createUnary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__WHERE_HAVING,
				 DsqlFactory.eINSTANCE.createBinary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__WHERE_HAVING,
				 DsqlFactory.eINSTANCE.createTernary()));

		newChildDescriptors.add
			(createChildParameter
				(DsqlPackage.Literals.QUERY__WHERE_HAVING,
				 DsqlFactory.eINSTANCE.createColumn()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DsqlPackage.Literals.QUERY__SELECT ||
			childFeature == DsqlPackage.Literals.QUERY__FROM ||
			childFeature == DsqlPackage.Literals.QUERY__WHERE_HAVING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DsqlEditPlugin.INSTANCE;
	}

}

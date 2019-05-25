/**
 */
package dsql.impl;

import dsql.AggregationFunction;
import dsql.ColumnReference;
import dsql.DsqlPackage;
import dsql.SortSpecification;
import dsql.Source;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getGroupOrder <em>Group Order</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getSortOrder <em>Sort Order</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getSortSpecification <em>Sort Specification</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getAggregationFunction <em>Aggregation Function</em>}</li>
 *   <li>{@link dsql.impl.ColumnReferenceImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ColumnReferenceImpl extends EObjectImpl implements ColumnReference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupOrder() <em>Group Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int GROUP_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGroupOrder() <em>Group Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupOrder()
	 * @generated
	 * @ordered
	 */
	protected int groupOrder = GROUP_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortOrder() <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortOrder()
	 * @generated
	 * @ordered
	 */
	protected int sortOrder = SORT_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortSpecification() <em>Sort Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final SortSpecification SORT_SPECIFICATION_EDEFAULT = SortSpecification.ASCENDING;

	/**
	 * The cached value of the '{@link #getSortSpecification() <em>Sort Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortSpecification()
	 * @generated
	 * @ordered
	 */
	protected SortSpecification sortSpecification = SORT_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationFunction AGGREGATION_FUNCTION_EDEFAULT = AggregationFunction.NONE;

	/**
	 * The cached value of the '{@link #getAggregationFunction() <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationFunction()
	 * @generated
	 * @ordered
	 */
	protected AggregationFunction aggregationFunction = AGGREGATION_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Source table;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.COLUMN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGroupOrder() {
		return groupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupOrder(int newGroupOrder) {
		int oldGroupOrder = groupOrder;
		groupOrder = newGroupOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER, oldGroupOrder, groupOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortOrder() {
		return sortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortOrder(int newSortOrder) {
		int oldSortOrder = sortOrder;
		sortOrder = newSortOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__SORT_ORDER, oldSortOrder, sortOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortSpecification getSortSpecification() {
		return sortSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortSpecification(SortSpecification newSortSpecification) {
		SortSpecification oldSortSpecification = sortSpecification;
		sortSpecification = newSortSpecification == null ? SORT_SPECIFICATION_EDEFAULT : newSortSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION, oldSortSpecification, sortSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunction getAggregationFunction() {
		return aggregationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationFunction(AggregationFunction newAggregationFunction) {
		AggregationFunction oldAggregationFunction = aggregationFunction;
		aggregationFunction = newAggregationFunction == null ? AGGREGATION_FUNCTION_EDEFAULT : newAggregationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION, oldAggregationFunction, aggregationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Source)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.COLUMN_REFERENCE__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Source newTable) {
		Source oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN_REFERENCE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsqlPackage.COLUMN_REFERENCE__NAME:
				return getName();
			case DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER:
				return getGroupOrder();
			case DsqlPackage.COLUMN_REFERENCE__SORT_ORDER:
				return getSortOrder();
			case DsqlPackage.COLUMN_REFERENCE__ALIAS:
				return getAlias();
			case DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION:
				return getSortSpecification();
			case DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION:
				return getAggregationFunction();
			case DsqlPackage.COLUMN_REFERENCE__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
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
			case DsqlPackage.COLUMN_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER:
				setGroupOrder((Integer)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__SORT_ORDER:
				setSortOrder((Integer)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__ALIAS:
				setAlias((String)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION:
				setSortSpecification((SortSpecification)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION:
				setAggregationFunction((AggregationFunction)newValue);
				return;
			case DsqlPackage.COLUMN_REFERENCE__TABLE:
				setTable((Source)newValue);
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
			case DsqlPackage.COLUMN_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER:
				setGroupOrder(GROUP_ORDER_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__SORT_ORDER:
				setSortOrder(SORT_ORDER_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION:
				setSortSpecification(SORT_SPECIFICATION_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION:
				setAggregationFunction(AGGREGATION_FUNCTION_EDEFAULT);
				return;
			case DsqlPackage.COLUMN_REFERENCE__TABLE:
				setTable((Source)null);
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
			case DsqlPackage.COLUMN_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER:
				return groupOrder != GROUP_ORDER_EDEFAULT;
			case DsqlPackage.COLUMN_REFERENCE__SORT_ORDER:
				return sortOrder != SORT_ORDER_EDEFAULT;
			case DsqlPackage.COLUMN_REFERENCE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION:
				return sortSpecification != SORT_SPECIFICATION_EDEFAULT;
			case DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION:
				return aggregationFunction != AGGREGATION_FUNCTION_EDEFAULT;
			case DsqlPackage.COLUMN_REFERENCE__TABLE:
				return table != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", groupOrder: ");
		result.append(groupOrder);
		result.append(", sortOrder: ");
		result.append(sortOrder);
		result.append(", alias: ");
		result.append(alias);
		result.append(", sortSpecification: ");
		result.append(sortSpecification);
		result.append(", aggregationFunction: ");
		result.append(aggregationFunction);
		result.append(')');
		return result.toString();
	}

} //ColumnReferenceImpl

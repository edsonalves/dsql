/**
 */
package dsql.impl;

import dsql.AggregationFunction;
import dsql.BinaryOp;
import dsql.Column;
import dsql.ColumnReference;
import dsql.ColumnType;
import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.DsqlPackage;
import dsql.Expression;
import dsql.LogicalLink;
import dsql.Operand;
import dsql.SortSpecification;
import dsql.Source;
import dsql.SourceAndExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.ColumnImpl#getConditionalExpressionLink <em>Conditional Expression Link</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getGroupOrder <em>Group Order</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getSortOrder <em>Sort Order</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getSortSpecification <em>Sort Specification</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getAggregationFunction <em>Aggregation Function</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link dsql.impl.ColumnImpl#getLogicalLink <em>Logical Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends SubqueryTargetImpl implements Column {
	/**
	 * The cached value of the '{@link #getConditionalExpressionLink() <em>Conditional Expression Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpressionLink()
	 * @generated
	 * @ordered
	 */
	protected ConditionalExpressionLink conditionalExpressionLink;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ColumnType TYPE_EDEFAULT = ColumnType.FIELD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ColumnType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalLink() <em>Logical Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalLink()
	 * @generated
	 * @ordered
	 */
	protected LogicalLink logicalLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionLink getConditionalExpressionLink() {
		if (conditionalExpressionLink != null && conditionalExpressionLink.eIsProxy()) {
			InternalEObject oldConditionalExpressionLink = (InternalEObject)conditionalExpressionLink;
			conditionalExpressionLink = (ConditionalExpressionLink)eResolveProxy(oldConditionalExpressionLink);
			if (conditionalExpressionLink != oldConditionalExpressionLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, conditionalExpressionLink));
			}
		}
		return conditionalExpressionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionLink basicGetConditionalExpressionLink() {
		return conditionalExpressionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalExpressionLink(ConditionalExpressionLink newConditionalExpressionLink, NotificationChain msgs) {
		ConditionalExpressionLink oldConditionalExpressionLink = conditionalExpressionLink;
		conditionalExpressionLink = newConditionalExpressionLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, newConditionalExpressionLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalExpressionLink(ConditionalExpressionLink newConditionalExpressionLink) {
		if (newConditionalExpressionLink != conditionalExpressionLink) {
			NotificationChain msgs = null;
			if (conditionalExpressionLink != null)
				msgs = ((InternalEObject)conditionalExpressionLink).eInverseRemove(this, DsqlPackage.CONDITIONAL_EXPRESSION_LINK__SOURCE, ConditionalExpressionLink.class, msgs);
			if (newConditionalExpressionLink != null)
				msgs = ((InternalEObject)newConditionalExpressionLink).eInverseAdd(this, DsqlPackage.CONDITIONAL_EXPRESSION_LINK__SOURCE, ConditionalExpressionLink.class, msgs);
			msgs = basicSetConditionalExpressionLink(newConditionalExpressionLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK, newConditionalExpressionLink, newConditionalExpressionLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__GROUP_ORDER, oldGroupOrder, groupOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__SORT_ORDER, oldSortOrder, sortOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__ALIAS, oldAlias, alias));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__SORT_SPECIFICATION, oldSortSpecification, sortSpecification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__AGGREGATION_FUNCTION, oldAggregationFunction, aggregationFunction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.COLUMN__TABLE, oldTable, table));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public ColumnType getType() {
		//Subquery
		if(getSubqueryLinkTarget() != null && getSubqueryLinkTarget().getOperation() == BinaryOp.NONE){
			type = ColumnType.SUBQUERY;
		}
		if(getSubqueryLinkTarget() == null && type == ColumnType.SUBQUERY  ){
			type = ColumnType.FIELD;
		}
		
		//Conditional Expression
		if(getConditionalExpressionLink() != null){
			type = ColumnType.CONDITIONAL_EXPRESSION;
		}
		if(getConditionalExpressionLink() == null && type == ColumnType.CONDITIONAL_EXPRESSION  ){
			type = ColumnType.FIELD;
		}
		
		//Logical
		if(getLogicalLink() != null){
			type = ColumnType.LOGICAL_CONNECTIVE;
		}
		if(getLogicalLink() == null && type == ColumnType.LOGICAL_CONNECTIVE  ){
			type = ColumnType.FIELD;
		}
		
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ColumnType newType) {
		ColumnType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLink getLogicalLink() {
		if (logicalLink != null && logicalLink.eIsProxy()) {
			InternalEObject oldLogicalLink = (InternalEObject)logicalLink;
			logicalLink = (LogicalLink)eResolveProxy(oldLogicalLink);
			if (logicalLink != oldLogicalLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.COLUMN__LOGICAL_LINK, oldLogicalLink, logicalLink));
			}
		}
		return logicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLink basicGetLogicalLink() {
		return logicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalLink(LogicalLink newLogicalLink, NotificationChain msgs) {
		LogicalLink oldLogicalLink = logicalLink;
		logicalLink = newLogicalLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__LOGICAL_LINK, oldLogicalLink, newLogicalLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalLink(LogicalLink newLogicalLink) {
		if (newLogicalLink != logicalLink) {
			NotificationChain msgs = null;
			if (logicalLink != null)
				msgs = ((InternalEObject)logicalLink).eInverseRemove(this, DsqlPackage.LOGICAL_LINK__SOURCE, LogicalLink.class, msgs);
			if (newLogicalLink != null)
				msgs = ((InternalEObject)newLogicalLink).eInverseAdd(this, DsqlPackage.LOGICAL_LINK__SOURCE, LogicalLink.class, msgs);
			msgs = basicSetLogicalLink(newLogicalLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.COLUMN__LOGICAL_LINK, newLogicalLink, newLogicalLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				if (conditionalExpressionLink != null)
					msgs = ((InternalEObject)conditionalExpressionLink).eInverseRemove(this, DsqlPackage.CONDITIONAL_EXPRESSION_LINK__SOURCE, ConditionalExpressionLink.class, msgs);
				return basicSetConditionalExpressionLink((ConditionalExpressionLink)otherEnd, msgs);
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				if (logicalLink != null)
					msgs = ((InternalEObject)logicalLink).eInverseRemove(this, DsqlPackage.LOGICAL_LINK__SOURCE, LogicalLink.class, msgs);
				return basicSetLogicalLink((LogicalLink)otherEnd, msgs);
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
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				return basicSetConditionalExpressionLink(null, msgs);
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				return basicSetLogicalLink(null, msgs);
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
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				if (resolve) return getConditionalExpressionLink();
				return basicGetConditionalExpressionLink();
			case DsqlPackage.COLUMN__NAME:
				return getName();
			case DsqlPackage.COLUMN__GROUP_ORDER:
				return getGroupOrder();
			case DsqlPackage.COLUMN__SORT_ORDER:
				return getSortOrder();
			case DsqlPackage.COLUMN__ALIAS:
				return getAlias();
			case DsqlPackage.COLUMN__SORT_SPECIFICATION:
				return getSortSpecification();
			case DsqlPackage.COLUMN__AGGREGATION_FUNCTION:
				return getAggregationFunction();
			case DsqlPackage.COLUMN__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case DsqlPackage.COLUMN__TYPE:
				return getType();
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				if (resolve) return getLogicalLink();
				return basicGetLogicalLink();
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
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)newValue);
				return;
			case DsqlPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case DsqlPackage.COLUMN__GROUP_ORDER:
				setGroupOrder((Integer)newValue);
				return;
			case DsqlPackage.COLUMN__SORT_ORDER:
				setSortOrder((Integer)newValue);
				return;
			case DsqlPackage.COLUMN__ALIAS:
				setAlias((String)newValue);
				return;
			case DsqlPackage.COLUMN__SORT_SPECIFICATION:
				setSortSpecification((SortSpecification)newValue);
				return;
			case DsqlPackage.COLUMN__AGGREGATION_FUNCTION:
				setAggregationFunction((AggregationFunction)newValue);
				return;
			case DsqlPackage.COLUMN__TABLE:
				setTable((Source)newValue);
				return;
			case DsqlPackage.COLUMN__TYPE:
				setType((ColumnType)newValue);
				return;
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				setLogicalLink((LogicalLink)newValue);
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
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)null);
				return;
			case DsqlPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__GROUP_ORDER:
				setGroupOrder(GROUP_ORDER_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__SORT_ORDER:
				setSortOrder(SORT_ORDER_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__SORT_SPECIFICATION:
				setSortSpecification(SORT_SPECIFICATION_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__AGGREGATION_FUNCTION:
				setAggregationFunction(AGGREGATION_FUNCTION_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__TABLE:
				setTable((Source)null);
				return;
			case DsqlPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				setLogicalLink((LogicalLink)null);
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
			case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK:
				return conditionalExpressionLink != null;
			case DsqlPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsqlPackage.COLUMN__GROUP_ORDER:
				return groupOrder != GROUP_ORDER_EDEFAULT;
			case DsqlPackage.COLUMN__SORT_ORDER:
				return sortOrder != SORT_ORDER_EDEFAULT;
			case DsqlPackage.COLUMN__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case DsqlPackage.COLUMN__SORT_SPECIFICATION:
				return sortSpecification != SORT_SPECIFICATION_EDEFAULT;
			case DsqlPackage.COLUMN__AGGREGATION_FUNCTION:
				return aggregationFunction != AGGREGATION_FUNCTION_EDEFAULT;
			case DsqlPackage.COLUMN__TABLE:
				return table != null;
			case DsqlPackage.COLUMN__TYPE:
				return type != TYPE_EDEFAULT;
			case DsqlPackage.COLUMN__LOGICAL_LINK:
				return logicalLink != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConditionalExpressionSource.class) {
			switch (derivedFeatureID) {
				case DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK: return DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK;
				default: return -1;
			}
		}
		if (baseClass == Operand.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SourceAndExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ColumnReference.class) {
			switch (derivedFeatureID) {
				case DsqlPackage.COLUMN__NAME: return DsqlPackage.COLUMN_REFERENCE__NAME;
				case DsqlPackage.COLUMN__GROUP_ORDER: return DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER;
				case DsqlPackage.COLUMN__SORT_ORDER: return DsqlPackage.COLUMN_REFERENCE__SORT_ORDER;
				case DsqlPackage.COLUMN__ALIAS: return DsqlPackage.COLUMN_REFERENCE__ALIAS;
				case DsqlPackage.COLUMN__SORT_SPECIFICATION: return DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION;
				case DsqlPackage.COLUMN__AGGREGATION_FUNCTION: return DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION;
				case DsqlPackage.COLUMN__TABLE: return DsqlPackage.COLUMN_REFERENCE__TABLE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConditionalExpressionSource.class) {
			switch (baseFeatureID) {
				case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK: return DsqlPackage.COLUMN__CONDITIONAL_EXPRESSION_LINK;
				default: return -1;
			}
		}
		if (baseClass == Operand.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SourceAndExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ColumnReference.class) {
			switch (baseFeatureID) {
				case DsqlPackage.COLUMN_REFERENCE__NAME: return DsqlPackage.COLUMN__NAME;
				case DsqlPackage.COLUMN_REFERENCE__GROUP_ORDER: return DsqlPackage.COLUMN__GROUP_ORDER;
				case DsqlPackage.COLUMN_REFERENCE__SORT_ORDER: return DsqlPackage.COLUMN__SORT_ORDER;
				case DsqlPackage.COLUMN_REFERENCE__ALIAS: return DsqlPackage.COLUMN__ALIAS;
				case DsqlPackage.COLUMN_REFERENCE__SORT_SPECIFICATION: return DsqlPackage.COLUMN__SORT_SPECIFICATION;
				case DsqlPackage.COLUMN_REFERENCE__AGGREGATION_FUNCTION: return DsqlPackage.COLUMN__AGGREGATION_FUNCTION;
				case DsqlPackage.COLUMN_REFERENCE__TABLE: return DsqlPackage.COLUMN__TABLE;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl

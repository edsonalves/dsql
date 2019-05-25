/**
 */
package dsql.impl;

import dsql.ColumnReference;
import dsql.DsqlPackage;
import dsql.Expression;
import dsql.Query;
import dsql.SetQuantifier;
import dsql.SourceAndExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.QueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getLimitOffset <em>Limit Offset</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getLimitRowCount <em>Limit Row Count</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getSetQuantifier <em>Set Quantifier</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getFrom <em>From</em>}</li>
 *   <li>{@link dsql.impl.QueryImpl#getWhereHaving <em>Where Having</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
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
	 * The default value of the '{@link #getLimitOffset() <em>Limit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimitOffset() <em>Limit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitOffset()
	 * @generated
	 * @ordered
	 */
	protected int limitOffset = LIMIT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimitRowCount() <em>Limit Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitRowCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_ROW_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimitRowCount() <em>Limit Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitRowCount()
	 * @generated
	 * @ordered
	 */
	protected int limitRowCount = LIMIT_ROW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetQuantifier() <em>Set Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final SetQuantifier SET_QUANTIFIER_EDEFAULT = SetQuantifier.ALL;

	/**
	 * The cached value of the '{@link #getSetQuantifier() <em>Set Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetQuantifier()
	 * @generated
	 * @ordered
	 */
	protected SetQuantifier setQuantifier = SET_QUANTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnReference> select;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceAndExpression> from;

	/**
	 * The cached value of the '{@link #getWhereHaving() <em>Where Having</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereHaving()
	 * @generated
	 * @ordered
	 */
	protected Expression whereHaving;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.QUERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimitOffset() {
		return limitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitOffset(int newLimitOffset) {
		int oldLimitOffset = limitOffset;
		limitOffset = newLimitOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__LIMIT_OFFSET, oldLimitOffset, limitOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimitRowCount() {
		return limitRowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitRowCount(int newLimitRowCount) {
		int oldLimitRowCount = limitRowCount;
		limitRowCount = newLimitRowCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__LIMIT_ROW_COUNT, oldLimitRowCount, limitRowCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetQuantifier getSetQuantifier() {
		return setQuantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetQuantifier(SetQuantifier newSetQuantifier) {
		SetQuantifier oldSetQuantifier = setQuantifier;
		setQuantifier = newSetQuantifier == null ? SET_QUANTIFIER_EDEFAULT : newSetQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__SET_QUANTIFIER, oldSetQuantifier, setQuantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnReference> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<ColumnReference>(ColumnReference.class, this, DsqlPackage.QUERY__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceAndExpression> getFrom() {
		if (from == null) {
			from = new EObjectContainmentEList<SourceAndExpression>(SourceAndExpression.class, this, DsqlPackage.QUERY__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWhereHaving() {
		return whereHaving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereHaving(Expression newWhereHaving, NotificationChain msgs) {
		Expression oldWhereHaving = whereHaving;
		whereHaving = newWhereHaving;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__WHERE_HAVING, oldWhereHaving, newWhereHaving);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereHaving(Expression newWhereHaving) {
		if (newWhereHaving != whereHaving) {
			NotificationChain msgs = null;
			if (whereHaving != null)
				msgs = ((InternalEObject)whereHaving).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.QUERY__WHERE_HAVING, null, msgs);
			if (newWhereHaving != null)
				msgs = ((InternalEObject)newWhereHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.QUERY__WHERE_HAVING, null, msgs);
			msgs = basicSetWhereHaving(newWhereHaving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.QUERY__WHERE_HAVING, newWhereHaving, newWhereHaving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.QUERY__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case DsqlPackage.QUERY__FROM:
				return ((InternalEList<?>)getFrom()).basicRemove(otherEnd, msgs);
			case DsqlPackage.QUERY__WHERE_HAVING:
				return basicSetWhereHaving(null, msgs);
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
			case DsqlPackage.QUERY__NAME:
				return getName();
			case DsqlPackage.QUERY__LIMIT_OFFSET:
				return getLimitOffset();
			case DsqlPackage.QUERY__LIMIT_ROW_COUNT:
				return getLimitRowCount();
			case DsqlPackage.QUERY__SET_QUANTIFIER:
				return getSetQuantifier();
			case DsqlPackage.QUERY__SELECT:
				return getSelect();
			case DsqlPackage.QUERY__FROM:
				return getFrom();
			case DsqlPackage.QUERY__WHERE_HAVING:
				return getWhereHaving();
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
			case DsqlPackage.QUERY__NAME:
				setName((String)newValue);
				return;
			case DsqlPackage.QUERY__LIMIT_OFFSET:
				setLimitOffset((Integer)newValue);
				return;
			case DsqlPackage.QUERY__LIMIT_ROW_COUNT:
				setLimitRowCount((Integer)newValue);
				return;
			case DsqlPackage.QUERY__SET_QUANTIFIER:
				setSetQuantifier((SetQuantifier)newValue);
				return;
			case DsqlPackage.QUERY__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends ColumnReference>)newValue);
				return;
			case DsqlPackage.QUERY__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends SourceAndExpression>)newValue);
				return;
			case DsqlPackage.QUERY__WHERE_HAVING:
				setWhereHaving((Expression)newValue);
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
			case DsqlPackage.QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsqlPackage.QUERY__LIMIT_OFFSET:
				setLimitOffset(LIMIT_OFFSET_EDEFAULT);
				return;
			case DsqlPackage.QUERY__LIMIT_ROW_COUNT:
				setLimitRowCount(LIMIT_ROW_COUNT_EDEFAULT);
				return;
			case DsqlPackage.QUERY__SET_QUANTIFIER:
				setSetQuantifier(SET_QUANTIFIER_EDEFAULT);
				return;
			case DsqlPackage.QUERY__SELECT:
				getSelect().clear();
				return;
			case DsqlPackage.QUERY__FROM:
				getFrom().clear();
				return;
			case DsqlPackage.QUERY__WHERE_HAVING:
				setWhereHaving((Expression)null);
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
			case DsqlPackage.QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsqlPackage.QUERY__LIMIT_OFFSET:
				return limitOffset != LIMIT_OFFSET_EDEFAULT;
			case DsqlPackage.QUERY__LIMIT_ROW_COUNT:
				return limitRowCount != LIMIT_ROW_COUNT_EDEFAULT;
			case DsqlPackage.QUERY__SET_QUANTIFIER:
				return setQuantifier != SET_QUANTIFIER_EDEFAULT;
			case DsqlPackage.QUERY__SELECT:
				return select != null && !select.isEmpty();
			case DsqlPackage.QUERY__FROM:
				return from != null && !from.isEmpty();
			case DsqlPackage.QUERY__WHERE_HAVING:
				return whereHaving != null;
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
		result.append(", limitOffset: ");
		result.append(limitOffset);
		result.append(", limitRowCount: ");
		result.append(limitRowCount);
		result.append(", setQuantifier: ");
		result.append(setQuantifier);
		result.append(')');
		return result.toString();
	}

} //QueryImpl

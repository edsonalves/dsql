/**
 */
package dsql.impl;

import dsql.DsqlPackage;
import dsql.Operand;
import dsql.Ternary;
import dsql.TernaryOp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.TernaryImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link dsql.impl.TernaryImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link dsql.impl.TernaryImpl#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link dsql.impl.TernaryImpl#getOperand3 <em>Operand3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TernaryImpl extends OperationImpl implements Ternary {
	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final TernaryOp OPERATION_EDEFAULT = TernaryOp.BETWEEN;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TernaryOp operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand1()
	 * @generated
	 * @ordered
	 */
	protected Operand operand1;

	/**
	 * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand2()
	 * @generated
	 * @ordered
	 */
	protected Operand operand2;

	/**
	 * The cached value of the '{@link #getOperand3() <em>Operand3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand3()
	 * @generated
	 * @ordered
	 */
	protected Operand operand3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TernaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.TERNARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryOp getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(TernaryOp newOperation) {
		TernaryOp oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getOperand1() {
		return operand1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand1(Operand newOperand1, NotificationChain msgs) {
		Operand oldOperand1 = operand1;
		operand1 = newOperand1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND1, oldOperand1, newOperand1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand1(Operand newOperand1) {
		if (newOperand1 != operand1) {
			NotificationChain msgs = null;
			if (operand1 != null)
				msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND1, null, msgs);
			if (newOperand1 != null)
				msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND1, null, msgs);
			msgs = basicSetOperand1(newOperand1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND1, newOperand1, newOperand1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getOperand2() {
		return operand2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand2(Operand newOperand2, NotificationChain msgs) {
		Operand oldOperand2 = operand2;
		operand2 = newOperand2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND2, oldOperand2, newOperand2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand2(Operand newOperand2) {
		if (newOperand2 != operand2) {
			NotificationChain msgs = null;
			if (operand2 != null)
				msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND2, null, msgs);
			if (newOperand2 != null)
				msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND2, null, msgs);
			msgs = basicSetOperand2(newOperand2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND2, newOperand2, newOperand2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getOperand3() {
		return operand3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand3(Operand newOperand3, NotificationChain msgs) {
		Operand oldOperand3 = operand3;
		operand3 = newOperand3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND3, oldOperand3, newOperand3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand3(Operand newOperand3) {
		if (newOperand3 != operand3) {
			NotificationChain msgs = null;
			if (operand3 != null)
				msgs = ((InternalEObject)operand3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND3, null, msgs);
			if (newOperand3 != null)
				msgs = ((InternalEObject)newOperand3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.TERNARY__OPERAND3, null, msgs);
			msgs = basicSetOperand3(newOperand3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.TERNARY__OPERAND3, newOperand3, newOperand3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.TERNARY__OPERAND1:
				return basicSetOperand1(null, msgs);
			case DsqlPackage.TERNARY__OPERAND2:
				return basicSetOperand2(null, msgs);
			case DsqlPackage.TERNARY__OPERAND3:
				return basicSetOperand3(null, msgs);
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
			case DsqlPackage.TERNARY__OPERATION:
				return getOperation();
			case DsqlPackage.TERNARY__OPERAND1:
				return getOperand1();
			case DsqlPackage.TERNARY__OPERAND2:
				return getOperand2();
			case DsqlPackage.TERNARY__OPERAND3:
				return getOperand3();
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
			case DsqlPackage.TERNARY__OPERATION:
				setOperation((TernaryOp)newValue);
				return;
			case DsqlPackage.TERNARY__OPERAND1:
				setOperand1((Operand)newValue);
				return;
			case DsqlPackage.TERNARY__OPERAND2:
				setOperand2((Operand)newValue);
				return;
			case DsqlPackage.TERNARY__OPERAND3:
				setOperand3((Operand)newValue);
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
			case DsqlPackage.TERNARY__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case DsqlPackage.TERNARY__OPERAND1:
				setOperand1((Operand)null);
				return;
			case DsqlPackage.TERNARY__OPERAND2:
				setOperand2((Operand)null);
				return;
			case DsqlPackage.TERNARY__OPERAND3:
				setOperand3((Operand)null);
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
			case DsqlPackage.TERNARY__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case DsqlPackage.TERNARY__OPERAND1:
				return operand1 != null;
			case DsqlPackage.TERNARY__OPERAND2:
				return operand2 != null;
			case DsqlPackage.TERNARY__OPERAND3:
				return operand3 != null;
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
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //TernaryImpl

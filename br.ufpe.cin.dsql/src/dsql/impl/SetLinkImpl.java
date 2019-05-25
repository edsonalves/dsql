/**
 */
package dsql.impl;

import dsql.DsqlPackage;
import dsql.Query;
import dsql.SetLink;
import dsql.SetOperator;
import dsql.SetQuantifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.SetLinkImpl#getSetQuantifier <em>Set Quantifier</em>}</li>
 *   <li>{@link dsql.impl.SetLinkImpl#getSetOperator <em>Set Operator</em>}</li>
 *   <li>{@link dsql.impl.SetLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.impl.SetLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetLinkImpl extends LinkImpl implements SetLink {
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
	 * The default value of the '{@link #getSetOperator() <em>Set Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetOperator()
	 * @generated
	 * @ordered
	 */
	protected static final SetOperator SET_OPERATOR_EDEFAULT = SetOperator.INTERSECT;

	/**
	 * The cached value of the '{@link #getSetOperator() <em>Set Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetOperator()
	 * @generated
	 * @ordered
	 */
	protected SetOperator setOperator = SET_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Query source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Query target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.SET_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.SET_LINK__SET_QUANTIFIER, oldSetQuantifier, setQuantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOperator getSetOperator() {
		return setOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetOperator(SetOperator newSetOperator) {
		SetOperator oldSetOperator = setOperator;
		setOperator = newSetOperator == null ? SET_OPERATOR_EDEFAULT : newSetOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.SET_LINK__SET_OPERATOR, oldSetOperator, setOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Query)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.SET_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Query newSource) {
		Query oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.SET_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Query)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.SET_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Query newTarget) {
		Query oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.SET_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsqlPackage.SET_LINK__SET_QUANTIFIER:
				return getSetQuantifier();
			case DsqlPackage.SET_LINK__SET_OPERATOR:
				return getSetOperator();
			case DsqlPackage.SET_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DsqlPackage.SET_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case DsqlPackage.SET_LINK__SET_QUANTIFIER:
				setSetQuantifier((SetQuantifier)newValue);
				return;
			case DsqlPackage.SET_LINK__SET_OPERATOR:
				setSetOperator((SetOperator)newValue);
				return;
			case DsqlPackage.SET_LINK__SOURCE:
				setSource((Query)newValue);
				return;
			case DsqlPackage.SET_LINK__TARGET:
				setTarget((Query)newValue);
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
			case DsqlPackage.SET_LINK__SET_QUANTIFIER:
				setSetQuantifier(SET_QUANTIFIER_EDEFAULT);
				return;
			case DsqlPackage.SET_LINK__SET_OPERATOR:
				setSetOperator(SET_OPERATOR_EDEFAULT);
				return;
			case DsqlPackage.SET_LINK__SOURCE:
				setSource((Query)null);
				return;
			case DsqlPackage.SET_LINK__TARGET:
				setTarget((Query)null);
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
			case DsqlPackage.SET_LINK__SET_QUANTIFIER:
				return setQuantifier != SET_QUANTIFIER_EDEFAULT;
			case DsqlPackage.SET_LINK__SET_OPERATOR:
				return setOperator != SET_OPERATOR_EDEFAULT;
			case DsqlPackage.SET_LINK__SOURCE:
				return source != null;
			case DsqlPackage.SET_LINK__TARGET:
				return target != null;
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
		result.append(" (setQuantifier: ");
		result.append(setQuantifier);
		result.append(", setOperator: ");
		result.append(setOperator);
		result.append(')');
		return result.toString();
	}

} //SetLinkImpl

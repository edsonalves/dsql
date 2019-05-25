/**
 */
package dsql.impl;

import dsql.DsqlPackage;
import dsql.JoinLink;
import dsql.JoinType;
import dsql.Source;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.JoinLinkImpl#getForeignKeyName <em>Foreign Key Name</em>}</li>
 *   <li>{@link dsql.impl.JoinLinkImpl#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link dsql.impl.JoinLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.impl.JoinLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinLinkImpl extends LinkImpl implements JoinLink {
	/**
	 * The default value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKeyName() <em>Foreign Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyName()
	 * @generated
	 * @ordered
	 */
	protected String foreignKeyName = FOREIGN_KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinType()
	 * @generated
	 * @ordered
	 */
	protected static final JoinType JOIN_TYPE_EDEFAULT = JoinType.INNER;

	/**
	 * The cached value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinType()
	 * @generated
	 * @ordered
	 */
	protected JoinType joinType = JOIN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Source target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.JOIN_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKeyName() {
		return foreignKeyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyName(String newForeignKeyName) {
		String oldForeignKeyName = foreignKeyName;
		foreignKeyName = newForeignKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.JOIN_LINK__FOREIGN_KEY_NAME, oldForeignKeyName, foreignKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType getJoinType() {
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinType(JoinType newJoinType) {
		JoinType oldJoinType = joinType;
		joinType = newJoinType == null ? JOIN_TYPE_EDEFAULT : newJoinType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.JOIN_LINK__JOIN_TYPE, oldJoinType, joinType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Source)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.JOIN_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.JOIN_LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Source)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.JOIN_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Source newTarget) {
		Source oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.JOIN_LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsqlPackage.JOIN_LINK__FOREIGN_KEY_NAME:
				return getForeignKeyName();
			case DsqlPackage.JOIN_LINK__JOIN_TYPE:
				return getJoinType();
			case DsqlPackage.JOIN_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DsqlPackage.JOIN_LINK__TARGET:
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
			case DsqlPackage.JOIN_LINK__FOREIGN_KEY_NAME:
				setForeignKeyName((String)newValue);
				return;
			case DsqlPackage.JOIN_LINK__JOIN_TYPE:
				setJoinType((JoinType)newValue);
				return;
			case DsqlPackage.JOIN_LINK__SOURCE:
				setSource((Source)newValue);
				return;
			case DsqlPackage.JOIN_LINK__TARGET:
				setTarget((Source)newValue);
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
			case DsqlPackage.JOIN_LINK__FOREIGN_KEY_NAME:
				setForeignKeyName(FOREIGN_KEY_NAME_EDEFAULT);
				return;
			case DsqlPackage.JOIN_LINK__JOIN_TYPE:
				setJoinType(JOIN_TYPE_EDEFAULT);
				return;
			case DsqlPackage.JOIN_LINK__SOURCE:
				setSource((Source)null);
				return;
			case DsqlPackage.JOIN_LINK__TARGET:
				setTarget((Source)null);
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
			case DsqlPackage.JOIN_LINK__FOREIGN_KEY_NAME:
				return FOREIGN_KEY_NAME_EDEFAULT == null ? foreignKeyName != null : !FOREIGN_KEY_NAME_EDEFAULT.equals(foreignKeyName);
			case DsqlPackage.JOIN_LINK__JOIN_TYPE:
				return joinType != JOIN_TYPE_EDEFAULT;
			case DsqlPackage.JOIN_LINK__SOURCE:
				return source != null;
			case DsqlPackage.JOIN_LINK__TARGET:
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
		result.append(" (foreignKeyName: ");
		result.append(foreignKeyName);
		result.append(", joinType: ");
		result.append(joinType);
		result.append(')');
		return result.toString();
	}

} //JoinLinkImpl

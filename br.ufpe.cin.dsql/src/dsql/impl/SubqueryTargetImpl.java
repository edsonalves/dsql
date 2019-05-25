/**
 */
package dsql.impl;

import dsql.DsqlPackage;
import dsql.SubqueryLink;
import dsql.SubqueryTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subquery Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.SubqueryTargetImpl#getSubqueryLinkTarget <em>Subquery Link Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubqueryTargetImpl extends EObjectImpl implements SubqueryTarget {
	/**
	 * The cached value of the '{@link #getSubqueryLinkTarget() <em>Subquery Link Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubqueryLinkTarget()
	 * @generated
	 * @ordered
	 */
	protected SubqueryLink subqueryLinkTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubqueryTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.SUBQUERY_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryLink getSubqueryLinkTarget() {
		if (subqueryLinkTarget != null && subqueryLinkTarget.eIsProxy()) {
			InternalEObject oldSubqueryLinkTarget = (InternalEObject)subqueryLinkTarget;
			subqueryLinkTarget = (SubqueryLink)eResolveProxy(oldSubqueryLinkTarget);
			if (subqueryLinkTarget != oldSubqueryLinkTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET, oldSubqueryLinkTarget, subqueryLinkTarget));
			}
		}
		return subqueryLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryLink basicGetSubqueryLinkTarget() {
		return subqueryLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubqueryLinkTarget(SubqueryLink newSubqueryLinkTarget, NotificationChain msgs) {
		SubqueryLink oldSubqueryLinkTarget = subqueryLinkTarget;
		subqueryLinkTarget = newSubqueryLinkTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET, oldSubqueryLinkTarget, newSubqueryLinkTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubqueryLinkTarget(SubqueryLink newSubqueryLinkTarget) {
		if (newSubqueryLinkTarget != subqueryLinkTarget) {
			NotificationChain msgs = null;
			if (subqueryLinkTarget != null)
				msgs = ((InternalEObject)subqueryLinkTarget).eInverseRemove(this, DsqlPackage.SUBQUERY_LINK__TARGET, SubqueryLink.class, msgs);
			if (newSubqueryLinkTarget != null)
				msgs = ((InternalEObject)newSubqueryLinkTarget).eInverseAdd(this, DsqlPackage.SUBQUERY_LINK__TARGET, SubqueryLink.class, msgs);
			msgs = basicSetSubqueryLinkTarget(newSubqueryLinkTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET, newSubqueryLinkTarget, newSubqueryLinkTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				if (subqueryLinkTarget != null)
					msgs = ((InternalEObject)subqueryLinkTarget).eInverseRemove(this, DsqlPackage.SUBQUERY_LINK__TARGET, SubqueryLink.class, msgs);
				return basicSetSubqueryLinkTarget((SubqueryLink)otherEnd, msgs);
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
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				return basicSetSubqueryLinkTarget(null, msgs);
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
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				if (resolve) return getSubqueryLinkTarget();
				return basicGetSubqueryLinkTarget();
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
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				setSubqueryLinkTarget((SubqueryLink)newValue);
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
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				setSubqueryLinkTarget((SubqueryLink)null);
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
			case DsqlPackage.SUBQUERY_TARGET__SUBQUERY_LINK_TARGET:
				return subqueryLinkTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //SubqueryTargetImpl

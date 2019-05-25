/**
 */
package dsql.impl;

import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.DsqlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.ConditionalExpressionSourceImpl#getConditionalExpressionLink <em>Conditional Expression Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionalExpressionSourceImpl extends EObjectImpl implements ConditionalExpressionSource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.CONDITIONAL_EXPRESSION_SOURCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, conditionalExpressionLink));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, newConditionalExpressionLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK, newConditionalExpressionLink, newConditionalExpressionLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				if (conditionalExpressionLink != null)
					msgs = ((InternalEObject)conditionalExpressionLink).eInverseRemove(this, DsqlPackage.CONDITIONAL_EXPRESSION_LINK__SOURCE, ConditionalExpressionLink.class, msgs);
				return basicSetConditionalExpressionLink((ConditionalExpressionLink)otherEnd, msgs);
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
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				return basicSetConditionalExpressionLink(null, msgs);
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
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				if (resolve) return getConditionalExpressionLink();
				return basicGetConditionalExpressionLink();
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
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)newValue);
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
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)null);
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
			case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK:
				return conditionalExpressionLink != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionSourceImpl

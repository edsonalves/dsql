/**
 */
package dsql.impl;

import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.DsqlPackage;
import dsql.Expression;
import dsql.When;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsql.impl.WhenImpl#getConditionalExpressionLink <em>Conditional Expression Link</em>}</li>
 *   <li>{@link dsql.impl.WhenImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link dsql.impl.WhenImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dsql.impl.WhenImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenImpl extends ConditionalExpressionImpl implements When {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Expression result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsqlPackage.Literals.WHEN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, conditionalExpressionLink));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK, oldConditionalExpressionLink, newConditionalExpressionLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK, newConditionalExpressionLink, newConditionalExpressionLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.WHEN__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.WHEN__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Expression newResult, NotificationChain msgs) {
		Expression oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Expression newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.WHEN__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsqlPackage.WHEN__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsqlPackage.WHEN__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
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
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
				return basicSetConditionalExpressionLink(null, msgs);
			case DsqlPackage.WHEN__CONDITION:
				return basicSetCondition(null, msgs);
			case DsqlPackage.WHEN__RESULT:
				return basicSetResult(null, msgs);
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
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
				if (resolve) return getConditionalExpressionLink();
				return basicGetConditionalExpressionLink();
			case DsqlPackage.WHEN__LABEL:
				return getLabel();
			case DsqlPackage.WHEN__CONDITION:
				return getCondition();
			case DsqlPackage.WHEN__RESULT:
				return getResult();
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
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)newValue);
				return;
			case DsqlPackage.WHEN__LABEL:
				setLabel((String)newValue);
				return;
			case DsqlPackage.WHEN__CONDITION:
				setCondition((Expression)newValue);
				return;
			case DsqlPackage.WHEN__RESULT:
				setResult((Expression)newValue);
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
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
				setConditionalExpressionLink((ConditionalExpressionLink)null);
				return;
			case DsqlPackage.WHEN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DsqlPackage.WHEN__CONDITION:
				setCondition((Expression)null);
				return;
			case DsqlPackage.WHEN__RESULT:
				setResult((Expression)null);
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
			case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK:
				return conditionalExpressionLink != null;
			case DsqlPackage.WHEN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DsqlPackage.WHEN__CONDITION:
				return condition != null;
			case DsqlPackage.WHEN__RESULT:
				return result != null;
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
				case DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK: return DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK;
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
				case DsqlPackage.CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK: return DsqlPackage.WHEN__CONDITIONAL_EXPRESSION_LINK;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //WhenImpl

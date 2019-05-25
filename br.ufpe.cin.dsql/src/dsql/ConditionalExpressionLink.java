/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.ConditionalExpressionLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.ConditionalExpressionLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getConditionalExpressionLink()
 * @model annotation="gmf.link style='solid' target.decoration='closedarrow'"
 * @generated
 */
public interface ConditionalExpressionLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.ConditionalExpressionSource#getConditionalExpressionLink <em>Conditional Expression Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConditionalExpressionSource)
	 * @see dsql.DsqlPackage#getConditionalExpressionLink_Source()
	 * @see dsql.ConditionalExpressionSource#getConditionalExpressionLink
	 * @model opposite="conditionalExpressionLink" required="true"
	 * @generated
	 */
	ConditionalExpressionSource getSource();

	/**
	 * Sets the value of the '{@link dsql.ConditionalExpressionLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConditionalExpressionSource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConditionalExpression)
	 * @see dsql.DsqlPackage#getConditionalExpressionLink_Target()
	 * @model required="true"
	 * @generated
	 */
	ConditionalExpression getTarget();

	/**
	 * Sets the value of the '{@link dsql.ConditionalExpressionLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConditionalExpression value);

} // ConditionalExpressionLink

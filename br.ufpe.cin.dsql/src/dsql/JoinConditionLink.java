/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Condition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.JoinConditionLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.JoinConditionLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getJoinConditionLink()
 * @model annotation="gmf.link style='dash'"
 * @generated
 */
public interface JoinConditionLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(JoinLink)
	 * @see dsql.DsqlPackage#getJoinConditionLink_Source()
	 * @model required="true"
	 * @generated
	 */
	JoinLink getSource();

	/**
	 * Sets the value of the '{@link dsql.JoinConditionLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(JoinLink value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Expression)
	 * @see dsql.DsqlPackage#getJoinConditionLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link dsql.JoinConditionLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

} // JoinConditionLink

/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.SubqueryLink#getOperation <em>Operation</em>}</li>
 *   <li>{@link dsql.SubqueryLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.SubqueryLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getSubqueryLink()
 * @model annotation="gmf.link style='solid' label='operation'"
 * @generated
 */
public interface SubqueryLink extends Link {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.BinaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see dsql.BinaryOp
	 * @see #setOperation(BinaryOp)
	 * @see dsql.DsqlPackage#getSubqueryLink_Operation()
	 * @model
	 * @generated
	 */
	BinaryOp getOperation();

	/**
	 * Sets the value of the '{@link dsql.SubqueryLink#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see dsql.BinaryOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BinaryOp value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Query)
	 * @see dsql.DsqlPackage#getSubqueryLink_Source()
	 * @model required="true"
	 * @generated
	 */
	Query getSource();

	/**
	 * Sets the value of the '{@link dsql.SubqueryLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Query value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.SubqueryTarget#getSubqueryLinkTarget <em>Subquery Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SubqueryTarget)
	 * @see dsql.DsqlPackage#getSubqueryLink_Target()
	 * @see dsql.SubqueryTarget#getSubqueryLinkTarget
	 * @model opposite="subqueryLinkTarget" required="true"
	 * @generated
	 */
	SubqueryTarget getTarget();

	/**
	 * Sets the value of the '{@link dsql.SubqueryLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SubqueryTarget value);

} // SubqueryLink

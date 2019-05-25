/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.LogicalLink#getSource <em>Source</em>}</li>
 *   <li>{@link dsql.LogicalLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getLogicalLink()
 * @model annotation="gmf.link style='solid' target.decoration='arrow'"
 * @generated
 */
public interface LogicalLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.Column#getLogicalLink <em>Logical Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Column)
	 * @see dsql.DsqlPackage#getLogicalLink_Source()
	 * @see dsql.Column#getLogicalLink
	 * @model opposite="logicalLink" required="true"
	 * @generated
	 */
	Column getSource();

	/**
	 * Sets the value of the '{@link dsql.LogicalLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Column value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LogicalOperation)
	 * @see dsql.DsqlPackage#getLogicalLink_Target()
	 * @model required="true"
	 * @generated
	 */
	LogicalOperation getTarget();

	/**
	 * Sets the value of the '{@link dsql.LogicalLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LogicalOperation value);

} // LogicalLink

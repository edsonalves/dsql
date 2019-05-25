/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.Column#getType <em>Type</em>}</li>
 *   <li>{@link dsql.Column#getLogicalLink <em>Logical Link</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends SubqueryTarget, ConditionalExpressionSource, Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.ColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dsql.ColumnType
	 * @see #setType(ColumnType)
	 * @see dsql.DsqlPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	ColumnType getType();

	/**
	 * Sets the value of the '{@link dsql.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dsql.ColumnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ColumnType value);

	/**
	 * Returns the value of the '<em><b>Logical Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dsql.LogicalLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Link</em>' reference.
	 * @see #setLogicalLink(LogicalLink)
	 * @see dsql.DsqlPackage#getColumn_LogicalLink()
	 * @see dsql.LogicalLink#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	LogicalLink getLogicalLink();

	/**
	 * Sets the value of the '{@link dsql.Column#getLogicalLink <em>Logical Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Link</em>' reference.
	 * @see #getLogicalLink()
	 * @generated
	 */
	void setLogicalLink(LogicalLink value);

} // Column

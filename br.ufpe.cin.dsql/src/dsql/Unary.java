/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.Unary#getOperation <em>Operation</em>}</li>
 *   <li>{@link dsql.Unary#getOperand1 <em>Operand1</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getUnary()
 * @model
 * @generated
 */
public interface Unary extends Operation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.UnaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see dsql.UnaryOp
	 * @see #setOperation(UnaryOp)
	 * @see dsql.DsqlPackage#getUnary_Operation()
	 * @model
	 * @generated
	 */
	UnaryOp getOperation();

	/**
	 * Sets the value of the '{@link dsql.Unary#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see dsql.UnaryOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(UnaryOp value);

	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' containment reference.
	 * @see #setOperand1(Operand)
	 * @see dsql.DsqlPackage#getUnary_Operand1()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Operand getOperand1();

	/**
	 * Sets the value of the '{@link dsql.Unary#getOperand1 <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(Operand value);

} // Unary

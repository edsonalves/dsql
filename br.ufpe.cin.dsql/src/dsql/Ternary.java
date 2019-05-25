/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.Ternary#getOperation <em>Operation</em>}</li>
 *   <li>{@link dsql.Ternary#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link dsql.Ternary#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link dsql.Ternary#getOperand3 <em>Operand3</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getTernary()
 * @model
 * @generated
 */
public interface Ternary extends Operation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.TernaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see dsql.TernaryOp
	 * @see #setOperation(TernaryOp)
	 * @see dsql.DsqlPackage#getTernary_Operation()
	 * @model
	 * @generated
	 */
	TernaryOp getOperation();

	/**
	 * Sets the value of the '{@link dsql.Ternary#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see dsql.TernaryOp
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TernaryOp value);

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
	 * @see dsql.DsqlPackage#getTernary_Operand1()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Operand getOperand1();

	/**
	 * Sets the value of the '{@link dsql.Ternary#getOperand1 <em>Operand1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' containment reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(Operand value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' containment reference.
	 * @see #setOperand2(Operand)
	 * @see dsql.DsqlPackage#getTernary_Operand2()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Operand getOperand2();

	/**
	 * Sets the value of the '{@link dsql.Ternary#getOperand2 <em>Operand2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' containment reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(Operand value);

	/**
	 * Returns the value of the '<em><b>Operand3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand3</em>' containment reference.
	 * @see #setOperand3(Operand)
	 * @see dsql.DsqlPackage#getTernary_Operand3()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Operand getOperand3();

	/**
	 * Sets the value of the '{@link dsql.Ternary#getOperand3 <em>Operand3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand3</em>' containment reference.
	 * @see #getOperand3()
	 * @generated
	 */
	void setOperand3(Operand value);

} // Ternary

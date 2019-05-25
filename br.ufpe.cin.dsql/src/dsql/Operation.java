/**
 */
package dsql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.Operation#isNegation <em>Negation</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getOperation()
 * @model abstract="true"
 *        annotation="gmf.node label='operation' border.color='0,0,0' border.style='dash' margin='3' figure='rectangle'"
 * @generated
 */
public interface Operation extends Expression {
	/**
	 * Returns the value of the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negation</em>' attribute.
	 * @see #setNegation(boolean)
	 * @see dsql.DsqlPackage#getOperation_Negation()
	 * @model
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link dsql.Operation#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

} // Operation

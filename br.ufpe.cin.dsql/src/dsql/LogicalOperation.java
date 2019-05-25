/**
 */
package dsql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.LogicalOperation#getType <em>Type</em>}</li>
 *   <li>{@link dsql.LogicalOperation#isNegation <em>Negation</em>}</li>
 *   <li>{@link dsql.LogicalOperation#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getLogicalOperation()
 * @model annotation="gmf.node label='type' resizable='false' label.icon='false' border.width='1' border.color='0,0,0' margin='3' figure='rectangle'"
 * @generated
 */
public interface LogicalOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.LogicalOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dsql.LogicalOperationType
	 * @see #setType(LogicalOperationType)
	 * @see dsql.DsqlPackage#getLogicalOperation_Type()
	 * @model
	 * @generated
	 */
	LogicalOperationType getType();

	/**
	 * Sets the value of the '{@link dsql.LogicalOperation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dsql.LogicalOperationType
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicalOperationType value);

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
	 * @see dsql.DsqlPackage#getLogicalOperation_Negation()
	 * @model
	 * @generated
	 */
	boolean isNegation();

	/**
	 * Sets the value of the '{@link dsql.LogicalOperation#isNegation <em>Negation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negation</em>' attribute.
	 * @see #isNegation()
	 * @generated
	 */
	void setNegation(boolean value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see dsql.DsqlPackage#getLogicalOperation_Expressions()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // LogicalOperation

/**
 */
package dsql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.Query#getName <em>Name</em>}</li>
 *   <li>{@link dsql.Query#getLimitOffset <em>Limit Offset</em>}</li>
 *   <li>{@link dsql.Query#getLimitRowCount <em>Limit Row Count</em>}</li>
 *   <li>{@link dsql.Query#getSetQuantifier <em>Set Quantifier</em>}</li>
 *   <li>{@link dsql.Query#getSelect <em>Select</em>}</li>
 *   <li>{@link dsql.Query#getFrom <em>From</em>}</li>
 *   <li>{@link dsql.Query#getWhereHaving <em>Where Having</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getQuery()
 * @model annotation="gmf.node resizable='false' label='name' label.icon='false' border.width='1' border.color='0,0,0' margin='3' figure='rectangle'"
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsql.DsqlPackage#getQuery_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsql.Query#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Limit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Offset</em>' attribute.
	 * @see #setLimitOffset(int)
	 * @see dsql.DsqlPackage#getQuery_LimitOffset()
	 * @model
	 * @generated
	 */
	int getLimitOffset();

	/**
	 * Sets the value of the '{@link dsql.Query#getLimitOffset <em>Limit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Offset</em>' attribute.
	 * @see #getLimitOffset()
	 * @generated
	 */
	void setLimitOffset(int value);

	/**
	 * Returns the value of the '<em><b>Limit Row Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Row Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Row Count</em>' attribute.
	 * @see #setLimitRowCount(int)
	 * @see dsql.DsqlPackage#getQuery_LimitRowCount()
	 * @model
	 * @generated
	 */
	int getLimitRowCount();

	/**
	 * Sets the value of the '{@link dsql.Query#getLimitRowCount <em>Limit Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Row Count</em>' attribute.
	 * @see #getLimitRowCount()
	 * @generated
	 */
	void setLimitRowCount(int value);

	/**
	 * Returns the value of the '<em><b>Set Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.SetQuantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Quantifier</em>' attribute.
	 * @see dsql.SetQuantifier
	 * @see #setSetQuantifier(SetQuantifier)
	 * @see dsql.DsqlPackage#getQuery_SetQuantifier()
	 * @model
	 * @generated
	 */
	SetQuantifier getSetQuantifier();

	/**
	 * Sets the value of the '{@link dsql.Query#getSetQuantifier <em>Set Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Quantifier</em>' attribute.
	 * @see dsql.SetQuantifier
	 * @see #getSetQuantifier()
	 * @generated
	 */
	void setSetQuantifier(SetQuantifier value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.ColumnReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQuery_Select()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<ColumnReference> getSelect();

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.SourceAndExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQuery_From()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceAndExpression> getFrom();

	/**
	 * Returns the value of the '<em><b>Where Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Having</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Having</em>' containment reference.
	 * @see #setWhereHaving(Expression)
	 * @see dsql.DsqlPackage#getQuery_WhereHaving()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	Expression getWhereHaving();

	/**
	 * Sets the value of the '{@link dsql.Query#getWhereHaving <em>Where Having</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Having</em>' containment reference.
	 * @see #getWhereHaving()
	 * @generated
	 */
	void setWhereHaving(Expression value);

} // Query

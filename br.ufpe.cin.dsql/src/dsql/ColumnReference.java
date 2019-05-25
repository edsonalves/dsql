/**
 */
package dsql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.ColumnReference#getName <em>Name</em>}</li>
 *   <li>{@link dsql.ColumnReference#getGroupOrder <em>Group Order</em>}</li>
 *   <li>{@link dsql.ColumnReference#getSortOrder <em>Sort Order</em>}</li>
 *   <li>{@link dsql.ColumnReference#getAlias <em>Alias</em>}</li>
 *   <li>{@link dsql.ColumnReference#getSortSpecification <em>Sort Specification</em>}</li>
 *   <li>{@link dsql.ColumnReference#getAggregationFunction <em>Aggregation Function</em>}</li>
 *   <li>{@link dsql.ColumnReference#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getColumnReference()
 * @model abstract="true"
 *        annotation="gmf.node resizable='false' label='name' label.icon='false' border.width='1' border.color='255,255,255' margin='3' figure='rectangle'"
 * @generated
 */
public interface ColumnReference extends EObject {
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
	 * @see dsql.DsqlPackage#getColumnReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Order</em>' attribute.
	 * @see #setGroupOrder(int)
	 * @see dsql.DsqlPackage#getColumnReference_GroupOrder()
	 * @model
	 * @generated
	 */
	int getGroupOrder();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getGroupOrder <em>Group Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Order</em>' attribute.
	 * @see #getGroupOrder()
	 * @generated
	 */
	void setGroupOrder(int value);

	/**
	 * Returns the value of the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Order</em>' attribute.
	 * @see #setSortOrder(int)
	 * @see dsql.DsqlPackage#getColumnReference_SortOrder()
	 * @model
	 * @generated
	 */
	int getSortOrder();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Order</em>' attribute.
	 * @see #getSortOrder()
	 * @generated
	 */
	void setSortOrder(int value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see dsql.DsqlPackage#getColumnReference_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Sort Specification</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.SortSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Specification</em>' attribute.
	 * @see dsql.SortSpecification
	 * @see #setSortSpecification(SortSpecification)
	 * @see dsql.DsqlPackage#getColumnReference_SortSpecification()
	 * @model
	 * @generated
	 */
	SortSpecification getSortSpecification();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getSortSpecification <em>Sort Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Specification</em>' attribute.
	 * @see dsql.SortSpecification
	 * @see #getSortSpecification()
	 * @generated
	 */
	void setSortSpecification(SortSpecification value);

	/**
	 * Returns the value of the '<em><b>Aggregation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link dsql.AggregationFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Function</em>' attribute.
	 * @see dsql.AggregationFunction
	 * @see #setAggregationFunction(AggregationFunction)
	 * @see dsql.DsqlPackage#getColumnReference_AggregationFunction()
	 * @model
	 * @generated
	 */
	AggregationFunction getAggregationFunction();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getAggregationFunction <em>Aggregation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Function</em>' attribute.
	 * @see dsql.AggregationFunction
	 * @see #getAggregationFunction()
	 * @generated
	 */
	void setAggregationFunction(AggregationFunction value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Source)
	 * @see dsql.DsqlPackage#getColumnReference_Table()
	 * @model
	 * @generated
	 */
	Source getTable();

	/**
	 * Sets the value of the '{@link dsql.ColumnReference#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Source value);

} // ColumnReference

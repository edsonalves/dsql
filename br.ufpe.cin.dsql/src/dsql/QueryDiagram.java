/**
 */
package dsql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsql.QueryDiagram#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link dsql.QueryDiagram#getQueries <em>Queries</em>}</li>
 *   <li>{@link dsql.QueryDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link dsql.QueryDiagram#getLogicalOperations <em>Logical Operations</em>}</li>
 *   <li>{@link dsql.QueryDiagram#getConditionalExpressions <em>Conditional Expressions</em>}</li>
 * </ul>
 *
 * @see dsql.DsqlPackage#getQueryDiagram()
 * @model annotation="gmf.diagram onefile='true' diagram.extension='dsql'"
 * @generated
 */
public interface QueryDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see dsql.DsqlPackage#getQueryDiagram_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link dsql.QueryDiagram#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQueryDiagram_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQueryDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Logical Operations</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.LogicalOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operations</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQueryDiagram_LogicalOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalOperation> getLogicalOperations();

	/**
	 * Returns the value of the '<em><b>Conditional Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link dsql.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expressions</em>' containment reference list.
	 * @see dsql.DsqlPackage#getQueryDiagram_ConditionalExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpressions();

} // QueryDiagram

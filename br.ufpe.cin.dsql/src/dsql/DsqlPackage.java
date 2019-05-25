/**
 */
package dsql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsql.DsqlFactory
 * @model kind="package"
 * @generated
 */
public interface DsqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dsql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsqlPackage eINSTANCE = dsql.impl.DsqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsql.impl.QueryDiagramImpl <em>Query Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.QueryDiagramImpl
	 * @see dsql.impl.DsqlPackageImpl#getQueryDiagram()
	 * @generated
	 */
	int QUERY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM__DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM__QUERIES = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM__LINKS = 2;

	/**
	 * The feature id for the '<em><b>Logical Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM__LOGICAL_OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Conditional Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS = 4;

	/**
	 * The number of structural features of the '<em>Query Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dsql.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.QueryImpl
	 * @see dsql.impl.DsqlPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Limit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LIMIT_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Limit Row Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__LIMIT_ROW_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Set Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SET_QUANTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SELECT = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FROM = 5;

	/**
	 * The feature id for the '<em><b>Where Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__WHERE_HAVING = 6;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dsql.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ColumnReferenceImpl
	 * @see dsql.impl.DsqlPackageImpl#getColumnReference()
	 * @generated
	 */
	int COLUMN_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__GROUP_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__SORT_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__SORT_SPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__AGGREGATION_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__TABLE = 6;

	/**
	 * The number of structural features of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link dsql.impl.SourceAndExpressionImpl <em>Source And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.SourceAndExpressionImpl
	 * @see dsql.impl.DsqlPackageImpl#getSourceAndExpression()
	 * @generated
	 */
	int SOURCE_AND_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Source And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_AND_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsql.impl.SubqueryTargetImpl <em>Subquery Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.SubqueryTargetImpl
	 * @see dsql.impl.DsqlPackageImpl#getSubqueryTarget()
	 * @generated
	 */
	int SUBQUERY_TARGET = 16;

	/**
	 * The feature id for the '<em><b>Subquery Link Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_TARGET__SUBQUERY_LINK_TARGET = 0;

	/**
	 * The number of structural features of the '<em>Subquery Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsql.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.SourceImpl
	 * @see dsql.impl.DsqlPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Subquery Link Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SUBQUERY_LINK_TARGET = SUBQUERY_TARGET__SUBQUERY_LINK_TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TYPE = SUBQUERY_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = SUBQUERY_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ALIAS = SUBQUERY_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = SUBQUERY_TARGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsql.impl.OperandImpl <em>Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.OperandImpl
	 * @see dsql.impl.DsqlPackageImpl#getOperand()
	 * @generated
	 */
	int OPERAND = 7;

	/**
	 * The number of structural features of the '<em>Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERAND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsql.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ExpressionImpl
	 * @see dsql.impl.DsqlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__GROUP_ORDER = OPERAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SORT_ORDER = OPERAND_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ALIAS = OPERAND_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SORT_SPECIFICATION = OPERAND_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__AGGREGATION_FUNCTION = OPERAND_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TABLE = OPERAND_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = OPERAND_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link dsql.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.OperationImpl
	 * @see dsql.impl.DsqlPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__GROUP_ORDER = EXPRESSION__GROUP_ORDER;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SORT_ORDER = EXPRESSION__SORT_ORDER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ALIAS = EXPRESSION__ALIAS;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SORT_SPECIFICATION = EXPRESSION__SORT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__AGGREGATION_FUNCTION = EXPRESSION__AGGREGATION_FUNCTION;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TABLE = EXPRESSION__TABLE;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NEGATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dsql.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.UnaryImpl
	 * @see dsql.impl.DsqlPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__GROUP_ORDER = OPERATION__GROUP_ORDER;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__SORT_ORDER = OPERATION__SORT_ORDER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__ALIAS = OPERATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__SORT_SPECIFICATION = OPERATION__SORT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__AGGREGATION_FUNCTION = OPERATION__AGGREGATION_FUNCTION;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__TABLE = OPERATION__TABLE;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__NEGATION = OPERATION__NEGATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERAND1 = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsql.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.BinaryImpl
	 * @see dsql.impl.DsqlPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__GROUP_ORDER = OPERATION__GROUP_ORDER;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SORT_ORDER = OPERATION__SORT_ORDER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__ALIAS = OPERATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__SORT_SPECIFICATION = OPERATION__SORT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__AGGREGATION_FUNCTION = OPERATION__AGGREGATION_FUNCTION;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__TABLE = OPERATION__TABLE;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NEGATION = OPERATION__NEGATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERAND1 = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERAND2 = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsql.impl.TernaryImpl <em>Ternary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.TernaryImpl
	 * @see dsql.impl.DsqlPackageImpl#getTernary()
	 * @generated
	 */
	int TERNARY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__GROUP_ORDER = OPERATION__GROUP_ORDER;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__SORT_ORDER = OPERATION__SORT_ORDER;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__ALIAS = OPERATION__ALIAS;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__SORT_SPECIFICATION = OPERATION__SORT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__AGGREGATION_FUNCTION = OPERATION__AGGREGATION_FUNCTION;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__TABLE = OPERATION__TABLE;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__NEGATION = OPERATION__NEGATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__OPERATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__OPERAND1 = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__OPERAND2 = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operand3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY__OPERAND3 = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ternary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERNARY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsql.impl.LogicalOperationImpl <em>Logical Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.LogicalOperationImpl
	 * @see dsql.impl.DsqlPackageImpl#getLogicalOperation()
	 * @generated
	 */
	int LOGICAL_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Negation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__NEGATION = 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION__EXPRESSIONS = 2;

	/**
	 * The number of structural features of the '<em>Logical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dsql.impl.ConditionalExpressionSourceImpl <em>Conditional Expression Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ConditionalExpressionSourceImpl
	 * @see dsql.impl.DsqlPackageImpl#getConditionalExpressionSource()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Conditional Expression Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK = 0;

	/**
	 * The number of structural features of the '<em>Conditional Expression Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dsql.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ConditionalExpressionImpl
	 * @see dsql.impl.DsqlPackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsql.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.WhenImpl
	 * @see dsql.impl.DsqlPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 14;

	/**
	 * The feature id for the '<em><b>Conditional Expression Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__CONDITIONAL_EXPRESSION_LINK = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__LABEL = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__CONDITION = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__RESULT = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsql.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ElseImpl
	 * @see dsql.impl.DsqlPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__LABEL = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__RESULT = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = CONDITIONAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsql.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ColumnImpl
	 * @see dsql.impl.DsqlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Subquery Link Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SUBQUERY_LINK_TARGET = SUBQUERY_TARGET__SUBQUERY_LINK_TARGET;

	/**
	 * The feature id for the '<em><b>Conditional Expression Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONDITIONAL_EXPRESSION_LINK = SUBQUERY_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = SUBQUERY_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__GROUP_ORDER = SUBQUERY_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SORT_ORDER = SUBQUERY_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ALIAS = SUBQUERY_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sort Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SORT_SPECIFICATION = SUBQUERY_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aggregation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__AGGREGATION_FUNCTION = SUBQUERY_TARGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = SUBQUERY_TARGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = SUBQUERY_TARGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Logical Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__LOGICAL_LINK = SUBQUERY_TARGET_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = SUBQUERY_TARGET_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link dsql.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.LinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 18;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsql.impl.SetLinkImpl <em>Set Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.SetLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getSetLink()
	 * @generated
	 */
	int SET_LINK = 19;

	/**
	 * The feature id for the '<em><b>Set Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LINK__SET_QUANTIFIER = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LINK__SET_OPERATOR = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LINK__SOURCE = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LINK__TARGET = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsql.impl.JoinLinkImpl <em>Join Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.JoinLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getJoinLink()
	 * @generated
	 */
	int JOIN_LINK = 20;

	/**
	 * The feature id for the '<em><b>Foreign Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_LINK__FOREIGN_KEY_NAME = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_LINK__JOIN_TYPE = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_LINK__SOURCE = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_LINK__TARGET = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Join Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dsql.impl.JoinConditionLinkImpl <em>Join Condition Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.JoinConditionLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getJoinConditionLink()
	 * @generated
	 */
	int JOIN_CONDITION_LINK = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Condition Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CONDITION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsql.impl.SubqueryLinkImpl <em>Subquery Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.SubqueryLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getSubqueryLink()
	 * @generated
	 */
	int SUBQUERY_LINK = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_LINK__OPERATION = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_LINK__SOURCE = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_LINK__TARGET = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subquery Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBQUERY_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dsql.impl.LogicalLinkImpl <em>Logical Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.LogicalLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getLogicalLink()
	 * @generated
	 */
	int LOGICAL_LINK = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsql.impl.ConditionalExpressionLinkImpl <em>Conditional Expression Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.impl.ConditionalExpressionLinkImpl
	 * @see dsql.impl.DsqlPackageImpl#getConditionalExpressionLink()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION_LINK = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Expression Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dsql.SetOperator <em>Set Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.SetOperator
	 * @see dsql.impl.DsqlPackageImpl#getSetOperator()
	 * @generated
	 */
	int SET_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link dsql.JoinType <em>Join Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.JoinType
	 * @see dsql.impl.DsqlPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 26;

	/**
	 * The meta object id for the '{@link dsql.LogicalOperationType <em>Logical Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.LogicalOperationType
	 * @see dsql.impl.DsqlPackageImpl#getLogicalOperationType()
	 * @generated
	 */
	int LOGICAL_OPERATION_TYPE = 27;

	/**
	 * The meta object id for the '{@link dsql.ColumnType <em>Column Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.ColumnType
	 * @see dsql.impl.DsqlPackageImpl#getColumnType()
	 * @generated
	 */
	int COLUMN_TYPE = 28;

	/**
	 * The meta object id for the '{@link dsql.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.SourceType
	 * @see dsql.impl.DsqlPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 29;

	/**
	 * The meta object id for the '{@link dsql.SetQuantifier <em>Set Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.SetQuantifier
	 * @see dsql.impl.DsqlPackageImpl#getSetQuantifier()
	 * @generated
	 */
	int SET_QUANTIFIER = 30;

	/**
	 * The meta object id for the '{@link dsql.SortSpecification <em>Sort Specification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.SortSpecification
	 * @see dsql.impl.DsqlPackageImpl#getSortSpecification()
	 * @generated
	 */
	int SORT_SPECIFICATION = 31;

	/**
	 * The meta object id for the '{@link dsql.AggregationFunction <em>Aggregation Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.AggregationFunction
	 * @see dsql.impl.DsqlPackageImpl#getAggregationFunction()
	 * @generated
	 */
	int AGGREGATION_FUNCTION = 32;

	/**
	 * The meta object id for the '{@link dsql.UnaryOp <em>Unary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.UnaryOp
	 * @see dsql.impl.DsqlPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 33;

	/**
	 * The meta object id for the '{@link dsql.BinaryOp <em>Binary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.BinaryOp
	 * @see dsql.impl.DsqlPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 34;

	/**
	 * The meta object id for the '{@link dsql.TernaryOp <em>Ternary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsql.TernaryOp
	 * @see dsql.impl.DsqlPackageImpl#getTernaryOp()
	 * @generated
	 */
	int TERNARY_OP = 35;


	/**
	 * Returns the meta object for class '{@link dsql.QueryDiagram <em>Query Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Diagram</em>'.
	 * @see dsql.QueryDiagram
	 * @generated
	 */
	EClass getQueryDiagram();

	/**
	 * Returns the meta object for the attribute '{@link dsql.QueryDiagram#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see dsql.QueryDiagram#getDataSource()
	 * @see #getQueryDiagram()
	 * @generated
	 */
	EAttribute getQueryDiagram_DataSource();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.QueryDiagram#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see dsql.QueryDiagram#getQueries()
	 * @see #getQueryDiagram()
	 * @generated
	 */
	EReference getQueryDiagram_Queries();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.QueryDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see dsql.QueryDiagram#getLinks()
	 * @see #getQueryDiagram()
	 * @generated
	 */
	EReference getQueryDiagram_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.QueryDiagram#getLogicalOperations <em>Logical Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Operations</em>'.
	 * @see dsql.QueryDiagram#getLogicalOperations()
	 * @see #getQueryDiagram()
	 * @generated
	 */
	EReference getQueryDiagram_LogicalOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.QueryDiagram#getConditionalExpressions <em>Conditional Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Expressions</em>'.
	 * @see dsql.QueryDiagram#getConditionalExpressions()
	 * @see #getQueryDiagram()
	 * @generated
	 */
	EReference getQueryDiagram_ConditionalExpressions();

	/**
	 * Returns the meta object for class '{@link dsql.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see dsql.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Query#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsql.Query#getName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Query#getLimitOffset <em>Limit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Offset</em>'.
	 * @see dsql.Query#getLimitOffset()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_LimitOffset();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Query#getLimitRowCount <em>Limit Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit Row Count</em>'.
	 * @see dsql.Query#getLimitRowCount()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_LimitRowCount();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Query#getSetQuantifier <em>Set Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Quantifier</em>'.
	 * @see dsql.Query#getSetQuantifier()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_SetQuantifier();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.Query#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see dsql.Query#getSelect()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Select();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.Query#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From</em>'.
	 * @see dsql.Query#getFrom()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_From();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Query#getWhereHaving <em>Where Having</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Having</em>'.
	 * @see dsql.Query#getWhereHaving()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_WhereHaving();

	/**
	 * Returns the meta object for class '{@link dsql.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Reference</em>'.
	 * @see dsql.ColumnReference
	 * @generated
	 */
	EClass getColumnReference();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsql.ColumnReference#getName()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getGroupOrder <em>Group Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Order</em>'.
	 * @see dsql.ColumnReference#getGroupOrder()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_GroupOrder();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getSortOrder <em>Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Order</em>'.
	 * @see dsql.ColumnReference#getSortOrder()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_SortOrder();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dsql.ColumnReference#getAlias()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_Alias();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getSortSpecification <em>Sort Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Specification</em>'.
	 * @see dsql.ColumnReference#getSortSpecification()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_SortSpecification();

	/**
	 * Returns the meta object for the attribute '{@link dsql.ColumnReference#getAggregationFunction <em>Aggregation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Function</em>'.
	 * @see dsql.ColumnReference#getAggregationFunction()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_AggregationFunction();

	/**
	 * Returns the meta object for the reference '{@link dsql.ColumnReference#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see dsql.ColumnReference#getTable()
	 * @see #getColumnReference()
	 * @generated
	 */
	EReference getColumnReference_Table();

	/**
	 * Returns the meta object for class '{@link dsql.SourceAndExpression <em>Source And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source And Expression</em>'.
	 * @see dsql.SourceAndExpression
	 * @generated
	 */
	EClass getSourceAndExpression();

	/**
	 * Returns the meta object for class '{@link dsql.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see dsql.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Source#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsql.Source#getType()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsql.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Source#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see dsql.Source#getAlias()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Alias();

	/**
	 * Returns the meta object for class '{@link dsql.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see dsql.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link dsql.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see dsql.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Operation#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see dsql.Operation#isNegation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Negation();

	/**
	 * Returns the meta object for class '{@link dsql.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operand</em>'.
	 * @see dsql.Operand
	 * @generated
	 */
	EClass getOperand();

	/**
	 * Returns the meta object for class '{@link dsql.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see dsql.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Unary#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see dsql.Unary#getOperation()
	 * @see #getUnary()
	 * @generated
	 */
	EAttribute getUnary_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Unary#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand1</em>'.
	 * @see dsql.Unary#getOperand1()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Operand1();

	/**
	 * Returns the meta object for class '{@link dsql.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see dsql.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Binary#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see dsql.Binary#getOperation()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Binary#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand1</em>'.
	 * @see dsql.Binary#getOperand1()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Operand1();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Binary#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand2</em>'.
	 * @see dsql.Binary#getOperand2()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Operand2();

	/**
	 * Returns the meta object for class '{@link dsql.Ternary <em>Ternary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ternary</em>'.
	 * @see dsql.Ternary
	 * @generated
	 */
	EClass getTernary();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Ternary#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see dsql.Ternary#getOperation()
	 * @see #getTernary()
	 * @generated
	 */
	EAttribute getTernary_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Ternary#getOperand1 <em>Operand1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand1</em>'.
	 * @see dsql.Ternary#getOperand1()
	 * @see #getTernary()
	 * @generated
	 */
	EReference getTernary_Operand1();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Ternary#getOperand2 <em>Operand2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand2</em>'.
	 * @see dsql.Ternary#getOperand2()
	 * @see #getTernary()
	 * @generated
	 */
	EReference getTernary_Operand2();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Ternary#getOperand3 <em>Operand3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand3</em>'.
	 * @see dsql.Ternary#getOperand3()
	 * @see #getTernary()
	 * @generated
	 */
	EReference getTernary_Operand3();

	/**
	 * Returns the meta object for class '{@link dsql.LogicalOperation <em>Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operation</em>'.
	 * @see dsql.LogicalOperation
	 * @generated
	 */
	EClass getLogicalOperation();

	/**
	 * Returns the meta object for the attribute '{@link dsql.LogicalOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsql.LogicalOperation#getType()
	 * @see #getLogicalOperation()
	 * @generated
	 */
	EAttribute getLogicalOperation_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsql.LogicalOperation#isNegation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negation</em>'.
	 * @see dsql.LogicalOperation#isNegation()
	 * @see #getLogicalOperation()
	 * @generated
	 */
	EAttribute getLogicalOperation_Negation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsql.LogicalOperation#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see dsql.LogicalOperation#getExpressions()
	 * @see #getLogicalOperation()
	 * @generated
	 */
	EReference getLogicalOperation_Expressions();

	/**
	 * Returns the meta object for class '{@link dsql.ConditionalExpressionSource <em>Conditional Expression Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression Source</em>'.
	 * @see dsql.ConditionalExpressionSource
	 * @generated
	 */
	EClass getConditionalExpressionSource();

	/**
	 * Returns the meta object for the reference '{@link dsql.ConditionalExpressionSource#getConditionalExpressionLink <em>Conditional Expression Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conditional Expression Link</em>'.
	 * @see dsql.ConditionalExpressionSource#getConditionalExpressionLink()
	 * @see #getConditionalExpressionSource()
	 * @generated
	 */
	EReference getConditionalExpressionSource_ConditionalExpressionLink();

	/**
	 * Returns the meta object for class '{@link dsql.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see dsql.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for class '{@link dsql.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see dsql.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link dsql.When#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsql.When#getLabel()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.When#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see dsql.When#getCondition()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.When#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see dsql.When#getResult()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Result();

	/**
	 * Returns the meta object for class '{@link dsql.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see dsql.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Else#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dsql.Else#getLabel()
	 * @see #getElse()
	 * @generated
	 */
	EAttribute getElse_Label();

	/**
	 * Returns the meta object for the containment reference '{@link dsql.Else#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see dsql.Else#getResult()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Result();

	/**
	 * Returns the meta object for class '{@link dsql.SubqueryTarget <em>Subquery Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subquery Target</em>'.
	 * @see dsql.SubqueryTarget
	 * @generated
	 */
	EClass getSubqueryTarget();

	/**
	 * Returns the meta object for the reference '{@link dsql.SubqueryTarget#getSubqueryLinkTarget <em>Subquery Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subquery Link Target</em>'.
	 * @see dsql.SubqueryTarget#getSubqueryLinkTarget()
	 * @see #getSubqueryTarget()
	 * @generated
	 */
	EReference getSubqueryTarget_SubqueryLinkTarget();

	/**
	 * Returns the meta object for class '{@link dsql.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see dsql.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link dsql.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsql.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the reference '{@link dsql.Column#getLogicalLink <em>Logical Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Link</em>'.
	 * @see dsql.Column#getLogicalLink()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_LogicalLink();

	/**
	 * Returns the meta object for class '{@link dsql.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see dsql.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link dsql.SetLink <em>Set Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Link</em>'.
	 * @see dsql.SetLink
	 * @generated
	 */
	EClass getSetLink();

	/**
	 * Returns the meta object for the attribute '{@link dsql.SetLink#getSetQuantifier <em>Set Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Quantifier</em>'.
	 * @see dsql.SetLink#getSetQuantifier()
	 * @see #getSetLink()
	 * @generated
	 */
	EAttribute getSetLink_SetQuantifier();

	/**
	 * Returns the meta object for the attribute '{@link dsql.SetLink#getSetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Operator</em>'.
	 * @see dsql.SetLink#getSetOperator()
	 * @see #getSetLink()
	 * @generated
	 */
	EAttribute getSetLink_SetOperator();

	/**
	 * Returns the meta object for the reference '{@link dsql.SetLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.SetLink#getSource()
	 * @see #getSetLink()
	 * @generated
	 */
	EReference getSetLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.SetLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.SetLink#getTarget()
	 * @see #getSetLink()
	 * @generated
	 */
	EReference getSetLink_Target();

	/**
	 * Returns the meta object for class '{@link dsql.JoinLink <em>Join Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Link</em>'.
	 * @see dsql.JoinLink
	 * @generated
	 */
	EClass getJoinLink();

	/**
	 * Returns the meta object for the attribute '{@link dsql.JoinLink#getForeignKeyName <em>Foreign Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key Name</em>'.
	 * @see dsql.JoinLink#getForeignKeyName()
	 * @see #getJoinLink()
	 * @generated
	 */
	EAttribute getJoinLink_ForeignKeyName();

	/**
	 * Returns the meta object for the attribute '{@link dsql.JoinLink#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Type</em>'.
	 * @see dsql.JoinLink#getJoinType()
	 * @see #getJoinLink()
	 * @generated
	 */
	EAttribute getJoinLink_JoinType();

	/**
	 * Returns the meta object for the reference '{@link dsql.JoinLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.JoinLink#getSource()
	 * @see #getJoinLink()
	 * @generated
	 */
	EReference getJoinLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.JoinLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.JoinLink#getTarget()
	 * @see #getJoinLink()
	 * @generated
	 */
	EReference getJoinLink_Target();

	/**
	 * Returns the meta object for class '{@link dsql.JoinConditionLink <em>Join Condition Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Condition Link</em>'.
	 * @see dsql.JoinConditionLink
	 * @generated
	 */
	EClass getJoinConditionLink();

	/**
	 * Returns the meta object for the reference '{@link dsql.JoinConditionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.JoinConditionLink#getSource()
	 * @see #getJoinConditionLink()
	 * @generated
	 */
	EReference getJoinConditionLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.JoinConditionLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.JoinConditionLink#getTarget()
	 * @see #getJoinConditionLink()
	 * @generated
	 */
	EReference getJoinConditionLink_Target();

	/**
	 * Returns the meta object for class '{@link dsql.SubqueryLink <em>Subquery Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subquery Link</em>'.
	 * @see dsql.SubqueryLink
	 * @generated
	 */
	EClass getSubqueryLink();

	/**
	 * Returns the meta object for the attribute '{@link dsql.SubqueryLink#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see dsql.SubqueryLink#getOperation()
	 * @see #getSubqueryLink()
	 * @generated
	 */
	EAttribute getSubqueryLink_Operation();

	/**
	 * Returns the meta object for the reference '{@link dsql.SubqueryLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.SubqueryLink#getSource()
	 * @see #getSubqueryLink()
	 * @generated
	 */
	EReference getSubqueryLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.SubqueryLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.SubqueryLink#getTarget()
	 * @see #getSubqueryLink()
	 * @generated
	 */
	EReference getSubqueryLink_Target();

	/**
	 * Returns the meta object for class '{@link dsql.LogicalLink <em>Logical Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Link</em>'.
	 * @see dsql.LogicalLink
	 * @generated
	 */
	EClass getLogicalLink();

	/**
	 * Returns the meta object for the reference '{@link dsql.LogicalLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.LogicalLink#getSource()
	 * @see #getLogicalLink()
	 * @generated
	 */
	EReference getLogicalLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.LogicalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.LogicalLink#getTarget()
	 * @see #getLogicalLink()
	 * @generated
	 */
	EReference getLogicalLink_Target();

	/**
	 * Returns the meta object for class '{@link dsql.ConditionalExpressionLink <em>Conditional Expression Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression Link</em>'.
	 * @see dsql.ConditionalExpressionLink
	 * @generated
	 */
	EClass getConditionalExpressionLink();

	/**
	 * Returns the meta object for the reference '{@link dsql.ConditionalExpressionLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see dsql.ConditionalExpressionLink#getSource()
	 * @see #getConditionalExpressionLink()
	 * @generated
	 */
	EReference getConditionalExpressionLink_Source();

	/**
	 * Returns the meta object for the reference '{@link dsql.ConditionalExpressionLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dsql.ConditionalExpressionLink#getTarget()
	 * @see #getConditionalExpressionLink()
	 * @generated
	 */
	EReference getConditionalExpressionLink_Target();

	/**
	 * Returns the meta object for enum '{@link dsql.SetOperator <em>Set Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Set Operator</em>'.
	 * @see dsql.SetOperator
	 * @generated
	 */
	EEnum getSetOperator();

	/**
	 * Returns the meta object for enum '{@link dsql.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Type</em>'.
	 * @see dsql.JoinType
	 * @generated
	 */
	EEnum getJoinType();

	/**
	 * Returns the meta object for enum '{@link dsql.LogicalOperationType <em>Logical Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operation Type</em>'.
	 * @see dsql.LogicalOperationType
	 * @generated
	 */
	EEnum getLogicalOperationType();

	/**
	 * Returns the meta object for enum '{@link dsql.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Column Type</em>'.
	 * @see dsql.ColumnType
	 * @generated
	 */
	EEnum getColumnType();

	/**
	 * Returns the meta object for enum '{@link dsql.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see dsql.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the meta object for enum '{@link dsql.SetQuantifier <em>Set Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Set Quantifier</em>'.
	 * @see dsql.SetQuantifier
	 * @generated
	 */
	EEnum getSetQuantifier();

	/**
	 * Returns the meta object for enum '{@link dsql.SortSpecification <em>Sort Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Specification</em>'.
	 * @see dsql.SortSpecification
	 * @generated
	 */
	EEnum getSortSpecification();

	/**
	 * Returns the meta object for enum '{@link dsql.AggregationFunction <em>Aggregation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Function</em>'.
	 * @see dsql.AggregationFunction
	 * @generated
	 */
	EEnum getAggregationFunction();

	/**
	 * Returns the meta object for enum '{@link dsql.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Op</em>'.
	 * @see dsql.UnaryOp
	 * @generated
	 */
	EEnum getUnaryOp();

	/**
	 * Returns the meta object for enum '{@link dsql.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Op</em>'.
	 * @see dsql.BinaryOp
	 * @generated
	 */
	EEnum getBinaryOp();

	/**
	 * Returns the meta object for enum '{@link dsql.TernaryOp <em>Ternary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ternary Op</em>'.
	 * @see dsql.TernaryOp
	 * @generated
	 */
	EEnum getTernaryOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsqlFactory getDsqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsql.impl.QueryDiagramImpl <em>Query Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.QueryDiagramImpl
		 * @see dsql.impl.DsqlPackageImpl#getQueryDiagram()
		 * @generated
		 */
		EClass QUERY_DIAGRAM = eINSTANCE.getQueryDiagram();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_DIAGRAM__DATA_SOURCE = eINSTANCE.getQueryDiagram_DataSource();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DIAGRAM__QUERIES = eINSTANCE.getQueryDiagram_Queries();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DIAGRAM__LINKS = eINSTANCE.getQueryDiagram_Links();

		/**
		 * The meta object literal for the '<em><b>Logical Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DIAGRAM__LOGICAL_OPERATIONS = eINSTANCE.getQueryDiagram_LogicalOperations();

		/**
		 * The meta object literal for the '<em><b>Conditional Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS = eINSTANCE.getQueryDiagram_ConditionalExpressions();

		/**
		 * The meta object literal for the '{@link dsql.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.QueryImpl
		 * @see dsql.impl.DsqlPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Limit Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__LIMIT_OFFSET = eINSTANCE.getQuery_LimitOffset();

		/**
		 * The meta object literal for the '<em><b>Limit Row Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__LIMIT_ROW_COUNT = eINSTANCE.getQuery_LimitRowCount();

		/**
		 * The meta object literal for the '<em><b>Set Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__SET_QUANTIFIER = eINSTANCE.getQuery_SetQuantifier();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__SELECT = eINSTANCE.getQuery_Select();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FROM = eINSTANCE.getQuery_From();

		/**
		 * The meta object literal for the '<em><b>Where Having</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__WHERE_HAVING = eINSTANCE.getQuery_WhereHaving();

		/**
		 * The meta object literal for the '{@link dsql.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ColumnReferenceImpl
		 * @see dsql.impl.DsqlPackageImpl#getColumnReference()
		 * @generated
		 */
		EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__NAME = eINSTANCE.getColumnReference_Name();

		/**
		 * The meta object literal for the '<em><b>Group Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__GROUP_ORDER = eINSTANCE.getColumnReference_GroupOrder();

		/**
		 * The meta object literal for the '<em><b>Sort Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__SORT_ORDER = eINSTANCE.getColumnReference_SortOrder();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__ALIAS = eINSTANCE.getColumnReference_Alias();

		/**
		 * The meta object literal for the '<em><b>Sort Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__SORT_SPECIFICATION = eINSTANCE.getColumnReference_SortSpecification();

		/**
		 * The meta object literal for the '<em><b>Aggregation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__AGGREGATION_FUNCTION = eINSTANCE.getColumnReference_AggregationFunction();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REFERENCE__TABLE = eINSTANCE.getColumnReference_Table();

		/**
		 * The meta object literal for the '{@link dsql.impl.SourceAndExpressionImpl <em>Source And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.SourceAndExpressionImpl
		 * @see dsql.impl.DsqlPackageImpl#getSourceAndExpression()
		 * @generated
		 */
		EClass SOURCE_AND_EXPRESSION = eINSTANCE.getSourceAndExpression();

		/**
		 * The meta object literal for the '{@link dsql.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.SourceImpl
		 * @see dsql.impl.DsqlPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TYPE = eINSTANCE.getSource_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ALIAS = eINSTANCE.getSource_Alias();

		/**
		 * The meta object literal for the '{@link dsql.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ExpressionImpl
		 * @see dsql.impl.DsqlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link dsql.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.OperationImpl
		 * @see dsql.impl.DsqlPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NEGATION = eINSTANCE.getOperation_Negation();

		/**
		 * The meta object literal for the '{@link dsql.impl.OperandImpl <em>Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.OperandImpl
		 * @see dsql.impl.DsqlPackageImpl#getOperand()
		 * @generated
		 */
		EClass OPERAND = eINSTANCE.getOperand();

		/**
		 * The meta object literal for the '{@link dsql.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.UnaryImpl
		 * @see dsql.impl.DsqlPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY__OPERATION = eINSTANCE.getUnary_Operation();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__OPERAND1 = eINSTANCE.getUnary_Operand1();

		/**
		 * The meta object literal for the '{@link dsql.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.BinaryImpl
		 * @see dsql.impl.DsqlPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OPERATION = eINSTANCE.getBinary_Operation();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__OPERAND1 = eINSTANCE.getBinary_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__OPERAND2 = eINSTANCE.getBinary_Operand2();

		/**
		 * The meta object literal for the '{@link dsql.impl.TernaryImpl <em>Ternary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.TernaryImpl
		 * @see dsql.impl.DsqlPackageImpl#getTernary()
		 * @generated
		 */
		EClass TERNARY = eINSTANCE.getTernary();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERNARY__OPERATION = eINSTANCE.getTernary_Operation();

		/**
		 * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY__OPERAND1 = eINSTANCE.getTernary_Operand1();

		/**
		 * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY__OPERAND2 = eINSTANCE.getTernary_Operand2();

		/**
		 * The meta object literal for the '<em><b>Operand3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERNARY__OPERAND3 = eINSTANCE.getTernary_Operand3();

		/**
		 * The meta object literal for the '{@link dsql.impl.LogicalOperationImpl <em>Logical Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.LogicalOperationImpl
		 * @see dsql.impl.DsqlPackageImpl#getLogicalOperation()
		 * @generated
		 */
		EClass LOGICAL_OPERATION = eINSTANCE.getLogicalOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OPERATION__TYPE = eINSTANCE.getLogicalOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Negation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OPERATION__NEGATION = eINSTANCE.getLogicalOperation_Negation();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OPERATION__EXPRESSIONS = eINSTANCE.getLogicalOperation_Expressions();

		/**
		 * The meta object literal for the '{@link dsql.impl.ConditionalExpressionSourceImpl <em>Conditional Expression Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ConditionalExpressionSourceImpl
		 * @see dsql.impl.DsqlPackageImpl#getConditionalExpressionSource()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION_SOURCE = eINSTANCE.getConditionalExpressionSource();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK = eINSTANCE.getConditionalExpressionSource_ConditionalExpressionLink();

		/**
		 * The meta object literal for the '{@link dsql.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ConditionalExpressionImpl
		 * @see dsql.impl.DsqlPackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '{@link dsql.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.WhenImpl
		 * @see dsql.impl.DsqlPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__LABEL = eINSTANCE.getWhen_Label();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__CONDITION = eINSTANCE.getWhen_Condition();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__RESULT = eINSTANCE.getWhen_Result();

		/**
		 * The meta object literal for the '{@link dsql.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ElseImpl
		 * @see dsql.impl.DsqlPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELSE__LABEL = eINSTANCE.getElse_Label();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__RESULT = eINSTANCE.getElse_Result();

		/**
		 * The meta object literal for the '{@link dsql.impl.SubqueryTargetImpl <em>Subquery Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.SubqueryTargetImpl
		 * @see dsql.impl.DsqlPackageImpl#getSubqueryTarget()
		 * @generated
		 */
		EClass SUBQUERY_TARGET = eINSTANCE.getSubqueryTarget();

		/**
		 * The meta object literal for the '<em><b>Subquery Link Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBQUERY_TARGET__SUBQUERY_LINK_TARGET = eINSTANCE.getSubqueryTarget_SubqueryLinkTarget();

		/**
		 * The meta object literal for the '{@link dsql.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ColumnImpl
		 * @see dsql.impl.DsqlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Logical Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__LOGICAL_LINK = eINSTANCE.getColumn_LogicalLink();

		/**
		 * The meta object literal for the '{@link dsql.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.LinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link dsql.impl.SetLinkImpl <em>Set Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.SetLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getSetLink()
		 * @generated
		 */
		EClass SET_LINK = eINSTANCE.getSetLink();

		/**
		 * The meta object literal for the '<em><b>Set Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LINK__SET_QUANTIFIER = eINSTANCE.getSetLink_SetQuantifier();

		/**
		 * The meta object literal for the '<em><b>Set Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LINK__SET_OPERATOR = eINSTANCE.getSetLink_SetOperator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LINK__SOURCE = eINSTANCE.getSetLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LINK__TARGET = eINSTANCE.getSetLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.impl.JoinLinkImpl <em>Join Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.JoinLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getJoinLink()
		 * @generated
		 */
		EClass JOIN_LINK = eINSTANCE.getJoinLink();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_LINK__FOREIGN_KEY_NAME = eINSTANCE.getJoinLink_ForeignKeyName();

		/**
		 * The meta object literal for the '<em><b>Join Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_LINK__JOIN_TYPE = eINSTANCE.getJoinLink_JoinType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_LINK__SOURCE = eINSTANCE.getJoinLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_LINK__TARGET = eINSTANCE.getJoinLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.impl.JoinConditionLinkImpl <em>Join Condition Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.JoinConditionLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getJoinConditionLink()
		 * @generated
		 */
		EClass JOIN_CONDITION_LINK = eINSTANCE.getJoinConditionLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CONDITION_LINK__SOURCE = eINSTANCE.getJoinConditionLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CONDITION_LINK__TARGET = eINSTANCE.getJoinConditionLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.impl.SubqueryLinkImpl <em>Subquery Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.SubqueryLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getSubqueryLink()
		 * @generated
		 */
		EClass SUBQUERY_LINK = eINSTANCE.getSubqueryLink();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBQUERY_LINK__OPERATION = eINSTANCE.getSubqueryLink_Operation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBQUERY_LINK__SOURCE = eINSTANCE.getSubqueryLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBQUERY_LINK__TARGET = eINSTANCE.getSubqueryLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.impl.LogicalLinkImpl <em>Logical Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.LogicalLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getLogicalLink()
		 * @generated
		 */
		EClass LOGICAL_LINK = eINSTANCE.getLogicalLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_LINK__SOURCE = eINSTANCE.getLogicalLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_LINK__TARGET = eINSTANCE.getLogicalLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.impl.ConditionalExpressionLinkImpl <em>Conditional Expression Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.impl.ConditionalExpressionLinkImpl
		 * @see dsql.impl.DsqlPackageImpl#getConditionalExpressionLink()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION_LINK = eINSTANCE.getConditionalExpressionLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION_LINK__SOURCE = eINSTANCE.getConditionalExpressionLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION_LINK__TARGET = eINSTANCE.getConditionalExpressionLink_Target();

		/**
		 * The meta object literal for the '{@link dsql.SetOperator <em>Set Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.SetOperator
		 * @see dsql.impl.DsqlPackageImpl#getSetOperator()
		 * @generated
		 */
		EEnum SET_OPERATOR = eINSTANCE.getSetOperator();

		/**
		 * The meta object literal for the '{@link dsql.JoinType <em>Join Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.JoinType
		 * @see dsql.impl.DsqlPackageImpl#getJoinType()
		 * @generated
		 */
		EEnum JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '{@link dsql.LogicalOperationType <em>Logical Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.LogicalOperationType
		 * @see dsql.impl.DsqlPackageImpl#getLogicalOperationType()
		 * @generated
		 */
		EEnum LOGICAL_OPERATION_TYPE = eINSTANCE.getLogicalOperationType();

		/**
		 * The meta object literal for the '{@link dsql.ColumnType <em>Column Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.ColumnType
		 * @see dsql.impl.DsqlPackageImpl#getColumnType()
		 * @generated
		 */
		EEnum COLUMN_TYPE = eINSTANCE.getColumnType();

		/**
		 * The meta object literal for the '{@link dsql.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.SourceType
		 * @see dsql.impl.DsqlPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '{@link dsql.SetQuantifier <em>Set Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.SetQuantifier
		 * @see dsql.impl.DsqlPackageImpl#getSetQuantifier()
		 * @generated
		 */
		EEnum SET_QUANTIFIER = eINSTANCE.getSetQuantifier();

		/**
		 * The meta object literal for the '{@link dsql.SortSpecification <em>Sort Specification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.SortSpecification
		 * @see dsql.impl.DsqlPackageImpl#getSortSpecification()
		 * @generated
		 */
		EEnum SORT_SPECIFICATION = eINSTANCE.getSortSpecification();

		/**
		 * The meta object literal for the '{@link dsql.AggregationFunction <em>Aggregation Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.AggregationFunction
		 * @see dsql.impl.DsqlPackageImpl#getAggregationFunction()
		 * @generated
		 */
		EEnum AGGREGATION_FUNCTION = eINSTANCE.getAggregationFunction();

		/**
		 * The meta object literal for the '{@link dsql.UnaryOp <em>Unary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.UnaryOp
		 * @see dsql.impl.DsqlPackageImpl#getUnaryOp()
		 * @generated
		 */
		EEnum UNARY_OP = eINSTANCE.getUnaryOp();

		/**
		 * The meta object literal for the '{@link dsql.BinaryOp <em>Binary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.BinaryOp
		 * @see dsql.impl.DsqlPackageImpl#getBinaryOp()
		 * @generated
		 */
		EEnum BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '{@link dsql.TernaryOp <em>Ternary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsql.TernaryOp
		 * @see dsql.impl.DsqlPackageImpl#getTernaryOp()
		 * @generated
		 */
		EEnum TERNARY_OP = eINSTANCE.getTernaryOp();

	}

} //DsqlPackage

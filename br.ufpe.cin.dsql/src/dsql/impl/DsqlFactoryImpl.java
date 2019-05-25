/**
 */
package dsql.impl;

import dsql.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsqlFactoryImpl extends EFactoryImpl implements DsqlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsqlFactory init() {
		try {
			DsqlFactory theDsqlFactory = (DsqlFactory)EPackage.Registry.INSTANCE.getEFactory(DsqlPackage.eNS_URI);
			if (theDsqlFactory != null) {
				return theDsqlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsqlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsqlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DsqlPackage.QUERY_DIAGRAM: return createQueryDiagram();
			case DsqlPackage.QUERY: return createQuery();
			case DsqlPackage.SOURCE: return createSource();
			case DsqlPackage.UNARY: return createUnary();
			case DsqlPackage.BINARY: return createBinary();
			case DsqlPackage.TERNARY: return createTernary();
			case DsqlPackage.LOGICAL_OPERATION: return createLogicalOperation();
			case DsqlPackage.WHEN: return createWhen();
			case DsqlPackage.ELSE: return createElse();
			case DsqlPackage.COLUMN: return createColumn();
			case DsqlPackage.SET_LINK: return createSetLink();
			case DsqlPackage.JOIN_LINK: return createJoinLink();
			case DsqlPackage.JOIN_CONDITION_LINK: return createJoinConditionLink();
			case DsqlPackage.SUBQUERY_LINK: return createSubqueryLink();
			case DsqlPackage.LOGICAL_LINK: return createLogicalLink();
			case DsqlPackage.CONDITIONAL_EXPRESSION_LINK: return createConditionalExpressionLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DsqlPackage.SET_OPERATOR:
				return createSetOperatorFromString(eDataType, initialValue);
			case DsqlPackage.JOIN_TYPE:
				return createJoinTypeFromString(eDataType, initialValue);
			case DsqlPackage.LOGICAL_OPERATION_TYPE:
				return createLogicalOperationTypeFromString(eDataType, initialValue);
			case DsqlPackage.COLUMN_TYPE:
				return createColumnTypeFromString(eDataType, initialValue);
			case DsqlPackage.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			case DsqlPackage.SET_QUANTIFIER:
				return createSetQuantifierFromString(eDataType, initialValue);
			case DsqlPackage.SORT_SPECIFICATION:
				return createSortSpecificationFromString(eDataType, initialValue);
			case DsqlPackage.AGGREGATION_FUNCTION:
				return createAggregationFunctionFromString(eDataType, initialValue);
			case DsqlPackage.UNARY_OP:
				return createUnaryOpFromString(eDataType, initialValue);
			case DsqlPackage.BINARY_OP:
				return createBinaryOpFromString(eDataType, initialValue);
			case DsqlPackage.TERNARY_OP:
				return createTernaryOpFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DsqlPackage.SET_OPERATOR:
				return convertSetOperatorToString(eDataType, instanceValue);
			case DsqlPackage.JOIN_TYPE:
				return convertJoinTypeToString(eDataType, instanceValue);
			case DsqlPackage.LOGICAL_OPERATION_TYPE:
				return convertLogicalOperationTypeToString(eDataType, instanceValue);
			case DsqlPackage.COLUMN_TYPE:
				return convertColumnTypeToString(eDataType, instanceValue);
			case DsqlPackage.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			case DsqlPackage.SET_QUANTIFIER:
				return convertSetQuantifierToString(eDataType, instanceValue);
			case DsqlPackage.SORT_SPECIFICATION:
				return convertSortSpecificationToString(eDataType, instanceValue);
			case DsqlPackage.AGGREGATION_FUNCTION:
				return convertAggregationFunctionToString(eDataType, instanceValue);
			case DsqlPackage.UNARY_OP:
				return convertUnaryOpToString(eDataType, instanceValue);
			case DsqlPackage.BINARY_OP:
				return convertBinaryOpToString(eDataType, instanceValue);
			case DsqlPackage.TERNARY_OP:
				return convertTernaryOpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDiagram createQueryDiagram() {
		QueryDiagramImpl queryDiagram = new QueryDiagramImpl();
		return queryDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unary createUnary() {
		UnaryImpl unary = new UnaryImpl();
		return unary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ternary createTernary() {
		TernaryImpl ternary = new TernaryImpl();
		return ternary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperation createLogicalOperation() {
		LogicalOperationImpl logicalOperation = new LogicalOperationImpl();
		return logicalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When createWhen() {
		WhenImpl when = new WhenImpl();
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLink createSetLink() {
		SetLinkImpl setLink = new SetLinkImpl();
		return setLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinLink createJoinLink() {
		JoinLinkImpl joinLink = new JoinLinkImpl();
		return joinLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinConditionLink createJoinConditionLink() {
		JoinConditionLinkImpl joinConditionLink = new JoinConditionLinkImpl();
		return joinConditionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryLink createSubqueryLink() {
		SubqueryLinkImpl subqueryLink = new SubqueryLinkImpl();
		return subqueryLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLink createLogicalLink() {
		LogicalLinkImpl logicalLink = new LogicalLinkImpl();
		return logicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpressionLink createConditionalExpressionLink() {
		ConditionalExpressionLinkImpl conditionalExpressionLink = new ConditionalExpressionLinkImpl();
		return conditionalExpressionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOperator createSetOperatorFromString(EDataType eDataType, String initialValue) {
		SetOperator result = SetOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinTypeFromString(EDataType eDataType, String initialValue) {
		JoinType result = JoinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperationType createLogicalOperationTypeFromString(EDataType eDataType, String initialValue) {
		LogicalOperationType result = LogicalOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnTypeFromString(EDataType eDataType, String initialValue) {
		ColumnType result = ColumnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetQuantifier createSetQuantifierFromString(EDataType eDataType, String initialValue) {
		SetQuantifier result = SetQuantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortSpecification createSortSpecificationFromString(EDataType eDataType, String initialValue) {
		SortSpecification result = SortSpecification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortSpecificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationFunction createAggregationFunctionFromString(EDataType eDataType, String initialValue) {
		AggregationFunction result = AggregationFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue) {
		UnaryOp result = UnaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp createBinaryOpFromString(EDataType eDataType, String initialValue) {
		BinaryOp result = BinaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryOp createTernaryOpFromString(EDataType eDataType, String initialValue) {
		TernaryOp result = TernaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTernaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsqlPackage getDsqlPackage() {
		return (DsqlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsqlPackage getPackage() {
		return DsqlPackage.eINSTANCE;
	}

} //DsqlFactoryImpl

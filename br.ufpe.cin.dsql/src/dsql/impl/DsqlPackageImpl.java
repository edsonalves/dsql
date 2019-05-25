/**
 */
package dsql.impl;

import dsql.AggregationFunction;
import dsql.Binary;
import dsql.BinaryOp;
import dsql.Column;
import dsql.ColumnReference;
import dsql.ColumnType;
import dsql.ConditionalExpression;
import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.DsqlFactory;
import dsql.DsqlPackage;
import dsql.Else;
import dsql.Expression;
import dsql.JoinConditionLink;
import dsql.JoinLink;
import dsql.JoinType;
import dsql.Link;
import dsql.LogicalLink;
import dsql.LogicalOperation;
import dsql.LogicalOperationType;
import dsql.Operand;
import dsql.Operation;
import dsql.Query;
import dsql.QueryDiagram;
import dsql.SetLink;
import dsql.SetOperator;
import dsql.SetQuantifier;
import dsql.SortSpecification;
import dsql.Source;
import dsql.SourceAndExpression;
import dsql.SourceType;
import dsql.SubqueryLink;
import dsql.SubqueryTarget;
import dsql.Ternary;
import dsql.TernaryOp;
import dsql.Unary;
import dsql.UnaryOp;
import dsql.When;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsqlPackageImpl extends EPackageImpl implements DsqlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceAndExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ternaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinConditionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum columnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setQuantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortSpecificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ternaryOpEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dsql.DsqlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsqlPackageImpl() {
		super(eNS_URI, DsqlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DsqlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsqlPackage init() {
		if (isInited) return (DsqlPackage)EPackage.Registry.INSTANCE.getEPackage(DsqlPackage.eNS_URI);

		// Obtain or create and register package
		DsqlPackageImpl theDsqlPackage = (DsqlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsqlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DsqlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDsqlPackage.createPackageContents();

		// Initialize created meta-data
		theDsqlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsqlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsqlPackage.eNS_URI, theDsqlPackage);
		return theDsqlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDiagram() {
		return queryDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryDiagram_DataSource() {
		return (EAttribute)queryDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDiagram_Queries() {
		return (EReference)queryDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDiagram_Links() {
		return (EReference)queryDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDiagram_LogicalOperations() {
		return (EReference)queryDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDiagram_ConditionalExpressions() {
		return (EReference)queryDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_Name() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_LimitOffset() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_LimitRowCount() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuery_SetQuantifier() {
		return (EAttribute)queryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Select() {
		return (EReference)queryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_From() {
		return (EReference)queryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_WhereHaving() {
		return (EReference)queryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnReference() {
		return columnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_Name() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_GroupOrder() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_SortOrder() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_Alias() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_SortSpecification() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnReference_AggregationFunction() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnReference_Table() {
		return (EReference)columnReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceAndExpression() {
		return sourceAndExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Type() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Name() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Alias() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Negation() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperand() {
		return operandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnary() {
		return unaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnary_Operation() {
		return (EAttribute)unaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnary_Operand1() {
		return (EReference)unaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Operation() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Operand1() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Operand2() {
		return (EReference)binaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTernary() {
		return ternaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTernary_Operation() {
		return (EAttribute)ternaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernary_Operand1() {
		return (EReference)ternaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernary_Operand2() {
		return (EReference)ternaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTernary_Operand3() {
		return (EReference)ternaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperation() {
		return logicalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalOperation_Type() {
		return (EAttribute)logicalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalOperation_Negation() {
		return (EAttribute)logicalOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalOperation_Expressions() {
		return (EReference)logicalOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpressionSource() {
		return conditionalExpressionSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpressionSource_ConditionalExpressionLink() {
		return (EReference)conditionalExpressionSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhen() {
		return whenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhen_Label() {
		return (EAttribute)whenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Condition() {
		return (EReference)whenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhen_Result() {
		return (EReference)whenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElse() {
		return elseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElse_Label() {
		return (EAttribute)elseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElse_Result() {
		return (EReference)elseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryTarget() {
		return subqueryTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryTarget_SubqueryLinkTarget() {
		return (EReference)subqueryTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Type() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_LogicalLink() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLink() {
		return setLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLink_SetQuantifier() {
		return (EAttribute)setLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetLink_SetOperator() {
		return (EAttribute)setLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLink_Source() {
		return (EReference)setLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLink_Target() {
		return (EReference)setLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinLink() {
		return joinLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinLink_ForeignKeyName() {
		return (EAttribute)joinLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinLink_JoinType() {
		return (EAttribute)joinLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinLink_Source() {
		return (EReference)joinLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinLink_Target() {
		return (EReference)joinLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinConditionLink() {
		return joinConditionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinConditionLink_Source() {
		return (EReference)joinConditionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinConditionLink_Target() {
		return (EReference)joinConditionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryLink() {
		return subqueryLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryLink_Operation() {
		return (EAttribute)subqueryLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryLink_Source() {
		return (EReference)subqueryLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryLink_Target() {
		return (EReference)subqueryLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalLink() {
		return logicalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalLink_Source() {
		return (EReference)logicalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalLink_Target() {
		return (EReference)logicalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpressionLink() {
		return conditionalExpressionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpressionLink_Source() {
		return (EReference)conditionalExpressionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpressionLink_Target() {
		return (EReference)conditionalExpressionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetOperator() {
		return setOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoinType() {
		return joinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperationType() {
		return logicalOperationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColumnType() {
		return columnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceType() {
		return sourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetQuantifier() {
		return setQuantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortSpecification() {
		return sortSpecificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationFunction() {
		return aggregationFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOp() {
		return unaryOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOp() {
		return binaryOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTernaryOp() {
		return ternaryOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsqlFactory getDsqlFactory() {
		return (DsqlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		queryDiagramEClass = createEClass(QUERY_DIAGRAM);
		createEAttribute(queryDiagramEClass, QUERY_DIAGRAM__DATA_SOURCE);
		createEReference(queryDiagramEClass, QUERY_DIAGRAM__QUERIES);
		createEReference(queryDiagramEClass, QUERY_DIAGRAM__LINKS);
		createEReference(queryDiagramEClass, QUERY_DIAGRAM__LOGICAL_OPERATIONS);
		createEReference(queryDiagramEClass, QUERY_DIAGRAM__CONDITIONAL_EXPRESSIONS);

		queryEClass = createEClass(QUERY);
		createEAttribute(queryEClass, QUERY__NAME);
		createEAttribute(queryEClass, QUERY__LIMIT_OFFSET);
		createEAttribute(queryEClass, QUERY__LIMIT_ROW_COUNT);
		createEAttribute(queryEClass, QUERY__SET_QUANTIFIER);
		createEReference(queryEClass, QUERY__SELECT);
		createEReference(queryEClass, QUERY__FROM);
		createEReference(queryEClass, QUERY__WHERE_HAVING);

		columnReferenceEClass = createEClass(COLUMN_REFERENCE);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__NAME);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__GROUP_ORDER);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__SORT_ORDER);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__ALIAS);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__SORT_SPECIFICATION);
		createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__AGGREGATION_FUNCTION);
		createEReference(columnReferenceEClass, COLUMN_REFERENCE__TABLE);

		sourceAndExpressionEClass = createEClass(SOURCE_AND_EXPRESSION);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__TYPE);
		createEAttribute(sourceEClass, SOURCE__NAME);
		createEAttribute(sourceEClass, SOURCE__ALIAS);

		expressionEClass = createEClass(EXPRESSION);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NEGATION);

		operandEClass = createEClass(OPERAND);

		unaryEClass = createEClass(UNARY);
		createEAttribute(unaryEClass, UNARY__OPERATION);
		createEReference(unaryEClass, UNARY__OPERAND1);

		binaryEClass = createEClass(BINARY);
		createEAttribute(binaryEClass, BINARY__OPERATION);
		createEReference(binaryEClass, BINARY__OPERAND1);
		createEReference(binaryEClass, BINARY__OPERAND2);

		ternaryEClass = createEClass(TERNARY);
		createEAttribute(ternaryEClass, TERNARY__OPERATION);
		createEReference(ternaryEClass, TERNARY__OPERAND1);
		createEReference(ternaryEClass, TERNARY__OPERAND2);
		createEReference(ternaryEClass, TERNARY__OPERAND3);

		logicalOperationEClass = createEClass(LOGICAL_OPERATION);
		createEAttribute(logicalOperationEClass, LOGICAL_OPERATION__TYPE);
		createEAttribute(logicalOperationEClass, LOGICAL_OPERATION__NEGATION);
		createEReference(logicalOperationEClass, LOGICAL_OPERATION__EXPRESSIONS);

		conditionalExpressionSourceEClass = createEClass(CONDITIONAL_EXPRESSION_SOURCE);
		createEReference(conditionalExpressionSourceEClass, CONDITIONAL_EXPRESSION_SOURCE__CONDITIONAL_EXPRESSION_LINK);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);

		whenEClass = createEClass(WHEN);
		createEAttribute(whenEClass, WHEN__LABEL);
		createEReference(whenEClass, WHEN__CONDITION);
		createEReference(whenEClass, WHEN__RESULT);

		elseEClass = createEClass(ELSE);
		createEAttribute(elseEClass, ELSE__LABEL);
		createEReference(elseEClass, ELSE__RESULT);

		subqueryTargetEClass = createEClass(SUBQUERY_TARGET);
		createEReference(subqueryTargetEClass, SUBQUERY_TARGET__SUBQUERY_LINK_TARGET);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__TYPE);
		createEReference(columnEClass, COLUMN__LOGICAL_LINK);

		linkEClass = createEClass(LINK);

		setLinkEClass = createEClass(SET_LINK);
		createEAttribute(setLinkEClass, SET_LINK__SET_QUANTIFIER);
		createEAttribute(setLinkEClass, SET_LINK__SET_OPERATOR);
		createEReference(setLinkEClass, SET_LINK__SOURCE);
		createEReference(setLinkEClass, SET_LINK__TARGET);

		joinLinkEClass = createEClass(JOIN_LINK);
		createEAttribute(joinLinkEClass, JOIN_LINK__FOREIGN_KEY_NAME);
		createEAttribute(joinLinkEClass, JOIN_LINK__JOIN_TYPE);
		createEReference(joinLinkEClass, JOIN_LINK__SOURCE);
		createEReference(joinLinkEClass, JOIN_LINK__TARGET);

		joinConditionLinkEClass = createEClass(JOIN_CONDITION_LINK);
		createEReference(joinConditionLinkEClass, JOIN_CONDITION_LINK__SOURCE);
		createEReference(joinConditionLinkEClass, JOIN_CONDITION_LINK__TARGET);

		subqueryLinkEClass = createEClass(SUBQUERY_LINK);
		createEAttribute(subqueryLinkEClass, SUBQUERY_LINK__OPERATION);
		createEReference(subqueryLinkEClass, SUBQUERY_LINK__SOURCE);
		createEReference(subqueryLinkEClass, SUBQUERY_LINK__TARGET);

		logicalLinkEClass = createEClass(LOGICAL_LINK);
		createEReference(logicalLinkEClass, LOGICAL_LINK__SOURCE);
		createEReference(logicalLinkEClass, LOGICAL_LINK__TARGET);

		conditionalExpressionLinkEClass = createEClass(CONDITIONAL_EXPRESSION_LINK);
		createEReference(conditionalExpressionLinkEClass, CONDITIONAL_EXPRESSION_LINK__SOURCE);
		createEReference(conditionalExpressionLinkEClass, CONDITIONAL_EXPRESSION_LINK__TARGET);

		// Create enums
		setOperatorEEnum = createEEnum(SET_OPERATOR);
		joinTypeEEnum = createEEnum(JOIN_TYPE);
		logicalOperationTypeEEnum = createEEnum(LOGICAL_OPERATION_TYPE);
		columnTypeEEnum = createEEnum(COLUMN_TYPE);
		sourceTypeEEnum = createEEnum(SOURCE_TYPE);
		setQuantifierEEnum = createEEnum(SET_QUANTIFIER);
		sortSpecificationEEnum = createEEnum(SORT_SPECIFICATION);
		aggregationFunctionEEnum = createEEnum(AGGREGATION_FUNCTION);
		unaryOpEEnum = createEEnum(UNARY_OP);
		binaryOpEEnum = createEEnum(BINARY_OP);
		ternaryOpEEnum = createEEnum(TERNARY_OP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceEClass.getESuperTypes().add(this.getSubqueryTarget());
		sourceEClass.getESuperTypes().add(this.getSourceAndExpression());
		expressionEClass.getESuperTypes().add(this.getOperand());
		expressionEClass.getESuperTypes().add(this.getSourceAndExpression());
		expressionEClass.getESuperTypes().add(this.getColumnReference());
		operationEClass.getESuperTypes().add(this.getExpression());
		unaryEClass.getESuperTypes().add(this.getOperation());
		binaryEClass.getESuperTypes().add(this.getOperation());
		ternaryEClass.getESuperTypes().add(this.getOperation());
		whenEClass.getESuperTypes().add(this.getConditionalExpression());
		whenEClass.getESuperTypes().add(this.getConditionalExpressionSource());
		elseEClass.getESuperTypes().add(this.getConditionalExpression());
		columnEClass.getESuperTypes().add(this.getSubqueryTarget());
		columnEClass.getESuperTypes().add(this.getConditionalExpressionSource());
		columnEClass.getESuperTypes().add(this.getExpression());
		setLinkEClass.getESuperTypes().add(this.getLink());
		joinLinkEClass.getESuperTypes().add(this.getLink());
		joinConditionLinkEClass.getESuperTypes().add(this.getLink());
		subqueryLinkEClass.getESuperTypes().add(this.getLink());
		logicalLinkEClass.getESuperTypes().add(this.getLink());
		conditionalExpressionLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(queryDiagramEClass, QueryDiagram.class, "QueryDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryDiagram_DataSource(), ecorePackage.getEString(), "dataSource", null, 0, 1, QueryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryDiagram_Queries(), this.getQuery(), null, "queries", null, 0, -1, QueryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryDiagram_Links(), this.getLink(), null, "links", null, 0, -1, QueryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryDiagram_LogicalOperations(), this.getLogicalOperation(), null, "logicalOperations", null, 0, -1, QueryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryDiagram_ConditionalExpressions(), this.getConditionalExpression(), null, "conditionalExpressions", null, 0, -1, QueryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_LimitOffset(), ecorePackage.getEInt(), "limitOffset", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_LimitRowCount(), ecorePackage.getEInt(), "limitRowCount", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuery_SetQuantifier(), this.getSetQuantifier(), "setQuantifier", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Select(), this.getColumnReference(), null, "select", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_From(), this.getSourceAndExpression(), null, "from", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_WhereHaving(), this.getExpression(), null, "whereHaving", null, 0, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnReferenceEClass, ColumnReference.class, "ColumnReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_GroupOrder(), ecorePackage.getEInt(), "groupOrder", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_SortOrder(), ecorePackage.getEInt(), "sortOrder", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_SortSpecification(), this.getSortSpecification(), "sortSpecification", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_AggregationFunction(), this.getAggregationFunction(), "aggregationFunction", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnReference_Table(), this.getSource(), null, "table", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceAndExpressionEClass, SourceAndExpression.class, "SourceAndExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Type(), this.getSourceType(), "type", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Negation(), ecorePackage.getEBoolean(), "negation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operandEClass, Operand.class, "Operand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryEClass, Unary.class, "Unary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnary_Operation(), this.getUnaryOp(), "operation", null, 0, 1, Unary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnary_Operand1(), this.getOperand(), null, "operand1", null, 1, 1, Unary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinary_Operation(), this.getBinaryOp(), "operation", null, 0, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Operand1(), this.getOperand(), null, "operand1", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinary_Operand2(), this.getOperand(), null, "operand2", null, 1, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ternaryEClass, Ternary.class, "Ternary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTernary_Operation(), this.getTernaryOp(), "operation", null, 0, 1, Ternary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernary_Operand1(), this.getOperand(), null, "operand1", null, 1, 1, Ternary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernary_Operand2(), this.getOperand(), null, "operand2", null, 1, 1, Ternary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTernary_Operand3(), this.getOperand(), null, "operand3", null, 1, 1, Ternary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalOperationEClass, LogicalOperation.class, "LogicalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalOperation_Type(), this.getLogicalOperationType(), "type", null, 0, 1, LogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalOperation_Negation(), ecorePackage.getEBoolean(), "negation", null, 0, 1, LogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalOperation_Expressions(), this.getExpression(), null, "expressions", null, 1, -1, LogicalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalExpressionSourceEClass, ConditionalExpressionSource.class, "ConditionalExpressionSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpressionSource_ConditionalExpressionLink(), this.getConditionalExpressionLink(), this.getConditionalExpressionLink_Source(), "conditionalExpressionLink", null, 1, 1, ConditionalExpressionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whenEClass, When.class, "When", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhen_Label(), ecorePackage.getEString(), "label", null, 0, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Condition(), this.getExpression(), null, "condition", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhen_Result(), this.getExpression(), null, "result", null, 1, 1, When.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseEClass, Else.class, "Else", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElse_Label(), ecorePackage.getEString(), "label", null, 0, 1, Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElse_Result(), this.getExpression(), null, "result", null, 1, 1, Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subqueryTargetEClass, SubqueryTarget.class, "SubqueryTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubqueryTarget_SubqueryLinkTarget(), this.getSubqueryLink(), this.getSubqueryLink_Target(), "subqueryLinkTarget", null, 1, 1, SubqueryTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Type(), this.getColumnType(), "type", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_LogicalLink(), this.getLogicalLink(), this.getLogicalLink_Source(), "logicalLink", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setLinkEClass, SetLink.class, "SetLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetLink_SetQuantifier(), this.getSetQuantifier(), "setQuantifier", null, 0, 1, SetLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetLink_SetOperator(), this.getSetOperator(), "setOperator", null, 0, 1, SetLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetLink_Source(), this.getQuery(), null, "source", null, 1, 1, SetLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetLink_Target(), this.getQuery(), null, "target", null, 1, 1, SetLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinLinkEClass, JoinLink.class, "JoinLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinLink_ForeignKeyName(), ecorePackage.getEString(), "foreignKeyName", null, 0, 1, JoinLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinLink_JoinType(), this.getJoinType(), "joinType", null, 0, 1, JoinLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinLink_Source(), this.getSource(), null, "source", null, 1, 1, JoinLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinLink_Target(), this.getSource(), null, "target", null, 1, 1, JoinLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinConditionLinkEClass, JoinConditionLink.class, "JoinConditionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinConditionLink_Source(), this.getJoinLink(), null, "source", null, 1, 1, JoinConditionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinConditionLink_Target(), this.getExpression(), null, "target", null, 1, 1, JoinConditionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subqueryLinkEClass, SubqueryLink.class, "SubqueryLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubqueryLink_Operation(), this.getBinaryOp(), "operation", null, 0, 1, SubqueryLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubqueryLink_Source(), this.getQuery(), null, "source", null, 1, 1, SubqueryLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubqueryLink_Target(), this.getSubqueryTarget(), this.getSubqueryTarget_SubqueryLinkTarget(), "target", null, 1, 1, SubqueryLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalLinkEClass, LogicalLink.class, "LogicalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalLink_Source(), this.getColumn(), this.getColumn_LogicalLink(), "source", null, 1, 1, LogicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalLink_Target(), this.getLogicalOperation(), null, "target", null, 1, 1, LogicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalExpressionLinkEClass, ConditionalExpressionLink.class, "ConditionalExpressionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpressionLink_Source(), this.getConditionalExpressionSource(), this.getConditionalExpressionSource_ConditionalExpressionLink(), "source", null, 1, 1, ConditionalExpressionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpressionLink_Target(), this.getConditionalExpression(), null, "target", null, 1, 1, ConditionalExpressionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(setOperatorEEnum, SetOperator.class, "SetOperator");
		addEEnumLiteral(setOperatorEEnum, SetOperator.INTERSECT);
		addEEnumLiteral(setOperatorEEnum, SetOperator.UNION);
		addEEnumLiteral(setOperatorEEnum, SetOperator.EXCEPT);
		addEEnumLiteral(setOperatorEEnum, SetOperator.EXCLUSIVE_UNION);

		initEEnum(joinTypeEEnum, JoinType.class, "JoinType");
		addEEnumLiteral(joinTypeEEnum, JoinType.INNER);
		addEEnumLiteral(joinTypeEEnum, JoinType.FULL_OUTER);
		addEEnumLiteral(joinTypeEEnum, JoinType.LEFT_OUTER);
		addEEnumLiteral(joinTypeEEnum, JoinType.RIGHT_OUTER);
		addEEnumLiteral(joinTypeEEnum, JoinType.FULL_OUTER_EXCLUDING);
		addEEnumLiteral(joinTypeEEnum, JoinType.LEFT_OUTER_EXCLUDING);
		addEEnumLiteral(joinTypeEEnum, JoinType.RIGHT_OUTER_EXCLUDING);
		addEEnumLiteral(joinTypeEEnum, JoinType.SEMI);
		addEEnumLiteral(joinTypeEEnum, JoinType.ANTI);
		addEEnumLiteral(joinTypeEEnum, JoinType.DIVISION);

		initEEnum(logicalOperationTypeEEnum, LogicalOperationType.class, "LogicalOperationType");
		addEEnumLiteral(logicalOperationTypeEEnum, LogicalOperationType.AND);
		addEEnumLiteral(logicalOperationTypeEEnum, LogicalOperationType.OR);

		initEEnum(columnTypeEEnum, ColumnType.class, "ColumnType");
		addEEnumLiteral(columnTypeEEnum, ColumnType.FIELD);
		addEEnumLiteral(columnTypeEEnum, ColumnType.LITERAL);
		addEEnumLiteral(columnTypeEEnum, ColumnType.FREE_EXPRESSION);
		addEEnumLiteral(columnTypeEEnum, ColumnType.LOGICAL_CONNECTIVE);
		addEEnumLiteral(columnTypeEEnum, ColumnType.CONDITIONAL_EXPRESSION);
		addEEnumLiteral(columnTypeEEnum, ColumnType.SUBQUERY);

		initEEnum(sourceTypeEEnum, SourceType.class, "SourceType");
		addEEnumLiteral(sourceTypeEEnum, SourceType.TABLE);
		addEEnumLiteral(sourceTypeEEnum, SourceType.SUBQUERY);

		initEEnum(setQuantifierEEnum, SetQuantifier.class, "SetQuantifier");
		addEEnumLiteral(setQuantifierEEnum, SetQuantifier.ALL);
		addEEnumLiteral(setQuantifierEEnum, SetQuantifier.DISTINCT);

		initEEnum(sortSpecificationEEnum, SortSpecification.class, "SortSpecification");
		addEEnumLiteral(sortSpecificationEEnum, SortSpecification.ASCENDING);
		addEEnumLiteral(sortSpecificationEEnum, SortSpecification.DESCENDING);

		initEEnum(aggregationFunctionEEnum, AggregationFunction.class, "AggregationFunction");
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.NONE);
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.AVG);
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.MAX);
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.MIN);
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.SUM);
		addEEnumLiteral(aggregationFunctionEEnum, AggregationFunction.COUNT);

		initEEnum(unaryOpEEnum, UnaryOp.class, "UnaryOp");
		addEEnumLiteral(unaryOpEEnum, UnaryOp.EXISTS);
		addEEnumLiteral(unaryOpEEnum, UnaryOp.IS_NULL);
		addEEnumLiteral(unaryOpEEnum, UnaryOp.UNIQUE);

		initEEnum(binaryOpEEnum, BinaryOp.class, "BinaryOp");
		addEEnumLiteral(binaryOpEEnum, BinaryOp.EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.NOT_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.GREATER_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.GREATER_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.LESS_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.LESS_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ADDITION);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.SUBTRACTION);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.MULTIPLICATION);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.DIVISON);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.CONCATENATION);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.IN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.LIKE);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.SIMILAR);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.OVERLAPS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_NOT_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_GREATER_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_GREATER_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_LESS_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ANY_LESS_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_NOT_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_GREATER_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_GREATER_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_LESS_THAN);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ALL_LESS_THAN_OR_EQUALS);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.NONE);

		initEEnum(ternaryOpEEnum, TernaryOp.class, "TernaryOp");
		addEEnumLiteral(ternaryOpEEnum, TernaryOp.BETWEEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (queryDiagramEClass, 
		   source, 
		   new String[] {
			 "onefile", "true",
			 "diagram.extension", "dsql"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (queryEClass, 
		   source, 
		   new String[] {
			 "resizable", "false",
			 "label", "name",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "0,0,0",
			 "margin", "3",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (columnReferenceEClass, 
		   source, 
		   new String[] {
			 "resizable", "false",
			 "label", "name",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "255,255,255",
			 "margin", "3",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (sourceEClass, 
		   source, 
		   new String[] {
			 "resizable", "false",
			 "label", "name",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "255,255,255",
			 "margin", "3",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "label", "operation",
			 "border.color", "0,0,0",
			 "border.style", "dash",
			 "margin", "3",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (logicalOperationEClass, 
		   source, 
		   new String[] {
			 "label", "type",
			 "resizable", "false",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "0,0,0",
			 "margin", "3",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (conditionalExpressionEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "label.readOnly", "true",
			 "resizable", "false",
			 "label.icon", "false",
			 "border.width", "1",
			 "border.color", "0,0,0",
			 "margin", "3",
			 "figure", "rectangle"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getQuery_Select(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getQuery_From(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getQuery_WhereHaving(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getUnary_Operand1(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getBinary_Operand1(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getBinary_Operand2(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTernary_Operand1(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTernary_Operand2(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getTernary_Operand3(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getLogicalOperation_Expressions(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWhen_Condition(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getWhen_Result(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });	
		addAnnotation
		  (getElse_Result(), 
		   source, 
		   new String[] {
			 "layout", "list"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (linkEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "incoming", "true",
			 "color", "0,0,0",
			 "width", "1"
		   });	
		addAnnotation
		  (setLinkEClass, 
		   source, 
		   new String[] {
			 "style", "dash",
			 "target.decoration", "filledclosedarrow",
			 "label", "setOperator"
		   });	
		addAnnotation
		  (joinLinkEClass, 
		   source, 
		   new String[] {
			 "style", "dash",
			 "target.decoration", "filledclosedarrow",
			 "label", "joinType"
		   });	
		addAnnotation
		  (joinConditionLinkEClass, 
		   source, 
		   new String[] {
			 "style", "dash"
		   });	
		addAnnotation
		  (subqueryLinkEClass, 
		   source, 
		   new String[] {
			 "style", "solid",
			 "label", "operation"
		   });	
		addAnnotation
		  (logicalLinkEClass, 
		   source, 
		   new String[] {
			 "style", "solid",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (conditionalExpressionLinkEClass, 
		   source, 
		   new String[] {
			 "style", "solid",
			 "target.decoration", "closedarrow"
		   });
	}

} //DsqlPackageImpl

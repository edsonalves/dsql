/*
 * 
 */
package dsql.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class DsqlEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DsqlVisualIDRegistry.getVisualID(view)) {

			case QueryDiagramEditPart.VISUAL_ID:
				return new QueryDiagramEditPart(view);

			case WhenEditPart.VISUAL_ID:
				return new WhenEditPart(view);

			case WhenLabelEditPart.VISUAL_ID:
				return new WhenLabelEditPart(view);

			case ElseEditPart.VISUAL_ID:
				return new ElseEditPart(view);

			case ElseLabelEditPart.VISUAL_ID:
				return new ElseLabelEditPart(view);

			case QueryEditPart.VISUAL_ID:
				return new QueryEditPart(view);

			case QueryNameEditPart.VISUAL_ID:
				return new QueryNameEditPart(view);

			case LogicalOperationEditPart.VISUAL_ID:
				return new LogicalOperationEditPart(view);

			case LogicalOperationTypeEditPart.VISUAL_ID:
				return new LogicalOperationTypeEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnNameEditPart.VISUAL_ID:
				return new ColumnNameEditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnName2EditPart.VISUAL_ID:
				return new ColumnName2EditPart(view);

			case UnaryEditPart.VISUAL_ID:
				return new UnaryEditPart(view);

			case UnaryOperationEditPart.VISUAL_ID:
				return new UnaryOperationEditPart(view);

			case Column3EditPart.VISUAL_ID:
				return new Column3EditPart(view);

			case ColumnName3EditPart.VISUAL_ID:
				return new ColumnName3EditPart(view);

			case Unary2EditPart.VISUAL_ID:
				return new Unary2EditPart(view);

			case UnaryOperation2EditPart.VISUAL_ID:
				return new UnaryOperation2EditPart(view);

			case BinaryEditPart.VISUAL_ID:
				return new BinaryEditPart(view);

			case BinaryOperationEditPart.VISUAL_ID:
				return new BinaryOperationEditPart(view);

			case Column4EditPart.VISUAL_ID:
				return new Column4EditPart(view);

			case ColumnName4EditPart.VISUAL_ID:
				return new ColumnName4EditPart(view);

			case Column5EditPart.VISUAL_ID:
				return new Column5EditPart(view);

			case ColumnName5EditPart.VISUAL_ID:
				return new ColumnName5EditPart(view);

			case Unary3EditPart.VISUAL_ID:
				return new Unary3EditPart(view);

			case UnaryOperation3EditPart.VISUAL_ID:
				return new UnaryOperation3EditPart(view);

			case TernaryEditPart.VISUAL_ID:
				return new TernaryEditPart(view);

			case TernaryOperationEditPart.VISUAL_ID:
				return new TernaryOperationEditPart(view);

			case Column6EditPart.VISUAL_ID:
				return new Column6EditPart(view);

			case ColumnName6EditPart.VISUAL_ID:
				return new ColumnName6EditPart(view);

			case Column7EditPart.VISUAL_ID:
				return new Column7EditPart(view);

			case ColumnName7EditPart.VISUAL_ID:
				return new ColumnName7EditPart(view);

			case Column8EditPart.VISUAL_ID:
				return new Column8EditPart(view);

			case ColumnName8EditPart.VISUAL_ID:
				return new ColumnName8EditPart(view);

			case Unary4EditPart.VISUAL_ID:
				return new Unary4EditPart(view);

			case UnaryOperation4EditPart.VISUAL_ID:
				return new UnaryOperation4EditPart(view);

			case Binary2EditPart.VISUAL_ID:
				return new Binary2EditPart(view);

			case BinaryOperation2EditPart.VISUAL_ID:
				return new BinaryOperation2EditPart(view);

			case Binary3EditPart.VISUAL_ID:
				return new Binary3EditPart(view);

			case BinaryOperation3EditPart.VISUAL_ID:
				return new BinaryOperation3EditPart(view);

			case Ternary2EditPart.VISUAL_ID:
				return new Ternary2EditPart(view);

			case TernaryOperation2EditPart.VISUAL_ID:
				return new TernaryOperation2EditPart(view);

			case Ternary3EditPart.VISUAL_ID:
				return new Ternary3EditPart(view);

			case TernaryOperation3EditPart.VISUAL_ID:
				return new TernaryOperation3EditPart(view);

			case Unary5EditPart.VISUAL_ID:
				return new Unary5EditPart(view);

			case UnaryOperation5EditPart.VISUAL_ID:
				return new UnaryOperation5EditPart(view);

			case Binary4EditPart.VISUAL_ID:
				return new Binary4EditPart(view);

			case BinaryOperation4EditPart.VISUAL_ID:
				return new BinaryOperation4EditPart(view);

			case Unary6EditPart.VISUAL_ID:
				return new Unary6EditPart(view);

			case UnaryOperation6EditPart.VISUAL_ID:
				return new UnaryOperation6EditPart(view);

			case Binary5EditPart.VISUAL_ID:
				return new Binary5EditPart(view);

			case BinaryOperation5EditPart.VISUAL_ID:
				return new BinaryOperation5EditPart(view);

			case Ternary4EditPart.VISUAL_ID:
				return new Ternary4EditPart(view);

			case TernaryOperation4EditPart.VISUAL_ID:
				return new TernaryOperation4EditPart(view);

			case Ternary5EditPart.VISUAL_ID:
				return new Ternary5EditPart(view);

			case TernaryOperation5EditPart.VISUAL_ID:
				return new TernaryOperation5EditPart(view);

			case Unary7EditPart.VISUAL_ID:
				return new Unary7EditPart(view);

			case UnaryOperation7EditPart.VISUAL_ID:
				return new UnaryOperation7EditPart(view);

			case Binary6EditPart.VISUAL_ID:
				return new Binary6EditPart(view);

			case BinaryOperation6EditPart.VISUAL_ID:
				return new BinaryOperation6EditPart(view);

			case Ternary6EditPart.VISUAL_ID:
				return new Ternary6EditPart(view);

			case TernaryOperation6EditPart.VISUAL_ID:
				return new TernaryOperation6EditPart(view);

			case Binary7EditPart.VISUAL_ID:
				return new Binary7EditPart(view);

			case BinaryOperation7EditPart.VISUAL_ID:
				return new BinaryOperation7EditPart(view);

			case Ternary7EditPart.VISUAL_ID:
				return new Ternary7EditPart(view);

			case TernaryOperation7EditPart.VISUAL_ID:
				return new TernaryOperation7EditPart(view);

			case Unary8EditPart.VISUAL_ID:
				return new Unary8EditPart(view);

			case UnaryOperation8EditPart.VISUAL_ID:
				return new UnaryOperation8EditPart(view);

			case Binary8EditPart.VISUAL_ID:
				return new Binary8EditPart(view);

			case BinaryOperation8EditPart.VISUAL_ID:
				return new BinaryOperation8EditPart(view);

			case Ternary8EditPart.VISUAL_ID:
				return new Ternary8EditPart(view);

			case TernaryOperation8EditPart.VISUAL_ID:
				return new TernaryOperation8EditPart(view);

			case Column9EditPart.VISUAL_ID:
				return new Column9EditPart(view);

			case ColumnName9EditPart.VISUAL_ID:
				return new ColumnName9EditPart(view);

			case Unary9EditPart.VISUAL_ID:
				return new Unary9EditPart(view);

			case UnaryOperation9EditPart.VISUAL_ID:
				return new UnaryOperation9EditPart(view);

			case Binary9EditPart.VISUAL_ID:
				return new Binary9EditPart(view);

			case BinaryOperation9EditPart.VISUAL_ID:
				return new BinaryOperation9EditPart(view);

			case Ternary9EditPart.VISUAL_ID:
				return new Ternary9EditPart(view);

			case TernaryOperation9EditPart.VISUAL_ID:
				return new TernaryOperation9EditPart(view);

			case Column10EditPart.VISUAL_ID:
				return new Column10EditPart(view);

			case ColumnName10EditPart.VISUAL_ID:
				return new ColumnName10EditPart(view);

			case Column11EditPart.VISUAL_ID:
				return new Column11EditPart(view);

			case ColumnName11EditPart.VISUAL_ID:
				return new ColumnName11EditPart(view);

			case Column12EditPart.VISUAL_ID:
				return new Column12EditPart(view);

			case ColumnName12EditPart.VISUAL_ID:
				return new ColumnName12EditPart(view);

			case Unary10EditPart.VISUAL_ID:
				return new Unary10EditPart(view);

			case UnaryOperation10EditPart.VISUAL_ID:
				return new UnaryOperation10EditPart(view);

			case Binary10EditPart.VISUAL_ID:
				return new Binary10EditPart(view);

			case BinaryOperation10EditPart.VISUAL_ID:
				return new BinaryOperation10EditPart(view);

			case Ternary10EditPart.VISUAL_ID:
				return new Ternary10EditPart(view);

			case TernaryOperation10EditPart.VISUAL_ID:
				return new TernaryOperation10EditPart(view);

			case Unary11EditPart.VISUAL_ID:
				return new Unary11EditPart(view);

			case UnaryOperation11EditPart.VISUAL_ID:
				return new UnaryOperation11EditPart(view);

			case Binary11EditPart.VISUAL_ID:
				return new Binary11EditPart(view);

			case BinaryOperation11EditPart.VISUAL_ID:
				return new BinaryOperation11EditPart(view);

			case Ternary11EditPart.VISUAL_ID:
				return new Ternary11EditPart(view);

			case TernaryOperation11EditPart.VISUAL_ID:
				return new TernaryOperation11EditPart(view);

			case Unary12EditPart.VISUAL_ID:
				return new Unary12EditPart(view);

			case UnaryOperation12EditPart.VISUAL_ID:
				return new UnaryOperation12EditPart(view);

			case Binary12EditPart.VISUAL_ID:
				return new Binary12EditPart(view);

			case BinaryOperation12EditPart.VISUAL_ID:
				return new BinaryOperation12EditPart(view);

			case Ternary12EditPart.VISUAL_ID:
				return new Ternary12EditPart(view);

			case TernaryOperation12EditPart.VISUAL_ID:
				return new TernaryOperation12EditPart(view);

			case SourceEditPart.VISUAL_ID:
				return new SourceEditPart(view);

			case SourceNameEditPart.VISUAL_ID:
				return new SourceNameEditPart(view);

			case Column13EditPart.VISUAL_ID:
				return new Column13EditPart(view);

			case ColumnName13EditPart.VISUAL_ID:
				return new ColumnName13EditPart(view);

			case Unary13EditPart.VISUAL_ID:
				return new Unary13EditPart(view);

			case UnaryOperation13EditPart.VISUAL_ID:
				return new UnaryOperation13EditPart(view);

			case Binary13EditPart.VISUAL_ID:
				return new Binary13EditPart(view);

			case BinaryOperation13EditPart.VISUAL_ID:
				return new BinaryOperation13EditPart(view);

			case Ternary13EditPart.VISUAL_ID:
				return new Ternary13EditPart(view);

			case TernaryOperation13EditPart.VISUAL_ID:
				return new TernaryOperation13EditPart(view);

			case WhenWhenConditionCompartmentEditPart.VISUAL_ID:
				return new WhenWhenConditionCompartmentEditPart(view);

			case WhenWhenResultCompartmentEditPart.VISUAL_ID:
				return new WhenWhenResultCompartmentEditPart(view);

			case UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID:
				return new UnaryUnaryOperand1CompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment2EditPart(view);

			case BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID:
				return new BinaryBinaryOperand1CompartmentEditPart(view);

			case BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID:
				return new BinaryBinaryOperand2CompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment3EditPart(view);

			case TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID:
				return new TernaryTernaryOperand1CompartmentEditPart(view);

			case TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID:
				return new TernaryTernaryOperand2CompartmentEditPart(view);

			case TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID:
				return new TernaryTernaryOperand3CompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment4EditPart(view);

			case BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment2EditPart(view);

			case BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment2EditPart(view);

			case BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment3EditPart(view);

			case BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment3EditPart(view);

			case TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment2EditPart(view);

			case TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment2EditPart(view);

			case TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment2EditPart(view);

			case TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment3EditPart(view);

			case TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment3EditPart(view);

			case TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment3EditPart(view);

			case UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment5EditPart(view);

			case BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment4EditPart(view);

			case BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment4EditPart(view);

			case UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment6EditPart(view);

			case BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment5EditPart(view);

			case BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment5EditPart(view);

			case TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment4EditPart(view);

			case TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment4EditPart(view);

			case TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment4EditPart(view);

			case TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment5EditPart(view);

			case TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment5EditPart(view);

			case TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment5EditPart(view);

			case UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment7EditPart(view);

			case BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment6EditPart(view);

			case BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment6EditPart(view);

			case TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment6EditPart(view);

			case TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment6EditPart(view);

			case TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment6EditPart(view);

			case BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment7EditPart(view);

			case BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment7EditPart(view);

			case TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment7EditPart(view);

			case TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment7EditPart(view);

			case TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment7EditPart(view);

			case UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment8EditPart(view);

			case BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment8EditPart(view);

			case BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment8EditPart(view);

			case TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment8EditPart(view);

			case TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment8EditPart(view);

			case TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment8EditPart(view);

			case ElseElseResultCompartmentEditPart.VISUAL_ID:
				return new ElseElseResultCompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment9EditPart(view);

			case BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment9EditPart(view);

			case BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment9EditPart(view);

			case TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment9EditPart(view);

			case TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment9EditPart(view);

			case TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment9EditPart(view);

			case QueryQuerySelectCompartmentEditPart.VISUAL_ID:
				return new QueryQuerySelectCompartmentEditPart(view);

			case QueryQueryFromCompartmentEditPart.VISUAL_ID:
				return new QueryQueryFromCompartmentEditPart(view);

			case QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID:
				return new QueryQueryWhereHavingCompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment10EditPart(view);

			case BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment10EditPart(view);

			case BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment10EditPart(view);

			case TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment10EditPart(view);

			case TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment10EditPart(view);

			case TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment10EditPart(view);

			case UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment11EditPart(view);

			case BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment11EditPart(view);

			case BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment11EditPart(view);

			case TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment11EditPart(view);

			case TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment11EditPart(view);

			case TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment11EditPart(view);

			case UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment12EditPart(view);

			case BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment12EditPart(view);

			case BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment12EditPart(view);

			case TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment12EditPart(view);

			case TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment12EditPart(view);

			case TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment12EditPart(view);

			case LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID:
				return new LogicalOperationLogicalOperationExpressionsCompartmentEditPart(view);

			case UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID:
				return new UnaryUnaryOperand1Compartment13EditPart(view);

			case BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID:
				return new BinaryBinaryOperand1Compartment13EditPart(view);

			case BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID:
				return new BinaryBinaryOperand2Compartment13EditPart(view);

			case TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID:
				return new TernaryTernaryOperand1Compartment13EditPart(view);

			case TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID:
				return new TernaryTernaryOperand2Compartment13EditPart(view);

			case TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID:
				return new TernaryTernaryOperand3Compartment13EditPart(view);

			case SetLinkEditPart.VISUAL_ID:
				return new SetLinkEditPart(view);

			case SetLinkSetOperatorEditPart.VISUAL_ID:
				return new SetLinkSetOperatorEditPart(view);

			case JoinLinkEditPart.VISUAL_ID:
				return new JoinLinkEditPart(view);

			case JoinLinkJoinTypeEditPart.VISUAL_ID:
				return new JoinLinkJoinTypeEditPart(view);

			case JoinConditionLinkEditPart.VISUAL_ID:
				return new JoinConditionLinkEditPart(view);

			case SubqueryLinkEditPart.VISUAL_ID:
				return new SubqueryLinkEditPart(view);

			case SubqueryLinkOperationEditPart.VISUAL_ID:
				return new SubqueryLinkOperationEditPart(view);

			case LogicalLinkEditPart.VISUAL_ID:
				return new LogicalLinkEditPart(view);

			case ConditionalExpressionLinkEditPart.VISUAL_ID:
				return new ConditionalExpressionLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}

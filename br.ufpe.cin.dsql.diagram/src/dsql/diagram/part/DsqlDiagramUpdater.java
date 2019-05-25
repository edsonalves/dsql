/*
* 
*/
package dsql.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import dsql.Binary;
import dsql.Column;
import dsql.ColumnReference;
import dsql.ConditionalExpression;
import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.DsqlPackage;
import dsql.Else;
import dsql.Expression;
import dsql.JoinConditionLink;
import dsql.JoinLink;
import dsql.LogicalLink;
import dsql.LogicalOperation;
import dsql.Operand;
import dsql.Query;
import dsql.QueryDiagram;
import dsql.SetLink;
import dsql.Source;
import dsql.SourceAndExpression;
import dsql.SubqueryLink;
import dsql.SubqueryTarget;
import dsql.Ternary;
import dsql.Unary;
import dsql.When;
import dsql.diagram.edit.parts.*;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class DsqlDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getSemanticChildren(View view) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case QueryDiagramEditPart.VISUAL_ID:
			return getQueryDiagram_1000SemanticChildren(view);
		case WhenWhenConditionCompartmentEditPart.VISUAL_ID:
			return getWhenWhenConditionCompartment_7001SemanticChildren(view);
		case WhenWhenResultCompartmentEditPart.VISUAL_ID:
			return getWhenWhenResultCompartment_7002SemanticChildren(view);
		case UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7003SemanticChildren(view);
		case UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7004SemanticChildren(view);
		case BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7005SemanticChildren(view);
		case BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7006SemanticChildren(view);
		case UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7007SemanticChildren(view);
		case TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7008SemanticChildren(view);
		case TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7009SemanticChildren(view);
		case TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7010SemanticChildren(view);
		case UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7011SemanticChildren(view);
		case BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7012SemanticChildren(view);
		case BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7013SemanticChildren(view);
		case BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7014SemanticChildren(view);
		case BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7015SemanticChildren(view);
		case TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7016SemanticChildren(view);
		case TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7017SemanticChildren(view);
		case TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7018SemanticChildren(view);
		case TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7019SemanticChildren(view);
		case TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7020SemanticChildren(view);
		case TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7021SemanticChildren(view);
		case UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7022SemanticChildren(view);
		case BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7023SemanticChildren(view);
		case BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7024SemanticChildren(view);
		case UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7025SemanticChildren(view);
		case BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7026SemanticChildren(view);
		case BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7027SemanticChildren(view);
		case TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7028SemanticChildren(view);
		case TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7029SemanticChildren(view);
		case TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7030SemanticChildren(view);
		case TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7031SemanticChildren(view);
		case TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7032SemanticChildren(view);
		case TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7033SemanticChildren(view);
		case UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7034SemanticChildren(view);
		case BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7035SemanticChildren(view);
		case BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7036SemanticChildren(view);
		case TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7037SemanticChildren(view);
		case TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7038SemanticChildren(view);
		case TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7039SemanticChildren(view);
		case BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7040SemanticChildren(view);
		case BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7041SemanticChildren(view);
		case TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7042SemanticChildren(view);
		case TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7043SemanticChildren(view);
		case TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7044SemanticChildren(view);
		case UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7045SemanticChildren(view);
		case BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7046SemanticChildren(view);
		case BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7047SemanticChildren(view);
		case TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7048SemanticChildren(view);
		case TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7049SemanticChildren(view);
		case TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7050SemanticChildren(view);
		case ElseElseResultCompartmentEditPart.VISUAL_ID:
			return getElseElseResultCompartment_7051SemanticChildren(view);
		case UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7052SemanticChildren(view);
		case BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7053SemanticChildren(view);
		case BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7054SemanticChildren(view);
		case TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7055SemanticChildren(view);
		case TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7056SemanticChildren(view);
		case TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7057SemanticChildren(view);
		case QueryQuerySelectCompartmentEditPart.VISUAL_ID:
			return getQueryQuerySelectCompartment_7058SemanticChildren(view);
		case QueryQueryFromCompartmentEditPart.VISUAL_ID:
			return getQueryQueryFromCompartment_7059SemanticChildren(view);
		case QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID:
			return getQueryQueryWhereHavingCompartment_7060SemanticChildren(view);
		case UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7061SemanticChildren(view);
		case BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7062SemanticChildren(view);
		case BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7063SemanticChildren(view);
		case TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7064SemanticChildren(view);
		case TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7065SemanticChildren(view);
		case TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7066SemanticChildren(view);
		case UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7067SemanticChildren(view);
		case BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7068SemanticChildren(view);
		case BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7069SemanticChildren(view);
		case TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7070SemanticChildren(view);
		case TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7071SemanticChildren(view);
		case TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7072SemanticChildren(view);
		case UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7073SemanticChildren(view);
		case BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7074SemanticChildren(view);
		case BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7075SemanticChildren(view);
		case TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7076SemanticChildren(view);
		case TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7077SemanticChildren(view);
		case TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7078SemanticChildren(view);
		case LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID:
			return getLogicalOperationLogicalOperationExpressionsCompartment_7079SemanticChildren(view);
		case UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID:
			return getUnaryUnaryOperand1Compartment_7080SemanticChildren(view);
		case BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID:
			return getBinaryBinaryOperand1Compartment_7081SemanticChildren(view);
		case BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID:
			return getBinaryBinaryOperand2Compartment_7082SemanticChildren(view);
		case TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID:
			return getTernaryTernaryOperand1Compartment_7083SemanticChildren(view);
		case TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID:
			return getTernaryTernaryOperand2Compartment_7084SemanticChildren(view);
		case TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID:
			return getTernaryTernaryOperand3Compartment_7085SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getQueryDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		QueryDiagram modelElement = (QueryDiagram) view.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConditionalExpressions().iterator(); it.hasNext();) {
			ConditionalExpression childElement = (ConditionalExpression) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WhenEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ElseEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getQueries().iterator(); it.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == QueryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLogicalOperations().iterator(); it.hasNext();) {
			LogicalOperation childElement = (LogicalOperation) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LogicalOperationEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getWhenWhenConditionCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		When modelElement = (When) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Expression childElement = modelElement.getCondition();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == UnaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getWhenWhenResultCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		When modelElement = (When) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Expression childElement = modelElement.getResult();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7015SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7016SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7017SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7018SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7019SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7020SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7027SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7028SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7029SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7030SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7031SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7032SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7033SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7034SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7035SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7036SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7037SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7038SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7039SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7040SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7041SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7042SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7043SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7044SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7045SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7046SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7047SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7048SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7049SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7050SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getElseElseResultCompartment_7051SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Else modelElement = (Else) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Expression childElement = modelElement.getResult();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column9EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary9EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary9EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary9EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7052SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7053SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7054SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7055SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7056SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7057SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getQueryQuerySelectCompartment_7058SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Query modelElement = (Query) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSelect().iterator(); it.hasNext();) {
			ColumnReference childElement = (ColumnReference) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column10EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Unary10EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Binary10EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ternary10EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getQueryQueryFromCompartment_7059SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Query modelElement = (Query) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFrom().iterator(); it.hasNext();) {
			SourceAndExpression childElement = (SourceAndExpression) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column11EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Unary11EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Binary11EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ternary11EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SourceEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getQueryQueryWhereHavingCompartment_7060SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Query modelElement = (Query) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Expression childElement = modelElement.getWhereHaving();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column12EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary12EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary12EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary12EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7061SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7062SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7063SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7064SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7065SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7066SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7067SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7068SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7069SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7070SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7071SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7072SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7073SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7074SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7075SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7076SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7077SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7078SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getLogicalOperationLogicalOperationExpressionsCompartment_7079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LogicalOperation modelElement = (LogicalOperation) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExpressions().iterator(); it.hasNext();) {
			Expression childElement = (Expression) it.next();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column13EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Unary13EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Binary13EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ternary13EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getUnaryUnaryOperand1Compartment_7080SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Unary modelElement = (Unary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == BinaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == TernaryEditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand1Compartment_7081SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getBinaryBinaryOperand2Compartment_7082SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Binary modelElement = (Binary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand1Compartment_7083SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand1();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary2EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary3EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand2Compartment_7084SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand2();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary4EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary5EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlNodeDescriptor> getTernaryTernaryOperand3Compartment_7085SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ternary modelElement = (Ternary) containerView.getElement();
		LinkedList<DsqlNodeDescriptor> result = new LinkedList<DsqlNodeDescriptor>();
		{
			Operand childElement = modelElement.getOperand3();
			int visualID = DsqlVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Column8EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Unary7EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Binary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
			if (visualID == Ternary6EditPart.VISUAL_ID) {
				result.add(new DsqlNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DsqlLinkDescriptor> getContainedLinks(View view) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case QueryDiagramEditPart.VISUAL_ID:
			return getQueryDiagram_1000ContainedLinks(view);
		case WhenEditPart.VISUAL_ID:
			return getWhen_2001ContainedLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2002ContainedLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_2003ContainedLinks(view);
		case LogicalOperationEditPart.VISUAL_ID:
			return getLogicalOperation_2004ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001ContainedLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3002ContainedLinks(view);
		case UnaryEditPart.VISUAL_ID:
			return getUnary_3003ContainedLinks(view);
		case Column3EditPart.VISUAL_ID:
			return getColumn_3004ContainedLinks(view);
		case Unary2EditPart.VISUAL_ID:
			return getUnary_3005ContainedLinks(view);
		case BinaryEditPart.VISUAL_ID:
			return getBinary_3006ContainedLinks(view);
		case Column4EditPart.VISUAL_ID:
			return getColumn_3007ContainedLinks(view);
		case Column5EditPart.VISUAL_ID:
			return getColumn_3008ContainedLinks(view);
		case Unary3EditPart.VISUAL_ID:
			return getUnary_3009ContainedLinks(view);
		case TernaryEditPart.VISUAL_ID:
			return getTernary_3010ContainedLinks(view);
		case Column6EditPart.VISUAL_ID:
			return getColumn_3011ContainedLinks(view);
		case Column7EditPart.VISUAL_ID:
			return getColumn_3012ContainedLinks(view);
		case Column8EditPart.VISUAL_ID:
			return getColumn_3013ContainedLinks(view);
		case Unary4EditPart.VISUAL_ID:
			return getUnary_3014ContainedLinks(view);
		case Binary2EditPart.VISUAL_ID:
			return getBinary_3015ContainedLinks(view);
		case Binary3EditPart.VISUAL_ID:
			return getBinary_3016ContainedLinks(view);
		case Ternary2EditPart.VISUAL_ID:
			return getTernary_3017ContainedLinks(view);
		case Ternary3EditPart.VISUAL_ID:
			return getTernary_3018ContainedLinks(view);
		case Unary5EditPart.VISUAL_ID:
			return getUnary_3019ContainedLinks(view);
		case Binary4EditPart.VISUAL_ID:
			return getBinary_3020ContainedLinks(view);
		case Unary6EditPart.VISUAL_ID:
			return getUnary_3021ContainedLinks(view);
		case Binary5EditPart.VISUAL_ID:
			return getBinary_3022ContainedLinks(view);
		case Ternary4EditPart.VISUAL_ID:
			return getTernary_3023ContainedLinks(view);
		case Ternary5EditPart.VISUAL_ID:
			return getTernary_3024ContainedLinks(view);
		case Unary7EditPart.VISUAL_ID:
			return getUnary_3025ContainedLinks(view);
		case Binary6EditPart.VISUAL_ID:
			return getBinary_3026ContainedLinks(view);
		case Ternary6EditPart.VISUAL_ID:
			return getTernary_3027ContainedLinks(view);
		case Binary7EditPart.VISUAL_ID:
			return getBinary_3028ContainedLinks(view);
		case Ternary7EditPart.VISUAL_ID:
			return getTernary_3029ContainedLinks(view);
		case Unary8EditPart.VISUAL_ID:
			return getUnary_3030ContainedLinks(view);
		case Binary8EditPart.VISUAL_ID:
			return getBinary_3031ContainedLinks(view);
		case Ternary8EditPart.VISUAL_ID:
			return getTernary_3032ContainedLinks(view);
		case Column9EditPart.VISUAL_ID:
			return getColumn_3033ContainedLinks(view);
		case Unary9EditPart.VISUAL_ID:
			return getUnary_3034ContainedLinks(view);
		case Binary9EditPart.VISUAL_ID:
			return getBinary_3035ContainedLinks(view);
		case Ternary9EditPart.VISUAL_ID:
			return getTernary_3036ContainedLinks(view);
		case Column10EditPart.VISUAL_ID:
			return getColumn_3037ContainedLinks(view);
		case Column11EditPart.VISUAL_ID:
			return getColumn_3038ContainedLinks(view);
		case Column12EditPart.VISUAL_ID:
			return getColumn_3039ContainedLinks(view);
		case Unary10EditPart.VISUAL_ID:
			return getUnary_3040ContainedLinks(view);
		case Binary10EditPart.VISUAL_ID:
			return getBinary_3041ContainedLinks(view);
		case Ternary10EditPart.VISUAL_ID:
			return getTernary_3042ContainedLinks(view);
		case Unary11EditPart.VISUAL_ID:
			return getUnary_3043ContainedLinks(view);
		case Binary11EditPart.VISUAL_ID:
			return getBinary_3044ContainedLinks(view);
		case Ternary11EditPart.VISUAL_ID:
			return getTernary_3045ContainedLinks(view);
		case Unary12EditPart.VISUAL_ID:
			return getUnary_3046ContainedLinks(view);
		case Binary12EditPart.VISUAL_ID:
			return getBinary_3047ContainedLinks(view);
		case Ternary12EditPart.VISUAL_ID:
			return getTernary_3048ContainedLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_3049ContainedLinks(view);
		case Column13EditPart.VISUAL_ID:
			return getColumn_3050ContainedLinks(view);
		case Unary13EditPart.VISUAL_ID:
			return getUnary_3051ContainedLinks(view);
		case Binary13EditPart.VISUAL_ID:
			return getBinary_3052ContainedLinks(view);
		case Ternary13EditPart.VISUAL_ID:
			return getTernary_3053ContainedLinks(view);
		case SetLinkEditPart.VISUAL_ID:
			return getSetLink_4001ContainedLinks(view);
		case JoinLinkEditPart.VISUAL_ID:
			return getJoinLink_4002ContainedLinks(view);
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getJoinConditionLink_4003ContainedLinks(view);
		case SubqueryLinkEditPart.VISUAL_ID:
			return getSubqueryLink_4004ContainedLinks(view);
		case LogicalLinkEditPart.VISUAL_ID:
			return getLogicalLink_4005ContainedLinks(view);
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getConditionalExpressionLink_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DsqlLinkDescriptor> getIncomingLinks(View view) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case WhenEditPart.VISUAL_ID:
			return getWhen_2001IncomingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2002IncomingLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_2003IncomingLinks(view);
		case LogicalOperationEditPart.VISUAL_ID:
			return getLogicalOperation_2004IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001IncomingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3002IncomingLinks(view);
		case UnaryEditPart.VISUAL_ID:
			return getUnary_3003IncomingLinks(view);
		case Column3EditPart.VISUAL_ID:
			return getColumn_3004IncomingLinks(view);
		case Unary2EditPart.VISUAL_ID:
			return getUnary_3005IncomingLinks(view);
		case BinaryEditPart.VISUAL_ID:
			return getBinary_3006IncomingLinks(view);
		case Column4EditPart.VISUAL_ID:
			return getColumn_3007IncomingLinks(view);
		case Column5EditPart.VISUAL_ID:
			return getColumn_3008IncomingLinks(view);
		case Unary3EditPart.VISUAL_ID:
			return getUnary_3009IncomingLinks(view);
		case TernaryEditPart.VISUAL_ID:
			return getTernary_3010IncomingLinks(view);
		case Column6EditPart.VISUAL_ID:
			return getColumn_3011IncomingLinks(view);
		case Column7EditPart.VISUAL_ID:
			return getColumn_3012IncomingLinks(view);
		case Column8EditPart.VISUAL_ID:
			return getColumn_3013IncomingLinks(view);
		case Unary4EditPart.VISUAL_ID:
			return getUnary_3014IncomingLinks(view);
		case Binary2EditPart.VISUAL_ID:
			return getBinary_3015IncomingLinks(view);
		case Binary3EditPart.VISUAL_ID:
			return getBinary_3016IncomingLinks(view);
		case Ternary2EditPart.VISUAL_ID:
			return getTernary_3017IncomingLinks(view);
		case Ternary3EditPart.VISUAL_ID:
			return getTernary_3018IncomingLinks(view);
		case Unary5EditPart.VISUAL_ID:
			return getUnary_3019IncomingLinks(view);
		case Binary4EditPart.VISUAL_ID:
			return getBinary_3020IncomingLinks(view);
		case Unary6EditPart.VISUAL_ID:
			return getUnary_3021IncomingLinks(view);
		case Binary5EditPart.VISUAL_ID:
			return getBinary_3022IncomingLinks(view);
		case Ternary4EditPart.VISUAL_ID:
			return getTernary_3023IncomingLinks(view);
		case Ternary5EditPart.VISUAL_ID:
			return getTernary_3024IncomingLinks(view);
		case Unary7EditPart.VISUAL_ID:
			return getUnary_3025IncomingLinks(view);
		case Binary6EditPart.VISUAL_ID:
			return getBinary_3026IncomingLinks(view);
		case Ternary6EditPart.VISUAL_ID:
			return getTernary_3027IncomingLinks(view);
		case Binary7EditPart.VISUAL_ID:
			return getBinary_3028IncomingLinks(view);
		case Ternary7EditPart.VISUAL_ID:
			return getTernary_3029IncomingLinks(view);
		case Unary8EditPart.VISUAL_ID:
			return getUnary_3030IncomingLinks(view);
		case Binary8EditPart.VISUAL_ID:
			return getBinary_3031IncomingLinks(view);
		case Ternary8EditPart.VISUAL_ID:
			return getTernary_3032IncomingLinks(view);
		case Column9EditPart.VISUAL_ID:
			return getColumn_3033IncomingLinks(view);
		case Unary9EditPart.VISUAL_ID:
			return getUnary_3034IncomingLinks(view);
		case Binary9EditPart.VISUAL_ID:
			return getBinary_3035IncomingLinks(view);
		case Ternary9EditPart.VISUAL_ID:
			return getTernary_3036IncomingLinks(view);
		case Column10EditPart.VISUAL_ID:
			return getColumn_3037IncomingLinks(view);
		case Column11EditPart.VISUAL_ID:
			return getColumn_3038IncomingLinks(view);
		case Column12EditPart.VISUAL_ID:
			return getColumn_3039IncomingLinks(view);
		case Unary10EditPart.VISUAL_ID:
			return getUnary_3040IncomingLinks(view);
		case Binary10EditPart.VISUAL_ID:
			return getBinary_3041IncomingLinks(view);
		case Ternary10EditPart.VISUAL_ID:
			return getTernary_3042IncomingLinks(view);
		case Unary11EditPart.VISUAL_ID:
			return getUnary_3043IncomingLinks(view);
		case Binary11EditPart.VISUAL_ID:
			return getBinary_3044IncomingLinks(view);
		case Ternary11EditPart.VISUAL_ID:
			return getTernary_3045IncomingLinks(view);
		case Unary12EditPart.VISUAL_ID:
			return getUnary_3046IncomingLinks(view);
		case Binary12EditPart.VISUAL_ID:
			return getBinary_3047IncomingLinks(view);
		case Ternary12EditPart.VISUAL_ID:
			return getTernary_3048IncomingLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_3049IncomingLinks(view);
		case Column13EditPart.VISUAL_ID:
			return getColumn_3050IncomingLinks(view);
		case Unary13EditPart.VISUAL_ID:
			return getUnary_3051IncomingLinks(view);
		case Binary13EditPart.VISUAL_ID:
			return getBinary_3052IncomingLinks(view);
		case Ternary13EditPart.VISUAL_ID:
			return getTernary_3053IncomingLinks(view);
		case SetLinkEditPart.VISUAL_ID:
			return getSetLink_4001IncomingLinks(view);
		case JoinLinkEditPart.VISUAL_ID:
			return getJoinLink_4002IncomingLinks(view);
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getJoinConditionLink_4003IncomingLinks(view);
		case SubqueryLinkEditPart.VISUAL_ID:
			return getSubqueryLink_4004IncomingLinks(view);
		case LogicalLinkEditPart.VISUAL_ID:
			return getLogicalLink_4005IncomingLinks(view);
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getConditionalExpressionLink_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DsqlLinkDescriptor> getOutgoingLinks(View view) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case WhenEditPart.VISUAL_ID:
			return getWhen_2001OutgoingLinks(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2002OutgoingLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_2003OutgoingLinks(view);
		case LogicalOperationEditPart.VISUAL_ID:
			return getLogicalOperation_2004OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001OutgoingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3002OutgoingLinks(view);
		case UnaryEditPart.VISUAL_ID:
			return getUnary_3003OutgoingLinks(view);
		case Column3EditPart.VISUAL_ID:
			return getColumn_3004OutgoingLinks(view);
		case Unary2EditPart.VISUAL_ID:
			return getUnary_3005OutgoingLinks(view);
		case BinaryEditPart.VISUAL_ID:
			return getBinary_3006OutgoingLinks(view);
		case Column4EditPart.VISUAL_ID:
			return getColumn_3007OutgoingLinks(view);
		case Column5EditPart.VISUAL_ID:
			return getColumn_3008OutgoingLinks(view);
		case Unary3EditPart.VISUAL_ID:
			return getUnary_3009OutgoingLinks(view);
		case TernaryEditPart.VISUAL_ID:
			return getTernary_3010OutgoingLinks(view);
		case Column6EditPart.VISUAL_ID:
			return getColumn_3011OutgoingLinks(view);
		case Column7EditPart.VISUAL_ID:
			return getColumn_3012OutgoingLinks(view);
		case Column8EditPart.VISUAL_ID:
			return getColumn_3013OutgoingLinks(view);
		case Unary4EditPart.VISUAL_ID:
			return getUnary_3014OutgoingLinks(view);
		case Binary2EditPart.VISUAL_ID:
			return getBinary_3015OutgoingLinks(view);
		case Binary3EditPart.VISUAL_ID:
			return getBinary_3016OutgoingLinks(view);
		case Ternary2EditPart.VISUAL_ID:
			return getTernary_3017OutgoingLinks(view);
		case Ternary3EditPart.VISUAL_ID:
			return getTernary_3018OutgoingLinks(view);
		case Unary5EditPart.VISUAL_ID:
			return getUnary_3019OutgoingLinks(view);
		case Binary4EditPart.VISUAL_ID:
			return getBinary_3020OutgoingLinks(view);
		case Unary6EditPart.VISUAL_ID:
			return getUnary_3021OutgoingLinks(view);
		case Binary5EditPart.VISUAL_ID:
			return getBinary_3022OutgoingLinks(view);
		case Ternary4EditPart.VISUAL_ID:
			return getTernary_3023OutgoingLinks(view);
		case Ternary5EditPart.VISUAL_ID:
			return getTernary_3024OutgoingLinks(view);
		case Unary7EditPart.VISUAL_ID:
			return getUnary_3025OutgoingLinks(view);
		case Binary6EditPart.VISUAL_ID:
			return getBinary_3026OutgoingLinks(view);
		case Ternary6EditPart.VISUAL_ID:
			return getTernary_3027OutgoingLinks(view);
		case Binary7EditPart.VISUAL_ID:
			return getBinary_3028OutgoingLinks(view);
		case Ternary7EditPart.VISUAL_ID:
			return getTernary_3029OutgoingLinks(view);
		case Unary8EditPart.VISUAL_ID:
			return getUnary_3030OutgoingLinks(view);
		case Binary8EditPart.VISUAL_ID:
			return getBinary_3031OutgoingLinks(view);
		case Ternary8EditPart.VISUAL_ID:
			return getTernary_3032OutgoingLinks(view);
		case Column9EditPart.VISUAL_ID:
			return getColumn_3033OutgoingLinks(view);
		case Unary9EditPart.VISUAL_ID:
			return getUnary_3034OutgoingLinks(view);
		case Binary9EditPart.VISUAL_ID:
			return getBinary_3035OutgoingLinks(view);
		case Ternary9EditPart.VISUAL_ID:
			return getTernary_3036OutgoingLinks(view);
		case Column10EditPart.VISUAL_ID:
			return getColumn_3037OutgoingLinks(view);
		case Column11EditPart.VISUAL_ID:
			return getColumn_3038OutgoingLinks(view);
		case Column12EditPart.VISUAL_ID:
			return getColumn_3039OutgoingLinks(view);
		case Unary10EditPart.VISUAL_ID:
			return getUnary_3040OutgoingLinks(view);
		case Binary10EditPart.VISUAL_ID:
			return getBinary_3041OutgoingLinks(view);
		case Ternary10EditPart.VISUAL_ID:
			return getTernary_3042OutgoingLinks(view);
		case Unary11EditPart.VISUAL_ID:
			return getUnary_3043OutgoingLinks(view);
		case Binary11EditPart.VISUAL_ID:
			return getBinary_3044OutgoingLinks(view);
		case Ternary11EditPart.VISUAL_ID:
			return getTernary_3045OutgoingLinks(view);
		case Unary12EditPart.VISUAL_ID:
			return getUnary_3046OutgoingLinks(view);
		case Binary12EditPart.VISUAL_ID:
			return getBinary_3047OutgoingLinks(view);
		case Ternary12EditPart.VISUAL_ID:
			return getTernary_3048OutgoingLinks(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_3049OutgoingLinks(view);
		case Column13EditPart.VISUAL_ID:
			return getColumn_3050OutgoingLinks(view);
		case Unary13EditPart.VISUAL_ID:
			return getUnary_3051OutgoingLinks(view);
		case Binary13EditPart.VISUAL_ID:
			return getBinary_3052OutgoingLinks(view);
		case Ternary13EditPart.VISUAL_ID:
			return getTernary_3053OutgoingLinks(view);
		case SetLinkEditPart.VISUAL_ID:
			return getSetLink_4001OutgoingLinks(view);
		case JoinLinkEditPart.VISUAL_ID:
			return getJoinLink_4002OutgoingLinks(view);
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getJoinConditionLink_4003OutgoingLinks(view);
		case SubqueryLinkEditPart.VISUAL_ID:
			return getSubqueryLink_4004OutgoingLinks(view);
		case LogicalLinkEditPart.VISUAL_ID:
			return getLogicalLink_4005OutgoingLinks(view);
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getConditionalExpressionLink_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getQueryDiagram_1000ContainedLinks(View view) {
		QueryDiagram modelElement = (QueryDiagram) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SetLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_JoinLink_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_JoinConditionLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SubqueryLink_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getWhen_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getElse_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getQuery_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalOperation_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3034ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3035ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3036ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3037ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3039ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSource_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSetLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinLink_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinConditionLink_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSubqueryLink_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalLink_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getConditionalExpressionLink_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getWhen_2001IncomingLinks(View view) {
		When modelElement = (When) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getElse_2002IncomingLinks(View view) {
		Else modelElement = (Else) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getQuery_2003IncomingLinks(View view) {
		Query modelElement = (Query) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SetLink_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalOperation_2004IncomingLinks(View view) {
		LogicalOperation modelElement = (LogicalOperation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LogicalLink_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3001IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3002IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3003IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3004IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3005IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3006IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3007IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3008IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3009IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3010IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3011IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3012IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3013IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3014IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3015IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3016IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3017IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3018IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3019IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3020IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3021IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3022IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3023IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3024IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3025IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3026IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3027IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3028IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3029IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3030IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3031IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3032IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3033IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3034IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3035IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3036IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3037IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3038IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3039IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3040IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3041IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3042IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3043IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3044IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3045IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3046IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3047IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3048IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSource_3049IncomingLinks(View view) {
		Source modelElement = (Source) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3050IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SubqueryLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3051IncomingLinks(View view) {
		Unary modelElement = (Unary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3052IncomingLinks(View view) {
		Binary modelElement = (Binary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3053IncomingLinks(View view) {
		Ternary modelElement = (Ternary) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_JoinConditionLink_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSetLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinLink_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinConditionLink_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSubqueryLink_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalLink_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getConditionalExpressionLink_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getWhen_2001OutgoingLinks(View view) {
		When modelElement = (When) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getElse_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getQuery_2003OutgoingLinks(View view) {
		Query modelElement = (Query) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SetLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SubqueryLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalOperation_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3001OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3002OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3004OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3007OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3008OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3011OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3012OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3013OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3033OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3034OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3035OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3036OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3037OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3038OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3039OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSource_3049OutgoingLinks(View view) {
		Source modelElement = (Source) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JoinLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getColumn_3050OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LogicalLink_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getUnary_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getBinary_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getTernary_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSetLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinLink_4002OutgoingLinks(View view) {
		JoinLink modelElement = (JoinLink) view.getElement();
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_JoinConditionLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getJoinConditionLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getSubqueryLink_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getLogicalLink_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DsqlLinkDescriptor> getConditionalExpressionLink_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_SetLink_4001(QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SetLink) {
				continue;
			}
			SetLink link = (SetLink) linkObject;
			if (SetLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			result.add(
					new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.SetLink_4001, SetLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_JoinLink_4002(
			QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinLink) {
				continue;
			}
			JoinLink link = (JoinLink) linkObject;
			if (JoinLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Source dst = link.getTarget();
			Source src = link.getSource();
			result.add(
					new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.JoinLink_4002, JoinLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_JoinConditionLink_4003(
			QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinConditionLink) {
				continue;
			}
			JoinConditionLink link = (JoinConditionLink) linkObject;
			if (JoinConditionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Expression dst = link.getTarget();
			JoinLink src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.JoinConditionLink_4003,
					JoinConditionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_SubqueryLink_4004(
			QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SubqueryLink) {
				continue;
			}
			SubqueryLink link = (SubqueryLink) linkObject;
			if (SubqueryLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SubqueryTarget dst = link.getTarget();
			Query src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.SubqueryLink_4004,
					SubqueryLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_LogicalLink_4005(
			QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LogicalLink) {
				continue;
			}
			LogicalLink link = (LogicalLink) linkObject;
			if (LogicalLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LogicalOperation dst = link.getTarget();
			Column src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.LogicalLink_4005,
					LogicalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getContainedTypeModelFacetLinks_ConditionalExpressionLink_4006(
			QueryDiagram container) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalExpressionLink) {
				continue;
			}
			ConditionalExpressionLink link = (ConditionalExpressionLink) linkObject;
			if (ConditionalExpressionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConditionalExpression dst = link.getTarget();
			ConditionalExpressionSource src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.ConditionalExpressionLink_4006,
					ConditionalExpressionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_SetLink_4001(Query target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getSetLink_Target()
					|| false == setting.getEObject() instanceof SetLink) {
				continue;
			}
			SetLink link = (SetLink) setting.getEObject();
			if (SetLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.SetLink_4001,
					SetLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_JoinLink_4002(Source target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getJoinLink_Target()
					|| false == setting.getEObject() instanceof JoinLink) {
				continue;
			}
			JoinLink link = (JoinLink) setting.getEObject();
			if (JoinLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Source src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.JoinLink_4002,
					JoinLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_JoinConditionLink_4003(
			Expression target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getJoinConditionLink_Target()
					|| false == setting.getEObject() instanceof JoinConditionLink) {
				continue;
			}
			JoinConditionLink link = (JoinConditionLink) setting.getEObject();
			if (JoinConditionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			JoinLink src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.JoinConditionLink_4003,
					JoinConditionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_SubqueryLink_4004(
			SubqueryTarget target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getSubqueryLink_Target()
					|| false == setting.getEObject() instanceof SubqueryLink) {
				continue;
			}
			SubqueryLink link = (SubqueryLink) setting.getEObject();
			if (SubqueryLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.SubqueryLink_4004,
					SubqueryLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_LogicalLink_4005(
			LogicalOperation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getLogicalLink_Target()
					|| false == setting.getEObject() instanceof LogicalLink) {
				continue;
			}
			LogicalLink link = (LogicalLink) setting.getEObject();
			if (LogicalLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.LogicalLink_4005,
					LogicalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DsqlLinkDescriptor> getIncomingTypeModelFacetLinks_ConditionalExpressionLink_4006(
			ConditionalExpression target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DsqlPackage.eINSTANCE.getConditionalExpressionLink_Target()
					|| false == setting.getEObject() instanceof ConditionalExpressionLink) {
				continue;
			}
			ConditionalExpressionLink link = (ConditionalExpressionLink) setting.getEObject();
			if (ConditionalExpressionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConditionalExpressionSource src = link.getSource();
			result.add(new DsqlLinkDescriptor(src, target, link, DsqlElementTypes.ConditionalExpressionLink_4006,
					ConditionalExpressionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_SetLink_4001(Query source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SetLink) {
				continue;
			}
			SetLink link = (SetLink) linkObject;
			if (SetLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Query dst = link.getTarget();
			Query src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.SetLink_4001, SetLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_JoinLink_4002(Source source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinLink) {
				continue;
			}
			JoinLink link = (JoinLink) linkObject;
			if (JoinLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Source dst = link.getTarget();
			Source src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(
					new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.JoinLink_4002, JoinLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_JoinConditionLink_4003(
			JoinLink source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof JoinConditionLink) {
				continue;
			}
			JoinConditionLink link = (JoinConditionLink) linkObject;
			if (JoinConditionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Expression dst = link.getTarget();
			JoinLink src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.JoinConditionLink_4003,
					JoinConditionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_SubqueryLink_4004(Query source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SubqueryLink) {
				continue;
			}
			SubqueryLink link = (SubqueryLink) linkObject;
			if (SubqueryLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			SubqueryTarget dst = link.getTarget();
			Query src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.SubqueryLink_4004,
					SubqueryLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_LogicalLink_4005(Column source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof LogicalLink) {
				continue;
			}
			LogicalLink link = (LogicalLink) linkObject;
			if (LogicalLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			LogicalOperation dst = link.getTarget();
			Column src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.LogicalLink_4005,
					LogicalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DsqlLinkDescriptor> getOutgoingTypeModelFacetLinks_ConditionalExpressionLink_4006(
			ConditionalExpressionSource source) {
		QueryDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof QueryDiagram) {
				container = (QueryDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DsqlLinkDescriptor> result = new LinkedList<DsqlLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalExpressionLink) {
				continue;
			}
			ConditionalExpressionLink link = (ConditionalExpressionLink) linkObject;
			if (ConditionalExpressionLinkEditPart.VISUAL_ID != DsqlVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConditionalExpression dst = link.getTarget();
			ConditionalExpressionSource src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DsqlLinkDescriptor(src, dst, link, DsqlElementTypes.ConditionalExpressionLink_4006,
					ConditionalExpressionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DsqlNodeDescriptor> getSemanticChildren(View view) {
			return DsqlDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DsqlLinkDescriptor> getContainedLinks(View view) {
			return DsqlDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DsqlLinkDescriptor> getIncomingLinks(View view) {
			return DsqlDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DsqlLinkDescriptor> getOutgoingLinks(View view) {
			return DsqlDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

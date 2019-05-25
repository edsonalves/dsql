/*
* 
*/
package dsql.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import dsql.DsqlPackage;
import dsql.QueryDiagram;
import dsql.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DsqlVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "br.ufpe.cin.dsql.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (QueryDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return QueryDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dsql.diagram.part.DsqlVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DsqlDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsqlPackage.eINSTANCE.getQueryDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((QueryDiagram) domainElement)) {
			return QueryDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dsql.diagram.part.DsqlVisualIDRegistry.getModelID(containerView);
		if (!QueryDiagramEditPart.MODEL_ID.equals(containerModelID) && !"dsql".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (QueryDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsql.diagram.part.DsqlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QueryDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case QueryDiagramEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getWhen().isSuperTypeOf(domainElement.eClass())) {
				return WhenEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getElse().isSuperTypeOf(domainElement.eClass())) {
				return ElseEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getQuery().isSuperTypeOf(domainElement.eClass())) {
				return QueryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getLogicalOperation().isSuperTypeOf(domainElement.eClass())) {
				return LogicalOperationEditPart.VISUAL_ID;
			}
			break;
		case WhenWhenConditionCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return UnaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary7EditPart.VISUAL_ID;
			}
			break;
		case WhenWhenResultCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary8EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case ElseElseResultCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column9EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary9EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary9EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary9EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case QueryQuerySelectCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column10EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary10EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary10EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary10EditPart.VISUAL_ID;
			}
			break;
		case QueryQueryFromCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column11EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary11EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary11EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary11EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getSource().isSuperTypeOf(domainElement.eClass())) {
				return SourceEditPart.VISUAL_ID;
			}
			break;
		case QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column12EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary12EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary12EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary12EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		case LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column13EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary13EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary13EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary13EditPart.VISUAL_ID;
			}
			break;
		case UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return BinaryEditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return TernaryEditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary3EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary2EditPart.VISUAL_ID;
			}
			break;
		case BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary4EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary2EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary3EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary5EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary4EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary5EditPart.VISUAL_ID;
			}
			break;
		case TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID:
			if (DsqlPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column8EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getUnary().isSuperTypeOf(domainElement.eClass())) {
				return Unary7EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getBinary().isSuperTypeOf(domainElement.eClass())) {
				return Binary6EditPart.VISUAL_ID;
			}
			if (DsqlPackage.eINSTANCE.getTernary().isSuperTypeOf(domainElement.eClass())) {
				return Ternary6EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dsql.diagram.part.DsqlVisualIDRegistry.getModelID(containerView);
		if (!QueryDiagramEditPart.MODEL_ID.equals(containerModelID) && !"dsql".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (QueryDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dsql.diagram.part.DsqlVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QueryDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case QueryDiagramEditPart.VISUAL_ID:
			if (WhenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicalOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhenEditPart.VISUAL_ID:
			if (WhenLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhenWhenConditionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhenWhenResultCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseEditPart.VISUAL_ID:
			if (ElseLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElseElseResultCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryEditPart.VISUAL_ID:
			if (QueryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryQuerySelectCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryQueryFromCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalOperationEditPart.VISUAL_ID:
			if (LogicalOperationTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column2EditPart.VISUAL_ID:
			if (ColumnName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryEditPart.VISUAL_ID:
			if (UnaryOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column3EditPart.VISUAL_ID:
			if (ColumnName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary2EditPart.VISUAL_ID:
			if (UnaryOperation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryEditPart.VISUAL_ID:
			if (BinaryOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column4EditPart.VISUAL_ID:
			if (ColumnName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column5EditPart.VISUAL_ID:
			if (ColumnName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary3EditPart.VISUAL_ID:
			if (UnaryOperation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryEditPart.VISUAL_ID:
			if (TernaryOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column6EditPart.VISUAL_ID:
			if (ColumnName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column7EditPart.VISUAL_ID:
			if (ColumnName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column8EditPart.VISUAL_ID:
			if (ColumnName8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary4EditPart.VISUAL_ID:
			if (UnaryOperation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary2EditPart.VISUAL_ID:
			if (BinaryOperation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary3EditPart.VISUAL_ID:
			if (BinaryOperation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary2EditPart.VISUAL_ID:
			if (TernaryOperation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary3EditPart.VISUAL_ID:
			if (TernaryOperation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary5EditPart.VISUAL_ID:
			if (UnaryOperation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary4EditPart.VISUAL_ID:
			if (BinaryOperation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary6EditPart.VISUAL_ID:
			if (UnaryOperation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary5EditPart.VISUAL_ID:
			if (BinaryOperation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary4EditPart.VISUAL_ID:
			if (TernaryOperation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary5EditPart.VISUAL_ID:
			if (TernaryOperation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary7EditPart.VISUAL_ID:
			if (UnaryOperation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary6EditPart.VISUAL_ID:
			if (BinaryOperation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary6EditPart.VISUAL_ID:
			if (TernaryOperation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary7EditPart.VISUAL_ID:
			if (BinaryOperation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary7EditPart.VISUAL_ID:
			if (TernaryOperation7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary8EditPart.VISUAL_ID:
			if (UnaryOperation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary8EditPart.VISUAL_ID:
			if (BinaryOperation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary8EditPart.VISUAL_ID:
			if (TernaryOperation8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column9EditPart.VISUAL_ID:
			if (ColumnName9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary9EditPart.VISUAL_ID:
			if (UnaryOperation9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary9EditPart.VISUAL_ID:
			if (BinaryOperation9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary9EditPart.VISUAL_ID:
			if (TernaryOperation9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column10EditPart.VISUAL_ID:
			if (ColumnName10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column11EditPart.VISUAL_ID:
			if (ColumnName11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column12EditPart.VISUAL_ID:
			if (ColumnName12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary10EditPart.VISUAL_ID:
			if (UnaryOperation10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary10EditPart.VISUAL_ID:
			if (BinaryOperation10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary10EditPart.VISUAL_ID:
			if (TernaryOperation10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary11EditPart.VISUAL_ID:
			if (UnaryOperation11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary11EditPart.VISUAL_ID:
			if (BinaryOperation11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary11EditPart.VISUAL_ID:
			if (TernaryOperation11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary12EditPart.VISUAL_ID:
			if (UnaryOperation12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary12EditPart.VISUAL_ID:
			if (BinaryOperation12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary12EditPart.VISUAL_ID:
			if (TernaryOperation12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SourceEditPart.VISUAL_ID:
			if (SourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column13EditPart.VISUAL_ID:
			if (ColumnName13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Unary13EditPart.VISUAL_ID:
			if (UnaryOperation13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Binary13EditPart.VISUAL_ID:
			if (BinaryOperation13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ternary13EditPart.VISUAL_ID:
			if (TernaryOperation13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhenWhenConditionCompartmentEditPart.VISUAL_ID:
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhenWhenResultCompartmentEditPart.VISUAL_ID:
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElseElseResultCompartmentEditPart.VISUAL_ID:
			if (Column9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryQuerySelectCompartmentEditPart.VISUAL_ID:
			if (Column10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryQueryFromCompartmentEditPart.VISUAL_ID:
			if (Column11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID:
			if (Column12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID:
			if (Column13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID:
			if (Column3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BinaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TernaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID:
			if (Column4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID:
			if (Column5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID:
			if (Column6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID:
			if (Column7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID:
			if (Column8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Unary7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Binary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ternary6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SetLinkEditPart.VISUAL_ID:
			if (SetLinkSetOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JoinLinkEditPart.VISUAL_ID:
			if (JoinLinkJoinTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubqueryLinkEditPart.VISUAL_ID:
			if (SubqueryLinkOperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DsqlPackage.eINSTANCE.getSetLink().isSuperTypeOf(domainElement.eClass())) {
			return SetLinkEditPart.VISUAL_ID;
		}
		if (DsqlPackage.eINSTANCE.getJoinLink().isSuperTypeOf(domainElement.eClass())) {
			return JoinLinkEditPart.VISUAL_ID;
		}
		if (DsqlPackage.eINSTANCE.getJoinConditionLink().isSuperTypeOf(domainElement.eClass())) {
			return JoinConditionLinkEditPart.VISUAL_ID;
		}
		if (DsqlPackage.eINSTANCE.getSubqueryLink().isSuperTypeOf(domainElement.eClass())) {
			return SubqueryLinkEditPart.VISUAL_ID;
		}
		if (DsqlPackage.eINSTANCE.getLogicalLink().isSuperTypeOf(domainElement.eClass())) {
			return LogicalLinkEditPart.VISUAL_ID;
		}
		if (DsqlPackage.eINSTANCE.getConditionalExpressionLink().isSuperTypeOf(domainElement.eClass())) {
			return ConditionalExpressionLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(QueryDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case WhenWhenConditionCompartmentEditPart.VISUAL_ID:
		case WhenWhenResultCompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID:
		case BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID:
		case BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID:
		case TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID:
		case TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID:
		case TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID:
		case ElseElseResultCompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID:
		case QueryQuerySelectCompartmentEditPart.VISUAL_ID:
		case QueryQueryFromCompartmentEditPart.VISUAL_ID:
		case QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID:
		case LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID:
		case UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID:
		case BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID:
		case BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID:
		case TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID:
		case TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID:
		case TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case QueryDiagramEditPart.VISUAL_ID:
			return false;
		case ColumnEditPart.VISUAL_ID:
		case Column2EditPart.VISUAL_ID:
		case Column3EditPart.VISUAL_ID:
		case Column4EditPart.VISUAL_ID:
		case Column5EditPart.VISUAL_ID:
		case Column6EditPart.VISUAL_ID:
		case Column7EditPart.VISUAL_ID:
		case Column8EditPart.VISUAL_ID:
		case Column9EditPart.VISUAL_ID:
		case Column10EditPart.VISUAL_ID:
		case Column11EditPart.VISUAL_ID:
		case Column12EditPart.VISUAL_ID:
		case SourceEditPart.VISUAL_ID:
		case Column13EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return dsql.diagram.part.DsqlVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return dsql.diagram.part.DsqlVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dsql.diagram.part.DsqlVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dsql.diagram.part.DsqlVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return dsql.diagram.part.DsqlVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return dsql.diagram.part.DsqlVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}

/*
* 
*/
package dsql.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import dsql.diagram.edit.commands.ConditionalExpressionLinkCreateCommand;
import dsql.diagram.edit.commands.ConditionalExpressionLinkReorientCommand;
import dsql.diagram.edit.commands.JoinConditionLinkCreateCommand;
import dsql.diagram.edit.commands.JoinConditionLinkReorientCommand;
import dsql.diagram.edit.commands.LogicalLinkCreateCommand;
import dsql.diagram.edit.commands.LogicalLinkReorientCommand;
import dsql.diagram.edit.commands.SubqueryLinkCreateCommand;
import dsql.diagram.edit.commands.SubqueryLinkReorientCommand;
import dsql.diagram.edit.parts.ConditionalExpressionLinkEditPart;
import dsql.diagram.edit.parts.JoinConditionLinkEditPart;
import dsql.diagram.edit.parts.LogicalLinkEditPart;
import dsql.diagram.edit.parts.SubqueryLinkEditPart;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class Column3ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public Column3ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Column_3004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (DsqlVisualIDRegistry.getVisualID(incomingLink) == JoinConditionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DsqlVisualIDRegistry.getVisualID(incomingLink) == SubqueryLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DsqlVisualIDRegistry.getVisualID(outgoingLink) == LogicalLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DsqlVisualIDRegistry.getVisualID(outgoingLink) == ConditionalExpressionLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DsqlElementTypes.JoinConditionLink_4003 == req.getElementType()) {
			return getGEFWrapper(new JoinConditionLinkCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (DsqlElementTypes.SubqueryLink_4004 == req.getElementType()) {
			return getGEFWrapper(new SubqueryLinkCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (DsqlElementTypes.LogicalLink_4005 == req.getElementType()) {
			return getGEFWrapper(new LogicalLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DsqlElementTypes.ConditionalExpressionLink_4006 == req.getElementType()) {
			return getGEFWrapper(new ConditionalExpressionLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DsqlElementTypes.JoinConditionLink_4003 == req.getElementType()) {
			return getGEFWrapper(new JoinConditionLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DsqlElementTypes.SubqueryLink_4004 == req.getElementType()) {
			return getGEFWrapper(new SubqueryLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (DsqlElementTypes.LogicalLink_4005 == req.getElementType()) {
			return getGEFWrapper(new LogicalLinkCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (DsqlElementTypes.ConditionalExpressionLink_4006 == req.getElementType()) {
			return getGEFWrapper(new ConditionalExpressionLinkCreateCommand(req, req.getTarget(), req.getSource()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new JoinConditionLinkReorientCommand(req));
		case SubqueryLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new SubqueryLinkReorientCommand(req));
		case LogicalLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new LogicalLinkReorientCommand(req));
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionalExpressionLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}

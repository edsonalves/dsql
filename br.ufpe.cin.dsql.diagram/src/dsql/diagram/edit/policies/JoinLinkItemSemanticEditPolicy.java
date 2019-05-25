/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dsql.diagram.edit.commands.JoinConditionLinkCreateCommand;
import dsql.diagram.edit.commands.JoinConditionLinkReorientCommand;
import dsql.diagram.edit.parts.JoinConditionLinkEditPart;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class JoinLinkItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public JoinLinkItemSemanticEditPolicy() {
		super(DsqlElementTypes.JoinLink_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
			return getGEFWrapper(new JoinConditionLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (DsqlElementTypes.JoinConditionLink_4003 == req.getElementType()) {
			return getGEFWrapper(new JoinConditionLinkCreateCommand(req, req.getTarget(), req.getSource()));
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
		}
		return super.getReorientRelationshipCommand(req);
	}

}

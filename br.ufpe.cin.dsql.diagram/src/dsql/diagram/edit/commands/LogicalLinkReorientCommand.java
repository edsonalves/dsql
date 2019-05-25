/*
 * 
 */
package dsql.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import dsql.Column;
import dsql.LogicalLink;
import dsql.LogicalOperation;
import dsql.QueryDiagram;
import dsql.diagram.edit.policies.DsqlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class LogicalLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public LogicalLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof LogicalLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Column && newEnd instanceof Column)) {
			return false;
		}
		LogicalOperation target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof QueryDiagram)) {
			return false;
		}
		QueryDiagram container = (QueryDiagram) getLink().eContainer();
		return DsqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistLogicalLink_4005(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof LogicalOperation && newEnd instanceof LogicalOperation)) {
			return false;
		}
		Column source = getLink().getSource();
		if (!(getLink().eContainer() instanceof QueryDiagram)) {
			return false;
		}
		QueryDiagram container = (QueryDiagram) getLink().eContainer();
		return DsqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistLogicalLink_4005(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected LogicalLink getLink() {
		return (LogicalLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Column getOldSource() {
		return (Column) oldEnd;
	}

	/**
	* @generated
	*/
	protected Column getNewSource() {
		return (Column) newEnd;
	}

	/**
	* @generated
	*/
	protected LogicalOperation getOldTarget() {
		return (LogicalOperation) oldEnd;
	}

	/**
	* @generated
	*/
	protected LogicalOperation getNewTarget() {
		return (LogicalOperation) newEnd;
	}
}

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

import dsql.ConditionalExpression;
import dsql.ConditionalExpressionLink;
import dsql.ConditionalExpressionSource;
import dsql.QueryDiagram;
import dsql.diagram.edit.policies.DsqlBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConditionalExpressionLinkReorientCommand extends EditElementCommand {

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
	public ConditionalExpressionLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ConditionalExpressionLink) {
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
		if (!(oldEnd instanceof ConditionalExpressionSource && newEnd instanceof ConditionalExpressionSource)) {
			return false;
		}
		ConditionalExpression target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof QueryDiagram)) {
			return false;
		}
		QueryDiagram container = (QueryDiagram) getLink().eContainer();
		return DsqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistConditionalExpressionLink_4006(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ConditionalExpression && newEnd instanceof ConditionalExpression)) {
			return false;
		}
		ConditionalExpressionSource source = getLink().getSource();
		if (!(getLink().eContainer() instanceof QueryDiagram)) {
			return false;
		}
		QueryDiagram container = (QueryDiagram) getLink().eContainer();
		return DsqlBaseItemSemanticEditPolicy.getLinkConstraints().canExistConditionalExpressionLink_4006(container,
				getLink(), source, getNewTarget());
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
	protected ConditionalExpressionLink getLink() {
		return (ConditionalExpressionLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ConditionalExpressionSource getOldSource() {
		return (ConditionalExpressionSource) oldEnd;
	}

	/**
	* @generated
	*/
	protected ConditionalExpressionSource getNewSource() {
		return (ConditionalExpressionSource) newEnd;
	}

	/**
	* @generated
	*/
	protected ConditionalExpression getOldTarget() {
		return (ConditionalExpression) oldEnd;
	}

	/**
	* @generated
	*/
	protected ConditionalExpression getNewTarget() {
		return (ConditionalExpression) newEnd;
	}
}

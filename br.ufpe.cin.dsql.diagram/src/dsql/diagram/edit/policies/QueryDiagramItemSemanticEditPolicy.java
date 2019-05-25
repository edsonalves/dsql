/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import dsql.diagram.edit.commands.ElseCreateCommand;
import dsql.diagram.edit.commands.LogicalOperationCreateCommand;
import dsql.diagram.edit.commands.QueryCreateCommand;
import dsql.diagram.edit.commands.WhenCreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryDiagramItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QueryDiagramItemSemanticEditPolicy() {
		super(DsqlElementTypes.QueryDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.When_2001 == req.getElementType()) {
			return getGEFWrapper(new WhenCreateCommand(req));
		}
		if (DsqlElementTypes.Else_2002 == req.getElementType()) {
			return getGEFWrapper(new ElseCreateCommand(req));
		}
		if (DsqlElementTypes.Query_2003 == req.getElementType()) {
			return getGEFWrapper(new QueryCreateCommand(req));
		}
		if (DsqlElementTypes.LogicalOperation_2004 == req.getElementType()) {
			return getGEFWrapper(new LogicalOperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}

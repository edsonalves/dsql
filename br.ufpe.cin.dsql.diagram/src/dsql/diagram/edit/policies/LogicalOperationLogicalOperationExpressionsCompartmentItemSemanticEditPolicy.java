/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary13CreateCommand;
import dsql.diagram.edit.commands.Column13CreateCommand;
import dsql.diagram.edit.commands.Ternary13CreateCommand;
import dsql.diagram.edit.commands.Unary13CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class LogicalOperationLogicalOperationExpressionsCompartmentItemSemanticEditPolicy
		extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LogicalOperationLogicalOperationExpressionsCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.LogicalOperation_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3050 == req.getElementType()) {
			return getGEFWrapper(new Column13CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3051 == req.getElementType()) {
			return getGEFWrapper(new Unary13CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3052 == req.getElementType()) {
			return getGEFWrapper(new Binary13CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3053 == req.getElementType()) {
			return getGEFWrapper(new Ternary13CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

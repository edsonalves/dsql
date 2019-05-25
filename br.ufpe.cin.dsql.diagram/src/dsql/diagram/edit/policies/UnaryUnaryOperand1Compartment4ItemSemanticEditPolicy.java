/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.BinaryCreateCommand;
import dsql.diagram.edit.commands.Column3CreateCommand;
import dsql.diagram.edit.commands.TernaryCreateCommand;
import dsql.diagram.edit.commands.Unary2CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class UnaryUnaryOperand1Compartment4ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UnaryUnaryOperand1Compartment4ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Unary_3014);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3004 == req.getElementType()) {
			return getGEFWrapper(new Column3CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3005 == req.getElementType()) {
			return getGEFWrapper(new Unary2CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3006 == req.getElementType()) {
			return getGEFWrapper(new BinaryCreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3010 == req.getElementType()) {
			return getGEFWrapper(new TernaryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary5CreateCommand;
import dsql.diagram.edit.commands.Column5CreateCommand;
import dsql.diagram.edit.commands.Ternary4CreateCommand;
import dsql.diagram.edit.commands.Unary6CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class BinaryBinaryOperand2Compartment12ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BinaryBinaryOperand2Compartment12ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Binary_3047);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3008 == req.getElementType()) {
			return getGEFWrapper(new Column5CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3021 == req.getElementType()) {
			return getGEFWrapper(new Unary6CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3022 == req.getElementType()) {
			return getGEFWrapper(new Binary5CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3023 == req.getElementType()) {
			return getGEFWrapper(new Ternary4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

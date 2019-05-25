/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary3CreateCommand;
import dsql.diagram.edit.commands.Column4CreateCommand;
import dsql.diagram.edit.commands.Ternary2CreateCommand;
import dsql.diagram.edit.commands.Unary3CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class BinaryBinaryOperand1Compartment5ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BinaryBinaryOperand1Compartment5ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Binary_3022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3007 == req.getElementType()) {
			return getGEFWrapper(new Column4CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3009 == req.getElementType()) {
			return getGEFWrapper(new Unary3CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3016 == req.getElementType()) {
			return getGEFWrapper(new Binary3CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3017 == req.getElementType()) {
			return getGEFWrapper(new Ternary2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

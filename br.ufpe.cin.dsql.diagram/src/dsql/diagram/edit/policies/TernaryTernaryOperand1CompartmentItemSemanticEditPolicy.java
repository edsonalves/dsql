/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary2CreateCommand;
import dsql.diagram.edit.commands.Column6CreateCommand;
import dsql.diagram.edit.commands.Ternary3CreateCommand;
import dsql.diagram.edit.commands.Unary4CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class TernaryTernaryOperand1CompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TernaryTernaryOperand1CompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.Ternary_3010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3011 == req.getElementType()) {
			return getGEFWrapper(new Column6CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3014 == req.getElementType()) {
			return getGEFWrapper(new Unary4CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3015 == req.getElementType()) {
			return getGEFWrapper(new Binary2CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3018 == req.getElementType()) {
			return getGEFWrapper(new Ternary3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

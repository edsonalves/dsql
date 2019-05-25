/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary6CreateCommand;
import dsql.diagram.edit.commands.Column8CreateCommand;
import dsql.diagram.edit.commands.Ternary6CreateCommand;
import dsql.diagram.edit.commands.Unary7CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class TernaryTernaryOperand3Compartment12ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TernaryTernaryOperand3Compartment12ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Ternary_3048);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3013 == req.getElementType()) {
			return getGEFWrapper(new Column8CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3025 == req.getElementType()) {
			return getGEFWrapper(new Unary7CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3026 == req.getElementType()) {
			return getGEFWrapper(new Binary6CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3027 == req.getElementType()) {
			return getGEFWrapper(new Ternary6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

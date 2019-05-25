/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary4CreateCommand;
import dsql.diagram.edit.commands.Column7CreateCommand;
import dsql.diagram.edit.commands.Ternary5CreateCommand;
import dsql.diagram.edit.commands.Unary5CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class TernaryTernaryOperand2Compartment13ItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TernaryTernaryOperand2Compartment13ItemSemanticEditPolicy() {
		super(DsqlElementTypes.Ternary_3053);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3012 == req.getElementType()) {
			return getGEFWrapper(new Column7CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3019 == req.getElementType()) {
			return getGEFWrapper(new Unary5CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3020 == req.getElementType()) {
			return getGEFWrapper(new Binary4CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3024 == req.getElementType()) {
			return getGEFWrapper(new Ternary5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

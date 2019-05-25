/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary7CreateCommand;
import dsql.diagram.edit.commands.ColumnCreateCommand;
import dsql.diagram.edit.commands.Ternary7CreateCommand;
import dsql.diagram.edit.commands.UnaryCreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class WhenWhenConditionCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WhenWhenConditionCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.When_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3001 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3003 == req.getElementType()) {
			return getGEFWrapper(new UnaryCreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3028 == req.getElementType()) {
			return getGEFWrapper(new Binary7CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3029 == req.getElementType()) {
			return getGEFWrapper(new Ternary7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary8CreateCommand;
import dsql.diagram.edit.commands.Column2CreateCommand;
import dsql.diagram.edit.commands.Ternary8CreateCommand;
import dsql.diagram.edit.commands.Unary8CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class WhenWhenResultCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WhenWhenResultCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.When_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3002 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3030 == req.getElementType()) {
			return getGEFWrapper(new Unary8CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3031 == req.getElementType()) {
			return getGEFWrapper(new Binary8CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3032 == req.getElementType()) {
			return getGEFWrapper(new Ternary8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

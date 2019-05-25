/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary9CreateCommand;
import dsql.diagram.edit.commands.Column9CreateCommand;
import dsql.diagram.edit.commands.Ternary9CreateCommand;
import dsql.diagram.edit.commands.Unary9CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class ElseElseResultCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ElseElseResultCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.Else_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3033 == req.getElementType()) {
			return getGEFWrapper(new Column9CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3034 == req.getElementType()) {
			return getGEFWrapper(new Unary9CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3035 == req.getElementType()) {
			return getGEFWrapper(new Binary9CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3036 == req.getElementType()) {
			return getGEFWrapper(new Ternary9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

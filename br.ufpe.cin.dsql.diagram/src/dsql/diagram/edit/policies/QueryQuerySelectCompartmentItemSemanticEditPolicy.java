/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary10CreateCommand;
import dsql.diagram.edit.commands.Column10CreateCommand;
import dsql.diagram.edit.commands.Ternary10CreateCommand;
import dsql.diagram.edit.commands.Unary10CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryQuerySelectCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QueryQuerySelectCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.Query_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3037 == req.getElementType()) {
			return getGEFWrapper(new Column10CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3040 == req.getElementType()) {
			return getGEFWrapper(new Unary10CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3041 == req.getElementType()) {
			return getGEFWrapper(new Binary10CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3042 == req.getElementType()) {
			return getGEFWrapper(new Ternary10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

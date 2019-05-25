/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary12CreateCommand;
import dsql.diagram.edit.commands.Column12CreateCommand;
import dsql.diagram.edit.commands.Ternary12CreateCommand;
import dsql.diagram.edit.commands.Unary12CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryQueryWhereHavingCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QueryQueryWhereHavingCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.Query_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3039 == req.getElementType()) {
			return getGEFWrapper(new Column12CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3046 == req.getElementType()) {
			return getGEFWrapper(new Unary12CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3047 == req.getElementType()) {
			return getGEFWrapper(new Binary12CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3048 == req.getElementType()) {
			return getGEFWrapper(new Ternary12CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

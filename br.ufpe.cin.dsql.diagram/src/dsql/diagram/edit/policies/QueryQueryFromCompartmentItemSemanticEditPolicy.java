/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import dsql.diagram.edit.commands.Binary11CreateCommand;
import dsql.diagram.edit.commands.Column11CreateCommand;
import dsql.diagram.edit.commands.SourceCreateCommand;
import dsql.diagram.edit.commands.Ternary11CreateCommand;
import dsql.diagram.edit.commands.Unary11CreateCommand;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryQueryFromCompartmentItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public QueryQueryFromCompartmentItemSemanticEditPolicy() {
		super(DsqlElementTypes.Query_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DsqlElementTypes.Column_3038 == req.getElementType()) {
			return getGEFWrapper(new Column11CreateCommand(req));
		}
		if (DsqlElementTypes.Unary_3043 == req.getElementType()) {
			return getGEFWrapper(new Unary11CreateCommand(req));
		}
		if (DsqlElementTypes.Binary_3044 == req.getElementType()) {
			return getGEFWrapper(new Binary11CreateCommand(req));
		}
		if (DsqlElementTypes.Ternary_3045 == req.getElementType()) {
			return getGEFWrapper(new Ternary11CreateCommand(req));
		}
		if (DsqlElementTypes.Source_3049 == req.getElementType()) {
			return getGEFWrapper(new SourceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

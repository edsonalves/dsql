/*
* 
*/
package dsql.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class SetLinkItemSemanticEditPolicy extends DsqlBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SetLinkItemSemanticEditPolicy() {
		super(DsqlElementTypes.SetLink_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}

/*
 * 
 */
package dsql.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsql.diagram.providers.DsqlElementTypes;
import dsql.diagram.providers.DsqlModelingAssistantProvider;

/**
 * @generated
 */
public class DsqlModelingAssistantProviderOfQueryDiagramEditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DsqlElementTypes.When_2001);
		types.add(DsqlElementTypes.Else_2002);
		types.add(DsqlElementTypes.Query_2003);
		types.add(DsqlElementTypes.LogicalOperation_2004);
		return types;
	}

}

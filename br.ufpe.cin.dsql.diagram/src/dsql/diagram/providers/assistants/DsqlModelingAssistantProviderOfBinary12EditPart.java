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
public class DsqlModelingAssistantProviderOfBinary12EditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(DsqlElementTypes.Column_3007);
		types.add(DsqlElementTypes.Unary_3009);
		types.add(DsqlElementTypes.Binary_3016);
		types.add(DsqlElementTypes.Ternary_3017);
		types.add(DsqlElementTypes.Column_3008);
		types.add(DsqlElementTypes.Unary_3021);
		types.add(DsqlElementTypes.Binary_3022);
		types.add(DsqlElementTypes.Ternary_3023);
		return types;
	}

}

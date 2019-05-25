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
public class DsqlModelingAssistantProviderOfTernary11EditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(12);
		types.add(DsqlElementTypes.Column_3011);
		types.add(DsqlElementTypes.Unary_3014);
		types.add(DsqlElementTypes.Binary_3015);
		types.add(DsqlElementTypes.Ternary_3018);
		types.add(DsqlElementTypes.Column_3012);
		types.add(DsqlElementTypes.Unary_3019);
		types.add(DsqlElementTypes.Binary_3020);
		types.add(DsqlElementTypes.Ternary_3024);
		types.add(DsqlElementTypes.Column_3013);
		types.add(DsqlElementTypes.Unary_3025);
		types.add(DsqlElementTypes.Binary_3026);
		types.add(DsqlElementTypes.Ternary_3027);
		return types;
	}

}

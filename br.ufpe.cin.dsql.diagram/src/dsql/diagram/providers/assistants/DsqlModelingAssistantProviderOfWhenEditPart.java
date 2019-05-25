/*
 * 
 */
package dsql.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import dsql.diagram.edit.parts.ElseEditPart;
import dsql.diagram.edit.parts.WhenEditPart;
import dsql.diagram.providers.DsqlElementTypes;
import dsql.diagram.providers.DsqlModelingAssistantProvider;

/**
 * @generated
 */
public class DsqlModelingAssistantProviderOfWhenEditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(DsqlElementTypes.Column_3001);
		types.add(DsqlElementTypes.Unary_3003);
		types.add(DsqlElementTypes.Binary_3028);
		types.add(DsqlElementTypes.Ternary_3029);
		types.add(DsqlElementTypes.Column_3002);
		types.add(DsqlElementTypes.Unary_3030);
		types.add(DsqlElementTypes.Binary_3031);
		types.add(DsqlElementTypes.Ternary_3032);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WhenEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WhenEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsqlElementTypes.ConditionalExpressionLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WhenEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(WhenEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WhenEditPart) {
			types.add(DsqlElementTypes.ConditionalExpressionLink_4006);
		}
		if (targetEditPart instanceof ElseEditPart) {
			types.add(DsqlElementTypes.ConditionalExpressionLink_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WhenEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WhenEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.ConditionalExpressionLink_4006) {
			types.add(DsqlElementTypes.When_2001);
			types.add(DsqlElementTypes.Else_2002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WhenEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WhenEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsqlElementTypes.ConditionalExpressionLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WhenEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WhenEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.ConditionalExpressionLink_4006) {
			types.add(DsqlElementTypes.When_2001);
			types.add(DsqlElementTypes.Column_3001);
			types.add(DsqlElementTypes.Column_3002);
			types.add(DsqlElementTypes.Column_3004);
			types.add(DsqlElementTypes.Column_3007);
			types.add(DsqlElementTypes.Column_3008);
			types.add(DsqlElementTypes.Column_3011);
			types.add(DsqlElementTypes.Column_3012);
			types.add(DsqlElementTypes.Column_3013);
			types.add(DsqlElementTypes.Column_3033);
			types.add(DsqlElementTypes.Column_3037);
			types.add(DsqlElementTypes.Column_3038);
			types.add(DsqlElementTypes.Column_3039);
			types.add(DsqlElementTypes.Column_3050);
		}
		return types;
	}

}

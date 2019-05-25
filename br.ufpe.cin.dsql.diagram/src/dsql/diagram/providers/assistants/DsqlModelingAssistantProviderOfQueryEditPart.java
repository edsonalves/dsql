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

import dsql.diagram.edit.parts.Column10EditPart;
import dsql.diagram.edit.parts.Column11EditPart;
import dsql.diagram.edit.parts.Column12EditPart;
import dsql.diagram.edit.parts.Column13EditPart;
import dsql.diagram.edit.parts.Column2EditPart;
import dsql.diagram.edit.parts.Column3EditPart;
import dsql.diagram.edit.parts.Column4EditPart;
import dsql.diagram.edit.parts.Column5EditPart;
import dsql.diagram.edit.parts.Column6EditPart;
import dsql.diagram.edit.parts.Column7EditPart;
import dsql.diagram.edit.parts.Column8EditPart;
import dsql.diagram.edit.parts.Column9EditPart;
import dsql.diagram.edit.parts.ColumnEditPart;
import dsql.diagram.edit.parts.QueryEditPart;
import dsql.diagram.edit.parts.SourceEditPart;
import dsql.diagram.providers.DsqlElementTypes;
import dsql.diagram.providers.DsqlModelingAssistantProvider;

/**
 * @generated
 */
public class DsqlModelingAssistantProviderOfQueryEditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(DsqlElementTypes.Column_3037);
		types.add(DsqlElementTypes.Unary_3040);
		types.add(DsqlElementTypes.Binary_3041);
		types.add(DsqlElementTypes.Ternary_3042);
		types.add(DsqlElementTypes.Column_3039);
		types.add(DsqlElementTypes.Unary_3046);
		types.add(DsqlElementTypes.Binary_3047);
		types.add(DsqlElementTypes.Ternary_3048);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((QueryEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(QueryEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DsqlElementTypes.SetLink_4001);
		types.add(DsqlElementTypes.SubqueryLink_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((QueryEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(QueryEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof QueryEditPart) {
			types.add(DsqlElementTypes.SetLink_4001);
		}
		if (targetEditPart instanceof ColumnEditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column2EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column3EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column4EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column5EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column6EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column7EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column8EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column9EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column10EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column11EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column12EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof SourceEditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		if (targetEditPart instanceof Column13EditPart) {
			types.add(DsqlElementTypes.SubqueryLink_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((QueryEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(QueryEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.SetLink_4001) {
			types.add(DsqlElementTypes.Query_2003);
		} else if (relationshipType == DsqlElementTypes.SubqueryLink_4004) {
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
			types.add(DsqlElementTypes.Source_3049);
			types.add(DsqlElementTypes.Column_3050);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((QueryEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(QueryEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsqlElementTypes.SetLink_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((QueryEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(QueryEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.SetLink_4001) {
			types.add(DsqlElementTypes.Query_2003);
		}
		return types;
	}

}

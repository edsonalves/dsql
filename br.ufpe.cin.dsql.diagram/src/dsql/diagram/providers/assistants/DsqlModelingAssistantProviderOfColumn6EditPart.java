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

import dsql.diagram.edit.parts.Column6EditPart;
import dsql.diagram.edit.parts.ElseEditPart;
import dsql.diagram.edit.parts.LogicalOperationEditPart;
import dsql.diagram.edit.parts.WhenEditPart;
import dsql.diagram.providers.DsqlElementTypes;
import dsql.diagram.providers.DsqlModelingAssistantProvider;

/**
 * @generated
 */
public class DsqlModelingAssistantProviderOfColumn6EditPart extends DsqlModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Column6EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Column6EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DsqlElementTypes.LogicalLink_4005);
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
		return doGetRelTypesOnSourceAndTarget((Column6EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Column6EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof LogicalOperationEditPart) {
			types.add(DsqlElementTypes.LogicalLink_4005);
		}
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
		return doGetTypesForTarget((Column6EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Column6EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.LogicalLink_4005) {
			types.add(DsqlElementTypes.LogicalOperation_2004);
		} else if (relationshipType == DsqlElementTypes.ConditionalExpressionLink_4006) {
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
		return doGetRelTypesOnTarget((Column6EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Column6EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DsqlElementTypes.SubqueryLink_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Column6EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Column6EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DsqlElementTypes.SubqueryLink_4004) {
			types.add(DsqlElementTypes.Query_2003);
		}
		return types;
	}

}
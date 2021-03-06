/*
 * 
 */
package dsql.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import dsql.DsqlPackage;
import dsql.custom.gmf.runtime.editpolicies.CompartmentEditPolicy;
import dsql.diagram.edit.policies.QueryQuerySelectCompartmentCanonicalEditPolicy;
import dsql.diagram.edit.policies.QueryQuerySelectCompartmentItemSemanticEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.part.Messages;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryQuerySelectCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 7058;

	/**
	* @generated
	*/
	public QueryQuerySelectCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.QueryQuerySelectCompartmentEditPart_title;
	}

	/**
	* @generated not
	*/
	public IFigure createFigure() {
		Font FONT_NORMAL = new Font(Display.getCurrent(),
				Display.getDefault().getSystemFont().getFontData()[0].getName(), 5, SWT.NORMAL);
		
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		
		//result.setFont(FONT_NORMAL);
		
		ConstrainedToolbarLayout layout2 = (ConstrainedToolbarLayout) result.getContentPane().getLayoutManager();

		layout2.setSpacing(2);

		result.getContentPane().setLayoutManager(layout2);

		result.setTitle("<<SELECT>>");
		result.setTitleVisibility(true);
		

		
		//result.getContentPane().setFont(FONT_NORMAL);
		//result.setFont(FONT_NORMAL);
		return result;
	}

	/**
	* @generated not
	*/
	protected void refreshVisuals() {
		   super.refreshVisuals();
		 Font FONT_NORMAL = new Font(Display.getCurrent(),
					Display.getDefault().getSystemFont().getFontData()[0].getName(), 7, SWT.NORMAL);
		 ((ResizableCompartmentFigure)getFigure()).setFont(FONT_NORMAL);
	} 
	
	/**
	* @generated not
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new QueryQuerySelectCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DsqlVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new QueryQuerySelectCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(DsqlPackage.Literals.QUERY__SELECT));
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DsqlElementTypes.Column_3037) {
				return this;
			}
			if (type == DsqlElementTypes.Unary_3040) {
				return this;
			}
			if (type == DsqlElementTypes.Binary_3041) {
				return this;
			}
			if (type == DsqlElementTypes.Ternary_3042) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(DsqlElementTypes.SubqueryLink_4004))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}

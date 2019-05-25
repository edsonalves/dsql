/*
 * 
 */
package dsql.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import dsql.diagram.edit.policies.OpenDiagramEditPolicy;
import dsql.diagram.edit.policies.QueryGraphicalNodeEditPolicy;
import dsql.diagram.edit.policies.QueryItemSemanticEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class QueryEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2003;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public QueryEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DsqlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new QueryItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new QueryGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new QueryFigure();
	}

	/**
	* @generated
	*/
	public QueryFigure getPrimaryShape() {
		return (QueryFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof QueryNameEditPart) {
			((QueryNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureQueryLabelFigure());
			return true;
		}
		if (childEditPart instanceof QueryQuerySelectCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQuerySelectCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((QueryQuerySelectCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof QueryQueryFromCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQueryFromCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((QueryQueryFromCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof QueryQueryWhereHavingCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQueryWhereHavingCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((QueryQueryWhereHavingCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof QueryNameEditPart) {
			return true;
		}
		if (childEditPart instanceof QueryQuerySelectCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQuerySelectCompartmentFigure();
			pane.remove(((QueryQuerySelectCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof QueryQueryFromCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQueryFromCompartmentFigure();
			pane.remove(((QueryQueryFromCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof QueryQueryWhereHavingCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getQueryWhereHavingCompartmentFigure();
			pane.remove(((QueryQueryWhereHavingCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof QueryQuerySelectCompartmentEditPart) {
			return getPrimaryShape().getQuerySelectCompartmentFigure();
		}
		if (editPart instanceof QueryQueryFromCompartmentEditPart) {
			return getPrimaryShape().getQueryFromCompartmentFigure();
		}
		if (editPart instanceof QueryQueryWhereHavingCompartmentEditPart) {
			return getPrimaryShape().getQueryWhereHavingCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* @generated
	*/
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated not
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(0);
			nodeShape.setLayoutManager(layout);
			
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(DsqlVisualIDRegistry.getType(QueryNameEditPart.VISUAL_ID));
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
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3040) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3041) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3042) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Column_3039) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3046) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3047) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3048) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class QueryFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureQueryLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fQuerySelectCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fQueryFromCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fQueryWhereHavingCompartmentFigure;

		/**
		 * @generated not
		 */
		public QueryFigure() {
			this.setForegroundColor(THIS_FORE);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(1)));
			createContents();
			

		}

		/**
		 * @generated not
		 */
		private void createContents() {

			fFigureQueryLabelFigure = new WrappingLabel();

			fFigureQueryLabelFigure.setText("Query");
			fFigureQueryLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));
			fFigureQueryLabelFigure.setBackgroundColor(THIS_BACK);
			fFigureQueryLabelFigure.setOpaque(true);

			this.add(fFigureQueryLabelFigure);

			fQuerySelectCompartmentFigure = new RectangleFigure();

			fQuerySelectCompartmentFigure.setOutline(false);

			this.add(fQuerySelectCompartmentFigure);

			fQueryFromCompartmentFigure = new RectangleFigure();

			fQueryFromCompartmentFigure.setOutline(false);

			this.add(fQueryFromCompartmentFigure);

			fQueryWhereHavingCompartmentFigure = new RectangleFigure();
			
			fQueryWhereHavingCompartmentFigure.setOutline(false);
			
			this.add(fQueryWhereHavingCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureQueryLabelFigure() {
			return fFigureQueryLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getQuerySelectCompartmentFigure() {
			return fQuerySelectCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getQueryFromCompartmentFigure() {
			return fQueryFromCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getQueryWhereHavingCompartmentFigure() {
			return fQueryWhereHavingCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated not
	 */
	static final Color THIS_BACK = new Color(null, 206, 206, 206);
}

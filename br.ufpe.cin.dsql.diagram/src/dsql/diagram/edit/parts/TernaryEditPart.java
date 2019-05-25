/*
 * 
 */
package dsql.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.swt.graphics.Color;

import dsql.diagram.edit.policies.OpenDiagramEditPolicy;
import dsql.diagram.edit.policies.TernaryItemSemanticEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class TernaryEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3010;

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
	public TernaryEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DsqlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TernaryItemSemanticEditPolicy());
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
		return primaryShape = new TernaryFigure();
	}

	/**
	* @generated
	*/
	public TernaryFigure getPrimaryShape() {
		return (TernaryFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TernaryOperationEditPart) {
			((TernaryOperationEditPart) childEditPart).setLabel(getPrimaryShape().getFigureTernaryLabelFigure());
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand1CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand1CompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TernaryTernaryOperand1CompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand2CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand2CompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TernaryTernaryOperand2CompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand3CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand3CompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((TernaryTernaryOperand3CompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TernaryOperationEditPart) {
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand1CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand1CompartmentFigure();
			pane.remove(((TernaryTernaryOperand1CompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand2CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand2CompartmentFigure();
			pane.remove(((TernaryTernaryOperand2CompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof TernaryTernaryOperand3CompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTernaryOperand3CompartmentFigure();
			pane.remove(((TernaryTernaryOperand3CompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof TernaryTernaryOperand1CompartmentEditPart) {
			return getPrimaryShape().getTernaryOperand1CompartmentFigure();
		}
		if (editPart instanceof TernaryTernaryOperand2CompartmentEditPart) {
			return getPrimaryShape().getTernaryOperand2CompartmentFigure();
		}
		if (editPart instanceof TernaryTernaryOperand3CompartmentEditPart) {
			return getPrimaryShape().getTernaryOperand3CompartmentFigure();
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
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
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
		return getChildBySemanticHint(DsqlVisualIDRegistry.getType(TernaryOperationEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DsqlElementTypes.Column_3011) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3014) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3015) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3018) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Column_3012) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3019) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3020) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3024) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Column_3013) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3025) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3026) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3027) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class TernaryFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTernaryLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTernaryOperand1CompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTernaryOperand2CompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTernaryOperand3CompartmentFigure;

		/**
		 * @generated
		 */
		public TernaryFigure() {
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTernaryLabelFigure = new WrappingLabel();

			fFigureTernaryLabelFigure.setText("Ternary");
			fFigureTernaryLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureTernaryLabelFigure);

			fTernaryOperand1CompartmentFigure = new RectangleFigure();

			fTernaryOperand1CompartmentFigure.setOutline(false);

			this.add(fTernaryOperand1CompartmentFigure);

			fTernaryOperand2CompartmentFigure = new RectangleFigure();

			fTernaryOperand2CompartmentFigure.setOutline(false);

			this.add(fTernaryOperand2CompartmentFigure);

			fTernaryOperand3CompartmentFigure = new RectangleFigure();

			fTernaryOperand3CompartmentFigure.setOutline(false);

			this.add(fTernaryOperand3CompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTernaryLabelFigure() {
			return fFigureTernaryLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTernaryOperand1CompartmentFigure() {
			return fTernaryOperand1CompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTernaryOperand2CompartmentFigure() {
			return fTernaryOperand2CompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTernaryOperand3CompartmentFigure() {
			return fTernaryOperand3CompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}

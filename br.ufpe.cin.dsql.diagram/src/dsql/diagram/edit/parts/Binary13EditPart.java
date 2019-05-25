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

import dsql.diagram.edit.policies.Binary13ItemSemanticEditPolicy;
import dsql.diagram.edit.policies.OpenDiagramEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class Binary13EditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3052;

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
	public Binary13EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(DsqlVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Binary13ItemSemanticEditPolicy());
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
		return primaryShape = new BinaryFigure();
	}

	/**
	* @generated
	*/
	public BinaryFigure getPrimaryShape() {
		return (BinaryFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BinaryOperation13EditPart) {
			((BinaryOperation13EditPart) childEditPart).setLabel(getPrimaryShape().getFigureBinaryLabelFigure());
			return true;
		}
		if (childEditPart instanceof BinaryBinaryOperand1Compartment13EditPart) {
			IFigure pane = getPrimaryShape().getBinaryOperand1CompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BinaryBinaryOperand1Compartment13EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof BinaryBinaryOperand2Compartment13EditPart) {
			IFigure pane = getPrimaryShape().getBinaryOperand2CompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((BinaryBinaryOperand2Compartment13EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof BinaryOperation13EditPart) {
			return true;
		}
		if (childEditPart instanceof BinaryBinaryOperand1Compartment13EditPart) {
			IFigure pane = getPrimaryShape().getBinaryOperand1CompartmentFigure();
			pane.remove(((BinaryBinaryOperand1Compartment13EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof BinaryBinaryOperand2Compartment13EditPart) {
			IFigure pane = getPrimaryShape().getBinaryOperand2CompartmentFigure();
			pane.remove(((BinaryBinaryOperand2Compartment13EditPart) childEditPart).getFigure());
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
		if (editPart instanceof BinaryBinaryOperand1Compartment13EditPart) {
			return getPrimaryShape().getBinaryOperand1CompartmentFigure();
		}
		if (editPart instanceof BinaryBinaryOperand2Compartment13EditPart) {
			return getPrimaryShape().getBinaryOperand2CompartmentFigure();
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
		return getChildBySemanticHint(DsqlVisualIDRegistry.getType(BinaryOperation13EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == DsqlElementTypes.Column_3007) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3009) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3016) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3017) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Column_3008) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Unary_3021) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Binary_3022) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			}
			if (type == DsqlElementTypes.Ternary_3023) {
				return getChildBySemanticHint(
						DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class BinaryFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBinaryLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBinaryOperand1CompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fBinaryOperand2CompartmentFigure;

		/**
		 * @generated
		 */
		public BinaryFigure() {
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

			fFigureBinaryLabelFigure = new WrappingLabel();

			fFigureBinaryLabelFigure.setText("Binary");
			fFigureBinaryLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureBinaryLabelFigure);

			fBinaryOperand1CompartmentFigure = new RectangleFigure();

			fBinaryOperand1CompartmentFigure.setOutline(false);

			this.add(fBinaryOperand1CompartmentFigure);

			fBinaryOperand2CompartmentFigure = new RectangleFigure();

			fBinaryOperand2CompartmentFigure.setOutline(false);

			this.add(fBinaryOperand2CompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBinaryLabelFigure() {
			return fFigureBinaryLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBinaryOperand1CompartmentFigure() {
			return fBinaryOperand1CompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getBinaryOperand2CompartmentFigure() {
			return fBinaryOperand2CompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}

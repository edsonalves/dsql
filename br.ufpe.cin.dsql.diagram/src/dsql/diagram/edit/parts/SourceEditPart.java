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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import dsql.Source;
import dsql.SourceType;
import dsql.diagram.edit.policies.SourceItemSemanticEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class SourceEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3049;

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
	public SourceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SourceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
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
		return primaryShape = new SourceFigure();
	}

	/**
	* @generated
	*/
	public SourceFigure getPrimaryShape() {
		return (SourceFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SourceNameEditPart) {
			((SourceNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureSourceLabelFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SourceNameEditPart) {
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
		return getContentPane();
	}

	/**
	* @generated not
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 20);
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
		return getChildBySemanticHint(DsqlVisualIDRegistry.getType(SourceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated not
	 */
	protected void handleNotificationEvent(Notification event) {

		if (event.getEventType() == Notification.SET && event.getFeature() instanceof EReference) {
			EReference reference = (EReference) event.getFeature();
			if (reference.getName().equals("subqueryLinkTarget")) {
				getPrimaryShape().createContents();
				getPrimaryShape().repaint();
			}
		}

		if (event.getEventType() == Notification.SET && event.getFeature() instanceof EAttribute) {
			EAttribute atributo = (EAttribute) event.getFeature();
			if (atributo.getName().equals("type")) {

				getPrimaryShape().createContents();
				getPrimaryShape().repaint();
			}
		}

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
	public class SourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSourceLabelFigure;

		/**
		 * @generated
		 */
		public SourceFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3)));
			createContents();
		}

		/**
		 * @generated not 
		 */
		private void createContents() {

			if (fFigureSourceLabelFigure == null) {
				fFigureSourceLabelFigure = new WrappingLabel();
				fFigureSourceLabelFigure.setText("Source");
				this.add(fFigureSourceLabelFigure);
			}

			Source source = ((Source) ((Node) SourceEditPart.this.getModel()).getElement());

			//Subquery
			if (source.getType() == SourceType.SUBQUERY) {
				this.setForegroundColor(THIS_FORE_SBUQUERY);
			} else {
				this.setForegroundColor(THIS_FORE);
			}
			if (source.getSubqueryLinkTarget() != null) {
				this.setForegroundColor(THIS_FORE_SBUQUERY);
			} else {
				this.setForegroundColor(THIS_FORE);
			}

		}

		/**
		 * @generated not
		 */
		@Override
		protected void outlineShape(Graphics graphics) {
			Source source = ((Source) ((Node) SourceEditPart.this.getModel()).getElement());

			if (source.getType() == SourceType.TABLE) {
				Rectangle r = getBounds();

				Point p1 = new Point(r.x, r.y + r.height - 1);
				Point p2 = new Point(r.x, r.y);

				Point p3 = new Point(r.x + (r.width - 1), r.y);
				Point p4 = new Point(r.x + r.width - 1, r.y + r.height - 1);

				PointList pointList = new PointList();
				pointList.addPoint(p1);
				pointList.addPoint(p2);
				pointList.addPoint(p3);
				pointList.addPoint(p4);

				graphics.fillPolygon(pointList);

				graphics.drawLine(p1, p2);
				graphics.drawLine(p3, p4);

				this.setLineWidth(1);
				this.setForegroundColor(new Color(null, 0, 0, 0));
			} else {
				super.outlineShape(graphics);
			}
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSourceLabelFigure() {
			return fFigureSourceLabelFigure;
		}

	}

	/**
	 * @generated not
	 */
	static final Color THIS_FORE_SBUQUERY = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 255, 255);

}

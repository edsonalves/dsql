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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import dsql.Column;
import dsql.ColumnType;
import dsql.diagram.edit.policies.Column12GraphicalNodeEditPolicy;
import dsql.diagram.edit.policies.Column12ItemSemanticEditPolicy;
import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class Column12EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3039;

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
	public Column12EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Column12ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new Column12GraphicalNodeEditPolicy());
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
		return primaryShape = new ColumnFigure();
	}

	/**
	 * @generated
	 */
	public ColumnFigure getPrimaryShape() {
		return (ColumnFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ColumnName12EditPart) {
			((ColumnName12EditPart) childEditPart).setLabel(getPrimaryShape().getFigureColumnLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ColumnName12EditPart) {
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
		return getChildBySemanticHint(DsqlVisualIDRegistry.getType(ColumnName12EditPart.VISUAL_ID));
	}

	/**
	 * @generated not
	 */
	protected void handleNotificationEvent(Notification event) {

		if (event.getEventType() == Notification.SET && event.getFeature() instanceof EReference) {
			EReference reference = (EReference) event.getFeature();
			if (reference.getName().equals("subqueryLinkTarget") || reference.getName().equals("logicalLink")) {
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
	 * @generated not
	 */
	public class ColumnFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureColumnLabelFigure;

		/**
		 * @generated
		 */
		public ColumnFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3), getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3)));
			createContents();
		}

		/**
		 * @generated not
		 */
		private void createContents() {

			if (fFigureColumnLabelFigure == null) {
				fFigureColumnLabelFigure = new WrappingLabel();
				fFigureColumnLabelFigure.setText("Column");
				this.add(fFigureColumnLabelFigure);
			}

			Column column = ((Column) ((Node) Column12EditPart.this.getModel()).getElement());

			if(column != null){
				//field
				if (column.getType() == ColumnType.FIELD) {
					fFigureColumnLabelFigure.setFont(FONT_BOLD);
				} else {
					fFigureColumnLabelFigure.setFont(FONT_NORMAL);
				}

				//Subquery
				//			if (column.getType() == ColumnType.SUBQUERY) {
				//				this.setForegroundColor(THIS_FORE_SBUQUERY);
				//			} else {
				//				this.setForegroundColor(THIS_FORE);
				//			}

				if (column.getSubqueryLinkTarget() != null) {
					this.setForegroundColor(THIS_FORE_SBUQUERY);
				} else {
					this.setForegroundColor(THIS_FORE);
				}
			}
			//Logical connective

		}

		/**
		 * @generated not
		 */
		@Override
		protected void outlineShape(Graphics graphics) {

			Column column = ((Column) ((Node) Column12EditPart.this.getModel()).getElement());

			//Logical connective


			if (column.getType() != null && column.getType() == ColumnType.LOGICAL_CONNECTIVE) {

				Rectangle r = getBounds();

				Point p1 = new Point(r.x, r.y + r.height - 1);
				Point p2 = new Point(r.x, r.y);
				Point p3 = new Point(r.x + (r.width - 10), r.y);
				Point p4 = new Point(r.x + r.width - 1, r.y + 10);
				Point p5 = new Point(r.x + r.width - 1, r.y + r.height - 1);

				PointList pointList = new PointList();
				pointList.addPoint(p1);
				pointList.addPoint(p2);
				pointList.addPoint(p3);
				pointList.addPoint(p4);
				pointList.addPoint(p5);

				graphics.fillPolygon(pointList);

				graphics.drawLine(p1, p2);
				graphics.drawLine(p2, p3);
				graphics.drawLine(p3, p4);
				graphics.drawLine(p4, p5);
				graphics.drawLine(p5, p1);

				this.setLineWidth(1);
				this.setForegroundColor(new Color(null, 0, 0, 0));

			} else {
				//Conditional expression
				if (column.getType() == ColumnType.CONDITIONAL_EXPRESSION) {

					Rectangle r = getBounds();

					Point p1 = new Point(r.x, r.y + r.height - 1);
					Point p2 = new Point(r.x, r.y);
					Point p3 = new Point(r.x + (r.width - 10), r.y);
					Point p4 = new Point(r.x + r.width - 1, r.y + 10);
					Point p5 = new Point(r.x + r.width - 1, r.y + r.height - 1);

					PointList pointList = new PointList();
					pointList.addPoint(p1);
					pointList.addPoint(p2);
					pointList.addPoint(p3);
					pointList.addPoint(p4);
					pointList.addPoint(p5);

					graphics.fillPolygon(pointList);

					graphics.drawLine(p1, p2);
					graphics.drawLine(p2, p3);
					graphics.drawArc(r.x + (r.width - 20), r.y, 19, 25, 0, 90);
					graphics.drawLine(p4, p5);
					graphics.drawLine(p5, p1);

					this.setLineWidth(1);
					this.setForegroundColor(new Color(null, 0, 0, 0));
				} else {
					super.outlineShape(graphics);
				}
			}
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureColumnLabelFigure() {
			return fFigureColumnLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 255, 255);

	/**
	 * @generated not
	 */
	static final Color THIS_FORE_SBUQUERY = new Color(null, 0, 0, 0);

	/**
	 * @generated not
	 */
	static final Font FONT_BOLD = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.BOLD);

	/**
	 * @generated not
	 */
	static final Font FONT_NORMAL = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}

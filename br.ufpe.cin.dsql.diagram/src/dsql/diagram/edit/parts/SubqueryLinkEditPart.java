/*
 * 
 */
package dsql.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import dsql.Column;
import dsql.diagram.edit.policies.SubqueryLinkItemSemanticEditPolicy;

/**
 * @generated
 */
public class SubqueryLinkEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public SubqueryLinkEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SubqueryLinkItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new SubqueryLinkFigure();
	}

	/**
	* @generated
	*/
	public SubqueryLinkFigure getPrimaryShape() {
		return (SubqueryLinkFigure) getFigure();
	}

	/**
	 * @generated not
	 */
	public class SubqueryLinkFigure extends PolylineConnectionEx {

		private int size = 10;

		/**
		 * @generated
		 */
		public SubqueryLinkFigure() {
			this.setForegroundColor(THIS_FORE);

		}

		/**
		 * @generated not
		 */
		public void paint(Graphics g) {
			super.paint(g);
			int numPoints = this.getPolygonPoints().size();
			int pointAindex = (int) (Math.floor(numPoints / 2)) - 1;
			int pointBindex = (int) (Math.floor(numPoints / 2));

			Point pointA;
			Point pointB;

			if (numPoints < 2) {
				pointA = this.getStart();
				pointB = this.getEnd();
			} else {
				pointA = this.getPolygonPoints().getPoint(pointAindex);
				pointB = this.getPolygonPoints().getPoint(pointBindex);
			}

			int angle = (int) (calcAngle(pointB, pointA));

//			if(SubqueryLinkEditPart.this.getSource() != null){
//				
//				SourceImpl source = ((Column) ((Node) SubqueryLinkEditPart.this.getTarget().getModel()).getElement());
//				
//				System.out.println(source.getName()+ " : "+ source.getAlias());
//			}
//			
			
			
			if (this.getTargetAnchor().getOwner().getClass().getCanonicalName() == null) { //Começou da entidade
				angle = angle - (+90);
			} else {
				angle = angle - (-90);
			}
			
			angle = angle * 1;

			PointList pl = this.getPolygonPoints();
			Point midPoint;

			try {
				midPoint = pl.getMidpoint();
			} catch (IndexOutOfBoundsException e) {
				midPoint = this.getStart();
			}
			g.setLineWidth(1);
			g.setForegroundColor(THIS_FORE);
			g.drawArc(midPoint.x - size, midPoint.y - size, size * 2, size * 2, angle, -180);

		}

		/**
		 * @generated not
		 */
		public double calcAngle(Point p, Point q) {

			float x1 = p.x;
			float y1 = p.y;
			float x2 = q.x;
			float y2 = q.y;

			float dx = x2 - x1;
			float dy = y2 - y1;
			double angle = 0.0d;

			if (dx == 0.0) {
				if (dy == 0.0)
					angle = 0.0;
				else if (dy > 0.0)
					angle = Math.PI / 2.0;
				else
					angle = Math.PI * 3.0 / 2.0;
			} else if (dy == 0.0) {
				if (dx > 0.0)
					angle = 0.0;
				else
					angle = Math.PI;
			} else {
				if (dx < 0.0)
					angle = Math.atan(dy / dx) + Math.PI;
				else if (dy < 0.0)
					angle = Math.atan(dy / dx) + (2 * Math.PI);
				else
					angle = Math.atan(dy / dx);
			}

			angle = angle * (-180) / Math.PI;

			return angle;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}

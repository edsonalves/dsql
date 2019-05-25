/*
* 
*/
package dsql.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import dsql.QueryDiagram;
import dsql.diagram.edit.parts.*;
import dsql.diagram.part.DsqlDiagramEditorPlugin;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.providers.DsqlElementTypes;
import dsql.diagram.providers.DsqlParserProvider;

/**
 * @generated
 */
public class DsqlNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DsqlDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DsqlDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DsqlNavigatorItem && !isOwnView(((DsqlNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DsqlNavigatorGroup) {
			DsqlNavigatorGroup group = (DsqlNavigatorGroup) element;
			return DsqlDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DsqlNavigatorItem) {
			DsqlNavigatorItem navigatorItem = (DsqlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case QueryDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?dsql?QueryDiagram", DsqlElementTypes.QueryDiagram_1000); //$NON-NLS-1$
		case WhenEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?dsql?When", DsqlElementTypes.When_2001); //$NON-NLS-1$
		case ElseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?dsql?Else", DsqlElementTypes.Else_2002); //$NON-NLS-1$
		case QueryEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?dsql?Query", DsqlElementTypes.Query_2003); //$NON-NLS-1$
		case LogicalOperationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?dsql?LogicalOperation", DsqlElementTypes.LogicalOperation_2004); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3001); //$NON-NLS-1$
		case Column2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3002); //$NON-NLS-1$
		case UnaryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3003); //$NON-NLS-1$
		case Column3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3004); //$NON-NLS-1$
		case Unary2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3005); //$NON-NLS-1$
		case BinaryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3006); //$NON-NLS-1$
		case Column4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3007); //$NON-NLS-1$
		case Column5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3008); //$NON-NLS-1$
		case Unary3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3009); //$NON-NLS-1$
		case TernaryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3010); //$NON-NLS-1$
		case Column6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3011); //$NON-NLS-1$
		case Column7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3012); //$NON-NLS-1$
		case Column8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3013); //$NON-NLS-1$
		case Unary4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3014); //$NON-NLS-1$
		case Binary2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3015); //$NON-NLS-1$
		case Binary3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3016); //$NON-NLS-1$
		case Ternary2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3017); //$NON-NLS-1$
		case Ternary3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3018); //$NON-NLS-1$
		case Unary5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3019); //$NON-NLS-1$
		case Binary4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3020); //$NON-NLS-1$
		case Unary6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3021); //$NON-NLS-1$
		case Binary5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3022); //$NON-NLS-1$
		case Ternary4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3023); //$NON-NLS-1$
		case Ternary5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3024); //$NON-NLS-1$
		case Unary7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3025); //$NON-NLS-1$
		case Binary6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3026); //$NON-NLS-1$
		case Ternary6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3027); //$NON-NLS-1$
		case Binary7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3028); //$NON-NLS-1$
		case Ternary7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3029); //$NON-NLS-1$
		case Unary8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3030); //$NON-NLS-1$
		case Binary8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3031); //$NON-NLS-1$
		case Ternary8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3032); //$NON-NLS-1$
		case Column9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3033); //$NON-NLS-1$
		case Unary9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3034); //$NON-NLS-1$
		case Binary9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3035); //$NON-NLS-1$
		case Ternary9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3036); //$NON-NLS-1$
		case Column10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3037); //$NON-NLS-1$
		case Column11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3038); //$NON-NLS-1$
		case Column12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3039); //$NON-NLS-1$
		case Unary10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3040); //$NON-NLS-1$
		case Binary10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3041); //$NON-NLS-1$
		case Ternary10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3042); //$NON-NLS-1$
		case Unary11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3043); //$NON-NLS-1$
		case Binary11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3044); //$NON-NLS-1$
		case Ternary11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3045); //$NON-NLS-1$
		case Unary12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3046); //$NON-NLS-1$
		case Binary12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3047); //$NON-NLS-1$
		case Ternary12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3048); //$NON-NLS-1$
		case SourceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Source", DsqlElementTypes.Source_3049); //$NON-NLS-1$
		case Column13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Column", DsqlElementTypes.Column_3050); //$NON-NLS-1$
		case Unary13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Unary", DsqlElementTypes.Unary_3051); //$NON-NLS-1$
		case Binary13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Binary", DsqlElementTypes.Binary_3052); //$NON-NLS-1$
		case Ternary13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?dsql?Ternary", DsqlElementTypes.Ternary_3053); //$NON-NLS-1$
		case SetLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?SetLink", DsqlElementTypes.SetLink_4001); //$NON-NLS-1$
		case JoinLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?JoinLink", DsqlElementTypes.JoinLink_4002); //$NON-NLS-1$
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?JoinConditionLink", DsqlElementTypes.JoinConditionLink_4003); //$NON-NLS-1$
		case SubqueryLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?SubqueryLink", DsqlElementTypes.SubqueryLink_4004); //$NON-NLS-1$
		case LogicalLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?LogicalLink", DsqlElementTypes.LogicalLink_4005); //$NON-NLS-1$
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?dsql?ConditionalExpressionLink", //$NON-NLS-1$
					DsqlElementTypes.ConditionalExpressionLink_4006);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DsqlDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DsqlElementTypes.isKnownElementType(elementType)) {
			image = DsqlElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DsqlNavigatorGroup) {
			DsqlNavigatorGroup group = (DsqlNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DsqlNavigatorItem) {
			DsqlNavigatorItem navigatorItem = (DsqlNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DsqlVisualIDRegistry.getVisualID(view)) {
		case QueryDiagramEditPart.VISUAL_ID:
			return getQueryDiagram_1000Text(view);
		case WhenEditPart.VISUAL_ID:
			return getWhen_2001Text(view);
		case ElseEditPart.VISUAL_ID:
			return getElse_2002Text(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_2003Text(view);
		case LogicalOperationEditPart.VISUAL_ID:
			return getLogicalOperation_2004Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001Text(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3002Text(view);
		case UnaryEditPart.VISUAL_ID:
			return getUnary_3003Text(view);
		case Column3EditPart.VISUAL_ID:
			return getColumn_3004Text(view);
		case Unary2EditPart.VISUAL_ID:
			return getUnary_3005Text(view);
		case BinaryEditPart.VISUAL_ID:
			return getBinary_3006Text(view);
		case Column4EditPart.VISUAL_ID:
			return getColumn_3007Text(view);
		case Column5EditPart.VISUAL_ID:
			return getColumn_3008Text(view);
		case Unary3EditPart.VISUAL_ID:
			return getUnary_3009Text(view);
		case TernaryEditPart.VISUAL_ID:
			return getTernary_3010Text(view);
		case Column6EditPart.VISUAL_ID:
			return getColumn_3011Text(view);
		case Column7EditPart.VISUAL_ID:
			return getColumn_3012Text(view);
		case Column8EditPart.VISUAL_ID:
			return getColumn_3013Text(view);
		case Unary4EditPart.VISUAL_ID:
			return getUnary_3014Text(view);
		case Binary2EditPart.VISUAL_ID:
			return getBinary_3015Text(view);
		case Binary3EditPart.VISUAL_ID:
			return getBinary_3016Text(view);
		case Ternary2EditPart.VISUAL_ID:
			return getTernary_3017Text(view);
		case Ternary3EditPart.VISUAL_ID:
			return getTernary_3018Text(view);
		case Unary5EditPart.VISUAL_ID:
			return getUnary_3019Text(view);
		case Binary4EditPart.VISUAL_ID:
			return getBinary_3020Text(view);
		case Unary6EditPart.VISUAL_ID:
			return getUnary_3021Text(view);
		case Binary5EditPart.VISUAL_ID:
			return getBinary_3022Text(view);
		case Ternary4EditPart.VISUAL_ID:
			return getTernary_3023Text(view);
		case Ternary5EditPart.VISUAL_ID:
			return getTernary_3024Text(view);
		case Unary7EditPart.VISUAL_ID:
			return getUnary_3025Text(view);
		case Binary6EditPart.VISUAL_ID:
			return getBinary_3026Text(view);
		case Ternary6EditPart.VISUAL_ID:
			return getTernary_3027Text(view);
		case Binary7EditPart.VISUAL_ID:
			return getBinary_3028Text(view);
		case Ternary7EditPart.VISUAL_ID:
			return getTernary_3029Text(view);
		case Unary8EditPart.VISUAL_ID:
			return getUnary_3030Text(view);
		case Binary8EditPart.VISUAL_ID:
			return getBinary_3031Text(view);
		case Ternary8EditPart.VISUAL_ID:
			return getTernary_3032Text(view);
		case Column9EditPart.VISUAL_ID:
			return getColumn_3033Text(view);
		case Unary9EditPart.VISUAL_ID:
			return getUnary_3034Text(view);
		case Binary9EditPart.VISUAL_ID:
			return getBinary_3035Text(view);
		case Ternary9EditPart.VISUAL_ID:
			return getTernary_3036Text(view);
		case Column10EditPart.VISUAL_ID:
			return getColumn_3037Text(view);
		case Column11EditPart.VISUAL_ID:
			return getColumn_3038Text(view);
		case Column12EditPart.VISUAL_ID:
			return getColumn_3039Text(view);
		case Unary10EditPart.VISUAL_ID:
			return getUnary_3040Text(view);
		case Binary10EditPart.VISUAL_ID:
			return getBinary_3041Text(view);
		case Ternary10EditPart.VISUAL_ID:
			return getTernary_3042Text(view);
		case Unary11EditPart.VISUAL_ID:
			return getUnary_3043Text(view);
		case Binary11EditPart.VISUAL_ID:
			return getBinary_3044Text(view);
		case Ternary11EditPart.VISUAL_ID:
			return getTernary_3045Text(view);
		case Unary12EditPart.VISUAL_ID:
			return getUnary_3046Text(view);
		case Binary12EditPart.VISUAL_ID:
			return getBinary_3047Text(view);
		case Ternary12EditPart.VISUAL_ID:
			return getTernary_3048Text(view);
		case SourceEditPart.VISUAL_ID:
			return getSource_3049Text(view);
		case Column13EditPart.VISUAL_ID:
			return getColumn_3050Text(view);
		case Unary13EditPart.VISUAL_ID:
			return getUnary_3051Text(view);
		case Binary13EditPart.VISUAL_ID:
			return getBinary_3052Text(view);
		case Ternary13EditPart.VISUAL_ID:
			return getTernary_3053Text(view);
		case SetLinkEditPart.VISUAL_ID:
			return getSetLink_4001Text(view);
		case JoinLinkEditPart.VISUAL_ID:
			return getJoinLink_4002Text(view);
		case JoinConditionLinkEditPart.VISUAL_ID:
			return getJoinConditionLink_4003Text(view);
		case SubqueryLinkEditPart.VISUAL_ID:
			return getSubqueryLink_4004Text(view);
		case LogicalLinkEditPart.VISUAL_ID:
			return getLogicalLink_4005Text(view);
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return getConditionalExpressionLink_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getQueryDiagram_1000Text(View view) {
		QueryDiagram domainModelElement = (QueryDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getDataSource();
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhen_2001Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.When_2001,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(WhenLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getElse_2002Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Else_2002,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ElseLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getQuery_2003Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Query_2003,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(QueryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLogicalOperation_2004Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.LogicalOperation_2004,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(LogicalOperationTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3001Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3001,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3002Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3002,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3003Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3003,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3004Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3004,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3005Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3005,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3006Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3006,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3007Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3007,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3008Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3008,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3009Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3009,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3010Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3010,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3011Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3011,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3012Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3012,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3013Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3013,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3014Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3014,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3015Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3015,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3016Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3016,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3017Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3017,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3018Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3018,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3019Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3019,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3020Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3020,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3021Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3021,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3022Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3022,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3023Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3023,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3024Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3024,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3025Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3025,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3026Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3026,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3027Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3027,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3028Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3028,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3029Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3029,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3030Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3030,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3031Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3031,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3032Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3032,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3033Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3033,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3034Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3034,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3035Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3035,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3036Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3036,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3037Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3037,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3038Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3038,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3039Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3039,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3040Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3040,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3041Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3041,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3042Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3042,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3043Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3043,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3044Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3044,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3045Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3045,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3046Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3046,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3047Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3047,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3048Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3048,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSource_3049Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Source_3049,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(SourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3050Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Column_3050,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(ColumnName13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnary_3051Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Unary_3051,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(UnaryOperation13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBinary_3052Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Binary_3052,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(BinaryOperation13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTernary_3053Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.Ternary_3053,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(TernaryOperation13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSetLink_4001Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.SetLink_4001,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(SetLinkSetOperatorEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoinLink_4002Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.JoinLink_4002,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(JoinLinkJoinTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getJoinConditionLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSubqueryLink_4004Text(View view) {
		IParser parser = DsqlParserProvider.getParser(DsqlElementTypes.SubqueryLink_4004,
				view.getElement() != null ? view.getElement() : view,
				DsqlVisualIDRegistry.getType(SubqueryLinkOperationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DsqlDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLogicalLink_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getConditionalExpressionLink_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return QueryDiagramEditPart.MODEL_ID.equals(DsqlVisualIDRegistry.getModelID(view));
	}

}

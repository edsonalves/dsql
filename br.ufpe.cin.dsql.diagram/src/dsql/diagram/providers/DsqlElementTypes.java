/*
 * 
 */
package dsql.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import dsql.DsqlPackage;
import dsql.diagram.edit.parts.Binary10EditPart;
import dsql.diagram.edit.parts.Binary11EditPart;
import dsql.diagram.edit.parts.Binary12EditPart;
import dsql.diagram.edit.parts.Binary13EditPart;
import dsql.diagram.edit.parts.Binary2EditPart;
import dsql.diagram.edit.parts.Binary3EditPart;
import dsql.diagram.edit.parts.Binary4EditPart;
import dsql.diagram.edit.parts.Binary5EditPart;
import dsql.diagram.edit.parts.Binary6EditPart;
import dsql.diagram.edit.parts.Binary7EditPart;
import dsql.diagram.edit.parts.Binary8EditPart;
import dsql.diagram.edit.parts.Binary9EditPart;
import dsql.diagram.edit.parts.BinaryEditPart;
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
import dsql.diagram.edit.parts.ConditionalExpressionLinkEditPart;
import dsql.diagram.edit.parts.ElseEditPart;
import dsql.diagram.edit.parts.JoinConditionLinkEditPart;
import dsql.diagram.edit.parts.JoinLinkEditPart;
import dsql.diagram.edit.parts.LogicalLinkEditPart;
import dsql.diagram.edit.parts.LogicalOperationEditPart;
import dsql.diagram.edit.parts.QueryDiagramEditPart;
import dsql.diagram.edit.parts.QueryEditPart;
import dsql.diagram.edit.parts.SetLinkEditPart;
import dsql.diagram.edit.parts.SourceEditPart;
import dsql.diagram.edit.parts.SubqueryLinkEditPart;
import dsql.diagram.edit.parts.Ternary10EditPart;
import dsql.diagram.edit.parts.Ternary11EditPart;
import dsql.diagram.edit.parts.Ternary12EditPart;
import dsql.diagram.edit.parts.Ternary13EditPart;
import dsql.diagram.edit.parts.Ternary2EditPart;
import dsql.diagram.edit.parts.Ternary3EditPart;
import dsql.diagram.edit.parts.Ternary4EditPart;
import dsql.diagram.edit.parts.Ternary5EditPart;
import dsql.diagram.edit.parts.Ternary6EditPart;
import dsql.diagram.edit.parts.Ternary7EditPart;
import dsql.diagram.edit.parts.Ternary8EditPart;
import dsql.diagram.edit.parts.Ternary9EditPart;
import dsql.diagram.edit.parts.TernaryEditPart;
import dsql.diagram.edit.parts.Unary10EditPart;
import dsql.diagram.edit.parts.Unary11EditPart;
import dsql.diagram.edit.parts.Unary12EditPart;
import dsql.diagram.edit.parts.Unary13EditPart;
import dsql.diagram.edit.parts.Unary2EditPart;
import dsql.diagram.edit.parts.Unary3EditPart;
import dsql.diagram.edit.parts.Unary4EditPart;
import dsql.diagram.edit.parts.Unary5EditPart;
import dsql.diagram.edit.parts.Unary6EditPart;
import dsql.diagram.edit.parts.Unary7EditPart;
import dsql.diagram.edit.parts.Unary8EditPart;
import dsql.diagram.edit.parts.Unary9EditPart;
import dsql.diagram.edit.parts.UnaryEditPart;
import dsql.diagram.edit.parts.WhenEditPart;
import dsql.diagram.part.DsqlDiagramEditorPlugin;

/**
 * @generated
 */
public class DsqlElementTypes {

	/**
	* @generated
	*/
	private DsqlElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			DsqlDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType QueryDiagram_1000 = getElementType("br.ufpe.cin.dsql.diagram.QueryDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType When_2001 = getElementType("br.ufpe.cin.dsql.diagram.When_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Else_2002 = getElementType("br.ufpe.cin.dsql.diagram.Else_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Query_2003 = getElementType("br.ufpe.cin.dsql.diagram.Query_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LogicalOperation_2004 = getElementType(
			"br.ufpe.cin.dsql.diagram.LogicalOperation_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3001 = getElementType("br.ufpe.cin.dsql.diagram.Column_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3002 = getElementType("br.ufpe.cin.dsql.diagram.Column_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3003 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3004 = getElementType("br.ufpe.cin.dsql.diagram.Column_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3005 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3006 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3007 = getElementType("br.ufpe.cin.dsql.diagram.Column_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3008 = getElementType("br.ufpe.cin.dsql.diagram.Column_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3009 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3010 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3011 = getElementType("br.ufpe.cin.dsql.diagram.Column_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3012 = getElementType("br.ufpe.cin.dsql.diagram.Column_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3013 = getElementType("br.ufpe.cin.dsql.diagram.Column_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3014 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3015 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3016 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3017 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3018 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3019 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3020 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3021 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3022 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3023 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3024 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3025 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3026 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3027 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3028 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3029 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3030 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3031 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3032 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3033 = getElementType("br.ufpe.cin.dsql.diagram.Column_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3034 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3035 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3036 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3037 = getElementType("br.ufpe.cin.dsql.diagram.Column_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3038 = getElementType("br.ufpe.cin.dsql.diagram.Column_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3039 = getElementType("br.ufpe.cin.dsql.diagram.Column_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3040 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3041 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3042 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3043 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3044 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3045 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3046 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3047 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3048 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Source_3049 = getElementType("br.ufpe.cin.dsql.diagram.Source_3049"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3050 = getElementType("br.ufpe.cin.dsql.diagram.Column_3050"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Unary_3051 = getElementType("br.ufpe.cin.dsql.diagram.Unary_3051"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Binary_3052 = getElementType("br.ufpe.cin.dsql.diagram.Binary_3052"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Ternary_3053 = getElementType("br.ufpe.cin.dsql.diagram.Ternary_3053"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SetLink_4001 = getElementType("br.ufpe.cin.dsql.diagram.SetLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinLink_4002 = getElementType("br.ufpe.cin.dsql.diagram.JoinLink_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType JoinConditionLink_4003 = getElementType(
			"br.ufpe.cin.dsql.diagram.JoinConditionLink_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SubqueryLink_4004 = getElementType("br.ufpe.cin.dsql.diagram.SubqueryLink_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LogicalLink_4005 = getElementType("br.ufpe.cin.dsql.diagram.LogicalLink_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConditionalExpressionLink_4006 = getElementType(
			"br.ufpe.cin.dsql.diagram.ConditionalExpressionLink_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(QueryDiagram_1000, DsqlPackage.eINSTANCE.getQueryDiagram());

			elements.put(When_2001, DsqlPackage.eINSTANCE.getWhen());

			elements.put(Else_2002, DsqlPackage.eINSTANCE.getElse());

			elements.put(Query_2003, DsqlPackage.eINSTANCE.getQuery());

			elements.put(LogicalOperation_2004, DsqlPackage.eINSTANCE.getLogicalOperation());

			elements.put(Column_3001, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3002, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3003, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Column_3004, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3005, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3006, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Column_3007, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3008, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3009, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Ternary_3010, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Column_3011, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3012, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3013, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3014, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3015, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Binary_3016, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3017, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Ternary_3018, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Unary_3019, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3020, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Unary_3021, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3022, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3023, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Ternary_3024, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Unary_3025, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3026, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3027, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Binary_3028, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3029, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Unary_3030, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3031, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3032, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Column_3033, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3034, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3035, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3036, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Column_3037, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3038, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Column_3039, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3040, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3041, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3042, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Unary_3043, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3044, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3045, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Unary_3046, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3047, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3048, DsqlPackage.eINSTANCE.getTernary());

			elements.put(Source_3049, DsqlPackage.eINSTANCE.getSource());

			elements.put(Column_3050, DsqlPackage.eINSTANCE.getColumn());

			elements.put(Unary_3051, DsqlPackage.eINSTANCE.getUnary());

			elements.put(Binary_3052, DsqlPackage.eINSTANCE.getBinary());

			elements.put(Ternary_3053, DsqlPackage.eINSTANCE.getTernary());

			elements.put(SetLink_4001, DsqlPackage.eINSTANCE.getSetLink());

			elements.put(JoinLink_4002, DsqlPackage.eINSTANCE.getJoinLink());

			elements.put(JoinConditionLink_4003, DsqlPackage.eINSTANCE.getJoinConditionLink());

			elements.put(SubqueryLink_4004, DsqlPackage.eINSTANCE.getSubqueryLink());

			elements.put(LogicalLink_4005, DsqlPackage.eINSTANCE.getLogicalLink());

			elements.put(ConditionalExpressionLink_4006, DsqlPackage.eINSTANCE.getConditionalExpressionLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(QueryDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(When_2001);
			KNOWN_ELEMENT_TYPES.add(Else_2002);
			KNOWN_ELEMENT_TYPES.add(Query_2003);
			KNOWN_ELEMENT_TYPES.add(LogicalOperation_2004);
			KNOWN_ELEMENT_TYPES.add(Column_3001);
			KNOWN_ELEMENT_TYPES.add(Column_3002);
			KNOWN_ELEMENT_TYPES.add(Unary_3003);
			KNOWN_ELEMENT_TYPES.add(Column_3004);
			KNOWN_ELEMENT_TYPES.add(Unary_3005);
			KNOWN_ELEMENT_TYPES.add(Binary_3006);
			KNOWN_ELEMENT_TYPES.add(Column_3007);
			KNOWN_ELEMENT_TYPES.add(Column_3008);
			KNOWN_ELEMENT_TYPES.add(Unary_3009);
			KNOWN_ELEMENT_TYPES.add(Ternary_3010);
			KNOWN_ELEMENT_TYPES.add(Column_3011);
			KNOWN_ELEMENT_TYPES.add(Column_3012);
			KNOWN_ELEMENT_TYPES.add(Column_3013);
			KNOWN_ELEMENT_TYPES.add(Unary_3014);
			KNOWN_ELEMENT_TYPES.add(Binary_3015);
			KNOWN_ELEMENT_TYPES.add(Binary_3016);
			KNOWN_ELEMENT_TYPES.add(Ternary_3017);
			KNOWN_ELEMENT_TYPES.add(Ternary_3018);
			KNOWN_ELEMENT_TYPES.add(Unary_3019);
			KNOWN_ELEMENT_TYPES.add(Binary_3020);
			KNOWN_ELEMENT_TYPES.add(Unary_3021);
			KNOWN_ELEMENT_TYPES.add(Binary_3022);
			KNOWN_ELEMENT_TYPES.add(Ternary_3023);
			KNOWN_ELEMENT_TYPES.add(Ternary_3024);
			KNOWN_ELEMENT_TYPES.add(Unary_3025);
			KNOWN_ELEMENT_TYPES.add(Binary_3026);
			KNOWN_ELEMENT_TYPES.add(Ternary_3027);
			KNOWN_ELEMENT_TYPES.add(Binary_3028);
			KNOWN_ELEMENT_TYPES.add(Ternary_3029);
			KNOWN_ELEMENT_TYPES.add(Unary_3030);
			KNOWN_ELEMENT_TYPES.add(Binary_3031);
			KNOWN_ELEMENT_TYPES.add(Ternary_3032);
			KNOWN_ELEMENT_TYPES.add(Column_3033);
			KNOWN_ELEMENT_TYPES.add(Unary_3034);
			KNOWN_ELEMENT_TYPES.add(Binary_3035);
			KNOWN_ELEMENT_TYPES.add(Ternary_3036);
			KNOWN_ELEMENT_TYPES.add(Column_3037);
			KNOWN_ELEMENT_TYPES.add(Column_3038);
			KNOWN_ELEMENT_TYPES.add(Column_3039);
			KNOWN_ELEMENT_TYPES.add(Unary_3040);
			KNOWN_ELEMENT_TYPES.add(Binary_3041);
			KNOWN_ELEMENT_TYPES.add(Ternary_3042);
			KNOWN_ELEMENT_TYPES.add(Unary_3043);
			KNOWN_ELEMENT_TYPES.add(Binary_3044);
			KNOWN_ELEMENT_TYPES.add(Ternary_3045);
			KNOWN_ELEMENT_TYPES.add(Unary_3046);
			KNOWN_ELEMENT_TYPES.add(Binary_3047);
			KNOWN_ELEMENT_TYPES.add(Ternary_3048);
			KNOWN_ELEMENT_TYPES.add(Source_3049);
			KNOWN_ELEMENT_TYPES.add(Column_3050);
			KNOWN_ELEMENT_TYPES.add(Unary_3051);
			KNOWN_ELEMENT_TYPES.add(Binary_3052);
			KNOWN_ELEMENT_TYPES.add(Ternary_3053);
			KNOWN_ELEMENT_TYPES.add(SetLink_4001);
			KNOWN_ELEMENT_TYPES.add(JoinLink_4002);
			KNOWN_ELEMENT_TYPES.add(JoinConditionLink_4003);
			KNOWN_ELEMENT_TYPES.add(SubqueryLink_4004);
			KNOWN_ELEMENT_TYPES.add(LogicalLink_4005);
			KNOWN_ELEMENT_TYPES.add(ConditionalExpressionLink_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case QueryDiagramEditPart.VISUAL_ID:
			return QueryDiagram_1000;
		case WhenEditPart.VISUAL_ID:
			return When_2001;
		case ElseEditPart.VISUAL_ID:
			return Else_2002;
		case QueryEditPart.VISUAL_ID:
			return Query_2003;
		case LogicalOperationEditPart.VISUAL_ID:
			return LogicalOperation_2004;
		case ColumnEditPart.VISUAL_ID:
			return Column_3001;
		case Column2EditPart.VISUAL_ID:
			return Column_3002;
		case UnaryEditPart.VISUAL_ID:
			return Unary_3003;
		case Column3EditPart.VISUAL_ID:
			return Column_3004;
		case Unary2EditPart.VISUAL_ID:
			return Unary_3005;
		case BinaryEditPart.VISUAL_ID:
			return Binary_3006;
		case Column4EditPart.VISUAL_ID:
			return Column_3007;
		case Column5EditPart.VISUAL_ID:
			return Column_3008;
		case Unary3EditPart.VISUAL_ID:
			return Unary_3009;
		case TernaryEditPart.VISUAL_ID:
			return Ternary_3010;
		case Column6EditPart.VISUAL_ID:
			return Column_3011;
		case Column7EditPart.VISUAL_ID:
			return Column_3012;
		case Column8EditPart.VISUAL_ID:
			return Column_3013;
		case Unary4EditPart.VISUAL_ID:
			return Unary_3014;
		case Binary2EditPart.VISUAL_ID:
			return Binary_3015;
		case Binary3EditPart.VISUAL_ID:
			return Binary_3016;
		case Ternary2EditPart.VISUAL_ID:
			return Ternary_3017;
		case Ternary3EditPart.VISUAL_ID:
			return Ternary_3018;
		case Unary5EditPart.VISUAL_ID:
			return Unary_3019;
		case Binary4EditPart.VISUAL_ID:
			return Binary_3020;
		case Unary6EditPart.VISUAL_ID:
			return Unary_3021;
		case Binary5EditPart.VISUAL_ID:
			return Binary_3022;
		case Ternary4EditPart.VISUAL_ID:
			return Ternary_3023;
		case Ternary5EditPart.VISUAL_ID:
			return Ternary_3024;
		case Unary7EditPart.VISUAL_ID:
			return Unary_3025;
		case Binary6EditPart.VISUAL_ID:
			return Binary_3026;
		case Ternary6EditPart.VISUAL_ID:
			return Ternary_3027;
		case Binary7EditPart.VISUAL_ID:
			return Binary_3028;
		case Ternary7EditPart.VISUAL_ID:
			return Ternary_3029;
		case Unary8EditPart.VISUAL_ID:
			return Unary_3030;
		case Binary8EditPart.VISUAL_ID:
			return Binary_3031;
		case Ternary8EditPart.VISUAL_ID:
			return Ternary_3032;
		case Column9EditPart.VISUAL_ID:
			return Column_3033;
		case Unary9EditPart.VISUAL_ID:
			return Unary_3034;
		case Binary9EditPart.VISUAL_ID:
			return Binary_3035;
		case Ternary9EditPart.VISUAL_ID:
			return Ternary_3036;
		case Column10EditPart.VISUAL_ID:
			return Column_3037;
		case Column11EditPart.VISUAL_ID:
			return Column_3038;
		case Column12EditPart.VISUAL_ID:
			return Column_3039;
		case Unary10EditPart.VISUAL_ID:
			return Unary_3040;
		case Binary10EditPart.VISUAL_ID:
			return Binary_3041;
		case Ternary10EditPart.VISUAL_ID:
			return Ternary_3042;
		case Unary11EditPart.VISUAL_ID:
			return Unary_3043;
		case Binary11EditPart.VISUAL_ID:
			return Binary_3044;
		case Ternary11EditPart.VISUAL_ID:
			return Ternary_3045;
		case Unary12EditPart.VISUAL_ID:
			return Unary_3046;
		case Binary12EditPart.VISUAL_ID:
			return Binary_3047;
		case Ternary12EditPart.VISUAL_ID:
			return Ternary_3048;
		case SourceEditPart.VISUAL_ID:
			return Source_3049;
		case Column13EditPart.VISUAL_ID:
			return Column_3050;
		case Unary13EditPart.VISUAL_ID:
			return Unary_3051;
		case Binary13EditPart.VISUAL_ID:
			return Binary_3052;
		case Ternary13EditPart.VISUAL_ID:
			return Ternary_3053;
		case SetLinkEditPart.VISUAL_ID:
			return SetLink_4001;
		case JoinLinkEditPart.VISUAL_ID:
			return JoinLink_4002;
		case JoinConditionLinkEditPart.VISUAL_ID:
			return JoinConditionLink_4003;
		case SubqueryLinkEditPart.VISUAL_ID:
			return SubqueryLink_4004;
		case LogicalLinkEditPart.VISUAL_ID:
			return LogicalLink_4005;
		case ConditionalExpressionLinkEditPart.VISUAL_ID:
			return ConditionalExpressionLink_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return dsql.diagram.providers.DsqlElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return dsql.diagram.providers.DsqlElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return dsql.diagram.providers.DsqlElementTypes.getElement(elementTypeAdapter);
		}
	};

}


/*
 * 
 */
package dsql.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import dsql.diagram.providers.DsqlElementTypes;

/**
 * @generated
 */
public class DsqlPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createBinary1CreationTool());
		paletteContainer.add(createColumn2CreationTool());
		paletteContainer.add(createElse3CreationTool());
		paletteContainer.add(createLogicalOperation4CreationTool());
		paletteContainer.add(createQuery5CreationTool());
		paletteContainer.add(createSource6CreationTool());
		paletteContainer.add(createTernary7CreationTool());
		paletteContainer.add(createUnary8CreationTool());
		paletteContainer.add(createWhen9CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConditionalExpressionLink1CreationTool());
		paletteContainer.add(createJoinConditionLink2CreationTool());
		paletteContainer.add(createJoinLink3CreationTool());
		paletteContainer.add(createLogicalLink4CreationTool());
		paletteContainer.add(createSetLink5CreationTool());
		paletteContainer.add(createSubqueryLink6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createBinary1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(13);
		types.add(DsqlElementTypes.Binary_3006);
		types.add(DsqlElementTypes.Binary_3015);
		types.add(DsqlElementTypes.Binary_3016);
		types.add(DsqlElementTypes.Binary_3020);
		types.add(DsqlElementTypes.Binary_3022);
		types.add(DsqlElementTypes.Binary_3026);
		types.add(DsqlElementTypes.Binary_3028);
		types.add(DsqlElementTypes.Binary_3031);
		types.add(DsqlElementTypes.Binary_3035);
		types.add(DsqlElementTypes.Binary_3041);
		types.add(DsqlElementTypes.Binary_3044);
		types.add(DsqlElementTypes.Binary_3047);
		types.add(DsqlElementTypes.Binary_3052);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Binary1CreationTool_title,
				Messages.Binary1CreationTool_desc, types);
		entry.setId("createBinary1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Binary_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(13);
		types.add(DsqlElementTypes.Column_3001);
		types.add(DsqlElementTypes.Column_3002);
		types.add(DsqlElementTypes.Column_3004);
		types.add(DsqlElementTypes.Column_3007);
		types.add(DsqlElementTypes.Column_3008);
		types.add(DsqlElementTypes.Column_3011);
		types.add(DsqlElementTypes.Column_3012);
		types.add(DsqlElementTypes.Column_3013);
		types.add(DsqlElementTypes.Column_3033);
		types.add(DsqlElementTypes.Column_3037);
		types.add(DsqlElementTypes.Column_3038);
		types.add(DsqlElementTypes.Column_3039);
		types.add(DsqlElementTypes.Column_3050);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column2CreationTool_title,
				Messages.Column2CreationTool_desc, types);
		entry.setId("createColumn2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Column_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createElse3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Else3CreationTool_title,
				Messages.Else3CreationTool_desc, Collections.singletonList(DsqlElementTypes.Else_2002));
		entry.setId("createElse3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Else_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogicalOperation4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LogicalOperation4CreationTool_title,
				Messages.LogicalOperation4CreationTool_desc,
				Collections.singletonList(DsqlElementTypes.LogicalOperation_2004));
		entry.setId("createLogicalOperation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.LogicalOperation_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuery5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Query5CreationTool_title,
				Messages.Query5CreationTool_desc, Collections.singletonList(DsqlElementTypes.Query_2003));
		entry.setId("createQuery5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Query_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSource6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Source6CreationTool_title,
				Messages.Source6CreationTool_desc, Collections.singletonList(DsqlElementTypes.Source_3049));
		entry.setId("createSource6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Source_3049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTernary7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(13);
		types.add(DsqlElementTypes.Ternary_3010);
		types.add(DsqlElementTypes.Ternary_3017);
		types.add(DsqlElementTypes.Ternary_3018);
		types.add(DsqlElementTypes.Ternary_3023);
		types.add(DsqlElementTypes.Ternary_3024);
		types.add(DsqlElementTypes.Ternary_3027);
		types.add(DsqlElementTypes.Ternary_3029);
		types.add(DsqlElementTypes.Ternary_3032);
		types.add(DsqlElementTypes.Ternary_3036);
		types.add(DsqlElementTypes.Ternary_3042);
		types.add(DsqlElementTypes.Ternary_3045);
		types.add(DsqlElementTypes.Ternary_3048);
		types.add(DsqlElementTypes.Ternary_3053);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ternary7CreationTool_title,
				Messages.Ternary7CreationTool_desc, types);
		entry.setId("createTernary7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Ternary_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUnary8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(13);
		types.add(DsqlElementTypes.Unary_3003);
		types.add(DsqlElementTypes.Unary_3005);
		types.add(DsqlElementTypes.Unary_3009);
		types.add(DsqlElementTypes.Unary_3014);
		types.add(DsqlElementTypes.Unary_3019);
		types.add(DsqlElementTypes.Unary_3021);
		types.add(DsqlElementTypes.Unary_3025);
		types.add(DsqlElementTypes.Unary_3030);
		types.add(DsqlElementTypes.Unary_3034);
		types.add(DsqlElementTypes.Unary_3040);
		types.add(DsqlElementTypes.Unary_3043);
		types.add(DsqlElementTypes.Unary_3046);
		types.add(DsqlElementTypes.Unary_3051);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Unary8CreationTool_title,
				Messages.Unary8CreationTool_desc, types);
		entry.setId("createUnary8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.Unary_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhen9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.When9CreationTool_title,
				Messages.When9CreationTool_desc, Collections.singletonList(DsqlElementTypes.When_2001));
		entry.setId("createWhen9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.When_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConditionalExpressionLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConditionalExpressionLink1CreationTool_title,
				Messages.ConditionalExpressionLink1CreationTool_desc,
				Collections.singletonList(DsqlElementTypes.ConditionalExpressionLink_4006));
		entry.setId("createConditionalExpressionLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.ConditionalExpressionLink_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinConditionLink2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.JoinConditionLink2CreationTool_title,
				Messages.JoinConditionLink2CreationTool_desc,
				Collections.singletonList(DsqlElementTypes.JoinConditionLink_4003));
		entry.setId("createJoinConditionLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.JoinConditionLink_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJoinLink3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.JoinLink3CreationTool_title,
				Messages.JoinLink3CreationTool_desc, Collections.singletonList(DsqlElementTypes.JoinLink_4002));
		entry.setId("createJoinLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.JoinLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogicalLink4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.LogicalLink4CreationTool_title,
				Messages.LogicalLink4CreationTool_desc, Collections.singletonList(DsqlElementTypes.LogicalLink_4005));
		entry.setId("createLogicalLink4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.LogicalLink_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSetLink5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SetLink5CreationTool_title,
				Messages.SetLink5CreationTool_desc, Collections.singletonList(DsqlElementTypes.SetLink_4001));
		entry.setId("createSetLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.SetLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSubqueryLink6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.SubqueryLink6CreationTool_title,
				Messages.SubqueryLink6CreationTool_desc, Collections.singletonList(DsqlElementTypes.SubqueryLink_4004));
		entry.setId("createSubqueryLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DsqlElementTypes.getImageDescriptor(DsqlElementTypes.SubqueryLink_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}

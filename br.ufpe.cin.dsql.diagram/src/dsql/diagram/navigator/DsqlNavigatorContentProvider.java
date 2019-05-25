/*
* 
*/
package dsql.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import dsql.diagram.edit.parts.*;
import dsql.diagram.part.DsqlVisualIDRegistry;
import dsql.diagram.part.Messages;

/**
 * @generated
 */
public class DsqlNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DsqlNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<DsqlNavigatorItem> result = new ArrayList<DsqlNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, QueryDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof DsqlNavigatorGroup) {
			DsqlNavigatorGroup group = (DsqlNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DsqlNavigatorItem) {
			DsqlNavigatorItem navigatorItem = (DsqlNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DsqlVisualIDRegistry.getVisualID(view)) {

		case QueryDiagramEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DsqlNavigatorGroup links = new DsqlNavigatorGroup(Messages.NavigatorGroupName_QueryDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalOperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SetLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case WhenEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_When_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_When_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(UnaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenConditionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenWhenResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ElseEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Else_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseElseResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseElseResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseElseResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseElseResultCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case QueryEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Query_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Query_2003_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Column10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryFromCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Column11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Column12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Binary10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQuerySelectCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryFromCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryFromCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Binary11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryFromCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Binary12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryWhereHavingCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryQueryFromCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SetLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SetLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LogicalOperationEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_LogicalOperation_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), DsqlVisualIDRegistry
					.getType(LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Column13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DsqlVisualIDRegistry
					.getType(LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DsqlVisualIDRegistry
					.getType(LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Binary13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), DsqlVisualIDRegistry
					.getType(LogicalOperationLogicalOperationExpressionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ColumnEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column2EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnaryEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Column3EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3004_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3004_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary2EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3005_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case BinaryEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Column4EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column5EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary3EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TernaryEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3CompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Column6EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3011_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column7EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column8EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary4EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3014_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary2EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3015_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary3EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3016_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary2EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3017_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary3EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3018_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary5EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3019_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary4EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3020_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary6EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3021_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary5EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3022_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary4EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary5EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary7EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3025_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary6EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3026_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary6EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3027_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment6EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary7EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3028_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary7EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3029_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment7EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary8EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3030_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary8EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3031_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary8EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3032_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment8EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Column9EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3033_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3033_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary9EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3034_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary9EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3035_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary9EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3036_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment9EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Column10EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3037_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3037_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column11EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3038_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3038_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column12EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3039_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3039_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary10EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3040_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary10EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3041_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary10EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3042_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment10EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary11EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3043_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary11EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3044_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary11EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3045_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment11EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Unary12EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3046_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary12EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3047_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary12EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3048_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment12EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SourceEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Source_3049_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Source_3049_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Column13EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3050_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Column_3050_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SubqueryLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ConditionalExpressionLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Unary13EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Unary_3051_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryUnaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Binary13EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Binary_3052_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryBinaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Ternary13EditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Node sv = (Node) view;
			DsqlNavigatorGroup incominglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_Ternary_3053_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand1Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand2Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryTernaryOperand3Compartment13EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(JoinConditionLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SetLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(Messages.NavigatorGroupName_SetLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(Messages.NavigatorGroupName_SetLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case JoinLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(Messages.NavigatorGroupName_JoinLink_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(Messages.NavigatorGroupName_JoinLink_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup outgoinglinks = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_JoinLink_4002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case JoinConditionLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_JoinConditionLink_4003_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_JoinConditionLink_4003_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(UnaryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(BinaryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(TernaryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column11EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column12EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary11EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary11EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary11EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary12EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary12EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary12EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column13EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Unary13EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Binary13EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Ternary13EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SubqueryLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(Messages.NavigatorGroupName_SubqueryLink_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(Messages.NavigatorGroupName_SubqueryLink_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column11EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column12EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(SourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column13EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(QueryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LogicalLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(Messages.NavigatorGroupName_LogicalLink_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(Messages.NavigatorGroupName_LogicalLink_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(LogicalOperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ConditionalExpressionLinkEditPart.VISUAL_ID: {
			LinkedList<DsqlAbstractNavigatorItem> result = new LinkedList<DsqlAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DsqlNavigatorGroup target = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionalExpressionLink_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DsqlNavigatorGroup source = new DsqlNavigatorGroup(
					Messages.NavigatorGroupName_ConditionalExpressionLink_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ElseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(WhenEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column11EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column12EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DsqlVisualIDRegistry.getType(Column13EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return QueryDiagramEditPart.MODEL_ID.equals(DsqlVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DsqlNavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DsqlNavigatorItem> result = new ArrayList<DsqlNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new DsqlNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DsqlNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof DsqlAbstractNavigatorItem) {
			DsqlAbstractNavigatorItem abstractNavigatorItem = (DsqlAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}

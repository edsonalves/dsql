/*
* 
*/
package dsql.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class DsqlNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7087;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7086;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof DsqlNavigatorItem) {
			DsqlNavigatorItem item = (DsqlNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DsqlVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

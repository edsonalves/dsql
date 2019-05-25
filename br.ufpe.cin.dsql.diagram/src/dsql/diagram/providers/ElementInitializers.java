/*
 * 
 */
package dsql.diagram.providers;

import dsql.diagram.part.DsqlDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DsqlDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			DsqlDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

/*
 * 
 */
package dsql.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import dsql.diagram.edit.parts.DsqlEditPartFactory;
import dsql.diagram.edit.parts.QueryDiagramEditPart;
import dsql.diagram.part.DsqlVisualIDRegistry;

/**
 * @generated
 */
public class DsqlEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DsqlEditPartProvider() {
		super(new DsqlEditPartFactory(), DsqlVisualIDRegistry.TYPED_INSTANCE, QueryDiagramEditPart.MODEL_ID);
	}

}

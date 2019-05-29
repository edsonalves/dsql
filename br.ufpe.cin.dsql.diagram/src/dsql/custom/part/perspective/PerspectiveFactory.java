package dsql.custom.part.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {
	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addView(IPageLayout.ID_EDITOR_AREA,IPageLayout.RIGHT,0.75f, layout.getEditorArea());

		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, layout.getEditorArea());
		topLeft.addView(IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottomLeft.addView(IPageLayout.ID_PROP_SHEET);
		bottomLeft.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomLeft.addView(IPageLayout.ID_OUTLINE);
		//bottomLeft.addView("org.eclipse.emf.ecore.presentation.ReflectiveEditorID");
	}
}
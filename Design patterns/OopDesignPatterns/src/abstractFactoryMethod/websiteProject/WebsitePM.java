package abstractFactoryMethod.websiteProject;

import abstractFactoryMethod.ProjectManager;

public class WebsitePM implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("Website PM manages website project...");
	}
}

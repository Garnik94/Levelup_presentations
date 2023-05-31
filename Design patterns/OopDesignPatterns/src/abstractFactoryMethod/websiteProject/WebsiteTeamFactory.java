package abstractFactoryMethod.websiteProject;

import abstractFactoryMethod.Developer;
import abstractFactoryMethod.ProjectManager;
import abstractFactoryMethod.ProjectTeamFactory;
import abstractFactoryMethod.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}
}

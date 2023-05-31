package abstractFactoryMethod.bankingProject;

import abstractFactoryMethod.Developer;
import abstractFactoryMethod.ProjectManager;
import abstractFactoryMethod.ProjectTeamFactory;
import abstractFactoryMethod.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}
}

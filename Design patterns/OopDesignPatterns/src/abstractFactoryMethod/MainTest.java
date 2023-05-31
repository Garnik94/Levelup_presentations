package abstractFactoryMethod;

import abstractFactoryMethod.bankingProject.BankingTeamFactory;
import abstractFactoryMethod.websiteProject.WebsiteTeamFactory;

public class MainTest {

	public static void main(String[] args) {
		ProjectTeamFactory bankingTeamFactory = new BankingTeamFactory();
		Developer javaDeveloper = bankingTeamFactory.getDeveloper();
		Tester qaTester = bankingTeamFactory.getTester();
		ProjectManager bankingProjectManager = bankingTeamFactory.getProjectManager();

		System.out.println("Creating bank system project");
		javaDeveloper.writeCode();
		qaTester.testCode();
		bankingProjectManager.manageProject();

		ProjectTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
		Developer phpDeveloper = websiteTeamFactory.getDeveloper();
		Tester manualTester = websiteTeamFactory.getTester();
		ProjectManager websiteProjectManager = websiteTeamFactory.getProjectManager();

		System.out.println("Creating website project");
		phpDeveloper.writeCode();
		manualTester.testCode();
		websiteProjectManager.manageProject();
	}

}

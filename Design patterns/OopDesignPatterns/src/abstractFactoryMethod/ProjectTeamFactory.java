package abstractFactoryMethod;

public interface ProjectTeamFactory {

	Developer getDeveloper();

	Tester getTester();

	ProjectManager getProjectManager();

}

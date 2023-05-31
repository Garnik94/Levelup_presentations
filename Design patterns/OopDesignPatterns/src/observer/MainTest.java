package observer;

public class MainTest {

	public static void main(String[] args) {

		JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

		javaDeveloperJobSite.addVacancy("First position");
		javaDeveloperJobSite.addVacancy("Second position");

		Observer firstSubscriber = new Subscriber("John Smith");
		Observer secondSubscriber = new Subscriber("Ann Edwards");

		javaDeveloperJobSite.addObserver(firstSubscriber);
		javaDeveloperJobSite.addObserver(secondSubscriber);

		javaDeveloperJobSite.addVacancy("Third position");

		javaDeveloperJobSite.removeVacancy("First position");

	}

}

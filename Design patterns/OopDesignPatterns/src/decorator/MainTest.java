package decorator;

public class MainTest {

	public static void main(String[] args) {

		Developer javaDeveloper = new JavDeveloper();

		System.out.println(javaDeveloper.makeJob());

		Developer seniorJavaDeveloper = new SeniorJavaDeveloper(javaDeveloper);

		System.out.println(seniorJavaDeveloper.makeJob());

		Developer teamLeadSeniorJavaDeveloper = new JavaTeamLead(seniorJavaDeveloper);

		System.out.println(teamLeadSeniorJavaDeveloper.makeJob());

	}

}

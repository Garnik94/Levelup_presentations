package factoryMethod;

public class MainTest {

	public static void main(String[] args) {
		DeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();

		Developer javaDeveloper = javaDeveloperFactory.createDeveloper();

		javaDeveloper.writeCode();

		DeveloperFactory cppDeveloperFactory = new CppDeveloperFactory();

		Developer cppDeveloper = cppDeveloperFactory.createDeveloper();

		cppDeveloper.writeCode();

		DeveloperFactory javaDeveloperFactory2 = createDeveloperBySpeciality("Java");

		Developer javaDeveloper2 = javaDeveloperFactory2.createDeveloper();

		javaDeveloper2.writeCode();

		DeveloperFactory cppDeveloperFactory2 = createDeveloperBySpeciality("C++");

		Developer cppDeveloper2 = cppDeveloperFactory2.createDeveloper();

		cppDeveloper2.writeCode();

	}

	static DeveloperFactory createDeveloperBySpeciality(String speciality) {
		if (speciality.equalsIgnoreCase("Java")){
			return new JavaDeveloperFactory();
		} else if (speciality.equalsIgnoreCase("C++")){
			return new CppDeveloperFactory();
		} else {
			throw new RuntimeException(speciality + " is unknown speciality.");
		}
	}

}

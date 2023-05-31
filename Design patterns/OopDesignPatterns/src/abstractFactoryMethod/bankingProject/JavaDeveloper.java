package abstractFactoryMethod.bankingProject;

import abstractFactoryMethod.Developer;

public class JavaDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("java developer writes java code...");
	}
}

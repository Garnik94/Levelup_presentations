package abstractFactoryMethod.websiteProject;

import abstractFactoryMethod.Developer;

public class PhpDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("Php developer writes php code...");
	}
}

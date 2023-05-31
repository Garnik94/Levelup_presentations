package singleton;

public class MainTest {

	public static void main(String[] args) {

		// regardless o the number of method calls we get the same object
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());

		// all added logs will be concat on the same object
		ProgramLogger programLogger = ProgramLogger.getProgramLogger();
		programLogger.addLogInfo("First log");
		programLogger.addLogInfo("Second log");
		programLogger.addLogInfo("Third log");

		programLogger.showLogFile();

	}

}

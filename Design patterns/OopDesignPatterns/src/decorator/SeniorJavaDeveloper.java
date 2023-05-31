package decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

	private String makeCodeReview() {
		return " Make code review.";
	}

	public SeniorJavaDeveloper(Developer developer) {
		super(developer);
	}

	@Override
	public String makeJob() {
		return super.makeJob() + makeCodeReview();
	}
}

package builder;

public class Director {

	private WebsiteBuilder builder;

	public void setBuilder(WebsiteBuilder builder) {
		this.builder = builder;
	}

	Website buildWebsite() {
		builder.createWebsite();
		builder.buildName();
		builder.buildCms();
		builder.buildPrice();

		return builder.getWebsite();
	}
}

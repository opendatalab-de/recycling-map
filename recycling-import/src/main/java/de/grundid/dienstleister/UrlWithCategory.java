package de.grundid.dienstleister;

public class UrlWithCategory {

	private String baseUrl;
	private String url;
	private String category;

	public UrlWithCategory(String baseUrl, String url, String category) {
		this.baseUrl = baseUrl;
		this.url = url;
		this.category = category;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}
}

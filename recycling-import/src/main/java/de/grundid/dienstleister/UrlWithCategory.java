package de.grundid.dienstleister;

public class UrlWithCategory {

	private String baseUrl;
	private String url;
	private String category;

	public UrlWithCategory() {
	}

	public UrlWithCategory(String baseUrl, String url, String category) {
		this.baseUrl = baseUrl;
		this.url = url;
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UrlWithCategory other = (UrlWithCategory)obj;
		if (url == null) {
			if (other.url != null)
				return false;
		}
		else if (!url.equals(other.url))
			return false;
		return true;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCategory(String category) {
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

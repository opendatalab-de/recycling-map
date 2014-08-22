package de.grundid.dienstleister.geocoding;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoCoderResponse {

	private String status;
	@JsonProperty(value = "error_message")
	private String errorMessage;
	private List<GeoCoderResult> results;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<GeoCoderResult> getResults() {
		return results;
	}

	public void setResults(List<GeoCoderResult> results) {
		this.results = results;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

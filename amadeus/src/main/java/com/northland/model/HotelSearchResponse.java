package com.northland.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HotelSearchResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelSearchResponse {

	@JsonProperty("results")
	private List<HotelPropertyResponse> results = null;

	public HotelSearchResponse results(List<HotelPropertyResponse> results) {
		this.results = results;
		return this;
	}

	public HotelSearchResponse addResultsItem(HotelPropertyResponse resultsItem) {
		if (this.results == null) {
			this.results = new ArrayList<HotelPropertyResponse>();
		}
		this.results.add(resultsItem);
		return this;
	}

	/**
	 * Get results
	 * 
	 * @return results
	 **/
	public List<HotelPropertyResponse> getResults() {
		return results;
	}

	public void setResults(List<HotelPropertyResponse> results) {
		this.results = results;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HotelSearchResponse hotelSearchResponse = (HotelSearchResponse) o;
		return Objects.equals(this.results, hotelSearchResponse.results);
	}

	@Override
	public int hashCode() {
		return Objects.hash(results);
	}

}

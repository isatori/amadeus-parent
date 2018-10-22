package com.northland.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Airport
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Airport {

	@JsonProperty("location")
	private String airport = null;

	public Airport airport(String airport) {
		this.airport = airport;
		return this;
	}

	/**
	 * The 3 character &lt;a
	 * href&#x3D;\&quot;https://en.wikipedia.org/wiki/International_Air_Transport_Association_airport_code\&quot;&gt;IATA
	 * airport code&lt;/a&gt; of the airport in question for this flight
	 * 
	 * @return airport
	 **/
	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Airport airport = (Airport) o;
		return Objects.equals(this.airport, airport.airport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(airport);
	}

}

package com.northland.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object to describe a postal address.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

	@JsonProperty("line1")
	private String line1 = null;

	@JsonProperty("city")
	private String city = null;

	@JsonProperty("region")
	private String region = null;

	@JsonProperty("postal_code")
	private String postalCode = null;

	@JsonProperty("country")
	private String country = null;

	public Address line1(String line1) {
		this.line1 = line1;
		return this;
	}

	/**
	 * The first line of this place&#39;s address. Generally represents the basic
	 * street address.
	 * 
	 * @return line1
	 **/
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * The town or city in which place is located.
	 * 
	 * @return city
	 **/
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * The state or region code in which the place is located.
	 * 
	 * @return region
	 **/
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * The postal or zip code of this address.
	 * 
	 * @return postalCode
	 **/
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * The &lt;a
	 * href&#x3D;\&quot;http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2\&quot;&gt;ISO
	 * 3166-1 alpha-2 country code&lt;/a&gt; country code of this address.
	 * 
	 * @return country
	 **/
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(this.line1, address.line1) 
				&& Objects.equals(this.city, address.city)
				&& Objects.equals(this.region, address.region) 
				&& Objects.equals(this.postalCode, address.postalCode)
				&& Objects.equals(this.country, address.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(line1, city, region, postalCode, country);
	}

}

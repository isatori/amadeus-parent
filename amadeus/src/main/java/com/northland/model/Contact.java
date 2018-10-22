package com.northland.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("detail")
	private String detail = null;

	public Contact type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * The method of contact, such as phone or fax.
	 * 
	 * @return type
	 **/
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Contact detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	 * How that contact should be used, eg. a phone number
	 * 
	 * @return detail
	 **/
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Contact contact = (Contact) o;
		return Objects.equals(this.type, contact.type) 
				&& Objects.equals(this.detail, contact.detail);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, detail);
	}

}

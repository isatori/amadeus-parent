package com.northland.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HotelPropertyResponse
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelPropertyResponse implements Comparable<HotelPropertyResponse> {

	@JsonProperty("property_code")
	private String propertyCode = null;
	
	@JsonProperty("property_name")
	private String propertyName = null;

	@JsonProperty("address")
	private Address address = null;

	@JsonProperty("min_daily_rate")
	private Amount minDailyRate = null;

	@JsonProperty("contacts")
	private List<Contact> contacts = null;

	public HotelPropertyResponse propertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
		return this;
	}
	
	/**
	 * The code of this hotel
	 * 
	 * @return propertyCode
	 */
	public String getPropertyCode() {
		return propertyCode;
	}
	
	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}
	
	public HotelPropertyResponse propertyName(String propertyName) {
		this.propertyName = propertyName;
		return this;
	}

	/**
	 * The name of this hotel.
	 * 
	 * @return propertyName
	 **/
	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public HotelPropertyResponse address(Address address) {
		this.address = address;
		return this;
	}

	/**
	 * Get address
	 * 
	 * @return address
	 **/
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HotelPropertyResponse minDailyRate(Amount minDailyRate) {
		this.minDailyRate = minDailyRate;
		return this;
	}

	/**
	 * The lowest price per day that the hotel offers between the given check-in and
	 * check-out dates. Extra taxes may apply to this rate.
	 * 
	 * @return minDailyRate
	 **/
	public Amount getMinDailyRate() {
		return minDailyRate;
	}

	public void setMinDailyRate(Amount minDailyRate) {
		this.minDailyRate = minDailyRate;
	}

	public HotelPropertyResponse contacts(List<Contact> contacts) {
		this.contacts = contacts;
		return this;
	}

	public HotelPropertyResponse addContactsItem(Contact contactsItem) {
		if (this.contacts == null) {
			this.contacts = new ArrayList<Contact>();
		}
		this.contacts.add(contactsItem);
		return this;
	}

	/**
	 * An array of contact objects to tell the user how to contact the hotel.
	 * Typically includes a phone and fax number
	 * 
	 * @return contacts
	 **/
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HotelPropertyResponse hotelPropertyResponse = (HotelPropertyResponse) o;
		return Objects.equals(this.propertyCode, hotelPropertyResponse.propertyCode)
				&& Objects.equals(this.propertyName, hotelPropertyResponse.propertyName)
				&& Objects.equals(this.address, hotelPropertyResponse.address)
				&& Objects.equals(this.minDailyRate, hotelPropertyResponse.minDailyRate)
				&& Objects.equals(this.contacts, hotelPropertyResponse.contacts);
	}

	@Override
	public int hashCode() {
		return Objects.hash(propertyCode, propertyName, address, minDailyRate, contacts);
	}

	/**
	 * Provide a natural way to order hotels thru min daily rate
	 */
	public int compareTo(HotelPropertyResponse hotel) {
		return this.getMinDailyRate().compareTo(hotel.getMinDailyRate());
	}

}

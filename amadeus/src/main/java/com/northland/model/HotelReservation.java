package com.northland.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HotelReservation
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelReservation {

	@JsonProperty("check_in")
	private LocalDate checkIn = null;

	@JsonProperty("check_out")
	private LocalDate checkOut = null;

	@JsonProperty("location")
	private String location = null;

	/**
	 * Date on which the guest will begin their stay in the hotel, in the &lt;a
	 * href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO
	 * 8601&lt;/a&gt; date format yyyy-MM-dd.
	 * 
	 * @return checkIn
	 **/
	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	/**
	 * Date on which the guest will end their stay in the hotel, in the &lt;a
	 * href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot;&gt;ISO
	 * 8601&lt;/a&gt; date format yyyy-MM-dd.
	 * 
	 * @return checkOut
	 **/
	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

	/**
	 * Near Airport Location
	 * 
	 * @return location
	 **/
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public HotelReservation checkIn(LocalDate checkIn) {
		this.checkIn = checkIn;
		return this;
	}

	public HotelReservation checkOut(LocalDate checkOut) {
		this.checkOut = checkOut;
		return this;
	}

	public HotelReservation location(String location) {
		this.location = location;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HotelReservation hotelReservation = (HotelReservation) o;
		return Objects.equals(this.checkIn, hotelReservation.checkIn)
				&& Objects.equals(this.checkOut, hotelReservation.checkOut)
				&& Objects.equals(this.location, hotelReservation.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(checkIn, checkOut, location);
	}
	
	/**
	 * Convenience method to get this map of object
	 * @return
	 */
	public Map<String, String> getReservationVarargs() {
		Map<String, String> varargs = new HashMap<String, String>();
		varargs.put("location", this.location);
		varargs.put("check_in", this.checkIn.toString());
		varargs.put("check_out", this.checkOut.toString());
		return varargs;
	}

}

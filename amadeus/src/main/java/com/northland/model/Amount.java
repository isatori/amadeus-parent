package com.northland.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A monetary amount with a price and a currency
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Amount implements Comparable<Amount> {

	@JsonProperty("amount")
	private String amount = null;

	public Amount amount(String amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Total amount in the given currency, formatted appropriately. For
	 * example&amp;colon; 194.99
	 * 
	 * @return amount
	 **/
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Amount amount = (Amount) o;
		return Objects.equals(this.amount, amount.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	/**
	 * Compares this amount to another
	 */
	public int compareTo(Amount o) {
		final float thisAmount = Float.parseFloat(this.amount);
		final float otherAmount = Float.parseFloat(o.amount);
		return (thisAmount < otherAmount ? -1 :
			(thisAmount == otherAmount ? 0 : 1));
	}

}

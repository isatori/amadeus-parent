package com.northland.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Error {
	private String code;
	private String description;

	public Error(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public Error(int value, String message) {
		this.code = String.valueOf(value);
		this.description = message;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}

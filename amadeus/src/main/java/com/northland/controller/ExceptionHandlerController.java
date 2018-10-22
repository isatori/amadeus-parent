package com.northland.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpServerErrorException;

import com.northland.model.Error;
import com.northland.repository.DataNotFoundException;


@ControllerAdvice
public class ExceptionHandlerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public Error handleDataNotFoundException(DataNotFoundException e) {
		LOGGER.warn("Handling DataNotFoundException: {}", e.getClass().getSimpleName(), e);
		return new Error(HttpStatus.NOT_FOUND.value(), e.getMessage());
	}

	@ExceptionHandler(HttpServerErrorException.class)
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	@ResponseBody
	public Error handleHttpServerException(HttpServerErrorException e) {
		LOGGER.warn("Handling HttpServerErrorException: {}", e.getClass().getSimpleName(), e);
		return new Error(HttpStatus.SERVICE_UNAVAILABLE.value(), e.getMessage());
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Error handleException(Exception e) {
		LOGGER.warn("Handling Exception: {}", e.getClass().getSimpleName(), e);
		return new Error(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	@ResponseBody
	public Error handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
		LOGGER.warn("Handling HttpMessageNotReadableException: {}", e.getClass().getSimpleName(), e);
		return new Error(HttpStatus.SERVICE_UNAVAILABLE.value(), e.getMessage());
	}
		
	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public Error handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
		LOGGER.warn("Handling MissingServletRequestParameterException: {}", e.getClass().getSimpleName(), e);
		return new Error(HttpStatus.BAD_REQUEST.value(), e.getMessage());
	}

}
package com.northland.service;

import java.util.List;

import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;

/**
 * Hotel search service
 */
public interface HotelSearchService {

	/**
	 * Finds the 3 cheapest hotels.
	 * 
	 * @param request
	 * @return List<HotelPropertyResponse>
	 */
	public List<HotelPropertyResponse> findCheapestHotels(HotelReservation request);
}

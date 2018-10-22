package com.northland.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;
import com.northland.repository.HotelReservationRepository;

/**
 * Business logic for the hotel search service
 * 
 *
 */
@Service
public class HotelSearchServiceImpl implements HotelSearchService {

	@Autowired
	private HotelReservationRepository repository;

	/**
	 * Searches for the first 3 cheapest hotels
	 */
	public List<HotelPropertyResponse> findCheapestHotels(HotelReservation request) {
		
		List<HotelPropertyResponse> hotels = repository.findHotels(request);
		
		Collections.sort(hotels);

		if (hotels.size() > 3)
			return hotels.subList(0, 3);
		
		return hotels;
	}
}

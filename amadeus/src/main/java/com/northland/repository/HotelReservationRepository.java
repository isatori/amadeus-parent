package com.northland.repository;

import java.util.List;

import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;

/**
 * Hotel reservation repository
 * 
 *
 */
public interface HotelReservationRepository {

	/**
	 * Find hotels using given criteria
	 * @param request
	 * @return
	 */
	List<HotelPropertyResponse> findHotels(HotelReservation request);
}

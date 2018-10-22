package com.northland.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;
import com.northland.service.HotelSearchService;

/**
 * Search Hotels controller
 * 
 */
@RestController
public class HotelSearchController {

	private final HotelSearchService hotelSearchService;
	
	@Autowired
	public HotelSearchController(HotelSearchService service) {
		hotelSearchService = service;
	}
	
	/**
	 * Looks for available hotels
	 * @param airport
	 * @param checkInDate
	 * @param checkOutDate
	 * @return
	 */
    @RequestMapping("/hotelsearch")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<HotelPropertyResponse> search(@RequestParam(value="airport", defaultValue="YVR") String airport, 
    					@RequestParam(value="check_in") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkInDate,
    					@RequestParam(value="check_out") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate checkOutDate) {
    	
    	HotelReservation reservation = new HotelReservation();
    	reservation.setLocation(airport);
    	reservation.setCheckIn(checkInDate);
    	reservation.setCheckOut(checkOutDate);
    	
    	List<HotelPropertyResponse> response = hotelSearchService.findCheapestHotels(reservation);

    	return response;
    	
    }
}
package com.northland.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;
import com.northland.model.HotelSearchResponse;

@Service
public class HotelReservationRepositoryImpl implements HotelReservationRepository {

	@Value("${amadeus.endpoint.url}")
	private String amadeusEndpoint;
	
	@Value("${amadeus.apikey}")
	private String apiKey;
	
	@Autowired
	protected RestTemplate restTemplate;

	public List<HotelPropertyResponse> findHotels(HotelReservation request) {
		
		String url = String.format("%s?apikey=%s&location={location}&check_in={check_in}&check_out={check_out}", 
					amadeusEndpoint, apiKey, request.getReservationVarargs());
				
		HotelSearchResponse response = restTemplate.getForObject(url, HotelSearchResponse.class, request.getReservationVarargs());
		
		return response.getResults();
	}
	
}

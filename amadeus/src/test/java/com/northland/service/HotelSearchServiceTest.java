package com.northland.service;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.northland.controller.HotelSearchController;
import com.northland.model.HotelPropertyResponse;
import com.northland.model.HotelReservation;

@RunWith(SpringRunner.class)
@WebMvcTest(HotelSearchController.class)
public class HotelSearchServiceTest {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private HotelSearchService service;
	
	@Test
	public void searchShouldReturnMessage() throws Exception {
		HotelReservation reservation = new HotelReservation();
    	reservation.setLocation("YVR");
    	reservation.setCheckIn(LocalDate.parse("2018-10-15"));
    	reservation.setCheckOut(LocalDate.parse("2018-10-16"));
		when(service.findCheapestHotels(reservation)).thenReturn(new ArrayList<HotelPropertyResponse>());
		
	}
}

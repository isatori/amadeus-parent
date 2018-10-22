package com.northland.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestSearchHotelsController {

	@Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnJsonMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("https://api.sandbox.amadeus.com/v1.2/hotels/search-airport?apikey=DcW6EmCYbEp4uJu3qF32cDKMZfAG7usV",
                String.class)).contains("status");
    }
}

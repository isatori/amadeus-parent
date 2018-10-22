package com.northland;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.northland.util.RestLoggingInterceptor;
 
 
//same as @Configuration @EnableAutoConfiguration @ComponentScan
@ImportResource({"classpath:spring/*-context.xml"})
@SpringBootApplication(scanBasePackages={"com.northland"})
public class Application {
 
	/**
	 * Returns a customize rest template with logging capabilities for debug purposes
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate() {
		ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
		RestTemplate restTemplate = new RestTemplate(factory);
		restTemplate.setInterceptors(Collections.singletonList(new RestLoggingInterceptor()));
		return restTemplate;
	}
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

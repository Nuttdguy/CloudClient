package com.microservice.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {

	@Value("${Region}") String region;
	
	@RequestMapping(value = "/region")
	public String showRegion() {
		return "The region is: " + region;
	}
	
}

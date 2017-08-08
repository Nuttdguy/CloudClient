package com.microservice.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {

	@Value("${Region.NorthAmerica}") 
	String region;
	
	@RequestMapping("/region")
	public String showRegion() {
		return "The region is: " + region;
	}
	
}

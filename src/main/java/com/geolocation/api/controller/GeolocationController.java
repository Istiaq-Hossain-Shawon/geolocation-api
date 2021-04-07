package com.geolocation.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geolocation.api.model.Geolocation;
import com.geolocation.api.service.GeolocationService;




@RestController
public class GeolocationController {
	
	 @Autowired
	 private GeolocationService geoLocationService;
	 

	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public List<Geolocation>  locations() {
		List<Geolocation> data=geoLocationService.getAll();
		return data;
	}





}

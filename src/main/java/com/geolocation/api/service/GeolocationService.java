package com.geolocation.api.service;


import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.geolocation.api.model.Geolocation;

import com.geolocation.api.config.exception.ResourceAlreadyExistsException;
import com.geolocation.api.dto.GeolocationDto;
import com.geolocation.api.repository.GeolocationRepository;

@Service
public class GeolocationService {
	public List<Geolocation> getAll() {

		return geolocationRepository.findAll();
	}

	@Autowired
	private GeolocationRepository geolocationRepository;
	public void saveAll(List<GeolocationDto> locations) throws Exception {
		locations.forEach(location -> {
			try {
				save(location);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    });


	}
	
	
	private void save(GeolocationDto geolocationDto) throws Exception {
		Geolocation check = geolocationRepository.findByName(geolocationDto.getName());
		if (check == null) {
			var GeolocationEntiry = new Geolocation();
			BeanUtils.copyProperties(geolocationDto, GeolocationEntiry);
			GeolocationEntiry.setId(geolocationDto.getId());
			geolocationRepository.save(GeolocationEntiry);
		} else {
			throw new ResourceAlreadyExistsException("This geoLocation already existed");
		}

	}
}

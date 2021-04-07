package com.geolocation.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.geolocation.api.model.Geolocation;
import com.geolocation.api.model.User;


public interface GeolocationRepository extends JpaRepository<Geolocation,Integer> {
	Geolocation findByName(String name);
	
}

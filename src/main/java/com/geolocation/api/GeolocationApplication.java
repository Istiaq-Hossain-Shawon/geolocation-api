package com.geolocation.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.geolocation.api.dto.GeolocationDto;
import com.geolocation.api.model.User;
import com.geolocation.api.repository.UserRepository;
import com.geolocation.api.service.GeolocationService;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeolocationApplication {

	 @Autowired
	 private UserRepository repository;
	 
	 @Autowired
	 private GeolocationService geoLocationService;
	 
	@PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "user1", "123456", "user1@gmail.com"),
                new User(102, "user2", "654321", "user2@gmail.com")	                
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }
	@PostConstruct
    public void initGeoLocation() throws Exception {
        List<GeolocationDto> locations = Stream.of(
                new GeolocationDto(1, "Mohakhali, Dhaka, Bangladesh", "23.777628", "90.405449"),
                new GeolocationDto(2, "Barisal District", "22.7022", "90.3696"),
                new GeolocationDto(3, "Chittagong District", "22.5150", "91.7539"),
                new GeolocationDto(4, "Comilla  District", "23.4576", "91.1809"),
                new GeolocationDto(5, "Tangail  District", "24.3917", "89.9948")	  
        ).collect(Collectors.toList());
        geoLocationService.saveAll(locations);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(GeolocationApplication.class, args);
	}

}

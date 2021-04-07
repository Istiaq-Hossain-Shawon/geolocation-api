package com.geolocation.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.geolocation.api.model.User;
import com.geolocation.api.repository.UserRepository;

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
	 
	 @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(101, "user1", "123456", "user1@gmail.com"),
	                new User(102, "user2", "654321", "user2@gmail.com")	                
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(GeolocationApplication.class, args);
	}

}

package com.geolocation.api.dto;

public class GeolocationDto {
	
	private int id;

	private String name;

	private String latitude;
	
	private String longitude;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public GeolocationDto(int i, String name, String latitude, String longitude) {
		super();
		this.id = i;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	} 
	
	
}

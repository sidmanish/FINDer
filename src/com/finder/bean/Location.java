package com.finder.bean;

public class Location {
	private int id;
	private String  locationName;
	
	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Location() {
		super();
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", locationName=" + locationName + "]";
	}
	

}

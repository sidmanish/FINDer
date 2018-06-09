package com.finder.bean;

public class ServiceProvider {
	private  int id;
	private String name;
	private String mobile;
	private String adharNo;
	private  int serviceId;
	private String address;
	private  int locationId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	@Override
	public String toString() {
		return "ServiceProvider [id=" + id + ", name=" + name + ", mobile=" + mobile + ", adharNo=" + adharNo
				+ ", serviceId=" + serviceId + ", address=" + address + ", locationId=" + locationId + "]";
	}
	public ServiceProvider(String name, String mobile, String adharNo, int serviceId, String address, int locationId) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.adharNo = adharNo;
		this.serviceId = serviceId;
		this.address = address;
		this.locationId = locationId;
	}
	
	public ServiceProvider() {
		
	}
	

}

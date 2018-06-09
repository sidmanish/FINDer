package com.finder.bean;

public class Services {
public Services() {
		super();
	}
private int id;
private String serviceName;
private String description;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "ServiceMaster [id=" + id + ", serviceName=" + serviceName + ", description=" + description + "]";
}
public Services(String serviceName, String description) {
	super();
	this.serviceName = serviceName;
	this.description = description;
}


}

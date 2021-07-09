package com.vmware.round1.entity;

public class Cab {

	private int id;

	private String modelName;
	private int locationX;
	private int locationY;
	private String driver;
	
	
	@Override
	public String toString() {
		return "Cab [id=" + id + ", modelName=" + modelName + ", locationX=" + locationX + ", locationY=" + locationY
				+ ", driver=" + driver + "]";
	}

	public Cab(String modelName, int locationX, int locationY ,String driver) {
		this.modelName = modelName;
		this.locationX = locationX;
		this.locationY = locationY;
		this.driver = driver;
	}
	
	public Cab() {
		this.modelName = "Tata Indica";
		this.locationX = 0;
		this.locationY = 0;	
		this.driver = "Not Assigned";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Cab(int id, String modelName, int locationX, int locationY, String driver) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.locationX = locationX;
		this.locationY = locationY;
		this.driver = driver;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}	
	
	
}

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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + id;
		result = prime * result + locationX;
		result = prime * result + locationY;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cab other = (Cab) obj;
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		if (id != other.id)
			return false;
		if (locationX != other.locationX)
			return false;
		if (locationY != other.locationY)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}	
	
}

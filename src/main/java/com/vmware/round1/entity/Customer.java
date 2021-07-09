package com.vmware.round1.entity;

public class Customer {
	
	String name;
	int currentLocationX;
	int currentLocationY;
	
	
	public Customer() {

	}	
	
	
	public Customer(String name, int currentLocationX, int currentLocationY) {
		this.name = name;
		this.currentLocationX = currentLocationX;
		this.currentLocationY = currentLocationY;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", currentLocationX=" + currentLocationX + ", currentLocationY="
				+ currentLocationY + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentLocationX() {
		return currentLocationX;
	}
	public void setCurrentLocationX(int currentLocationX) {
		this.currentLocationX = currentLocationX;
	}
	public int getCurrentLocationY() {
		return currentLocationY;
	}
	public void setCurrentLocationY(int currentLocationY) {
		this.currentLocationY = currentLocationY;
	}
	
	

}

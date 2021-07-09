package com.vmware.round1.service;

import java.util.List;

import com.vmware.round1.entity.Cab;
import com.vmware.round1.entity.Customer;

public interface CabBookingService {
	
	public void addCustomer(Customer newCustomer);
	
	public void addNewCab(Cab newCab);
	
	
	public List<Cab> getAvailableCabs();
	
	public Cab bookCab(Customer customer);

}

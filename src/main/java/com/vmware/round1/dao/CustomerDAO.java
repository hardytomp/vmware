package com.vmware.round1.dao;

import java.util.List;

import com.vmware.round1.entity.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer newCustomer);
	
	public List<Customer> getCustomer();
}

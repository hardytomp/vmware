package com.vmware.round1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vmware.round1.entity.Customer;

@Component
public class CustomerDAOImpl implements CustomerDAO{

	private List<Customer> customerRepo = new ArrayList<>();
	
	@Override
	public void addCustomer(Customer newCustomer) {
		customerRepo.add(newCustomer);
		
	}

	@Override
	public List<Customer> getCustomer() {
		return customerRepo;
	}

}

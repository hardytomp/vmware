package com.vmware.round1.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmware.round1.dao.CabDAO;
import com.vmware.round1.dao.CustomerDAO;
import com.vmware.round1.entity.Cab;
import com.vmware.round1.entity.Customer;

@Service
public class CabBookingServiceImpl implements CabBookingService{
	
	@Autowired
	CabDAO cabDao;
	
	@Autowired
	CustomerDAO customerDao;
	
	Set<Cab> availableCabs = new HashSet<>();

	@Override
	public void addCustomer(Customer newCustomer) {
		customerDao.addCustomer(newCustomer);
		
	}

	@Override
	public void addNewCab(Cab newCab) {
		cabDao.addCab(newCab);
		availableCabs.add(newCab);
		
	}

	@Override
	public List<Cab> getAvailableCabs() {
		return availableCabs.stream().collect(Collectors.toList());
	}

	@Override
	public Cab bookCab(Customer customer) {
		int nearest = Integer.MAX_VALUE;
		Cab nearestCab = null ;
		
		for(Cab availCab: availableCabs) {
			
			int distanceX = customer.getCurrentLocationX() - availCab.getLocationX();
			int distanceY = customer.getCurrentLocationY() - availCab.getLocationY();
			
			int currentDistance = (int) Math.sqrt((distanceX*distanceX) -(distanceX*distanceY)); 
			if(currentDistance < nearest) {
				nearest = currentDistance;
				nearestCab = availCab;
			}
		}
		
		availableCabs.remove(nearestCab);
		return nearestCab;
	}

}

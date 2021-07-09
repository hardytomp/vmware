package com.vmware.round1.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.round1.entity.Cab;
import com.vmware.round1.entity.Customer;
import com.vmware.round1.service.CabBookingService;



@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	CabBookingService cabBookingService;
	
	
	@GetMapping("/sample")
	@ResponseBody
	public String availableSlotsForEkm() {	
		return "Hi";
	}

	
	public void addCustomer(String  newCustomer){
		
		cabBookingService.addCustomer(new Customer(newCustomer,0,0));
	}
	
	public void addNewCab(String  newCab){
		cabBookingService.addNewCab(new Cab(0,newCab,0,0,null));
	}
	
	
	public List<Cab> getAvailableCabs(){
		return null;
	}
	
	public Cab bookCab(Customer customer){
		return null;
	}
	
	
}

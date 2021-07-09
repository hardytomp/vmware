package com.vmware.round1.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/customers")
	public void addCustomer(@RequestBody Customer  newCustomer){
		cabBookingService.addCustomer(newCustomer);
	}
	
	@PostMapping("/cabs")
	public void addNewCab(@RequestBody Cab  newCab){
		cabBookingService.addNewCab(newCab);
	}
	
	@GetMapping("/cabs")
	@ResponseBody
	public List<Cab> getAvailableCabs(){
		return null;
	}
	@PostMapping("/book")
	@ResponseBody
	public Cab bookCab(@RequestBody Customer customer){
		return null;
	}
	
	
}

package com.vmware.round1.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/sample")
	@ResponseBody
	public String availableSlotsForEkm() {	
		return "Hi";
	}

}

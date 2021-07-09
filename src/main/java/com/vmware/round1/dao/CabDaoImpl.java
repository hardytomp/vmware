package com.vmware.round1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vmware.round1.entity.Cab;

@Component
public class CabDaoImpl implements CabDAO{
	
	List<Cab> cabRepository = new ArrayList<>();

	@Override
	public void addCab(Cab newCab) {
		System.out.println("Added cabs");
		cabRepository.add(newCab);
		
	}

	@Override
	public List<Cab> getAllCabs() {
		return cabRepository;
	}

}

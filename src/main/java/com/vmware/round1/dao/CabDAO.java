package com.vmware.round1.dao;

import java.util.List;

import com.vmware.round1.entity.Cab;

public interface CabDAO {
	
	public void addCab(Cab newCab);
	
	public List<Cab> getAllCabs();

}

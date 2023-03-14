package com.xyz.Service;



import java.util.List;

import com.xyz.Model.DrDetails;

public interface DrDetailsServiceI {
	public void addDrDetails(DrDetails drDetails);
	List<DrDetails>showdrDetailsdata();
	public DrDetails update(DrDetails drdetails);
	public void delete(int id);
	 public List<DrDetails>findByName(String name);
}

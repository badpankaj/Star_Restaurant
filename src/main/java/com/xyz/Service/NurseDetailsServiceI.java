package com.xyz.Service;


import java.util.List;


import com.xyz.Model.NurseDetails;

public interface NurseDetailsServiceI {
	public NurseDetails addNurseDetails(NurseDetails nursedetails);
	public List<NurseDetails>shownursedetailsdata();
	public NurseDetails updateNurseDetails(NurseDetails nursedetails);
	public void delete(int id);
	public List<NurseDetails>findByfirstName(String name);
	 
}

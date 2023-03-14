package com.xyz.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.Dao.NurseDetailsDaoI;
import com.xyz.Model.NurseDetails;

@Service
public class NurseDetailsServiceImpl implements NurseDetailsServiceI {
	@Autowired
	private NurseDetailsDaoI d;

	@Override
	public NurseDetails addNurseDetails(NurseDetails nursedetails) {
		// TODO Auto-generated method stub
		d.save(nursedetails);
		return nursedetails;
	}

	@Override
	public List<NurseDetails> shownursedetailsdata() {
		// TODO Auto-generated method stub
		List<NurseDetails> list = d.findAll();
		return list;
	}

	@Override
	public NurseDetails updateNurseDetails(NurseDetails nursedetails) {
		// TODO Auto-generated method stub
		NurseDetails ndt = d.save(nursedetails);
		return ndt;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		d.deleteById(id);
	}

	@Override
	public List<NurseDetails> findByfirstName(String name) {
		// TODO Auto-generated method stub
		List<NurseDetails>sh=d.findByfirstName(name);
		return sh;
	}

}

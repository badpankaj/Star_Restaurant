package com.xyz.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xyz.Dao.DrDetailsDaoI;
import com.xyz.Model.DrDetails;


@Service
public class DrDetailsServiceImpl implements DrDetailsServiceI {
	@Autowired
	private DrDetailsDaoI d;

	@Override
	public void addDrDetails(DrDetails drDetails) {
		// TODO Auto-generated method stub
		d.save(drDetails);
	}

	@Override
	public List<DrDetails> showdrDetailsdata() {
		// TODO Auto-generated method stub
		List<DrDetails>list=d.findAll();
		return list;
	}

	@Override
	public DrDetails update(DrDetails drdetails) {
		// TODO Auto-generated method stub
		DrDetails dt=d.save(drdetails);
				return dt;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		d.deleteById(id);
	}

	@Override
	public List<DrDetails> findByName(String name) {
		// TODO Auto-generated method stub
		List<DrDetails>list=d.findByfirstName(name);
		list .forEach(e->System.out.println(e));
		return list;
		
	}



	}

	
	

	
	




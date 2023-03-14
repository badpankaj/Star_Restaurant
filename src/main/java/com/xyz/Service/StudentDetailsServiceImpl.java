package com.xyz.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.Dao.DrDetailsDaoI;
import com.xyz.Dao.StudentDetailsDaoI;
import com.xyz.Model.StudentDetails;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsServiceI{
	@Autowired
	private StudentDetailsDaoI sd;
	@Autowired 
	private DrDetailsDaoI dd;
	@Override
	public void addStudentDetails(StudentDetails studentdetails) {
		// TODO Auto-generated method stub
		sd.save(studentdetails);
		
	}

	@Override
	public List<StudentDetails> showstudentdetailsdata() {
		// TODO Auto-generated method stub
		List<StudentDetails>lst=sd.findAll();
		return lst;
	}

	@Override
	public StudentDetails update(StudentDetails studentdetails) {
		// TODO Auto-generated method stub
		StudentDetails std=sd.save(studentdetails);
		return std;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sd.deleteById(id);
	}

	@Override
	public List<StudentDetails>findByName(String Name) {
		// TODO Auto-generated method stub
		List<StudentDetails>list=sd.findByfirstName(Name);
		return list;
	}
	
}

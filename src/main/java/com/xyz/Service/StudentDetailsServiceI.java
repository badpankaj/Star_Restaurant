package com.xyz.Service;

import java.util.List;

import com.xyz.Model.StudentDetails;

public interface StudentDetailsServiceI {
	public void addStudentDetails(StudentDetails studentdetails);
	List<StudentDetails>showstudentdetailsdata();
	public StudentDetails update(StudentDetails studentdetails);
	public void delete(int id);
	List<StudentDetails> findByName(String Name);
}

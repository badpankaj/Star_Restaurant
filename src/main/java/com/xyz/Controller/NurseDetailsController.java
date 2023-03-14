package com.xyz.Controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.xyz.Exception.NurseDetailsNotFoundException;
import com.xyz.Model.NurseDetails;
import com.xyz.Service.NurseDetailsServiceI;

@RestController
@RequestMapping("/nursedetails")
public class NurseDetailsController {
	@Autowired
	private NurseDetailsServiceI s;
	@PostMapping("/insert")
	public ResponseEntity<?>addNurseDetails(@RequestBody NurseDetails nursedetails) {
		NurseDetails urs=s.addNurseDetails(nursedetails);
		return new ResponseEntity<>(urs,HttpStatus.CREATED);
	}
	@GetMapping("/findAll")
	public ResponseEntity<?>shownursedetailsdata(){
		List<NurseDetails>lst=s.shownursedetailsdata();
		return new ResponseEntity<>(lst,HttpStatus.OK);
	
	}
	@PutMapping("/update")
	public ResponseEntity<?>updateNurseDetails(@RequestBody NurseDetails nursedetails){
		NurseDetails nls=s.updateNurseDetails(nursedetails);
		return new ResponseEntity<>(nls,HttpStatus.OK);
}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteNurseDetails(@PathVariable int id) {
		s.delete(id);
		return new ResponseEntity<>(s,HttpStatus.OK);
		
	}	
	@GetMapping("/ByfirstName/{name}")
	public ResponseEntity<?>searchByName(@PathVariable String name)  throws NurseDetailsNotFoundException {
		s.findByfirstName(name);
		if (s != null) 
			return new ResponseEntity<>(s,HttpStatus.OK);
			else 
				throw new NurseDetailsNotFoundException("NurseDetails not found with name");
			}
}
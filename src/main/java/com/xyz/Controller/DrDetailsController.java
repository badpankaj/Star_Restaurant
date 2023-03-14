package com.xyz.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.Model.DrDetails;
import com.xyz.Service.DrDetailsServiceI;

@RestController
@RequestMapping("/drDetails")
public class DrDetailsController {
	@Autowired
	private DrDetailsServiceI s;
	@PostMapping("/add")
	public void addDrDetails(@RequestBody DrDetails drDetails) {
		s.addDrDetails(drDetails);
		
	}
	@GetMapping("/findAll")
	public List<DrDetails>showdrDetilsdata() {
		List<DrDetails>list=s.showdrDetailsdata();
		return list;
	}
	@PutMapping("/update")
	public DrDetails update (@RequestBody DrDetails drdetails) {
		DrDetails dr=s.update(drdetails);
		return dr;
	}
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable int id) {
		s.delete(id);
	}
	@GetMapping("ByfirstName/{name}")
	public List<DrDetails>searchByName(@PathVariable String name){
		List<DrDetails>shiva=s.findByName(name);
		shiva.forEach(e->System.out.println(e));
		return shiva;
	}
}

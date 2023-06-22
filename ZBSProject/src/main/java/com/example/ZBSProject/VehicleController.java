package com.example.ZBSProject;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController{
	  
	  	
	  	@Autowired
	  	private VehicleRepository vehicleRepository;

	    @RequestMapping("/addVehicle")
	    public String addVehicle(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, @RequestParam("password") String password, 
	    		@RequestParam("role") String role, @RequestParam("dateadded") String dateadded) {	
	    	
	    	User user = new User();
	    	user.setName(name);
	    	user.setGender(gender);
	    	user.setAddress(address);
	    	user.setPhone(phone);
	    	user.setUsername(username);
	    	user.setPassword(password);
	    	user.setStatus("LIVE");
	    	user.setRDate(dateadded);
	    	user.setRole(role);
	    	//vehicleRepository.save(user);
	    	return "success";
	    }
	    
	    @RequestMapping("/updateVehicle")
	    public String updateUser(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, 
	    		@RequestParam("role") String role, @RequestParam("dateadded") String dateadded, @RequestParam("uid") int uid) {	
	    	
	    	/* User user = vehicleRepository.findById((long) uid).orElse(null);
	    	
	    	user.setName(name);
	    	user.setGender(gender);
	    	user.setAddress(address);
	    	user.setPhone(phone);
	    	user.setUsername(username);
	    	user.setStatus("LIVE");
	    	user.setRDate(dateadded);
	    	user.setRole(role);
	    	vehicleRepository.save(user); */
	    	return "success";
	    }
	    

	    @RequestMapping("/VehicleList")
	    public List<Vehicle> findAllProducts() {
	        return vehicleRepository.findAll();
	    }
	    
	    

	    @GetMapping("/vehicleById/{id}")
	    public Vehicle findVehicleById(@PathVariable int id) {
	        return vehicleRepository.getById((long) id);
	    }

	    @GetMapping("/deleteVehicle/{id}")
	    public String deleteVehicle(@PathVariable int id) {
	    	vehicleRepository.deleteById((long) id);
	        return "success";
	    }
}

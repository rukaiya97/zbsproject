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
public class UserController{
	  
	  	@Autowired
	    private UserService service;
	  	
	  	@Autowired
	  	private UserRepository userRepository;

	    /* @PostMapping("/addUser")
	    public User addProduct(@RequestBody User user) {
	        return service.saveUser(user);
	    } */

	    @RequestMapping("/addUser")
	    public String addUser(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, @RequestParam("password") String password, 
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
	    	userRepository.save(user);
	    	return "success";
	    }
	    
	    @RequestMapping("/updateUser")
	    public String updateUser(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, 
	    		@RequestParam("role") String role, @RequestParam("dateadded") String dateadded, @RequestParam("uid") int uid) {	
	    	
	    	User user = userRepository.findById((long) uid).orElse(null);
	    	
	    	user.setName(name);
	    	user.setGender(gender);
	    	user.setAddress(address);
	    	user.setPhone(phone);
	    	user.setUsername(username);
	    	user.setStatus("LIVE");
	    	user.setRDate(dateadded);
	    	user.setRole(role);
	    	userRepository.save(user);
	    	return "success";
	    }
	    

	    @RequestMapping("/UserList")
	    public List<User> findAllProducts() {
	        return userRepository.findAll();
	    }
	    
	    

	    @RequestMapping("/userById/{id}")
	    public User findUserById(@PathVariable int id) {
	        return userRepository.getById((long) id);
	    }

	    @GetMapping("/user/{name}")
	    public User findUserByName(@PathVariable String name) {
	        return service.getUserByName(name);
	    }
	    
	    @GetMapping("/EmpNo/{empno}")
	    public User findUserByEmpNo(@PathVariable String emno) {
	        return service.getUserByName(emno);
	    }

	    /* @PutMapping("/update")
	    public User updateUser(@RequestBody User user) {
	        return service.updateUser(user);
	    } */

	    @GetMapping("/deleteUser/{id}")
	    public String deleteUser(@PathVariable int id) {
	    	userRepository.deleteById((long) id);
	        return "success";
	    }
}

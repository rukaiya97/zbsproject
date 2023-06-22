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
public class MemberController{
	  
	  	
	  	@Autowired
	  	private MemberRepository memberRepository;

	    @RequestMapping("/addMember")
	    public String addMember(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, @RequestParam("password") String password, 
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
	    
	    /* @RequestMapping("/addMember")
	    public String addMember(@RequestParam("name") String name, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("phone") String phone, @RequestParam("username") String username, @RequestParam("password") String password, 
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
	    } */
	    
	    @RequestMapping("/loginMember")
	    public String updateMember(@RequestParam("username") String username, 
	    		@RequestParam("password") String password) {	
	    	User user = new User();
	    	if (user.getUsername() == username && user.getPassword() == password)
	    	{
	    		return "success";
	    	}else {
	    		return user.getUsername();
	    	}
	    }
	    

	    @RequestMapping("/MemberList")
	    public List<Member> findAllMember() {
	        return memberRepository.findAll();
	    }
	    
	    

	    @GetMapping("/memberById/{id}")
	    public Member findMemberById(@PathVariable int id) {
	        return memberRepository.getById((long) id);
	    }

	    @GetMapping("/deleteMember/{id}")
	    public String deleteMember(@PathVariable int id) {
	    	memberRepository.deleteById((long) id);
	        return "success";
	    }
}

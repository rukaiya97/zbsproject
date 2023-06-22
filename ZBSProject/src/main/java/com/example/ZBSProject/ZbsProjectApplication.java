package com.example.ZBSProject;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class ZbsProjectApplication {
	
	@RequestMapping({"/index"})
    public String LoginPage() {
    	return "index";
    }
	
	@Autowired
  	private VehicleRepository vehicleRepository;
	
	@RequestMapping({"/vehicle"})
    public String OpenVehicle(Map<String, Object> model) {
		model.put("vehicle", vehicleRepository.findAll());
    	return "home";
    }
	
	
	@Autowired
  	private MemberRepository memberRepository;
	
	@RequestMapping({"/member"})
    public String OpenMember(Map<String, Object> model) {
		model.put("members", memberRepository.findAll());
    	return "member";
    }
	
	@RequestMapping({"/payment"})
    public String OpenPayment() {
    	return "payment";
    }
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/ViewUser")
    public String OpenUser(Map<String, Object> model) {
 
       model.put("users", userRepository.findAll());
 
       return "user";    
    }
	
	@RequestMapping("/logout")
    public String logOut(Map<String, Object> model) {
        model.put("msg", "logout");
        return "index";    
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ZbsProjectApplication.class, args);
	}

}

package com.example.ZBSProject;


import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZbsApplication {
	
	
	@RequestMapping("/")
    public String LoginPage() {
		return "index";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ZbsApplication.class, args);
	}
}

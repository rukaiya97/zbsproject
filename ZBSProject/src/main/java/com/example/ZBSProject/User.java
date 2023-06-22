package com.example.ZBSProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  public long uid;

	  private String name;
	  private String gender;
	  private String address;
	  private String phone;
	  private String username;
	  private String password;
	  private String live_status;
	  private String rdate;
	  private String role;

	  public long getId() {
	    return uid;
	  }

	  public void setId(long uid) {
	    this.uid = uid;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public String getGender() {
		return gender;
	  }

	  public void setGender(String gender) {
		this.gender = gender;
	  }
		  
	  public String getAddress() {
		return address;
	  }

	  public void setAddress(String address) 
	  {
		this.address = address;
	  }
	  
	  public String getPhone() {
		 return phone;
	  }

	  public void setPhone(String phone) 
	  {
		this.phone = phone;
	  }
	  
	  public String getRDate() {
		return rdate;
	  }

	  public void setRDate(String rdate) 
	  {
		this.rdate = rdate;
	  }
	  
	  public String getRole() {
		return role;
	  }

	  public void setRole(String role) 
	  {
		this.role = role;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }
	  
	  public String getPassword() {
		  return password;
	  }

	  public void setPassword(String password) {
		  this.password = password;
	  }
	  
	  public String getStatus() {
		  return live_status;
	  }

	  public void setStatus(String live_status) {
		  this.live_status = live_status;
	  }
}

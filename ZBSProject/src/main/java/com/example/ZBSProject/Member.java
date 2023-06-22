package com.example.ZBSProject;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_member")
public class Member {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  public long mid;

	  public String name;
	  public String gender;
	  public String address;
	  public String phone;
	  public String username;
	  public String password;
	  public String national_id;
	  public String live_status;
	  public Date rdate;
	  public String image;

	  public long getId() {
	    return mid;
	  }

	  public void setId(long mid) {
	    this.mid = mid;
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
	  
	  public Date getRDate() {
		return rdate;
	  }

	  public void setRDate(Date rdate) 
	  {
		this.rdate = rdate;
	  }
	  
	  public String getImage() {
		return image;
	  }

	  public void setImage(String image) 
	  {
		this.image = image;
	  }
	  
	  public String getNationaId() {
		return national_id;
	  }

	  public void setNational_Id(String national_id) 
	  {
		this.national_id = national_id;
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

package com.example.ZBSProject;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  public long vid;

	  public String name;
	  public String plat_no;
	  public String model;
	  public String mashine_no;
	  public String image;
	  public String remark;
	  public String live_status;
	  public Date remarkDate;
	  public long uid;
	  public Date rDate;
	  public long mid;
	  
		  
	  public long getId() {
	    return vid;
	  }

	  public void setId(long vid) {
	    this.vid = vid;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public String getPlat_No() {
		return plat_no;
	  }

	  public void setPlat(String plat_no) {
		this.plat_no = plat_no;
	  }
		  
	  public String getModel() {
		return model;
	  }

	  public void setModel(String model) 
	  {
		this.model = model;
	  }
	  
	  public String getMashine() {
		 return mashine_no;
	  }

	  public void setMashine(String mashine_no) 
	  {
		this.mashine_no = mashine_no;
	  }
	  
	  public String getImage() {
		return image;
	  }

	  public void setImage(String image) 
	  {
		this.image = image;
	  }
	  
	  public String getRemark() {
		return remark;
	  }

	  public void setRemark(String remark) 
	  {
		this.remark = remark;
	  }

	  public Date getRemarkDate() {
	    return remarkDate;
	  }

	  public void setRemarkDate(Date remarkDate) {
	    this.remarkDate = remarkDate;
	  }
	  
	  public Date getRDate() {
		 return rDate;
	  }

	  public void setRDate(Date rDate) {
		 this.rDate = rDate;
	  }
	 
	  public Long getUid() {
		  return uid;
	  }

	  public void setUid(long uid) {
		  this.uid = uid;
	  }
	  
	  public long getStatus() {
		  return mid;
	  }

	  public void setStatus(long mid) {
		  this.mid = mid;
	  }
	  
	  public void setLive_status(String live_status) 
	  {
		this.live_status = live_status;
	  }

	  public String getLiveStatus() {
	    return live_status;
	  }

}

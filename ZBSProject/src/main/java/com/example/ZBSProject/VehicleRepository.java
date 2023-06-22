package com.example.ZBSProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository  extends JpaRepository<Vehicle, Long>{
	@Autowired
	Vehicle findByName(String name);
}

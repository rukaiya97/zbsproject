package com.example.ZBSProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository  extends JpaRepository<Member, Long>{
	@Autowired
    Member findByName(String name);
}

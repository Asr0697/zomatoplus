package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Users;

public interface UserRepository extends JpaRepository<Users,Long>{
	
	Users findByUsernameAndPassword(String username,String passwod);

}

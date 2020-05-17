package com.hak.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hak.model.User;
import com.hak.service.GitSearchServ;

@RestController
public class gitSearchController {
	@Autowired
	public GitSearchServ gitservice;
//	User[] user;
	int i;
	
	@GetMapping("/gitfollowers/{username}")
	public User getFollowersc(@PathVariable("username") String username) {
	//	List <User> user = new ArrayList<>();
		User users = new User();
		int iteration = 3;
		
		gitservice.getFollowers(username);
		 gitservice.getFollower1(users, iteration);
		 return users;
	
		
		
	}

}

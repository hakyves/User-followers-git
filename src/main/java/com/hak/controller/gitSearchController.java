package com.hak.controller;

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
	
	@GetMapping("/gitfollowers/{username}")
	public User getFollowersc(@PathVariable("username") String username) {
		return gitservice.getFollowers(username);
	
		
		
	}

}

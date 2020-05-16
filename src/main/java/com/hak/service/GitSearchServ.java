package com.hak.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hak.model.User;

@Service
public class GitSearchServ {
	User user1;
	String url;
	User[] users;
	RestTemplate rt = new RestTemplate();
	String serviceUrl = "https://api.github.com/users/";
	
HttpHeaders headers = new HttpHeaders();
	HttpEntity<String> headerEntity;
	
	public User getFollowers(String username) {
headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "token 93edf313f8f805edabbe3018d1f37dbea5987129");
		headerEntity = new HttpEntity<String>(headers);
	 user1 = rt.exchange(serviceUrl+username, HttpMethod.GET, headerEntity, User.class).getBody();
	 url = user1.getFollowers_url();
	 return user1;
	 
	 

}
	public List<User> getFollower1(User user,int iteration){
		if((iteration >3)||(user ==null))
			return null;
		
		ResponseEntity<User[]> gFoll;
		List<User> lst = new ArrayList<>();
		
		gFoll = rt.exchange(user1.getFollowers_url()+"?per_page=5",HttpMethod.GET,headerEntity,User[].class);
		User[] users = gFoll.getBody();
		
		iteration++;
		for(User u: users) {
			u.setFollowers1(getFollower1(u,iteration));
			lst.add(u);
		
			
		}
		return lst;
	}
	
}

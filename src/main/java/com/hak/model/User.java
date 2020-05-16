package com.hak.model;

import java.util.List;

public class User {
	
	 private String login;
     private long id;
     private String node_id;
    
   
     private String url;
    
     private String followers_url;
     private String following_url;
     private String gists_url;
     private String starred_url;

     private String repos_url;
    
    
     private String user;
     private boolean site_admin;
     private List <User> followers1;
     
     
	public List<User> getFollowers1() {
		return followers1;
	}
	public void setFollowers1(List<User> followers1) {
		this.followers1 = followers1;
	}
	public User() {}
	public User(String login, long id, String node_id, String avatar_url, String gravatar_id, String url,
			String html_url, String followers_url, String following_url, String gists_url, String starred_url,
			String subscriptions_url, String organizations_url, String repos_url, String events_url,
			String received_events_url, String user, boolean site_admin) {
		super();
		this.login = login;
		this.id = id;
		this.node_id = node_id;
	
		this.url = url;

		this.followers_url = followers_url;
		this.following_url = following_url;
		this.gists_url = gists_url;
		this.starred_url = starred_url;
	
		this.repos_url = repos_url;
	
		this.user = user;
		this.site_admin = site_admin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNode_id() {
		return node_id;
	}
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getFollowers_url() {
		return followers_url;
	}
	public void setFollowers_url(String followers_url) {
		this.followers_url = followers_url;
	}
	public String getFollowing_url() {
		return following_url;
	}
	public void setFollowing_url(String following_url) {
		this.following_url = following_url;
	}
	public String getGists_url() {
		return gists_url;
	}
	public void setGists_url(String gists_url) {
		this.gists_url = gists_url;
	}
	public String getStarred_url() {
		return starred_url;
	}
	public void setStarred_url(String starred_url) {
		this.starred_url = starred_url;
	}
	
	public String getRepos_url() {
		return repos_url;
	}
	public void setRepos_url(String repos_url) {
		this.repos_url = repos_url;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public boolean isSite_admin() {
		return site_admin;
	}
	public void setSite_admin(boolean site_admin) {
		this.site_admin = site_admin;
	}
     

}

package com.book.model;

public class Register {
	private Integer id;
	private String username;
	private String password;
	private String confirmpassword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public Register(Integer id, String username, String password, String confirmpassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	
	
	
}

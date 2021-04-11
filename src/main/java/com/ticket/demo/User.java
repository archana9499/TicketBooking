package com.ticket.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="userInfo")
public class User {

	@Id
	private String id;
	private String emailId,name,password,mobileNo;
	private int dateOfBirth;
	
	
	
	
	

	public User(String id, String emailId, String name, String password, String mobileNo, int dateOfBirth) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.name = name;
		this.password = password;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
	}


	public User() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", name=" + name + ", password=" + password + ", mobileNo="
				+ mobileNo + ", dateOfBirth=" + dateOfBirth + "]";
	}


	
	
	
	
}

package com.spring.cortana.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRegistration {
	@Id
	private String userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String emailid;
	private String password;
	private String OTP;
	private String contatNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOTP() {
		return OTP;
	}
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	public String getContatNo() {
		return contatNo;
	}
	public void setContatNo(String contatNo) {
		this.contatNo = contatNo;
	}
	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", emailid=" + emailid + ", password=" + password + ", OTP=" + OTP
				+ ", contatNo=" + contatNo + "]";
	}
	
}

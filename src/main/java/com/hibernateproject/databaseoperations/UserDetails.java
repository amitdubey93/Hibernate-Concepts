package com.hibernateproject.databaseoperations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="UserDetails.byId", query="from UserDetails where userId> :userId")
@NamedNativeQuery(name = "UserDetails.byName", query = "select * from user_details where user_name=:userName")
@Table(name="user_details")
public class UserDetails {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	private String email;
	
	private String password;
	
	@Column(name="join_date")
	private Date joinDate;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password="
				+ password + ", joinDate=" + joinDate + "]";
	}
	
}

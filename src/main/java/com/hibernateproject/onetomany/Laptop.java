package com.hibernateproject.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	
	@Id @GeneratedValue
	@Column(name = "laptop_id")
	private int laptopId;
	
	@Column(name = "laptop_name")
	private String laptopName;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	/*provide join column for bidrectional relational.
	*  for unidirectional both are not needed as a separate table is carrying the configration*/ 
	private UserDetails5 user;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public UserDetails5 getUser() {
		return user;
	}

	public void setUser(UserDetails5 user) {
		this.user = user;
	}
	
}

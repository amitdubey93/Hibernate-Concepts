package com.hibernateproject.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details5")
public class UserDetails5 {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	//@JoinTable(name="user_laptop", joinColumns=@JoinColumn(name="user_id"),
	//			inverseJoinColumns=@JoinColumn(name="laptop_id"))
	
	/*jointable is not needed for biderectional relationship when you use mappedby*/
	
	private Collection<Laptop> laptops = new ArrayList<Laptop>();
	
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
	public Collection<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(Collection<Laptop> laptops) {
		this.laptops = laptops;
	}
}

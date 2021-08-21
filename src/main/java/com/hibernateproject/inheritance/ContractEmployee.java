package com.hibernateproject.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee")
//@DiscriminatorValue("Con")
public class ContractEmployee extends Employee{
	
	private float payPerHour;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
	
	
	
}

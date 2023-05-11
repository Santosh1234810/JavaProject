package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custName;
	private int amount;
	
	public Customer() {
		super();
	}

	public Customer(int custId, String custName, int amount) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.amount = amount;
	}

	public Customer(String custName, int amount) {
		super();
		this.custName = custName;
		this.amount = amount;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}

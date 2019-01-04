package com.cts.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="citizens")
public class Citizen {
	
	@Id
	private String adharId;
	private String name;
	
	@OneToOne(mappedBy="accountHolder", cascade=CascadeType.ALL)
	private BankAccount bankAccount;

	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(String adharId, String name, BankAccount bankAccount) {
		super();
		this.adharId = adharId;
		this.name = name;
		this.bankAccount = bankAccount;
	}

	public String getAdharId() {
		return adharId;
	}

	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}

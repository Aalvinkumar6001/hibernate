package com.cts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Persons")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="pin")
private int personIdentificationNumber;

@Column(name="fnm")
private String firstName;

@Column(name="lnm")
private String lastName;

@Transient
private String fullName;

@Enumerated(EnumType.STRING)
private Gender gender;

private boolean isMarried;

@Temporal(TemporalType.DATE)
private Date dateOfBirth;






public Person(String firstName, String lastName, Gender gender, boolean isMarried, Date dateOfBirth) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.isMarried = isMarried;
	this.dateOfBirth = dateOfBirth;
}

public int getPersonIdentificationNumber() {
	return personIdentificationNumber;
}

public void setPersonIdentificationNumber(int personIdentificationNumber) {
	this.personIdentificationNumber = personIdentificationNumber;
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

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public boolean isMarried() {
	return isMarried;
}

public void setMarried(boolean isMarried) {
	this.isMarried = isMarried;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}


}

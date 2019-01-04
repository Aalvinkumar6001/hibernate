package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student2 implements Comparable<Student2>{
 @Id
 private int admNo;
 private String sName;
 
 @ManyToOne
 @JoinColumn
 private Course2 course;
public Student2() {
	super();
	// TODO Auto-generated constructor stub
}

public Student2(int admNo, String sName) {
	super();
	this.admNo = admNo;
	this.sName = sName;
}

public int getAdmNo() {
	return admNo;
}

public void setAdmNo(int admNo) {
	this.admNo = admNo;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public Course2 getCourse() {
	return course;
}

public void setCourse(Course2 course) {
	this.course = course;
}



@Override
public int compareTo(Student2 arg0) {
	// TODO Auto-generated method stub
	return 0;
}


}

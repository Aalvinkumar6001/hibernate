package com.cts.model;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses2")
public class Course2 implements Comparable<Course2> {

	@Id
	private int cId;
	private String cName;
	@OneToMany(mappedBy="course",cascade = CascadeType.ALL)
	@JoinColumn
	private TreeSet<Student2> students;



	public void setStudents(TreeSet<Student2> students) {
		this.students = students;
	}

	public Course2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	
	
	public Course2(int cId, String cName, TreeSet<Student2> students) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.students = students;
	}

	public TreeSet<Student2> getStudents() {
		return students;
	}

	@Override
	public int compareTo(Course2 o) {
		// TODO Auto-generated method stub
		return 0;
	}


}

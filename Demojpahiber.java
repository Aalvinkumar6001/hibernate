package com.cts.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.JPA.JPAUTIL;
import com.cts.model.Address;
import com.cts.model.BankAccount;
import com.cts.model.Book;
import com.cts.model.Citizen;
import com.cts.model.Course;
import com.cts.model.Course2;
import com.cts.model.Employee;
import com.cts.model.Gender;
import com.cts.model.Person;
import com.cts.model.Student;
import com.cts.model.Student2;
import com.cts.model.Worker;

public class Demojpahiber {

	public static void main(String[] args) {

	/*	Scanner scan =new Scanner(System.in);
		Book book=new Book();
		System.out.println("Enter a bcode");
		book.setBcode(scan.nextInt());
		System.out.println("Enter a title");
		book.setTitle(scan.next());
		System.out.println("enter a price");
		book.setPrice(scan.nextDouble());*/
		//Person P = new Person("aalvin", "vijay",Gender.Masculine, false, new Date(1995,06,11));
		
		//Employee emp = new Employee("venkat", Gender.Masculine, LocalDate.of(1968, Month.AUGUST, 11), new Address("48-1-2","chennai","tamilNadu"));
		/*
		 * BankAccount acc= new BankAccount(); acc.setAccNumber("121212");
		 * acc.setBal(123.00); Citizen c= new Citizen();
		 * c.setAdharId("1000000003"); c.setName("aalvinkumar");
		 * c.setBankAccount(acc); acc.setAccountHolder(c); em.persist(c);
		 */
	/*	TreeSet<Student> mbaStudents = new TreeSet<Student>();
		TreeSet<Student> mcaStudents = new TreeSet<Student>();
		mbaStudents.add(new Student(123, "Rahul"));
		mbaStudents.add(new Student(456, "Kishore"));
		mbaStudents.add(new Student(789, "Suresh"));
		mcaStudents.add(new Student(147, "Rajesh"));
		mcaStudents.add(new Student(258, "Ram"));
		mcaStudents.add(new Student(963, "Narendra"));
		Course mca = new Course(1, "MCA", mcaStudents);
		Course mba = new Course(2, "MBA", mbaStudents);*/
	/*	TreeSet<Student2> mbaStudents = new TreeSet<Student2>();
		TreeSet<Student2> mcaStudents = new TreeSet<Student2>();
		mbaStudents.add(new Student2(123, "Rahul"));
		mbaStudents.add(new Student2(456, "Kishore"));
		mbaStudents.add(new Student2(789, "Suresh"));
		mcaStudents.add(new Student2(147, "Rajesh"));
		mcaStudents.add(new Student2(258, "Ram"));
		mcaStudents.add(new Student2(963, "Narendra"));
		Course2 mca = new Course2(1, "MCA", mcaStudents);
		Course2 mba = new Course2(2, "MBA", mbaStudents);
		for (Student2 stud:mbaStudents){
			stud.setCourse(mba);
		}
		//for bidirection manytoone
		for (Student2 stud:mcaStudents){
			stud.setCourse(mca);
		}*/
		Worker manger = new Worker(101,"vignesh",null);
		Worker w1 = new Worker(102, "aalvin", manger);
		EntityManager em =JPAUTIL.getEntityManagerFacory().createEntityManager();
	    EntityTransaction txn=em.getTransaction();
	    txn.begin();
	    em.persist(manger);
	    txn.commit();
	    
	    JPAUTIL.shutdown();
	}
}

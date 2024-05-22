package com.StudentManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")

public class Student {

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    @Column(name="FirstName")
	    private String firstName;
	    @Column(name="LastName")
	    private String LastName;
	    @Column(name="Email",nullable = false,unique = true)
	    private String email;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(long id, String firstName, String lastName, String email) {
			super();
			this.id = id;
			this.firstName = firstName;
			LastName = lastName;
			this.email = email;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
}

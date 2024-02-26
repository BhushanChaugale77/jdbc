package com.prowings.jdbc;

public class Student1 {
	
	private int id;
	private String name;
	private String subject;
	private int rollno;
	
	public Student1() {
		super();
	}
	
	public Student1(int id, String name, String subject, int rollno) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.rollno = rollno;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

package com.springjdbc.SpringAutoWire;

public class Student {
	
	private String name;
	private String email;
	private int roll;
	private Marks marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("Student Name : "+ name);
		System.out.println("Student Email : " + email);
		System.out.println("Student Roll : " +roll);
		System.out.println("Marks : "+ marks.toString());
	}
	
	

}

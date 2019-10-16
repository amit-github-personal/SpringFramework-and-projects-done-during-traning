package com.test.SpringPro2;

public class student {
	
	private int roll;
	private String sname;
	private String course;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display()
	{
		 System.out.println("Student Roll :"+roll);
	        System.out.println("Student Name :"+sname);
	        System.out.println("Student Course :"+course);
	}

}

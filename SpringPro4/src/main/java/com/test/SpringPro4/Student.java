package com.test.SpringPro4;

import java.util.List;

public class Student {
	
	private int roll;
	private String sname;
	private List<String> course;
	
	public Student(int roll, String sname, List<String> course)
	{
		super();
		this.roll=roll;
		this.course=course;
		this.sname=sname;
	}
	
	public void display()
	{
		System.out.println("Student Roll : "+roll);
		System.out.println("Student Name : "+sname);
		System.out.println("Course : ");
		
		for(String s:course)
		{
			System.out.println(s);
		}
	}

}

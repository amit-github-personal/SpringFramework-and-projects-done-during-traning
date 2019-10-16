package com.test.SpringPro5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int roll;
	private String sname;
	private List<String> course;
	
	
	public void setValue()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.println("Enter your Roll : ");
			roll=Integer.parseInt(br.readLine());
			
			System.out.println("Enter Student Name : ");
			sname=br.readLine();
			
			String c;
			
			do 
			{
				System.out.println("Please Enter Courses :");
				course=new ArrayList<String>();
				c=br.readLine();
				course.add(c);
				
			}
			while(!c.equals("stop"));
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void display()
	{
		System.out.println("Student roll : "+roll);
		System.out.println("Student Name : "+sname);
		
		for(String s:course)
		{
			System.out.println("Course : "+s);
		}
		
	}
	

}

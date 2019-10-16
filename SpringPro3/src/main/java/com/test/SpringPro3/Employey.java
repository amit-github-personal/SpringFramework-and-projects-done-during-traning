package com.test.SpringPro3;

import java.util.Scanner;

public class Employey {
	
	private int emp_id;
	private String empname;
	private String desig;
	private double basic;
	
	public void setValue()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter your Employey ID :");
			emp_id=Integer.valueOf(sc.next());
			System.out.print("Enter Employey Name :");
			empname=sc.next();
			System.out.print("Enter Employey Designation :");
			desig=sc.next();
			System.out.print("Enter your Basic Salary :");
			basic=Double.valueOf(sc.next());
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void display()
	{
		System.out.println("Employey ID : "+emp_id);
		System.out.println("Employey Name : "+empname);
		System.out.println("Employey Designation : "+desig);
		System.out.println("Employey Basic Salary : "+basic);
		
	}

}

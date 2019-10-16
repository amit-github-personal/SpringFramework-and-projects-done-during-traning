package com.test.SpringPro6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
	
	private int Book_id;
	private String sub;
	private Map<String, String> map;
	
	public void setValues()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter book ID : ");
			Book_id=Integer.valueOf(br.readLine());
			
			System.out.println("Please Enter Sub :");
			sub=br.readLine();
			
			System.out.println("Please Enter Number of Subject and writer :");
			int n=br.read();
			
			for(int i=0; i<=n; i++)
			{
			String course;
			String writer;
			
				map=new HashMap<String, String>();
				
				System.out.println("Please enter Book's course :");
				course=br.readLine();
				
				System.out.println("Please Enter Writer Name :");
				writer=br.readLine();
				map.put(course, writer);
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void display()
	{
		System.out.println("Book ID :"+Book_id);
		System.out.println("Book's Subject Name : "+sub);
		
		Iterator itr=map.keySet().iterator();
		
		while(itr.hasNext())
		{
			String course=(String) itr.next();
			System.out.println("Course Name is : "+course);
			System.out.println("Book Writer : "+map.get(course));
			System.out.println(" Book");
		}
	}

}

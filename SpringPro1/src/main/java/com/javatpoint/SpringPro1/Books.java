package com.javatpoint.SpringPro1;

public class Books {
	
	private int id;
	private String sub;
	private String bname;
	private String writer;
	
	public Books(int id, String sub, String bname, String writer) {
		super();
		this.id = id;
		this.sub = sub;
		this.bname = bname;
		this.writer = writer;
	}
	
	public void display()
	{
		System.out.println("Book Details.");
		System.out.println("Book ID: "+id);
		System.out.println("Subject : "+sub);
		System.out.println("Book Name : "+bname);
		System.out.println("Book Writer : "+writer);
		
	}
	
	
}

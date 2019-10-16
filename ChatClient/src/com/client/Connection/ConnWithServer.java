package com.client.Connection;

import java.io.*;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.client.Database.Database;
import com.client.IOOperations.ReadThread;
import com.client.IOOperations.WriteThread;

public class ConnWithServer extends Thread {
	
	private static final int port_no=8451;
	private static final String url="127.0.0.1";
	private Socket client;
	
	public ConnWithServer() 
	{
		start();
	}
	
	
	
	public void run()
	{
		
		try
		{
			client=new Socket(url, port_no);
			
			System.out.println("You're Connected! on localport : 8451");
			
			//Once connected 
			
			DataInputStream reader=new DataInputStream(client.getInputStream());
			DataOutputStream writer=new DataOutputStream(client.getOutputStream());
			
			ReadThread read=new ReadThread(reader);
			WriteThread WriteThread=new WriteThread(writer);
			
			read.start();
			WriteThread.start();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured while connecting to Server : " +e.getMessage());
			JOptionPane.showMessageDialog(null, "Error while Connecting to Server :"+ e.getMessage());
		} 
	}
	
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		Database db=new Database();
		db.Connect();
		System.out.println("Please Enter username :");
		String user=sc.nextLine();
		System.out.println("Enter your Password : ");
		String pass=sc.nextLine();
		
		if(db.searchUser(user, pass))
		{
			new ConnWithServer();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "User not found in records");
		}
		
		
			
	}
}

package com.client.IOOperations;

import java.io.DataInputStream;
import java.io.IOException;;

public class ReadThread extends Thread {
	
	private DataInputStream reader;
	
	public ReadThread(DataInputStream reader)
	{
		this.reader=reader;
	}

	public void run()
	{
		String message="";
		
		do
		{
			try 
			{
				message=reader.readUTF();
				System.out.println("Server Message : "+message);
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		while(!message.equalsIgnoreCase("stop"));
	}
}

package com.clients.List;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ClientList extends Thread{
	
	private HashMap<String, Socket> client=null;
	private DataOutputStream dos;
	private DataInputStream dis;
	
	public ClientList(HashMap<String, Socket> client2) 
	{
		client=client2;
	}
	
	public void run()
	{
		try
		{
			String str="";
			
			
			String client_name="test_user";
			Socket sc= client.get(client_name);
			
				do
				{
					
					dis=new DataInputStream(sc.getInputStream());
					str=dis.readUTF();
					
					if(str.equalsIgnoreCase("stop"))
					{
						SendAll(str);
					}
					else
					{
						
						dos=new DataOutputStream(sc.getOutputStream());
						System.out.println("Client Message : "+str);
						dos.writeUTF(str);
						dos.flush();
					}
				}
				while(!str.equalsIgnoreCase("stop"));
	
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void SendAll(String args)
	{
		
			
				try
				{
					
					Socket sc= (Socket) client.get("test_user");
					dos=new DataOutputStream(sc.getOutputStream());
					dos.writeUTF(args);
					dos.flush();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		
	}
	

}

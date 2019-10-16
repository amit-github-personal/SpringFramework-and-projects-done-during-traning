package com.Server.Connections;

import java.io.IOException;

import com.client.Connection.ConnWithServer;
import com.clients.List.ClientList;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server extends Thread {
	
	private static ServerSocket serverSocket;
	//private static Socket clientSocket;
	private static final int port_no=8451;
	
	HashMap<String, Socket> client;
	
	public Server()
	{
		start();
		
	}
		
		public void run()
		{
			try {
				
				serverSocket=new ServerSocket(port_no);
				System.out.println("Server statrted at port no : "+port_no);
				
				
				
				while(true)
				{
					
					client=new HashMap<String,Socket>();
					
					//We're keeping the client unique so that ew can easily identify them
					client.put("test_user", serverSocket.accept());
					System.out.println("Client" + "[ test_user ]" + " got connected at address: "+client.get("test_user"));
					
					new ClientList(client).start();

					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	public static void main(String...args)
	{
		new Server();
	}

}

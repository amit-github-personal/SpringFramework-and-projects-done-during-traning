package com.rabbitmq.test;

import com.rabbitmq.client.*;

public class Producer {

	private String message="";
	private Channel channel;
	private Connection connection;
	
	public Producer(String message, Channel ch, Connection con)
	{
		this.message=message;
		channel=ch;
		connection=con;
	}
	
	public void send()
	{
		
	}
	

}

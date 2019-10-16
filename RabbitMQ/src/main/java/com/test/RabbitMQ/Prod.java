package com.test.RabbitMQ;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

public class Prod {
	 
	private final static String QUEUE_NAME = "hello";
	
	public Prod()
	{
		ConnectionFactory cf=new ConnectionFactory();
		cf.setHost("localhost");
		
		try(Connection con=cf.newConnection();
				Channel ch=con.createChannel())
		{
			ch.queueDeclare(QUEUE_NAME, false, false, false, null);
			String Message="Hello world";
			ch.basicPublish("", QUEUE_NAME, null, Message.getBytes());
			System.out.println("Sent : "+Message);
			
		} catch (IOException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

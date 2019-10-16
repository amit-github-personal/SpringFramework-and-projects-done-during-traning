package com.test.RabbitMQ;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Consumer {
	
	public static final String QUEUE_NAME="hello";
	
	public static void main(String...args)
	{
		
		try {
			ConnectionFactory cf=new ConnectionFactory();
			cf.setHost("localhost");
			Connection con=cf.newConnection();
			Channel ch=con.createChannel();
			
			ch.queueDeclare(QUEUE_NAME, false, false, false, null);
			System.out.println("Waiting for message to be pushed.");
			
			DeliverCallback deliver=(consumertag, delivery) ->
			{
				String Message=new String(delivery.getBody(), "UTF-8");
				System.out.println(" Message Received : "+ Message);
			};
			
			ch.basicConsume(QUEUE_NAME, true, deliver, consumertag-> {});
			
		} catch (IOException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

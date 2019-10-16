package com.rabbitmq.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.rabbitmq.client.*;

public class User {
	
	private static final String EXCHANGE_NAME="direct_logs";

	public static void main(String[] args) {
		
		try
		{
			ConnectionFactory factory=new ConnectionFactory();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your Username : ");
			factory.setUsername(br.readLine());
			
			System.out.println("Enter Password : ");
			factory.setPassword(br.readLine());
			factory.setHost("localhost");
			factory.setVirtualHost("host1");
			Thread.sleep(5000);
			System.out.println("Connected to virtual host...");
			
			Connection connection=factory.newConnection();
			Channel channel= connection.createChannel();
			
			String queue=channel.queueDeclare().getQueue();
			channel.exchangeDeclare(EXCHANGE_NAME, "direct");
			channel.queueBind(EXCHANGE_NAME, queue, "");
			
			String message="";
			do
			{
				System.out.println("You typed: ");
				message=br.readLine();
				
				Producer p=new Producer(message, channel, connection);
				p.send();
				
				DefaultConsumer consumer = new DefaultConsumer(channel) {
					
					@Override
					public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
							byte[] body) throws IOException {
						
						String message = new String(body, "UTF-8");
						System.out.println(" Received '" + message + "'");
					}
				};
				
			}while(!message.equals("stop"));
			
			connection.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

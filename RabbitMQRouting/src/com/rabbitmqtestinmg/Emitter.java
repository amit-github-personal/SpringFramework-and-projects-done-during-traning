package com.rabbitmqtestinmg;
import com.rabbitmq.client.ConnectionFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.rabbitmq.client.*;

public class Emitter {

	//Now we're gonna learn how we route the messages according to serverity
	
	/*Declaring Exchange name*/
	
	private static final String EXCHANGE_NAME="direct_logs";
	
	public static void main(String[] args) {
	
		/*We'll use this model for our logging system. Instead of fanout we'll send messages to a direct exchange. 
		 *We will supply the log severity as a routing key. That way the receiving program will be able to select the severity it wants to receive.
		 * Let's focus on emitting logs first.*/
		
		/*We were using a fanout exchange, which doesn't give us much flexibility - it's only capable of mindless broadcasting.*/
		
		/*We will use a direct exchange instead. The routing algorithm behind a direct exchange is simple - 
		 * a message goes to the queues whose binding key exactly matches the routing key of the message.*/
		ConnectionFactory factory=new ConnectionFactory();
		factory.setHost("localhost");
		
		
		try(Connection con=factory.newConnection();
				Channel ch=con.createChannel())
		{
			/*Earlier we were using fanout exhange that was not much useful so to 
			to filter the messages on basis of severity we use direct exchange*/
			ch.exchangeDeclare(EXCHANGE_NAME, "direct");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter severity : ");
			String severity=br.readLine();
			
			System.out.println("Enter Message : ");
			String message=br.readLine();
			
			ch.basicPublish(EXCHANGE_NAME, severity	, null, message.getBytes("UTF-8"));
			
			
			
			System.out.println("[X] Sent "+ severity+ " : "+ message);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}




		

	}

}

package com.rabbitmqtestinmg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.rabbitmq.client.*;

public class Receiver {

	private static final String EXCHANGE_NAME="direct_logs";

	
	public static void main(String[] args) {
		
		try
		{
			ConnectionFactory factory=new ConnectionFactory();
			Connection con=factory.newConnection();
			factory.setHost("localhost");
			Channel ch=con.createChannel();
			
			ch.exchangeDeclare(EXCHANGE_NAME, "direct");
			
			String queue=ch.queueDeclare().getQueue();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			
			if(args.length < 1)
			{
				System.err.println("Usage: ReceiveLogsDirect [info] [warning] [error]");
				
			}
			
			List<String> sev=new ArrayList<String>();
			
			for(int i=0; i<=2; i++)
			{
				System.out.println("Your Query : ");
				sev.add(br.readLine());
				
			}
			
			
			
			for(String severity : sev)
			{
				ch.queueBind(queue , EXCHANGE_NAME, severity);
			}
			
		    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
		    
		    DeliverCallback deliver= (consumerTag, delivery) -> {
		    	
		    	String message=new String(delivery.getBody(), "UTF-8");
		    	
		    	System.out.println("[*] Received : "+ delivery.getEnvelope().getRoutingKey()+ " : "+message);
		    };
		    
		    ch.basicConsume(queue, true, deliver, consumertag ->{});
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

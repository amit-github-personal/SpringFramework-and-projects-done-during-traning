package com.rabbitmq;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.*;

public class Producer {
	
	private static final String EXCHANGE_NAME="logs";

	public static void main(String[] args) {
		
		try
		{
			ConnectionFactory cf=new ConnectionFactory();
			cf.setHost("localhost");
			
			try(Connection con=cf.newConnection();
				Channel ch=con.createChannel())
			{
				/*The core idea in the messaging model in RabbitMQ is that the producer never sends any messages directly to a queue.
				 *  the producer can only send messages to an exchange. An exchange is a very simple thing. 
				 *  On one side it receives messages from producers and the other side it pushes them to queues.
				 *  The exchange must know exactly what to do with a message it receives*/
				ch.exchangeDeclare(EXCHANGE_NAME, "fanout");
				
/*In previous parts of the tutorial we knew nothing about exchanges, but still were able to send messages to queues. 
 *That was possible because we were using a default exchange, which we identify by the empty string ("").
Recall how we published a message before:
channel.basicPublish("", "hello", null, message.getBytes());*/
				String message=args.length < 1 ? "Hello this is rabbitmq." : String.join("", args);
				
				/*Now, we can publish to our named exchange instead:*/
				
				ch.basicPublish("logs", "", null, message.getBytes());
				
				System.out.println("[ X ] Sent : "+ message);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

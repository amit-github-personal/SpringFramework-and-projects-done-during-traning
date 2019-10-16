package com.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Consumer {
	
	  private static final String EXCHANGE_NAME = "logs";
	
	/*Being able to name a queue was crucial for us -- we needed to point the workers to the same queue.
	Giving a queue a name is important when you want to share the queue between producers and consumers.
	But that's not the case for our logger. We want to hear about all log messages, not just a subset of them.
	We're also interested only in currently flowing messages not in the old ones. To solve that we need two things.
	Firstly, whenever we connect to Rabbit we need a fresh, empty queue. To do this we could create a queue with a random name,
	or, even better - let the server choose a random queue name for us.*/
	
	/*In the Java client, when we supply no parameters to queueDeclare() 
	 * we create a non-durable, exclusive, autodelete queue with a generated name:*/
	
	public static void main(String...args)
	{
		try
		{
			ConnectionFactory cf=new ConnectionFactory();
			cf.setHost("localhost");
			Connection con=cf.newConnection();
			Channel ch=con.createChannel();
			ch.exchangeDeclare(EXCHANGE_NAME, "fanout");
			
			/*At that point queueName contains a random queue name. For example it may look like amq.gen-JzTY20BRgKO-HjmUJj0wLg.*/
			String queueName = ch.queueDeclare().getQueue();
			
			/*We've already created a fanout exchange and a queue. 
			 *Now we need to tell the exchange to send messages to our queue.
			 *That relationship between exchange and a queue is called a binding.*/
			ch.queueBind(queueName, EXCHANGE_NAME, "");
			
			System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		    DeliverCallback deliverCallback = (consumerTag, delivery) -> {
		        String message = new String(delivery.getBody(), "UTF-8");
		        System.out.println(" [x] Received '" + message + "'");
		    };
		    ch.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}

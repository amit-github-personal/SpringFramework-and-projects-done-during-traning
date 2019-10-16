
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;


public class Worker {

	public static final String QUEUE_NAME="hello";

	public static void main(String[] args) {

		try
		{
			ConnectionFactory cf=new ConnectionFactory();
			cf.setHost("localhost");
			Connection con=cf.newConnection();
			Channel ch=con.createChannel();
			
			ch.queueDeclare(QUEUE_NAME, false, false, false, null);
			System.out.println("Waiting for message to be pushed.");
			
			DeliverCallback deliverCallback = (consumerTag, delivery) -> {
			
				String message = new String(delivery.getBody(), "UTF-8");
	   		    System.out.println(" [x] Received '" + message + "'");
	   		    
	   		    try
	   		    {
	   		    	doWork(message);
	   		    } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	   		    finally
	   		    {
	   		    	System.out.println("[x] Done.");
	   		    }

			};
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void doWork(String Task) throws InterruptedException
	{
		for(char s: Task.toCharArray())
		{
			for (char ch: Task.toCharArray()) {
		        if (ch == '.') Thread.sleep(1000);
		    }
		}
	}

}

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import com.rabbitmq.client.Channel;

public class Prod {
	
	private final static String QUEUE_NAME = "hello";
	 public static void main(String...args)
	 {
		 ConnectionFactory factory=new ConnectionFactory();
		 factory.setHost("localhost");
		 
		 try(Connection con=factory.newConnection();
		 Channel ch=con.createChannel())
		 {
			 ch.queueDeclare(QUEUE_NAME, false, false, false, null);
			 String msg="Hey there testing ..Rabbitmq ..the message ..broker..";
			 ch.basicPublish("" , QUEUE_NAME ,null, msg.getBytes());
			 System.out.println("Message sent : "+msg);
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }

}

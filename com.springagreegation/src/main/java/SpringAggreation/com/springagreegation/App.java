package SpringAggreation.com.springagreegation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employey em=con.getBean("em", Employey.class);
        
        em.display();
    }
}

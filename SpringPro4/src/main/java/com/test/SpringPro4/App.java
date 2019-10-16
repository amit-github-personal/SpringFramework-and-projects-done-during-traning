package com.test.SpringPro4;

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
        Student st=con.getBean("info", Student.class);
        st.display();
    }
}

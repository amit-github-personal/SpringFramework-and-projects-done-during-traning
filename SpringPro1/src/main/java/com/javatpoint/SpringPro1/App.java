package com.javatpoint.SpringPro1;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Books obj=context.getBean("info",Books.class);
        obj.display();
    }
}

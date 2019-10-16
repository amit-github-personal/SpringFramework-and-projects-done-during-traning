package com.springjdbc.SpringJDBC;

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
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student obj=app.getBean("Book", Student.class);
        BookDao dao=app.getBean("dao", BookDao.class);
        int i=dao.save(obj);
        
        if(i>0)
        {
        	System.out.println("Done");
        }
        else
        {
        	System.out.println("Fail");
        }
    }
}

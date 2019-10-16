package com.spring.jdbc.SpringJDBCTemplate;

import java.util.Iterator;
import java.util.List;

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
        ApplicationContext con= new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplateSpring jt=con.getBean("jt", JdbcTemplateSpring.class);
        
        jt.create(2, "Yash", "Janakpuri", "BTech");
        jt.create(3, "Rohitash", "Noida sec5", "MTech");
        jt.create(4, "Himanshu", "Dilshad Garden", "Agriculture");
        
          List<Student> dis=jt.displayAll();
          Iterator it= dis.iterator();
          
          while(it.hasNext())
          {
        	  Student st=(Student) it.next();
        	  System.out.println("Student info : "+ st.getId()+ " "+ st.getName()+" "+st.getAddress()+" "+st.getCourse());
          }
          
          jt.updateName(1, "Amit");
        
    }
}

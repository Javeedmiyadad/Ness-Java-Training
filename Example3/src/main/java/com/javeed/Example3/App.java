package com.javeed.Example3;

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
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config3.xml");
//    	Employee e =(Employee) context.getBean("emp");
//    	System.out.println(e);
    	
    			Student student = context.getBean("student",  Student.class);
    			System.out.println(student);
    			
    }
}

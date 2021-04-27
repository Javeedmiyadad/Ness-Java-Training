package com.javeed.Example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

//Bean life cycle by inint-method,destroy-method and by implementing initialializingBean an disposableBean
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("Config2.xml");
    	//to call the destroy we write following code
    	((AbstractApplicationContext) context).registerShutdownHook();
    	
    	
//    	 Employee e =(Employee) context.getBean("emp");
//    	 System.out.println(e.toString());
    	
    	Student s = (Student) context.getBean("std");
    	 System.out.println(s.toString());
    	
    	
    }
}

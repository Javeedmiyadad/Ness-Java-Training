package com.javeed.Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		
//		Setter injection

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//		Employee employee = (Employee) context.getBean("Employee1");
//		Employee employee1 = (Employee) context.getBean("Employee2");
//		Employee employee2 = (Employee) context.getBean("Employee3");
//		System.out.println(employee.toString());
//		System.out.println(employee1.toString());
//		System.out.println(employee2.toString());
//		System.out.println("**********************************");
//
//		Test t1 = (Test) context.getBean("Test1");
//		System.out.println(t1.toString());
//
//		System.out.println("**********************************");
//		
//		Student st = (Student) context.getBean("student1");
//		System.out.println(st.toString());
		
//		Constructor injection

//		Test1 std = (Test1) context.getBean("test1");
//		System.out.println(std.toString());
//		System.out.println("**********************************");
//		Student s = (Student) context.getBean("stud");
//		System.out.println(s.toString());
		
//		index and type
		
		Calculator c =(Calculator) context.getBean("calc");
		c.m1();
		

	}
}

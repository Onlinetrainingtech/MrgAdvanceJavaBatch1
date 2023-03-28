package com.xyz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) 
	{
	 
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Reterive bean from spring container
		
		Coach theCoach=(Coach) context.getBean("myCoach",Coach.class);
		
		Coach theCoach1=(Coach) context.getBean("myCoach1",Coach.class);
		
		//call the method
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyWorkout());
		
		//close the context
		
		
		context.close();
		
		

	}

}

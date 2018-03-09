package com.javapoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootPropertyeditorApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootPropertyeditorApplication.class, args);
		ApplicationContext  context = new ClassPathXmlApplicationContext("SpringContext.xml");
		Person person = (Person)context.getBean("person");
		PersonType ptype = person.getType();
		System.out.println(ptype.getType().toString());
	}
	
	
}

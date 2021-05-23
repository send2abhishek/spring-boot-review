package com.send2abhishek.spring.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {
		
		System.out.println("Application started");
		
		//BinarySearchAlgo algo=new BinarySearchAlgo(new BubbleSort());	
		
		// it returns the application context
		
		ApplicationContext context=	SpringApplication.run(SpringbootBasicsApplication.class, args);
	
	// now using application context create the object of BinarySearchAlgo class
	
	BinarySearchAlgo algo=context.getBean(BinarySearchAlgo.class);
		
		System.out.println("sorted number is "+algo.sortNumbers());
	}

}

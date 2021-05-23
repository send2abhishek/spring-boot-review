package com.send2abhishek.spring.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicsApplication {

	public static void main(String[] args) {
		
		System.out.println("Application started");
		
		BinarySearchAlgo algo=new BinarySearchAlgo(new BubbleSort());	
		System.out.println("sorted number is "+algo.sortNumbers());
		//SpringApplication.run(SpringbootBasicsApplication.class, args);
	}

}

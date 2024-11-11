package com.learn.springcore2;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(Config.class);
		
		Customer c1 = context.getBean("customer",Customer.class);
		System.out.println(c1);
		
		Card card = context.getBean("card",Card.class);
		System.out.println(card);
		
		Card card1=context.getBean("card",Card.class);
		System.out.println(card1);
		
	}
	
}

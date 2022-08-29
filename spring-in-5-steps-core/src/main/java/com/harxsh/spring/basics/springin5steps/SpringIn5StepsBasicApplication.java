package com.harxsh.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harxsh.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
// @ComponentScan("com.harxsh.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		// Application context
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {

			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 12, 4, 6, 9 }, 7);
			System.out.println(result);
		}
	}
}

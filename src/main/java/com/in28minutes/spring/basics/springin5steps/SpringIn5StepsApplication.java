package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		BinarySearchimpl binarySearch = new BinarySearchimpl();
		int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
		System.out.println("Boba");
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}

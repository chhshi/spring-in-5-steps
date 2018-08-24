package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		int result1 = binarySearch1.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
		System.out.println(result1);

		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}

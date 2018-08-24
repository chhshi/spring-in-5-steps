package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Component Scan: by default automatically scan the package that this Application is in
//Application itself is a bean:  [DEBUG::Creating shared instance of singleton bean 'springIn5StepsApplication']
@SpringBootApplication
public class SpringIn5StepsApplication {

	/*
	 *
	 * Spring cares about:
	 *
	 * 1) what are beans
	 * 2) what are dependencies of a bean
	 * 3) where to search for beans?
	 *
	 * */


	public static void main(String[] args) {

		/*
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch1 = new BinarySearchImpl(new QuickSortAlgorithm());

		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		int result1 = binarySearch1.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
		System.out.println(result1);
		*/

		//ApplicationContext will maintain all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);


	}
}

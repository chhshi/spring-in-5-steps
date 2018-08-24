package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This is a bean
@Component
public class BinarySearchImpl {


  //Interface
  //This is a dependency
  @Autowired
  private SortAlgorithm sortAlgorithm;

  //constructor
  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }


  /*
  * SPRING CORE:
  * 1) Dependency Injection
  * 2) Loose Coupling
  *
  * */

  public int binarySearch(int[] numbers, int numberToSearchFor) {


    /* sort an array: BubbleSort
    * BinarySearchImpl.class is -tightly-coupled- with this Sort implementation
    * Means: When you want to change a sort implementation,
    * you have to change this binarySearch method
    * This is not good.
    * */

    /* Try creating a BubbleSortAlgorithm class */
    BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
    int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

    /* Now it's hard coded to use BubbleSortAlgorithm
     * What if I want to switch between different algorithms?
     * Create -Interface- SortAlgorithm and include it as private field.
     * Write a constructor to initiate it.
     * */

    int[] sortedNumbers2 = sortAlgorithm.sort(numbers);

    //search the array

    //return the result

    return 3;
  }

}

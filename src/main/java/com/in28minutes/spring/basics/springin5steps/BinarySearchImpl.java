package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This is a bean
//[DEBUG::Creating shared instance of singleton bean 'binarySearchImpl']
@Component
public class BinarySearchImpl {


  //Interface
  //This is a dependency
  @Autowired
  private SortAlgorithm sortAlgorithm;
  /*
  * 1) Contructor Injection / autowire  -------> Old days, this is mandatory
  * 2) Setter Inject /autowire
  * 3) No constructor & No Setter ----> Drawbacks: too easy to add dependencies, add too much dependencies.
  *
  * */


  /*
  //constructor Injection
  //[DEBUG::Autowiring (by type) from bean name 'binarySearchImpl' (via constructor) to bean named 'bubbleSortAlgorithm']
  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }
  */

  //Setter Injection
  public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
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

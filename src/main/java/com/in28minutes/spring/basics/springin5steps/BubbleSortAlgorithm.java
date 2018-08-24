package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

//This is a bean
//[DEBUG::Creating shared instance of singleton bean 'bubbleSortAlgorithm']
@Component
public class BubbleSortAlgorithm implements SortAlgorithm{

  public int[] sort(int[] nums) {

    /*
     * Sort logic here
     */

    return nums;
  }

}

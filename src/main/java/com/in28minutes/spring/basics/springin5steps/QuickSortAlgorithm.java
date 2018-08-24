package com.in28minutes.spring.basics.springin5steps;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//[DEBUG::Parameter 0 of constructor in ...BinarySearchImpl required a single bean, but 2 were found, use  @Primary, or @Qualifier ]
@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
  public int[] sort(int[] nums) {

    /*
     * Sort logic here
     */

    return nums;
  }
}

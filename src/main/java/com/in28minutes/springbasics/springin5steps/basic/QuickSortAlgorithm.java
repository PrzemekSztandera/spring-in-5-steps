package com.in28minutes.springbasics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers) {
        // Some logic for Quick sort
        return numbers;
    }
}

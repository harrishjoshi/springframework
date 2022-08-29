package com.harxsh.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
	public int[] sort(int[] numbers);
}

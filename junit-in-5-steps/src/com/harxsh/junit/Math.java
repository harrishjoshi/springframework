package com.harxsh.junit;

public class Math {

	int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}

		return sum;
	}
}

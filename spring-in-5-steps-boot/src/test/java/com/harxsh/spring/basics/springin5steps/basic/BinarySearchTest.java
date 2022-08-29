package com.harxsh.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.harxsh.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		// Call method on binary search
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		
		// Check if the value is correct
		assertEquals(3, actualResult);
	}
}
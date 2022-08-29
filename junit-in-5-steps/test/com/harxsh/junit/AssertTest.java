package com.harxsh.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(1, 1);
		assertTrue(true);
		assertFalse(false);
		assertArrayEquals(new int[] { 1, 2 }, new int[] { 1, 2 });
	}

}

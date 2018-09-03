package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.Grep;



class GrepTest {

	@Test
	void testCheckForSting() {
		Grep.checkForString("C:\\harini\\harin.txt", "hai");
		assertEquals(437, Grep.checkForString("‪C:\\harini\\harin.txt", "hai"));
	}

}
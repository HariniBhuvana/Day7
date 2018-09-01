package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.LineCounter;


class LineCounterTest {

	@Test
	void testCountLine() {

		System.out.println(LineCounter.countLine("C:\\a\\ab.txt"));

		assertEquals(8, LineCounter.countLine("C:\\a\\ab.txt"));

	}

}
package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.MagicDate;



class MagicDateTest {

	@Test
	void testIsMagicDate() {
		assertEquals(true, MagicDate.isMagicDate(2, 7, 14));
		assertEquals(false, MagicDate.isMagicDate(3, 9, 14));
	}

}
package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.DateFormat;



class DateFormatTest {

	@Test
	void testGetFormateOne() {
		DateFormat date = new DateFormat("12022014");
		date.getFormateOne();
		assertEquals("12/02/2014", date.getFormateOne());
		date.getFormateTwo();
		assertEquals("12,February,2014", date.getFormateTwo());
	}

}
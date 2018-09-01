package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DisplayTodayDateTest {

	@Test
	void testDisplayTodaysDate() {
		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.getDayOfWeek().name() + " " + localDate.getMonth().name() + " "
				+ localDate.getDayOfMonth() + " " + localDate.getYear());
		String dateFormate = localDate.getDayOfWeek().name() + " " + localDate.getMonth().name() + " "
				+ localDate.getDayOfMonth() + " " + localDate.getYear();

		assertEquals("SATURDAY SEPTEMBER 1 2018", dateFormate);
	}

}
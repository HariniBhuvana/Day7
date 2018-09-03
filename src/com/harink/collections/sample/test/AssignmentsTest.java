package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.Assignments;


class AssignmentsTest {

	@Test
	void testAssignments() {
		
		
		Assignments assign1 = new Assignments(new File("C:\\harini\\day1.txt"), LocalDate.of(2014, 9, 25));
		Assignments assign2 = new Assignments(new File("C:\\harini\\day2.txt"), LocalDate.of(2014, 9, 24));
		Assignments assign3 = new Assignments(new File("C:\\harini\\day3.txt"), LocalDate.of(2014, 9, 18));
		Assignments assign4 = new Assignments(new File("C:\\harini\\day4.txt"), LocalDate.of(2014, 9, 20));
		assertEquals(true, Assignments.add(assign1));
		assertEquals(true, Assignments.add(assign2));
		assertEquals(true, Assignments.add(assign3));
		assertEquals(true, Assignments.add(assign4));
		assertEquals(true, Assignments.remove(assign1));
		
		Assignments.show();
		System.out.println("\n");
		
		
		assertEquals(assign3, Assignments.search());
		
	}

}

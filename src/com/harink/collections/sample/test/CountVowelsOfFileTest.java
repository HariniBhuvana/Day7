package com.harink.collections.sample.test;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.CountVowelsOfFile;



class CountVowelsOfFileTest {

	@Test
	void testCountVowelsandConsonents() {
		CountVowelsOfFile count;
		
		count = CountVowelsOfFile.countVowelsandConsonents("C:\\a\\ab.txt");
		System.out.println(count);
	}

}

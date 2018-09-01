package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import com.harink.collections.sample.WordCount;



class WordCountTest {

	@Test
	void testLineCount() throws IOException {
		assertEquals(16, WordCount.count("C:\\\\a\\\\ab.txt"));
	}

}


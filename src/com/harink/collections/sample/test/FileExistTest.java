package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testExistenceOfFile() {
		File file= new File("C:\\Users\\Harink\\Documents\\New Text Document.txt");
		assertEquals(true,file.exists());
		//assertEqulas(true,file.isFile());
		
		
	}

	

	

}

package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileHandlingQues2Test {

	@Test
	void testFileLineCount() throws IOException {
		File file= new File("C:\\a\\ab.txt");
		assertEquals(true,file.exists());
		int s=0;
		
		try(FileReader fr = new FileReader(file);
			BufferedReader br= new BufferedReader(fr);) {
			while(br.readLine() != null) {
				s++;}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(7,s);
		
		
	}

}

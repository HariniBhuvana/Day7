package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

class FileHandlingQues3Test {

	@Test
	void testWordCount() throws IOException {
		 File file = new File("C:\\\\a\\\\ab.txt");
	        FileInputStream fileStream = new FileInputStream(file);
	        InputStreamReader input = new InputStreamReader(fileStream);
	        BufferedReader reader = new BufferedReader(input);
	         String line;
	        int countWord = 0;
	        int sentenceCount = 0;
	        int characterCount = 0;
	        int whitespaceCount = 0;
	        assertEquals(true,file.exists());
	          
	         
	        while((line = reader.readLine()) != null)
	        {
	            
	            if(!(line.equals("")))
	            {
	            	characterCount += line.length();
	                String[] wordList = line.split("\\s+");
	                countWord += wordList.length;
	                whitespaceCount += countWord -1;
	                String[] sentenceList = line.split("[!?.:]+");
	                sentenceCount += sentenceList.length;
	            }
	        }
	        System.out.println("Total word count = " + countWord);
	        System.out.println("Total number of sentences = " + sentenceCount);
	        System.out.println("Total number of characters = " + characterCount);
	        System.out.println("Total number of whitespaces = " + whitespaceCount);
	        assertEquals(16,countWord);
	    }
	

	}




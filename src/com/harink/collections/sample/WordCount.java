package com.harink.collections.sample;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {
	

	
		public static int count(String string) throws IOException {
			int count = 0;
			try (FileReader fr = new FileReader(string); BufferedReader br = new BufferedReader(fr);) {
				String line;
				String[] stringArray;
				while ((line = br.readLine()) != null) {
					stringArray = line.split("\\s+");
					count = count + stringArray.length;
				}
			}
			return count;
		}
	}

    
    
    
   
      
     
    
   

	

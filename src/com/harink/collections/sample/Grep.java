package com.harink.collections.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Grep {

	public static int checkForString(String fileName, String search) {
		int count=0;
		String lines = null;
		String[] lineArray = null;
		File file = new File(fileName);
		try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
			while ((lines = bufferedReader.readLine().toLowerCase()) != null) {
				lineArray = lines.split("\\s+");
				for(String word : lineArray) {
					if (word.equals(search)) {
						count++;
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(count);
		return count;
	}
}
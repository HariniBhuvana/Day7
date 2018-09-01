package com.harink.collections.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
	public static int countLine(String filePath) {
		int count = 0;
		try (FileReader fileReader = new FileReader(filePath);
				BufferedReader reader = new BufferedReader(fileReader)) {

			while (reader.readLine() != null) {
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;

	}

}
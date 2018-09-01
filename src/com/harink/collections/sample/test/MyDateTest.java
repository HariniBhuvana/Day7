package com.harink.collections.sample.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.harink.collections.sample.MyDate;



class MyDateTest {

	@Test
	void testMyDate() throws FileNotFoundException {
		MyDate d1 = new MyDate(LocalDate.of(2016, 02, 25));
		MyDate d2 = new MyDate(LocalDate.of(2017, 05, 23));
		MyDate d3 = new MyDate(LocalDate.of(2018, 12, 05));

		ArrayList<MyDate> arrayList = new ArrayList<>();
		arrayList.add(d1);
		arrayList.add(d2);
		arrayList.add(d3);

		
		ArrayList<MyDate> newArrayList = new ArrayList<>();
		
		try (FileOutputStream fileOutput = new FileOutputStream("C:\\harini\\ab.ser");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(arrayList);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 

		try (FileInputStream fileInput = new FileInputStream("C:\\harini\\ab.ser");
				ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {
				
				newArrayList = (ArrayList<MyDate>)inputStream.readObject();
				System.out.println(newArrayList);
				
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		assertEquals(true, arrayList.toString().equals(newArrayList.toString()));
	}
}

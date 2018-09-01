package com.harink.collections.sample;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FutureDate {

	private LocalDate localDate;

	public FutureDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FutureDate(String localDate) {
		super();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			this.localDate = LocalDate.parse(localDate, formatter);
		} catch (DateTimeParseException e) {
			System.out.println(e.toString());
		}
	}
	
	public LocalDate futureDate(int daysCount) {
		localDate = localDate.plusDays(daysCount);
		System.out.println(localDate);
		return localDate;
	}

	@Override
	public String toString() {
		return "FutureDate [localDate=" + localDate + "]";
	}
	
	
}

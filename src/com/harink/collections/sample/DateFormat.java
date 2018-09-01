package com.harink.collections.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	private String dateString;
	private Date commonDate;

	public DateFormat() {
		super();
	}

	public DateFormat(String dateString) {
		super();
		this.dateString = dateString;
		try {
			commonDate = new SimpleDateFormat("ddMMyyyy").parse(dateString);
			//System.out.println( new SimpleDateFormat("dd/MM/yyyy").format(commonDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getFormateOne() {
		
		System.out.println( new SimpleDateFormat("dd/MM/yyyy").format(commonDate));
		return new SimpleDateFormat("dd/MM/yyyy").format(commonDate);
	}

	public String getFormateTwo() {
//		String dateFormat = commonDate.getDay() + "," + commonDate.getMonth() + "," + commonDate.getYear();
		System.out.println(new SimpleDateFormat("dd,MMMM,yyyy").format(commonDate));
		return new SimpleDateFormat("dd,MMMM,yyyy").format(commonDate);
	}

	@Override
	public String toString() {
		return "DateFormat [dateString=" + dateString + ", commonDate=" + commonDate + "]";
	}
}
	
	


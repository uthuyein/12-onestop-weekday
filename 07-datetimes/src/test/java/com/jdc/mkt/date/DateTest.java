package com.jdc.mkt.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTest {
	
	@Test
	void testAddRollAndMinusInCalendar() {
		Calendar cl = Calendar.getInstance();
		
		//Plus
		cl.add(Calendar.DATE, 25);
		cl.roll(Calendar.DATE, 40);
		System.out.println(cl.getTime());
		
		//Minus
		cl.add(Calendar.DATE,-20);
		System.out.println(cl.getTime());
		
	}
	
	@Test
	@Disabled
	void testCreateDateFromFormatter() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss SSS");
		Date date = df.parse("11-11-1999 24:23:20 546");	
		System.out.println(date);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		String str = df2.format(date);
		System.out.println(str);
		
	}

	@Test
	@Disabled
	void testCreateDateFromCalendar() {
		Calendar cl1 = Calendar.getInstance();
		Date d1 = cl1.getTime();
		System.out.println(d1);		
	}
	
	@Test
	@Disabled
	@SuppressWarnings("deprecation")
	void testCreateDate() {
		Date date  = new Date();
		System.out.println(date);
		
		Date date2 = new Date(2023, 11, 01);
		System.out.println(date2);		
	}
	
	@Test
	@Disabled
	void testCreateDateWithSetter() {
		Calendar cl2 = Calendar.getInstance();
		cl2.setLenient(true);
		cl2.set(2022,Calendar.AUGUST,22);
		cl2.set(Calendar.MONTH, 12);
		cl2.set(Calendar.DATE, 30);
		System.out.println(cl2.getTime());
	}
	
	
	
	
}

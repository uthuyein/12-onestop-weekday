package com.jdc.mkt.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class DateTimeFormatterTest {

	@Test
	void test() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("'Date :'MM-dd-yyyy 'Time :'hh:mm:ss a");
		LocalDate ld = LocalDate.parse("Date :02-14-1999 Time :04:20:11 AM", df);
		System.out.println(ld);
		
		LocalDateTime lt = LocalDateTime.parse("Date :02-14-1999 Time :04:20:11 AM",df);
		System.out.println(lt);
	}
}

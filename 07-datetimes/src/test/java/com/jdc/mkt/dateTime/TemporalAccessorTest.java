package com.jdc.mkt.dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TemporalAccessorTest {

	@Test
	void adjustDateTimeTest() {
		var ldt = LocalDateTime.now();
		
		//using Period which is a grandChild of TemporalAmount
		
		var ldt1 = ldt.plus(Period.ofDays(5));	
		System.out.println(ldt1);
		
		//using fluent method
		var ldt2 = ldt.minusDays(10);
		System.out.println(ldt2);
		
		//using LocalTime which is a grandChild of TemporalAdjustor
		var ldt3 = ldt.with(LocalTime.of(4, 30));
		System.out.println(ldt3);
		
		//using fluent method
		var ldt4 = ldt.withHour(4).withMinute(30);
		System.out.println(ldt4);
		
	}
	
	
	@Test
	@Disabled
	void setDateTimeTest() {	
		//LocalDateTime is a grandChild of temporalAccessor
		var ldt = LocalDateTime.from(LocalDateTime.now());
		System.out.println(ldt);
		
		var ldt1 = LocalDateTime.of(2022, 12, 20, 10, 20);
		System.out.println(ldt1);
			
	}
	
	@Test
	@Disabled
	void getDateTimeWithTemporalFieldOrFluentMethod() {
		LocalDateTime ldt = LocalDateTime.now();
		
		//using ChronoField which is a child of TemporalField
		int dom = ldt.get(ChronoField.MONTH_OF_YEAR);
		int dow = ldt.get(ChronoField.DAY_OF_MONTH);
		int doy = ldt.get(ChronoField.YEAR);
		System.out.println(dow+"\t"+dom+"\t"+doy);
		
		//using fluent method
		int day = ldt.getDayOfMonth();
		int month = ldt.getMonthValue();
		int year = ldt.getYear();
		System.out.println(day+" "+month+" "+year);
	}
}

package com.jdc.mkt.dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DateTimeApiTest {
	
	@Test
	void testInstantToHuman() {
		Instant i1 = Instant.now();
		ZonedDateTime zdt = i1.atZone(ZoneId.of("Asia/Yangon"));
		System.out.println(zdt);
		OffsetDateTime odt = i1.atOffset(ZoneOffset.ofHours(5));
		System.out.println(odt);
	}
	
   @Test
   @Disabled
   // must hv time and zone or offset
	void testDateHumanToInstant() {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		 Instant i1 = date.toInstant(ZoneOffset.of("+06:30")); 
		 System.out.println(i1);
		 
		 Instant i2 = zdt.toInstant();
		 System.out.println(i2);
		 
		 Instant i3 = odt.toInstant();
		 System.out.println(i3);
	}

}


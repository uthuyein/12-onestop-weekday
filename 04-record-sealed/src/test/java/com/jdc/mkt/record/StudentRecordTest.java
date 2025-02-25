package com.jdc.mkt.record;

import org.junit.jupiter.api.Test;

public class StudentRecordTest {

	@Test
	void test() {
		StudentRecord rec = new StudentRecord(1, null, 10);
		System.out.println(rec.id());
		System.out.println(rec.name());
		System.out.println(rec.age());
	}
}

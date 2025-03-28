package com.jdc.mkt.test.fatchAndOptional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Department;
import com.jdc.mkt.entity.Employee;
import com.jdc.mkt.test.JpaFactory;

public class FatchTest extends JpaFactory{

	@Test
	@Disabled
	void testInOne() {
		var em = emf.createEntityManager();
		var emp = em.find(Employee.class, 1);
		System.out.println(emp.getAddress().getCity());
		em.close();
	}
	
	@Test
	void testInMany() {
		var em = emf.createEntityManager();
		var dep = em.find(Department.class, 1);
		System.out.println(dep.getName()+"/t"+dep.getEmployees().size());
	}
}

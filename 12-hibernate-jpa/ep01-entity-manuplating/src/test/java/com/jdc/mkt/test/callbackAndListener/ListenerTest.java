package com.jdc.mkt.test.callbackAndListener;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Department;
import com.jdc.mkt.entity.Employee;
import com.jdc.mkt.test.JpaFactory;

public class ListenerTest extends JpaFactory{

	@Test
	@Order(1)
	void departmentPersistTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		var dep = new Department("Services Teams");
		
		dep.addEmployee(new Employee("Ko Pauk",LocalDate.of(1986, 04, 20)));
		dep.addEmployee(new Employee("Ko Swe Oo",LocalDate.of(1990, 01, 06)));
		
		em.persist(dep);
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	@Order(2)
	void departmentMergeTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		var dep = em.find(Department.class, 4);
		
		dep.setName("Test dep");
		
		var emp = dep.getEmployees().get(0);
		emp.setName("Test");

		em.getTransaction().commit();
		em.close();
	}
}

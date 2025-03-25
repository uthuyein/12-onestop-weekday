package com.jdc.mkt.test.manipulate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Employee;
import com.jdc.mkt.test.JpaFactory;

import jakarta.persistence.PersistenceException;

public class StateChangeTest extends JpaFactory{
	
	@Test
	@Order(3)
	void removeTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//To be managed
		var emp = em.find(Employee.class, 1);
		
		//To be detached from managed
		em.detach(emp);
		assertFalse(em.contains(emp));
		
		assertThrows(IllegalArgumentException.class, () -> em.remove(emp));
		
		//To be managed form detached
		var newEmp = em.merge(emp);
		assertTrue(em.contains(newEmp));
		
		//To be removed from managed
		em.remove(newEmp);
		assertFalse(em.contains(newEmp));
		
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	@Disabled
	@Order(2)
	void mergeTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//To Be Transient State
		var emp = new Employee("PeterPan",LocalDate.of(1993, 11, 22));
				
		//To Be Manage from Transient
		 var newEmp = em.merge(emp);
		 assertFalse(em.contains(emp));
		 assertTrue(em.contains(newEmp));
		
		//To Be Detached from Manage
		 em.detach(newEmp);
		 assertFalse(em.contains(newEmp));
		 
		 //To Be Managed from Detached
		 var anotherEmp = em.merge(newEmp);
		 assertTrue(em.contains(anotherEmp));
		 
		//To Be Removed State from managed
		 em.remove(anotherEmp);
		 assertFalse(em.contains(anotherEmp));
		 
		 assertThrows(IllegalArgumentException.class, () -> em.merge(anotherEmp));
		 	
		em.getTransaction().commit();
		em.close();
	}

	@Test
	@Disabled
	@Order(1)
	void persistTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		//To Be Transient State
		var emp = new Employee("PeterPan",LocalDate.of(1992, 02, 22));
		
		//To Be Manage State
		em.persist(emp);
		assertTrue(em.contains(emp));
		
		//To Be Removed State
		em.remove(emp);
		assertFalse(em.contains(emp));
		
		//To Be Managed State
		em.persist(emp);
		assertTrue(em.contains(emp));
		
		//To Be Detached State
		em.detach(emp);
		assertFalse(em.contains(emp));
		
		//To Be Managed State	
		assertThrows(PersistenceException.class, () -> em.persist(emp));
		
		em.getTransaction().commit();
		em.close();
		
	}
}

package com.jdc.mkt.test.manipulate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.entity.Department;
import com.jdc.mkt.test.JpaFactory;

import jakarta.persistence.EntityNotFoundException;

public class ManiplatingTest extends JpaFactory{

	@Order(1)
	@ParameterizedTest
	@CsvSource(delimiter = ':',value = {
			"1:1",
			"2:2"
	})
	void findTest(int id,int res) {
		/* using find method */
		var em = emf.createEntityManager();
		var dep = em.find(Department.class, id);
		assertEquals(res, dep.getId());	
		em.close();
		System.out.println("Dep Name :::::::"+ dep.getName());
		
		//If can't find,will retrun null
		//assertNull(em.find(Department.class, 4));
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource(delimiter = ':',value = {
			"1:1",
			"2:2"
	})
	void getReferenceTest(int id,int res) {
		/* using getReference method */
		var em = emf.createEntityManager();
		var dep = em.getReference(Department.class, id);
		assertEquals(res, dep.getId());
		em.close();
		assertThrows(LazyInitializationException.class, () -> dep.getName());
	
//		var dep1 = em.getReference(Department.class, 4);		
//		assertThrows(EntityNotFoundException.class, () -> dep1.getName());
	}
}

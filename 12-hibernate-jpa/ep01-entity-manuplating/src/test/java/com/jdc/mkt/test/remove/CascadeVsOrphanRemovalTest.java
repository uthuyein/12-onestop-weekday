package com.jdc.mkt.test.remove;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.entity.Department;
import com.jdc.mkt.test.JpaFactory;

public class CascadeVsOrphanRemovalTest extends JpaFactory {

	@Test
	void OrphanTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		var dep = em.find(Department.class, 1);
//		var list = dep.getEmployees();
//		list.remove(0);
		
		em.remove(dep);
		
		em.getTransaction().commit();
	}
}

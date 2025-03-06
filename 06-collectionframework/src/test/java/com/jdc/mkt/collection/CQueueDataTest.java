package com.jdc.mkt.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CQueueDataTest extends JunitConfig {

	private Queue<String> queue ;
	
	@Test
	@Order(4)
	void queryElementVsPeekTest() {
		assertEquals("Andrew", queue.element());
		assertEquals("Andrew", queue.peek());
		queue.clear();
		
		assertThrows(NoSuchElementException.class,() -> queue.element());
		assertNull(queue.peek());
		
	}
	
	@Test
	@Order(3)
	void queueRemoveVsPollTest() {
		//FIFO
		
		assertEquals("Andrew", queue.remove());
		assertEquals(3, queue.size());
		
		assertEquals("John", queue.poll());
		assertEquals(2, queue.size());
		
		queue.poll();
		queue.remove();
		assertEquals(0, queue.size());
		
		assertThrows(NoSuchElementException.class,() -> queue.remove());
		assertNull(queue.poll());
	}
	
	@Test
	@Order(2)
	void queueAddVsOfferTest() {
		
		assertEquals(4, queue.size());
		assertThrows(IllegalStateException.class,() -> queue.add("Jack"));
		
		queue.offer("Jack");
		assertEquals(4, queue.size());		
	}
	
	@BeforeEach
	void queueAddData() {
		queue = data.useQueue("block", 4);
		queue.addAll(List.of("Andrew","John"));
		queue.add("William");
		queue.offer("James");
	}
	
	
}

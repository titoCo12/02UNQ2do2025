package ar.edu.unq.po2.tp3.test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.*;


class CounterTestCase {
	
	private Counter counter;
	
	@BeforeEach
	public void SetUp() throws Exception {
		
		this.counter = new Counter();
		
		counter.agregarNum(1);
		counter.agregarNum(3);
		counter.agregarNum(5);
		counter.agregarNum(7);
		counter.agregarNum(9);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(1);
		counter.agregarNum(4);
		
	}
	
	
	
	@Test
	void testNumerosPares() {
		assertEquals(counter.contarPares(), 1);;
	}

}

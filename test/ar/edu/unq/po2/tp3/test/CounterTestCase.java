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
	
	
	// Verificar la cantidad de pares y impares
	
	@Test
	void testNumerosPares() {
		assertEquals(1, counter.contarPares());
		assertEquals(9, counter.contarImpares());
	}
	
	
	// Verificar la cantidad de multiplos de un numero (3)
	
	@Test
	void testMultiplosDe() {
		assertEquals(2,counter.multiplosDe(3));
	}

	
	// Verificar el multiplo mas grande entre dos numeros (2, 9)
	
	@Test
	void testMultiploMasGrandeDe() {
		assertEquals(990 ,counter.multiploMasGrandeDe(2, 9));
	}
	
}

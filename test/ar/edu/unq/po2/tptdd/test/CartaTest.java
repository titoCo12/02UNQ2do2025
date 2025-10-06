package ar.edu.unq.po2.tptdd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tptdd.*;


class CartaTest {

	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	private Carta c6;
	private Carta c7;
	private Carta c8;
	private Carta c9;
	private Carta c10;
	private Carta c11;
	private Carta c12;
	
	
	@BeforeEach
	public void setUp() {
		c1 = new Carta(1, "P");
		c2 = new Carta(2, "T");
		c3 = new Carta(3, "D");
		c4 = new Carta(4, "P");
		c5 = new Carta(5, "C");
		c6 = new Carta(6, "P");
		c7 = new Carta(7, "C");
		c8 = new Carta(8, "D");
		c9 = new Carta(9, "P");
		c10 = new Carta(10, "D");
		c11 = new Carta(11, "D");
		c12 = new Carta(12, "T");
		
	}
	
	@Test
	void testDevolverValor() {
		
		//Exercise
		int v1 = c1.getValor();
		int v2 = c2.getValor();
		int v3 = c3.getValor();
		int v4 = c4.getValor();
		int v5 = c5.getValor();
		int v6 = c6.getValor();
		int v7 = c7.getValor();
		int v8 = c8.getValor();
		int v9 = c9.getValor();
		int v10 = c10.getValor();
		int v11 = c11.getValor();
		int v12 = c12.getValor();
		
		//Verify
		assertEquals(v1, 1);
		assertEquals(v2, 2);
		assertEquals(v3, 3);
		assertEquals(v4, 4);
		assertEquals(v5, 5);
		assertEquals(v6, 6);
		assertEquals(v7, 7);
		assertEquals(v8, 8);
		assertEquals(v9, 9);
		assertEquals(v10, 10);
		assertEquals(v11, 11);
		assertEquals(v12, 12);
		
	}
	
	void testDevolverPalo() {
				
		//Exercise
		String pica = c1.getPalo();
		String trebol = c2.getPalo();
		String diamante = c3.getPalo();
		String corazon = c5.getPalo();
		
		//Verify
		assertEquals(pica, "P");
		assertEquals(trebol, "T");
		assertEquals(diamante, "D");
		assertEquals(corazon, "C");
	}
	
	
	void testMayorValor() {
		
		//Excercise 
		boolean casoSi = c10.esMayorQue(c5);
		boolean casoNo = c2.esMayorQue(c4);
		
		//Verify
		assertEquals(casoSi, true);
		assertEquals(casoNo, false);
	}

	
	void testMismoPalo() {
		
		//Excercise 
		boolean casoSi = c1.tieneMismoPaloQue(c4);
		boolean casoNo = c5.tieneMismoPaloQue(c8);
	
		//Verify
		assertEquals(casoSi, true);
		assertEquals(casoNo, false);
		
	}
}

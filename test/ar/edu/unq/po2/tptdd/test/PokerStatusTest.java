package ar.edu.unq.po2.tptdd.test;
import ar.edu.unq.po2.tptdd.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {

	private PokerStatus pokerStatus;
	
	//Setup
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus(); 
	}
	
	@Test
	void testVerificarManosConPoker() {
		
		//Setup
		//Carta diferente
		Carta cdf = new Carta(5, "D");
		
		//Para poker caso 1 (poker de 7)
		Carta c71 = new Carta(7, "T");
		Carta c72 = new Carta(7, "D");
		Carta c73 = new Carta(7, "C");
		Carta c74 = new Carta(7, "P");
		
		//Para poker caso 2 (poker de 12 / Q)
		Carta cQ1 = new Carta(12, "T");
		Carta cQ2 = new Carta(12, "D");
		Carta cQ3 = new Carta(12, "C");
		Carta cQ4 = new Carta(12, "P");
		
		//Exercise
		String poker7 = pokerStatus.verificar(c71, c72, c73, c74, cdf);
		String pokerQ = pokerStatus.verificar(cQ1, cQ2, cQ3, cdf, cQ4);
		
		//Verify
		assertEquals(poker7, "Poker");
		assertEquals(pokerQ, "Poker");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}

	
	@Test
	void testVerificarManosConTrio() { 

		//Setup
		//Cartas diferentes
		Carta cdf1 = new Carta(5, "D");
		Carta cdf2 = new Carta(10, "T");
		
		//Para trio caso 1 (trio de 7)
		Carta c71 = new Carta(7, "T");
		Carta c72 = new Carta(7, "D");
		Carta c73 = new Carta(7, "C");
		
		//Para trio caso 2 (trio de 12 / Q)
		Carta cQ1 = new Carta(12, "T");
		Carta cQ2 = new Carta(12, "D");
		Carta cQ3 = new Carta(12, "C");
		
		//Exercise
		String trio7 = pokerStatus.verificar(c71, c72, c73, cdf1, cdf2);
		String trioQ = pokerStatus.verificar(cQ1, cdf1, cQ3, cQ2, cdf2);
		
		//Verify
		assertEquals(trio7, "Trio");
		assertEquals(trioQ, "Trio");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}

	
	@Test
	void testVerificarManosConColor() { 
		
		//Setup
		//Para color caso 1 (color de Pica)
		Carta cP1 = new Carta(7, "P");
		Carta cP2 = new Carta(10, "P");
		Carta cP3 = new Carta(9, "P");
		Carta cP4 = new Carta(2, "P");
		Carta cP5 = new Carta(6, "P");
		
		//Para color caso 2 (color de Trebol)
		Carta cT1 = new Carta(12, "T");
		Carta cT2 = new Carta(9, "T");
		Carta cT3 = new Carta(8, "T");
		Carta cT4 = new Carta(1, "T");
		Carta cT5 = new Carta(4, "T");
		
		//Exercise
		String colorP = pokerStatus.verificar(cP1,cP2,cP3,cP4,cP5);
		String colorT = pokerStatus.verificar(cT1,cT2,cT3,cT4,cT5);
		
		//Verify
		assertEquals(colorP, "Color");
		assertEquals(colorT, "Color");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}
	
	
	@Test
	void testVerificarManosConNada() {
		
		//Setup
		//Para caso Nada
		Carta cN1 = new Carta(7, "P");
		Carta cN2 = new Carta(10, "P");
		Carta cN3 = new Carta(9, "C");
		Carta cN4 = new Carta(10, "C");
		Carta cN5 = new Carta(6, "T");
		
		//Exercise
		String casoNada = pokerStatus.verificar(cN1,cN2,cN3,cN4,cN5);
		
		//Verify
		assertEquals(casoNada, "Nada");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)	
	}


	

	
}

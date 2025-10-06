package ar.edu.unq.po2.tptdd.test;
import ar.edu.unq.po2.tptdd.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class PokerStatusTest {

	private PokerStatus pokerStatus;
	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	
	//Setup
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus(); 
		this.c1 = mock(Carta.class);
		this.c2 = mock(Carta.class);
		this.c3 = mock(Carta.class);
		this.c4 = mock(Carta.class);
		this.c5 = mock(Carta.class);
	}
	
	
	@Test
	void testVerificarManoConPoker() {
		
		//Setup
		when(c1.getValor()).thenReturn(5);
		when(c1.getPalo()).thenReturn("P");
		when(c2.getValor()).thenReturn(7);
		when(c2.getPalo()).thenReturn("P");
		when(c3.getValor()).thenReturn(7);
		when(c3.getPalo()).thenReturn("C");
		when(c4.getValor()).thenReturn(7);
		when(c4.getPalo()).thenReturn("D");
		when(c5.getValor()).thenReturn(7);
		when(c5.getPalo()).thenReturn("T");
			
		//Exercise
		String poker7 = pokerStatus.verificar(c1, c2, c3, c4, c5);
		
		//Verify
		assertEquals(poker7, "Poker");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}


	@Test
	void testVerificarManosConTrio() { 

		//Setup
		when(c1.getValor()).thenReturn(7);
		when(c1.getPalo()).thenReturn("P");
		when(c2.getValor()).thenReturn(7);
		when(c2.getPalo()).thenReturn("T");
		when(c3.getValor()).thenReturn(5);
		when(c3.getPalo()).thenReturn("P");
		when(c4.getValor()).thenReturn(10);
		when(c4.getPalo()).thenReturn("P");
		when(c5.getValor()).thenReturn(7);
		when(c5.getPalo()).thenReturn("C");
		
		//Exercise
		String trio7 = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(trio7, "Trio");
	
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}

	
	@Test
	void testVerificarManosConColor() { 
		
		//Setup
		when(c1.getValor()).thenReturn(7);
		when(c1.getPalo()).thenReturn("P");
		when(c2.getValor()).thenReturn(2);
		when(c2.getPalo()).thenReturn("P");
		when(c3.getValor()).thenReturn(5);
		when(c3.getPalo()).thenReturn("P");
		when(c4.getValor()).thenReturn(10);
		when(c4.getPalo()).thenReturn("P");
		when(c5.getValor()).thenReturn(6);
		when(c5.getPalo()).thenReturn("P");
		
		//Exercise
		String colorP = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(colorP, "Color");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}
	
	
	@Test
	void testVerificarManosConNada() {
		
		//Setup
		when(c1.getValor()).thenReturn(7);
		when(c1.getPalo()).thenReturn("P");
		when(c2.getValor()).thenReturn(7);
		when(c2.getPalo()).thenReturn("T");
		when(c3.getValor()).thenReturn(2);
		when(c3.getPalo()).thenReturn("P");
		when(c4.getValor()).thenReturn(8);
		when(c4.getPalo()).thenReturn("C");
		when(c5.getValor()).thenReturn(3);
		when(c5.getPalo()).thenReturn("P");
		
		//Exercise
		String casoNada = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(casoNada, "Nada");
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)	
	}

}

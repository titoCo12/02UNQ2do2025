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
		when(c1.getValor()).thenReturn(ValorCarta.CINCO);
		when(c1.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c2.getValor()).thenReturn(ValorCarta.SIETE);
		when(c2.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c3.getValor()).thenReturn(ValorCarta.SIETE);
		when(c3.getPalo()).thenReturn(PaloCarta.CORAZONES);
		when(c4.getValor()).thenReturn(ValorCarta.SIETE);
		when(c4.getPalo()).thenReturn(PaloCarta.DIAMANTES);
		when(c5.getValor()).thenReturn(ValorCarta.SIETE);
		when(c5.getPalo()).thenReturn(PaloCarta.TREBOLES);
			
		//Exercise
		Jugada poker7 = pokerStatus.verificar(c1, c2, c3, c4, c5);
		
		//Verify
		assertEquals(poker7.getTipo(), TipoMano.POKER);
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}


	@Test
	void testVerificarManosConTrio() { 

		//Setup
		when(c1.getValor()).thenReturn(ValorCarta.SIETE);
		when(c1.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c2.getValor()).thenReturn(ValorCarta.SIETE);
		when(c2.getPalo()).thenReturn(PaloCarta.TREBOLES);
		when(c3.getValor()).thenReturn(ValorCarta.CINCO);
		when(c3.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c4.getValor()).thenReturn(ValorCarta.DIEZ);
		when(c4.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c5.getValor()).thenReturn(ValorCarta.SIETE);
		when(c5.getPalo()).thenReturn(PaloCarta.CORAZONES);
		
		//Exercise
		Jugada trio7 = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(trio7.getTipo(), TipoMano.TRIO);
	
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}

	
	@Test
	void testVerificarManosConColor() { 
		
		//Setup
		when(c1.getValor()).thenReturn(ValorCarta.SIETE);
		when(c1.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c2.getValor()).thenReturn(ValorCarta.DOS);
		when(c2.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c3.getValor()).thenReturn(ValorCarta.CINCO);
		when(c3.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c4.getValor()).thenReturn(ValorCarta.DIEZ);
		when(c4.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c5.getValor()).thenReturn(ValorCarta.SEIS);
		when(c5.getPalo()).thenReturn(PaloCarta.PICAS);
		
		//Exercise
		Jugada colorP = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(colorP.getTipo(), TipoMano.COLOR);
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)
	}
	
	
	@Test
	void testVerificarManosConNada() {
		
		//Setup
		when(c1.getValor()).thenReturn(ValorCarta.SIETE);
		when(c1.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c2.getValor()).thenReturn(ValorCarta.SIETE);
		when(c2.getPalo()).thenReturn(PaloCarta.TREBOLES);
		when(c3.getValor()).thenReturn(ValorCarta.DOS);
		when(c3.getPalo()).thenReturn(PaloCarta.PICAS);
		when(c4.getValor()).thenReturn(ValorCarta.OCHO);
		when(c4.getPalo()).thenReturn(PaloCarta.CORAZONES);
		when(c5.getValor()).thenReturn(ValorCarta.TRES);
		when(c5.getPalo()).thenReturn(PaloCarta.PICAS);
		
		//Exercise
		Jugada casoNada = pokerStatus.verificar(c1,c2,c3,c4,c5);
		
		//Verify
		assertEquals(casoNada.getTipo(), TipoMano.NADA);
		
		//En este caso no hay Teardown manual por asi decirlo (cerrar archivos o conexiones)	
	}

}

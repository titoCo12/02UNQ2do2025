package ar.edu.unq.po2.tpState.test;
import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unq.po2.tpState.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MaquinaDeJuegoTest {
	private MaquinaDeJuego maquina;
	
	
	@BeforeEach
	public void SetUp() {
		this.maquina = new MaquinaDeJuego();
	}
	
	// EstadoInicial
	@Test
	void testInicialFicha() {
		//Al encenderse una maquina, el estado deberia ser "EstadoInicial", y ingresar fichas
		//  no deberia hacer nada
		
		assertTrue(maquina.getEstado() instanceof EstadoInicial);

		
		maquina.ingresoDeFicha();
		
		assertTrue(maquina.getEstado() instanceof EstadoInicial);
	}

	@Test 
	void testInicialBotonInicio() {
	
		maquina.botonDeInicio();
		
		assertTrue(maquina.getEstado() instanceof EstadoCartelFichas);
	}
	
	
	//EstadoCartelFichas
	@Test 
	void testCartelBotonInicio() {
		maquina.cambiarEstado(new EstadoCartelFichas(maquina));
		
		maquina.botonDeInicio();
		
		assertTrue(maquina.getEstado() instanceof EstadoCartelFichas);
	}
	
	@Test 
	void testCartelFichas() {
		maquina.cambiarEstado(new EstadoCartelFichas(maquina));
		
		maquina.ingresoDeFicha();
		
		assertTrue(maquina.getEstado() instanceof EstadoUnJugador);
	}
	
	
	//EstadoUnJugador
	@Test
	void testUnJugadorFichas() {
		maquina.cambiarEstado(new EstadoUnJugador(maquina));
		
		maquina.ingresoDeFicha();
		
		assertTrue(maquina.getEstado() instanceof EstadoDosJugadores);
	}
	
	@Test
	void testUnJugadorInicio() {
		maquina.cambiarEstado(new EstadoUnJugador(maquina));
		
		maquina.botonDeInicio();
		
		assertTrue(maquina.getEstado() instanceof EstadoJugando);
	}
	
	
	//EstadoDosJugadores
	@Test
	void testDosJugadorFichas() {
		maquina.cambiarEstado(new EstadoDosJugadores(maquina));
		
		maquina.ingresoDeFicha();
		
		assertTrue(maquina.getEstado() instanceof EstadoDosJugadores);
	} 
	
	@Test
	void testDosJugadorInicio() {
		maquina.cambiarEstado(new EstadoDosJugadores(maquina));
		
		maquina.botonDeInicio();
		
		assertTrue(maquina.getEstado() instanceof EstadoJugando);
	} 
	
}

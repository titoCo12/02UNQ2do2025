package ar.edu.unq.po2.tpStrategy.test;
import ar.edu.unq.po2.tpStrategy.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncriptadorNaiveTest {

	private EncriptadorNaive encriptador;
	private String palabra;
	
	void setUp() {
		this.encriptador = new EncriptadorNaive();
	}
	
	@Test
	void testEncriptarVocales() {
		this.palabra = "HolaMundo";
		String encriptado = encriptador.encriptar(palabra, new EncriptacionVocales());
		
		assertEquals("HuleMandu", encriptado);
	}
	
	void testDesencriptarVocales() {
		this.palabra = "HuleMandu";
		String desencriptado = encriptador.desencriptar(palabra, new EncriptacionVocales());
		
		assertEquals("HolaMundo", desencriptado);
	}
	
	void testEncriptarNumeros() {
		this.palabra = "HolaMundo";
		String encriptado = encriptador.encriptar(palabra, new EncriptacionNumeros());
		
		assertEquals("8,16,12,1,13,22,14,4,16", encriptado);
	}
	
	void testDesencriptarNumeros() {
		this.palabra = "8,16,12,1,13,22,14,4,16";
		String desencriptado = encriptador.desencriptar(palabra, new EncriptacionNumeros());
		
		assertEquals("holamundo", desencriptado);
	}

}

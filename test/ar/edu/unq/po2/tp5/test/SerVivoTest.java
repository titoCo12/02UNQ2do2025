package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import ar.edu.unq.po2.tp5.*;



public class SerVivoTest {

	private Persona marcos;
	private Persona ariel;
	private Mascota butcher;
	private Mascota pancho;
	private Collection<SerVivo> listaDeSeresVivos;
	
	@BeforeEach
	public void setUp() {
		marcos = new Persona("Marcos", LocalDate.of(2000, 06, 10));
		ariel = new Persona("Ariel", LocalDate.of(1998, 05, 12));
		butcher = new Mascota("Butcher", "Callejero");
		pancho = new Mascota("Pancho", "Labrador");
		listaDeSeresVivos = new ArrayList<SerVivo>();
		
		
		listaDeSeresVivos.add(ariel);
		listaDeSeresVivos.add(marcos);
		listaDeSeresVivos.add(butcher);
		listaDeSeresVivos.add(pancho);
		
	}
	
	@Test
	public void testListarNombres() {
		
		for (SerVivo sv:listaDeSeresVivos) {
			System.out.println(sv.getName());
		}
		
	}

}

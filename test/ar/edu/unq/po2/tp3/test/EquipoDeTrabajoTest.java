package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.*;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo;
	private Persona marcos;
	private Persona ariel;
	private Persona maria;
	
	
	@BeforeEach
	public void SetUp() throws Exception {
		
		marcos = new Persona("Marcos", LocalDate.of(2004, 06, 15)); // 21
		ariel = new Persona("Ariel", LocalDate.of(2000, 06, 15));   // 25
		maria = new Persona("Maria", LocalDate.of(1990, 06, 15));   // 35
		
		equipo = new EquipoDeTrabajo("Equipazo", new ArrayList<>());
		equipo.agregarIntegrante(marcos);
		equipo.agregarIntegrante(ariel);
		equipo.agregarIntegrante(maria);
		
	}
	
	
	// Promedio: 31 (redondeado a int)
	@Test
	public void test() {
		assertEquals(27, equipo.edadPromedio());
	}

}

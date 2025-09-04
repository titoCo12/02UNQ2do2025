package ar.edu.unq.po2.tp2.test;
import ar.edu.unq.po2.tp2.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class tp2Test {

	private Empresa arcor;
	
	/*
	 * SetUp
	 * */
	
	@BeforeEach
	public void SetUp() throws Exception{
		
		EmpleadoPermanente marcos = new EmpleadoPermanente("Marcos", "Quilmes", true, 
				LocalDate.of(2004, 06, 15), 2000.0, 10, 2);
		
		EmpleadoTemporal ariel = new EmpleadoTemporal("Ariel", "Varela", false, 
				LocalDate.of(2020, 07, 10), 1200.0, LocalDate.of(2021, 02, 01), 3);
		
		EmpleadoContratado maria = new EmpleadoContratado("Maria", "Berazategui", true,
				LocalDate.of(2022, 06, 02), 1600.0, 25612, "Efectivo");
		
		
		arcor = new Empresa("Arcor", 123);
		
		arcor.contratarEmpleado(marcos);
		arcor.contratarEmpleado(ariel);
		arcor.contratarEmpleado(maria);
	}
	
	/*
	 * Tests para corroborar calculo total de sueldos 
	 * y liquidacion de sueldos exitosa 
	 */
	
	@Test
	public void testCalcularTotalDeNeto() {
		
		/* Totales esperados de cada empleado
		 *  
		 * Marcos: 2135
		 * Ariel:
		 * Maria:
		 * 
		 */
		
		double totalNeto = arcor.totalSueldoNeto();
		assertEquals(totalNeto, 2135.0);
		fail("Not yet implemented");
	}

}

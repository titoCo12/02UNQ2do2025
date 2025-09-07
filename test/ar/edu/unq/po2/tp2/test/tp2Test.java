package ar.edu.unq.po2.tp2.test;
import ar.edu.unq.po2.tp2.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class tp2Test {

	private Empresa arcor;
	private EmpleadoPermanente marcos;
	private EmpleadoTemporal ariel;
	private EmpleadoContratado maria;
	
	/*
	 * SetUp
	 * */
	
	@BeforeEach
	public void SetUp() throws Exception{
		
		 marcos = new EmpleadoPermanente("Marcos", "Quilmes", true, 
				LocalDate.of(2004, 06, 15), 2000.0, 10, 2);
		
		ariel = new EmpleadoTemporal("Ariel", "Varela", false, 
				LocalDate.of(2002, 07, 10), 1200.0, LocalDate.of(2021, 02, 01), 3);
		
		maria = new EmpleadoContratado("Maria", "Berazategui", true,
				LocalDate.of(2022, 06, 02), 1600.0, 25612, "Efectivo");
		
		
		arcor = new Empresa("Arcor", 123);
		
		arcor.contratarEmpleado(marcos);
		arcor.contratarEmpleado(ariel);
		arcor.contratarEmpleado(maria);
	}
	
	/*
	 * Test para corroborar calculo total de sueldos 
	 * y liquidacion de sueldos  
	 */
	
	@Test
	public void testCalcularTotalDeNeto() {
		
		/* Esperados de cada empleado
		 *  
		 * Marcos: 2135
		 * Ariel: 1065
		 * Maria: 1550
		 * 
		 * Total : 4750
		 * 
		 */
		
		double marcosNeto = marcos.sueldoNeto();
		assertEquals(2135.0, marcosNeto);
		System.out.println("Marcos tiene el sueldo neto esperado");
		
		
		double arielNeto = ariel.sueldoNeto();
		assertEquals(1065.0, arielNeto);
		System.out.println("Ariel tiene el sueldo neto esperado");

		
		double mariaNeto = maria.sueldoNeto();
		assertEquals(1550.0, mariaNeto);
		System.out.println("Maria tiene el sueldo neto esperado");
		
		
		double totalNeto = arcor.totalSueldoNeto();
		assertEquals(4750.0, totalNeto);
		System.out.println("El total de sueldo neto de la empresa es el esperado");

		
	}
	
	/*
	 * Test para corroborar la liquidacion de sueldos
	 */

	@Test
	public void testCalcularLiquidacionSueldos() {
		
		System.out.println("La empresa tiene " + arcor.getEmpleados().size()
				+ " empleados");
		
		int cant = arcor.getRecibos().size();
		assertEquals(0, cant);
		System.out.println("Antes de la liquidacion, la empresa tiene " + cant 
				+ " recibos");

		arcor.liquidacionSueldos();
		
		cant = arcor.getRecibos().size();
		assertEquals(3, cant);
		System.out.println("Despues de la liquidacion, la empresa tiene " + cant 
				+ " recibos");
		
		System.out.println("----------------------------------------------------");
		
	}
	
}

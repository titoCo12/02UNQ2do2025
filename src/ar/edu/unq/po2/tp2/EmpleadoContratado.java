package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

import ar.edu.unq.po2.tp2.*;


public class EmpleadoContratado extends Empleado {

	private int numeroContrato;
	private String medioDePago;
	
	
	public EmpleadoContratado(String nombre, String direccion, Boolean esConyuge, 
			LocalDate fechaNacimiento, double sueldoBasico, int numeroContrato,
			String medioDePago) {
		super(nombre, direccion, esConyuge, fechaNacimiento, sueldoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}
	
	
	@Override
	public double retencionesTotal() {
		return this.gastosContractuales();
	}
	
	
	public double sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.gastosContractuales();
	}
	
	
	public void agregarDesgloseConceptos(Recibo recibo) {
		recibo.agregarConcepto(new Concepto("Gastos administrativos contractuales", 
				this.gastosContractuales()));
	}
	
	
	public double gastosContractuales() {
		return 50;
	}
	
	public double obraSocial() {
		return 0;
	}
	
	public double aportesJubilatorios() {
		return 0;
	}
	
	public int getNumeroContrato() {
		return this.numeroContrato;
	}
	
	public String medioDePago() {
		return this.medioDePago;
	}
	
}

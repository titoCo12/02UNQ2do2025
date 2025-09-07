package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.time.*;


public class EmpleadoPermanente extends Empleado{

	
	private int antiguedad;
	private int cantHijos;
	
	public EmpleadoPermanente(String nombre, String direccion, Boolean esConyuge, 
			LocalDate fechaNacimiento, double sueldoBasico, int antiguedad, int cantHijos) {
		super(nombre, direccion, esConyuge, fechaNacimiento, sueldoBasico);
		this.antiguedad = antiguedad;
		this.cantHijos = cantHijos;
	}
	

	@Override
	public void agregarDesgloseConceptos(Recibo recibo) {
		recibo.agregarConcepto(new Concepto("Salario familiar", this.salarioFamiliar()));
		recibo.agregarConcepto(new Concepto("Asignacion por hijo", this.asignacionPorHijo()));
		recibo.agregarConcepto(new Concepto("Asignacion por conyuge", this.asignacionPorConyuge()));
	}
	
	
	@Override
	public double aportesJubilatorios() {
		return (15.0/100.0) * this.sueldoBruto();
	}
	
	
	@Override
	public double obraSocial() {
		return ((10.0/100.0) * this.sueldoBruto()) + (20 * this.cantHijos);
	}
	
	
	public double asignacionPorHijo() {
		return 150 * this.cantHijos;
	}
	
	
	public double asignacionPorConyuge() {
		if (this.getEsConyuge()) {
			return 100;
		}
		else { return 0;}
	}
	
	
	public double salarioFamiliar() {
		double total = this.asignacionPorHijo();
		total += this.asignacionPorConyuge();
		total += this.antiguedad * 50;
		return total;
	}
	
	
	@Override
	public double sueldoBruto() {
		double total = this.getSueldoBasico();
		total += this.salarioFamiliar();
		return total;
	}
	
	
	public int getCantHijos() {
		return this.cantHijos;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
}

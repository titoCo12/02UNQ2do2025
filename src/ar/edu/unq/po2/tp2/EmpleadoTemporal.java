package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.time.*;


public class EmpleadoTemporal extends Empleado{

	private LocalDate fechaFin;
	private int horasExtra;
	
	public EmpleadoTemporal(String nombre, String direccion, Boolean esConyuge, 
			LocalDate fechaNacimiento, double sueldoBasico, LocalDate fechaFin, int horasExtra) {
		super(nombre, direccion, esConyuge, fechaNacimiento, sueldoBasico);
		this.fechaFin = fechaFin;
		this.horasExtra = horasExtra;
	}
	
	public LocalDate getFechaFin() {
		return this.fechaFin;
	}
	
	public int getHorasExtra() {
		return this.horasExtra;
	}
	
	
	@Override
	public double aportesJubilatorios() {
		return (10.0/100.0)*this.sueldoBruto() + (5 * this.horasExtra);
	}
	
	
	@Override
	public double obraSocial() {
		double total = (10.0/100.0)*this.sueldoBruto();
		if (Period.between(this.getFechaNacimiento(), 
				LocalDate.now()).getYears() > 50) {
			total += 25;
		}
		return total;
	}
	
	
	public double horasExtra() {
		return 50 * this.horasExtra;
	}
	
	
	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.horasExtra();
	}
	
	@Override
	public void agregarDesgloseConceptos(Recibo recibo) {
		recibo.agregarConcepto(new Concepto("Horas extra", this.horasExtra()));
	}
	
	
}

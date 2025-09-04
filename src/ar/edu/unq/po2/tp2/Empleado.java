package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.time.*;


public abstract class Empleado {

	private String nombre;
	private String direccion;
	private Boolean esConyuge;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;
	
	public Empleado(String nombre, String direccion, Boolean esConyuge, 
			LocalDate fechaNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.esConyuge = esConyuge;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	
	public int calcularEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	
	public Recibo generarRecibo() {
		Recibo nuevoRecibo = new Recibo(this.getNombre(), this.getDireccion(), 
				this.getFechaNacimiento(), this.sueldoBruto(), this.sueldoNeto());
		
		nuevoRecibo.agregarConcepto(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		nuevoRecibo.agregarConcepto(new Concepto("Obra social", this.obraSocial()));
		nuevoRecibo.agregarConcepto(new Concepto("Aportes jubilatorios", this.aportesJubilatorios()));
		this.agregarDesgloseConceptos(nuevoRecibo);
		
		return nuevoRecibo;
	}
	
	
	public abstract void agregarDesgloseConceptos(Recibo recibo);
	
	public abstract double sueldoBruto();
	
	public abstract double obraSocial();
	
	public abstract double aportesJubilatorios();
	
	
	
	public double retencionesTotal() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	
	public double sueldoNeto() {
		return this.sueldoBruto() - this.retencionesTotal();
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Boolean getEsConyuge() {
		return this.esConyuge;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
}

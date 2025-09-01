package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;
import java.time.*;


public abstract class Empleado {

	private String nombre;
	private String direccion;
	private Boolean esConyuge;
	private LocalDate fechaNacimiento;
	private float sueldoBasico;
	
	public Empleado(String nombre, String direccion, Boolean esConyuge, LocalDate fechaNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.esConyuge = esConyuge;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	
	public int calcularEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	
	public abstract float sueldoBruto();
	
	public abstract float obraSocial();
	
	public abstract float aportesJubilatorios();
	
	public abstract Recibo generarRecibo();
	
	
	public float retencionesTotal() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	
	public float sueldoNeto() {
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
	
	public float getSueldoBasico() {
		return this.sueldoBasico;
	}
	
}

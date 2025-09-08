package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
import java.time.Period;



public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate fechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public int edad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
	
}

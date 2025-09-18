package ar.edu.unq.po2.tp5;
import java.time.*;



public class Persona extends Bipedo{

	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super(nombre);
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public int getEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public Persona elMayor(Persona p2) {
		if (p2.getEdad() > this.getEdad()) {
			return p2;
		}
		else {return this;}
	}
	
	
}

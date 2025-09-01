package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.time.*;


public class EmpleadoPermanente extends Empleado{

	private int cantHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, Boolean esConyuge, 
			LocalDate fechaNacimiento, float sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre, direccion, esConyuge, fechaNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	

	@Override
	public Recibo generarRecibo() {
		Recibo nuevoRecibo = new Recibo(this.getNombre(), this.getDireccion(), 
				this.getFechaNacimiento(), this.sueldoBruto(), this.sueldoNeto());
		
		nuevoRecibo.agregarConcepto(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		
		// Dividir este metodo en llamar a un primer metodo "armarBase" que devuelva 
		//el nuevoRecibo y despues en cada subclase agregar los respectivos conceptos en
		// un metodo llamado "agregarConceptos"
		
		
		return nuevoRecibo;
	}
	
	
	@Override
	public float aportesJubilatorios() {
		return (15/100) * this.sueldoBruto();
	}
	
	
	@Override
	public float obraSocial() {
		return ((10/100) * this.sueldoBruto()) * this.cantHijos;
	}
	
	
	public float salarioFamiliar() {
		float total = this.cantHijos * 150;
		if (this.getEsConyuge()) {
			total += 100;
		}
		total += this.antiguedad * 50;
		return total;
	}
	
	
	@Override
	public float sueldoBruto() {
		float total = this.getSueldoBasico();
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

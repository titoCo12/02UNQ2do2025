package ar.edu.unq.po2.tp4;
import java.util.ArrayList;


public class Trabajador {

	private ArrayList<Ingreso> ingresosAnuales;
	private String nombre;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresosAnuales.add(ingreso);
	}
	
	
	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso:ingresosAnuales) {
			total += ingreso.getMonto();
		}
		return total;	
	}
	

	public double getMontoImponible() {
		double total = 0;
		for (Ingreso ingreso:ingresosAnuales) {
			total += ingreso.getMontoImponible();
		}
		return total;
	}
	
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
}

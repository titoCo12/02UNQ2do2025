package ar.edu.unq.po2.tp2;
import java.util.*;

public class Empresa {

	private String nombre;
	private int CUIT;
	private List<Empleado> empleados;
	private List<Recibo> recibos;
	
	public Empresa(String nombre, int CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT;
	}
	
	public void contratarEmpleado(Empleado emp) {
		this.empleados.add(emp); 
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCUIT() {
		return this.CUIT;
	}
	
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}
	
	public List<Recibo> getRecibos() {
		return this.recibos;
	}
}

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
	
	
	public float totalSueldoNeto() {
		float total = 0;
		for (Empleado emp: empleados) {
			total += emp.sueldoNeto();
		}
		return total;
	}
	
	
	public float totalSueldoBruto() {
		float total = 0;
		for (Empleado emp: empleados) {
			total += emp.sueldoBruto();
		}
		return total;
	}
	
	
	public float totalRetenciones() {
		float total = 0;
		for (Empleado emp: empleados) {
			total += emp.retencionesTotal();
		}
		return total;
	}
	
	
	public Recibo generarRecibo(Empleado empleado) {
		return empleado.generarRecibo();
	}
	
	
	public void liquidacionSueldos() {
		for (Empleado emp: empleados) {
			recibos.add(this.generarRecibo(emp));
		}
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

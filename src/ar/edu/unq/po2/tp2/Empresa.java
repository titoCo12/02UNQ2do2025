package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;

public class Empresa {

	private String nombre;
	private int CUIT;
	private ArrayList<Empleado> empleados;
	private ArrayList<Recibo> recibos;
	
	public Empresa(String nombre, int CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT;
		this.empleados = new ArrayList<>();
		this.recibos = new ArrayList <>();
	}
	
	
	public void contratarEmpleado(Empleado emp) {
		this.empleados.add(emp); 
	}
	
	
	public double totalSueldoNeto() {
		double total = 0;
		for (Empleado emp: empleados) {
			total += emp.sueldoNeto();
		}
		return total;
	}
	
	
	public double totalSueldoBruto() {
		double total = 0;
		for (Empleado emp: empleados) {
			total += emp.sueldoBruto();
		}
		return total;
	}
	
	
	public double totalRetenciones() {
		double total = 0;
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
	
	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}
	
	public ArrayList<Recibo> getRecibos() {
		return this.recibos;
	}
}

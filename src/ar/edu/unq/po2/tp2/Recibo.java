package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;
import java.time.*;


public class Recibo {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private ArrayList<Concepto> conceptos;

	
	public Recibo(String nombreEmpleado, String direccion, LocalDate fechaEmision, 
			double sueldoBruto, double sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		
		this.conceptos = new ArrayList<>();
	}
	
	
	public void agregarConcepto(Concepto concepto) {
		this.conceptos.add(concepto);
	}
	
	
	public String getNombre() {
		return this.nombreEmpleado;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}
	
	public double sueldoBruto() {
		return this.sueldoBruto;
	}
	
	public double sueldoNeto() {
		return this.sueldoNeto;
	}
	
}

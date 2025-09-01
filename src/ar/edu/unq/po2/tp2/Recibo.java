package ar.edu.unq.po2.tp2;
import ar.edu.unq.po2.tp2.*;
import java.util.*;
import java.time.*;


public class Recibo {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private List<Concepto> conceptos;

	
	public Recibo(String nombreEmpleado, String direccion, LocalDate fechaEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
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
	
	public float sueldoBruto() {
		return this.sueldoBruto;
	}
	
	public float sueldoNeto() {
		return this.sueldoNeto;
	}
	
}

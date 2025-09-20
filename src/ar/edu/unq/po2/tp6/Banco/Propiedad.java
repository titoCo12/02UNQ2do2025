package ar.edu.unq.po2.tp6.Banco;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getValorFiscal() {
		return this.valorFiscal;
	}
	
}

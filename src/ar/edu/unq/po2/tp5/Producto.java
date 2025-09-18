package ar.edu.unq.po2.tp5;

public class Producto implements Item{

	
	private String nombre;
	private double precioBase;
	
	public Producto(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public double montoAPagar(Caja caja) {
		caja.reducirStock(this);
		return this.precioBase;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}

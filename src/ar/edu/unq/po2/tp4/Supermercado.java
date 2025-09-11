package ar.edu.unq.po2.tp4;
import java.util.*;


public class Supermercado {

	private ArrayList<Producto> catalogo;
	private String nombre;
	private String direccion;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		
		this.catalogo = new ArrayList<Producto>();
	}
	
	
	public void agregarProducto(Producto producto) {
		this.catalogo.add(producto);
	}
	
	
	public int getCantidadDeProductos() {
		return this.catalogo.size();
	}
	
	
	public double getPrecioTotal() {
		double total = 0.0;
		for (Producto producto:this.catalogo) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
}

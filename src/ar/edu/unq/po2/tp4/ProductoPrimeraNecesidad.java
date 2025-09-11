package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
}

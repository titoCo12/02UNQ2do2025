package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private double descuento;
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}
	
	
	public void cambiarDescuento(double nuevoDescuento) {
		this.descuento = nuevoDescuento;
	}
	
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * this.descuento;
	}
	
}

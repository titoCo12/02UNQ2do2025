package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto{

	public ProductoDeCooperativa(String nombre, double precioBase) {
		super(nombre, precioBase);
	}
	
	public double montoAPagar(Caja c) {
		return super.registrarCobro(c) * 0.9;
	}
	
	
}

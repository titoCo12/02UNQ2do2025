package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {

	private double valorFijo;

	
	public FacturaImpuesto(int id, double valorFijo) {
		super(id);
		this.valorFijo = valorFijo;
	}
	
	
	public double valor() {
		return valorFijo;
	}
	
}

package ar.edu.unq.po2.tp5;

public abstract class Factura implements Item {

	private int id;
	
	
	public Factura(int id) {
		this.id = id;
	}
	
	public abstract double valor();
	
	public double registrarCobro(Caja caja) {
		caja.notificarAgencia(this);
		return this.valor();
	}
	
	
	public int getId() {
		return this.id;
	}
	
}

package ar.edu.unq.po2.tp5;



public class FacturaServicio extends Factura{

	
	private double costoPorUnidad;
	private int unidadesConsumidas;
	
	
	public FacturaServicio(int id, double costo, int unidades) {
		super(id);
		this.costoPorUnidad = costo;
		this.unidadesConsumidas = unidades;
	}
	
	public double valor() {
		return costoPorUnidad * unidadesConsumidas;
	}
	
}





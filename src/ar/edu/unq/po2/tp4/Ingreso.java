package ar.edu.unq.po2.tp4;

public class Ingreso {

	private int mes;
	private String concepto;
	private double monto;
	
	public Ingreso(int mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public double getMontoImponible() {
		return this.monto;
	}
	
	
}

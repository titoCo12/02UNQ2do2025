package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso{

	private int horasExtra;
	
	
	public IngresoPorHorasExtra(int mes, String concepto, double monto, int horasExtra) {
		super(mes, concepto, monto);
		this.horasExtra = horasExtra;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}

	public int getHorasExtra() {
		return horasExtra;
	}
	
}

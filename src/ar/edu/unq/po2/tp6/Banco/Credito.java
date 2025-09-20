package ar.edu.unq.po2.tp6.Banco;

public abstract class Credito {

	private Cliente solicitante;
	private double monto;
	private  int plazoMeses;
	
	
	public Credito(Cliente solicitante, double monto, int plazoMeses) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.plazoMeses = plazoMeses;
	}
	
	public abstract boolean cumpleRequisitos();
	
	public double montoMensual() {
		return this.monto / this.plazoMeses;
	}
	
	public Cliente getSolicitante() {
		return this.solicitante;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public int getPlazoMeses() {
		return this.plazoMeses;
	}
	
}

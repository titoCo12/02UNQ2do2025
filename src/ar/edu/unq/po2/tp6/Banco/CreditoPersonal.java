package ar.edu.unq.po2.tp6.Banco;

public class CreditoPersonal extends Credito{

	
	public CreditoPersonal(Cliente solicitante, double monto, int plazoMeses) {
		super(solicitante, monto, plazoMeses);
	}
	
	public boolean cumpleRequisitos() {
		Cliente solicitante = this.getSolicitante();
		
		return solicitante.sueldoAnual() >= 15000.0 &&
				this.getMonto()<= (solicitante.getSueldoMensual() * 0.7); 
	}

}

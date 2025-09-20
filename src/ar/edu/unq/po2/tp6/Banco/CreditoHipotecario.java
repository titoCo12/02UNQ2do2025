package ar.edu.unq.po2.tp6.Banco;

public class CreditoHipotecario extends Credito{

	private Propiedad propiedad;
	
	public CreditoHipotecario(Cliente cliente, double monto, int plazoMeses, Propiedad propiedad) {
		super(cliente, monto, plazoMeses);
		this.propiedad = propiedad;
	}
	
	
	public boolean cumpleRequisitos() {
		Cliente solicitante = this.getSolicitante();
		
		boolean cond1 = this.getMonto() <= (solicitante.getSueldoMensual() * 0.5);
		boolean cond2 = this.getMonto() <= (this.propiedad.getValorFiscal() * 0.7);
		boolean cond3 = solicitante.getEdad() + (this.getPlazoMeses() / 12) <= 65;		
				
		return cond1 && cond2 && cond3;
	}
	
}

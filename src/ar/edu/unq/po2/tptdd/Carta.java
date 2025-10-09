package ar.edu.unq.po2.tptdd;


public class Carta {

	private ValorCarta valor;
	private PaloCarta palo;
	
	public Carta(ValorCarta val, PaloCarta palo) {
		this.valor = val;
		this.palo = palo;
	}
	
	public ValorCarta getValor() {
		return this.valor;
	}
	
	public PaloCarta getPalo() {
		return this.palo;
	}
	
	public boolean esMayorQue(Carta c) {
		return this.valor.ordinal() > c.getValor().ordinal();
	}
	
	public boolean tieneMismoPaloQue(Carta c) {
		return this.palo == c.getPalo();
	}
	
}

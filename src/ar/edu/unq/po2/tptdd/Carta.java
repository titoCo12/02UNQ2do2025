package ar.edu.unq.po2.tptdd;

public class Carta {

	private int valor;
	private String palo;
	
	public Carta(int val, String palo) {
		this.valor = val;
		this.palo = palo;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public String getPalo() {
		return this.palo;
	}
	
	
}

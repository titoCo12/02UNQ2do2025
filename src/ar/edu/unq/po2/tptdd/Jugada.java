package ar.edu.unq.po2.tptdd;


public class Jugada {

	int valorTotal;
	TipoMano tipo;
	
	public Jugada(int valorTotal, TipoMano tipo) {
		this.valorTotal = valorTotal;
		this.tipo = tipo;
	}
	
	public int getValorTotal() {
		return this.valorTotal;
	}
	
	public TipoMano getTipo() {
		return this.tipo;
	}
	
	public boolean esMejorQue(Jugada jug) {
		if (this.tipo.ordinal() == jug.getTipo().ordinal()) {
			return this.getValorTotal() > jug.getValorTotal();
		}
		return this.tipo.ordinal() > jug.getTipo().ordinal();
	}
	
}

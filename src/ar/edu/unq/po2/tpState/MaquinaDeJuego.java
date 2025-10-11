package ar.edu.unq.po2.tpState;

public class MaquinaDeJuego {

	private EstadoJuego state;
	
	public MaquinaDeJuego() {
		this.state = new EstadoInicial(this);
	}
	
	public void botonDeInicio() {
		this.state.botonDeInicio();
	}
	
	public void ingresoDeFicha() {
		this.state.ingresoDeFicha();
	}
	
	public void cambiarEstado(EstadoJuego newState) {
		this.state = newState;
	}
	
	public EstadoJuego getEstado() {
		return this.state;
	}
	
}

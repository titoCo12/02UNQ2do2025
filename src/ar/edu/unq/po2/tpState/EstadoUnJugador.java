package ar.edu.unq.po2.tpState;

public class EstadoUnJugador extends EstadoJuego {

	public EstadoUnJugador(MaquinaDeJuego maq) {
		super(maq);
	}
	
	public void botonDeInicio() {
		this.getMaquina().cambiarEstado(new EstadoJugando(this.getMaquina()));
	}
	
	public void ingresoDeFicha() {
		this.getMaquina().cambiarEstado(new EstadoDosJugadores(this.getMaquina()));
	}
	
}

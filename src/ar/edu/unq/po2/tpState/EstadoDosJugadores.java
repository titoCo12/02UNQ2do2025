package ar.edu.unq.po2.tpState;

public class EstadoDosJugadores extends EstadoJuego {

	
	public EstadoDosJugadores(MaquinaDeJuego maq) {
		super(maq);
	}
	
	public void botonDeInicio() {
		this.getMaquina().cambiarEstado(new EstadoJugando(this.getMaquina()));
	}
}

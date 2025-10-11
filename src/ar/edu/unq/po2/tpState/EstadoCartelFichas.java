package ar.edu.unq.po2.tpState;

public class EstadoCartelFichas extends EstadoJuego{

	public EstadoCartelFichas(MaquinaDeJuego maq) {
		super(maq);
	}
	
	public void ingresoDeFicha() {
		this.getMaquina().cambiarEstado(new EstadoUnJugador(this.getMaquina()));
	}
	
}

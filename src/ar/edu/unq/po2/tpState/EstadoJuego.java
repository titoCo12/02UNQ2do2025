package ar.edu.unq.po2.tpState;

public abstract class EstadoJuego {

	private MaquinaDeJuego maquina;
	
	public EstadoJuego(MaquinaDeJuego maq) {
		this.maquina = maq;
	}
	
	public MaquinaDeJuego getMaquina() {
		return this.maquina;
	}
	
	public void botonDeInicio() {};
	
	public void ingresoDeFicha() {};
	
}

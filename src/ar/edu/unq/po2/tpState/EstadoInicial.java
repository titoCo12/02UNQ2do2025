package ar.edu.unq.po2.tpState;

public class EstadoInicial extends EstadoJuego{

	public EstadoInicial(MaquinaDeJuego maq) {
		super(maq);
	}
	
	public void botonDeInicio() {
		this.getMaquina().cambiarEstado(new EstadoCartelFichas(this.getMaquina()));
	}
	
}

package ar.edu.unq.po2.tpStrategy;

public class EncriptadorNaive {

	private Encriptacion encriptacion;
	
	public EncriptadorNaive() {
		this.encriptacion = new EncriptacionVocales();
	}
	
	public String encriptar(String palabra, Encriptacion strat) {
		this.encriptacion = strat;
		
		return this.encriptacion.encriptar(palabra);
	}
	
	public String desencriptar(String palabra, Encriptacion strat) {
		this.encriptacion = strat;
		
		return this.encriptacion.desencriptar(palabra);
	}
	
}

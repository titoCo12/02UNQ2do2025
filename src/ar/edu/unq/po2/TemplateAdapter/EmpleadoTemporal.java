package ar.edu.unq.po2.TemplateAdapter;

public class EmpleadoTemporal extends Empleado {

	public EmpleadoTemporal(int horas, int hijos) {
		super(horas, hijos);
	}

	@Override
	public int xHoras() {
		return 5 * this.getHoras();
	}
	
	@Override
	public int SBasico() {
		return 1000;
	}
	
	@Override
	public int xHijos() {
		if (this.getHijos() > 0) {
			return 100;
		}
		return 0;
	}
	
}

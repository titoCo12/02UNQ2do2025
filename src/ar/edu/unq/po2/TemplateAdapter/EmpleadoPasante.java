package ar.edu.unq.po2.TemplateAdapter;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(int horas, int hijos) {
		super(horas, hijos);
	}
	
	@Override
	public int xHoras() {
		return 40 * this.getHoras();
	}
	
}

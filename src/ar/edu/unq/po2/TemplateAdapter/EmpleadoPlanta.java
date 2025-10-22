package ar.edu.unq.po2.TemplateAdapter;

public class EmpleadoPlanta extends Empleado{

	public EmpleadoPlanta(int horas, int hijos) {
		super(horas, hijos);
	}
	
	@Override
	public int SBasico() {
		return 3000;
	}
	
	@Override
	public int xHijos() {
		return 150 * this.getHijos();
	}
	
}

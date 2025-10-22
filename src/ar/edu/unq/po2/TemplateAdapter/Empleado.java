package ar.edu.unq.po2.TemplateAdapter;

public abstract class Empleado {

	private int horas;
	private int hijos;
	
	public Empleado(int horas, int hijos) {
		this.horas = horas;
		this.hijos = hijos;
	}
	
	public Double getSueldo() {
		Double total = 0.0;
		total += this.xHoras() + this.SBasico() + this.xHijos();
		total -= this.aportesDe(total);
		return total;
	}
	
	public int xHoras() {
		return 0;
	}
	
	public int SBasico() {
		return 0;
	}
	
	public int xHijos() {
		return 0;
	}
	
	public Double aportesDe(Double sueldo) {
		return (sueldo * 13) /100;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public int getHijos() {
		return this.hijos;
	}
	
	
}

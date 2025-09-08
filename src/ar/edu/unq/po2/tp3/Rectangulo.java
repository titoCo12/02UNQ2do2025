package ar.edu.unq.po2.tp3;
import java.math.*;


public class Rectangulo {

	private Point esquinaSupIzquierda;
	private int largo;
	private int ancho;
	
	
	private void verificarArgumentos(int largo, int ancho) {
		
		if (largo == ancho) {
			throw new IllegalArgumentException("Largo y ancho no pueden ser iguales");
		}
		if (largo == 0) {
			throw new IllegalArgumentException("Largo no puede ser 0");
		}
		if (ancho == 0) {
			throw new IllegalArgumentException("Ancho no puede ser 0");
		}
		
	}
	
	
	public Rectangulo(Point esquinaSupIzquierda, int largo, int ancho) {
		
		this.verificarArgumentos(largo, ancho);
		
		this.esquinaSupIzquierda = esquinaSupIzquierda;
		this.largo = Math.abs(largo);
		this.ancho = Math.abs(ancho);
	}
	
	
	public int area() {
		return this.ancho * this.largo;
	}
	
	public int perimetro() {
		return (this.ancho * 2) + (this.largo * 2);
	}
	
	
	public boolean esVertical() {
		return this.largo > this.ancho;
	}
	
	public boolean esHorizontal() {
		return  !this.esVertical();
	}
	
}

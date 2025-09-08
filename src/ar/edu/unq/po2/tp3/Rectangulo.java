package ar.edu.unq.po2.tp3;
import java.math.*;


public class Rectangulo {

	private Point esquinaSupIzquierda;
	private Point esquinaSupDerecha;
	private Point esquinaInfIzquierda;
	private Point esquinaInfDerecha;
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
		
		//this.verificarArgumentos(largo, ancho);
		/* 
		 * ↑ ↑ ↑ ↑ ↑ ↑ ↑
		 * Esto en realidad es una buena practica para lograr la consistencia de la estructura que se 
		 * espera de un rectangulo, ya que, en caso contrario estarias permitiendo que se construya un
		 * cuadrado que pretende ser rectangulo, o rectangulos con valores nulos.
		 * 
		 * Queda comentado para poder reutilizar la clase para crear cuadrados
		 * */
		
		
		this.esquinaSupIzquierda = esquinaSupIzquierda;
		this.largo = Math.abs(largo);
		this.ancho = Math.abs(ancho);
		
		this.esquinaSupDerecha = new Point(this.esquinaSupIzquierda.getX() + this.ancho, 
				this.esquinaSupIzquierda.getY());
		this.esquinaInfIzquierda = new Point(this.esquinaSupIzquierda.getX(), 
				this.esquinaSupIzquierda.getY() - this.largo);
		this.esquinaInfDerecha = new Point(this.esquinaSupIzquierda.getX() + this.ancho,
				this.esquinaSupIzquierda.getY() - this.largo);
	}
	
	
	public Point getEsquinaSupIzquierda() {
		return this.esquinaSupIzquierda;
	}
	
	public Point getEsquinaSupDerecha() {
		return this.esquinaSupDerecha;
	}
	
	public Point getEsquinaInfIzquierda() {
		return this.esquinaInfIzquierda;
	}
	
	public Point getEsquinaInfDerecha() {
		return this.esquinaInfDerecha;
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

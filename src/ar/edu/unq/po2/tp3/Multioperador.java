package ar.edu.unq.po2.tp3;
import java.util.*;



public class Multioperador {

	private ArrayList<Integer> numeros;
	
	
	public Integer sumaDeNumeros() {
		Integer total = 0;
		for (Integer n:numeros) {
			total += n;
		}
		return total;
	}
	
	
	public Integer restaDeNumeros() {
		return -this.sumaDeNumeros();
	}
	
	
	public Integer productoDeNumeros() {
		Integer total = 1;
		for (Integer n:numeros) {
			total *= n;
		}
		return total;
	}
	
	
}

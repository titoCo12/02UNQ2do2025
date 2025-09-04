package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	
	public void agregarNum(Integer num) {
		this.numeros.add(num);
	}
	
	
	public Integer contarPares() {
		Integer count = 0;
		for (Integer num:this.numeros) {
			if (esPar(num)) {
				count++;
			}
		}
		return count;
	}
	
	
	public Integer contarImpares() {
		Integer count = 0;
		for (Integer num:this.numeros) {
			if (!esPar(num)) {
				count++;
			}
		}
		return count;
	}
	
	
	public Integer multiplosDe(Integer multiplo) {
		Integer count = 0;
		for (Integer num:this.numeros) {
			if (num % multiplo == 0) {
				count++;
			}
		}
		return count;
	}
	
	
	public boolean esPar(Integer n) {
		return n % 2 == 0;
	}
	
	
	public Integer contarDigitosPares(Integer n) {
		
		Integer count = 0;
		Integer curr = n;
		
		while (curr != 0) {
			if(this.esPar(curr % 10) && (curr % 10 != 0)) {
				count++;
			}
			curr = curr / 10;
		}
		return count;
	}
	
	
	public Integer numeroConMasDigitosPares() {

		Integer curr = 0;
		Integer max = 0;
		
		for (Integer n:numeros) {
			if (contarDigitosPares(n) > max) {
				curr = n;
			}
		}
		return curr;
	}
	
	
	
}

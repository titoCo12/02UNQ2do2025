package ar.edu.unq.po2.tpStrategy;

import java.util.ArrayList;
import java.util.List;

public class EncriptacionVocales implements Encriptacion{

	
	public String encriptar(String palabra) {
		String vocales = "aeioua"; 
		String result = "";
		
		for (int i = 0; i < palabra.length(); i++) {
		    char c = palabra.charAt(i);
		    if (vocales.indexOf(c) != -1) {
		    	result += (vocales.charAt(vocales.indexOf(c) + 1));
		    }
		    else {result += c;}
		}
		return result;
	}
	
	public String desencriptar(String palabra) {
		String vocales = "aeiou"; 
		String result = "";
		
		for (int i = 0; i < palabra.length(); i++) {
		    char c = palabra.charAt(i);
		    if (vocales.indexOf(c) != -1) {
		    	if (vocales.indexOf(c) -1 == -1) {
		    		result += "u";
		    	}
		    	else {result += (vocales.charAt(vocales.indexOf(c) -1));}
		    }
		    else {result += c;}
		}
		return result;
	}
	
}

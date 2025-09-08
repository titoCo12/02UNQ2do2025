package ar.edu.unq.po2.tp3;
import java.util.*;



public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> integrantes;
	
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void agregarIntegrante(Persona p) {
		this.integrantes.add(p);
	}
	
	
	public int edadPromedio() {
		int total = 0;
		for (Persona p:integrantes) {
			total += p.edad();
		}
		return total/this.integrantes.size();
	}
}

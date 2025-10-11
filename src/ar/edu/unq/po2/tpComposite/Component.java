package ar.edu.unq.po2.tpComposite;

import java.time.LocalDate;

public abstract class Component {

	private String name;
	private LocalDate date;
	private Component parent;
	
	public Component(String name, LocalDate creation, Component parent) {
		this.name = name;
		this.date = creation;
		this.parent = parent;	
	}
	
	
	public String getPath() {
		if (this.parent != null) {
			return this.parent.getPath() + "/" + this.name;
		}
		return this.name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public abstract int getSize();
	
	
}

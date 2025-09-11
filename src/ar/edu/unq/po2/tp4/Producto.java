package ar.edu.unq.po2.tp4;

public class Producto {

		private String nombre;
		private double precio;
		private boolean tienePrecioCuidado;
		
		
		
		public Producto(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
			this.tienePrecioCuidado = false;
		}
		
		
		public Producto(String nombre, double precio, boolean tienePrecioCuidado) {
			this.nombre = nombre;
			this.precio = precio;
			this.tienePrecioCuidado = tienePrecioCuidado;
		}
		
		
		public String getNombre() {
			return this.nombre;
		}
		
		public double getPrecio() {
			return this.precio;
		}
		
		public boolean esPrecioCuidado() {
			return this.tienePrecioCuidado;
		}
		
		public void aumentarPrecio(double aumento) {
			this.precio += aumento;
		}
		
	
}

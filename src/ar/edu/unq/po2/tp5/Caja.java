package ar.edu.unq.po2.tp5;
import java.util.*;


public class Caja {

	
	private ArrayList<Item> itemsEnCaja;
	//idealmente usaria HashMap y una clase ItemStock
	private ArrayList<Producto> stock;
	private Agencia agencia;
	
	
	public Caja(ArrayList<Producto> stock, Agencia agencia) {
		this.stock = stock;
		this.agencia = agencia;
	}
	
	
	public void agregarItem(Item item) {
		this.itemsEnCaja.add(item);
	}
	
	
	public void reducirStock(Producto p) {
		this.stock.remove(p);
	}
	
	
	public void notificarAgencia(Factura factura) {
		this.agencia.registrarPago(factura);
	}
	
	
	public double registrarPagos() {
		double total = 0;
		for (Item i:itemsEnCaja) {
			total += i.montoAPagar(this);
		}
		itemsEnCaja.clear();
		return total;
	}
	
	
}

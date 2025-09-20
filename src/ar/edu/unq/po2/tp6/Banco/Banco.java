package ar.edu.unq.po2.tp6.Banco;
import java.util.*;


public class Banco {

	private String nombre;
	private ArrayList<Cliente> clientes;
	private ArrayList<Credito> creditosActivos;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<Cliente>();
		this.creditosActivos = new ArrayList<Credito>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void registrarCredito(Credito solicitud) {
		if (solicitud.cumpleRequisitos()) {
			this.creditosActivos.add(solicitud);
			solicitud.getSolicitante().recibirMonto(solicitud.getMonto());;
		}
	}
	
	public double totalADesembolsar() {
		double total = 0;
		for (Credito credito:creditosActivos) {
			total += credito.getMonto();
		}
		return total;
	}
}

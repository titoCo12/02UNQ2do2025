package ar.edu.unq.po2.tp6.Banco;
import java.time.*;


public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private double saldo;
	private LocalDate fechaNacimiento;
	private double sueldoMensual;
	private Banco banco;
	
	
	public Cliente(String nombre, String apellido, String direccion, double saldo, 
			LocalDate fechaNac, double sueldo, Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.saldo = saldo;
		this.fechaNacimiento = fechaNac;
		this.sueldoMensual = sueldo;
		this.banco = banco;
	}
	
	public double sueldoAnual() {
		return this.sueldoMensual * 12;
	}
	
	
	public void solicitarCredito(Credito credito) {
		this.banco.registrarCredito(credito);
	}
	
	
	public void recibirMonto(double monto) {
		this.saldo += monto;
	}
	
	public double getSueldoMensual() {
		return this.sueldoMensual;
	}
	
	public int getEdad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}

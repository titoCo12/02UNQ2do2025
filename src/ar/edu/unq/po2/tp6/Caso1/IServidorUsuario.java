package ar.edu.unq.po2.tp6.Caso1;
import java.util.*;

public interface IServidorUsuario {

	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
	
}

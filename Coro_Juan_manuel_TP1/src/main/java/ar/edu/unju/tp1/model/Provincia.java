package ar.edu.unju.tp1.model;
import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigo;
	private String nombre;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
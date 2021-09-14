package Unidad2.Practica11;

public class Pasajero {

	private String nombre;
	private String curp;
	public Pasajero(String nombre, String curp) {
		super();
		this.nombre = nombre;
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", curp=" + curp + "]";
	}
	
	
}

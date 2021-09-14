package Unidad2.Practica11;

import java.util.Scanner;



public class Asiento {
	private String clase; // EJECUTIVA Y ECONOMICA
    private boolean estado; // LIBRE(FALSE) U OCUPADO(TRUE)
    private String lugar;//VENTANILLA, PASILLO, CENTRO
    private Pasajero pasajero;
	
    
	public Asiento(String clase, boolean estado, String lugar) {
		super();
		this.clase = clase;
		this.estado = estado;
		this.lugar = lugar;
		this.pasajero=null;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
	
	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		if(pasajero!=null) {
		return "Asiento [clase=" + clase + ", estado=" + estado + ", lugar=" + lugar + ", pasajero=" + pasajero.getNombre() +" , CURP="+ pasajero.getCurp()+ "]";
		}else {
			return "Asiento [clase=" + clase + ", estado=" + estado + ", lugar=" + lugar + ", sin pasajero=" + "]";
		}
	}

	

	public void registrarPasajero(int numero) {
		Scanner leer = new Scanner(System.in);
	    System.out.println("::::::::ASIGNAR AL PASAJERO ::::::::" );
		System.out.println("NOMBRE");
		String nom = leer.next();
		System.out.println("CURP");
		String curp = leer.next();
		
	    this.pasajero= new Pasajero(nom, curp);
	    this.estado=true;
	   
			
	}

	

	
	}
	


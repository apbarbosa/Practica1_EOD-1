package Unidad2.Practica11;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;



public class Avion {
	
	
	  @Override
	public String toString() {
		return "Avion [as1=" + as1 + ", as2=" + as2 + ", as3=" + as3 + ", as4=" + as4 + ", as5=" + as5 + "]";
	}

	private Asiento as1;
	    private Asiento as2;
	    private Asiento as3;
	    private Asiento as4;
	    private Asiento as5;

	    public Avion() {
	        this.as1 = new Asiento("Ejecutivo", false, "pasillo");
	        this.as2 = new Asiento("Ejecutivo", false, "ventana");
	        this.as3 = new Asiento("Economico", false, "ventana");
	        this.as4 = new Asiento("Economico", false, "centro");
	        this.as5 = new Asiento("Economico", false, "pasillo");
	    }

	    public void crearAsiento() {
	        Scanner leer = new Scanner(System.in);
	        int opc;

	        do {
	        	System.out.println("¿Qué asiento deseas crear?");
	            System.out.println("1.- ASIENTO EJECUTIVO PASILLO");
	            System.out.println("2.- ASIENTO EJECUTIVO VENTANA");
	            System.out.println("3.- ASIENTO ECONOMICO VENTANA");
	            System.out.println("4.- ASIENTO ECONOMICO CENTRO");
	            System.out.println("5.- ASIENTO ECONOMICO PASILLO");
	            System.out.println("6.- SALIR");
	            opc = leer.nextInt();

	            switch (opc) {
	                case 1:
	                    if (as1.getPasajero()==null) {
	                        as1.registrarPasajero(1);
	                        as1.setEstado(true);
	                        System.out.println(as1.toString());
	                    } else {
	                        System.out.println("Este asiento ya está ocupado");
	                    }
	                    break;
	                case 2:
	                	 if (as2.getPasajero()==null) {
		                        as2.registrarPasajero(1);
		                        as2.setEstado(true);
		                        System.out.println(as2.toString());
		                    } else {
		                        System.out.println("Este asiento ya está ocupado");
		                    }
	                    break;
	                case 3:
	                	 if (as3.getPasajero()==null) {
		                        as3.registrarPasajero(1);
		                        as3.setEstado(true);
		                        System.out.println(as3.toString());
		                    } else {
		                        System.out.println("Este asiento ya está ocupado");
		                    }
	                    break;
	                case 4:
	                	 if (as4.getPasajero()==null) {
		                        as4.registrarPasajero(1);
		                        as4.setEstado(true);
		                        System.out.println(as4.toString());
		                    } else {
		                        System.out.println("Este asiento ya está ocupado");
		                    }
	                    break;
	                case 5:
	                	 if (as5.getPasajero()==null) {
		                        as5.registrarPasajero(1);
		                        as5.setEstado(true);
		                        System.out.println(as5.toString());
		                    } else {
		                        System.out.println("Este asiento ya está ocupado");
		                    }
	                    break;

	            }
	        	
	        	
	        }while(opc!=6);
	       

	    }
   
	
	    public void mostrarAsientosDisponibles() {
	    	System.out.println("ASIENTOS DISPONIBLES");
	    	if(this.as1!=null && this.as1.isEstado()==false) {
	    		System.out.println(as1.toString());
	    	}
	    	if(this.as2!=null && this.as2.isEstado()==false) {
	    		System.out.println(as2.toString());
	    }
	    	if(this.as3!=null && this.as3.isEstado()==false) {
	    		System.out.println(as3.toString());
              }
	    	if(this.as4!=null && this.as4.isEstado()==false) {
	    		System.out.println(as4.toString());
              }
	    	if(this.as5!=null && this.as5.isEstado()==false) {
	    		System.out.println(as5.toString());
              }
	    }
	    
	    
	    
	    public void mostrarAsientosNoDisponibles() {
	    	System.out.println("ASIENTOS NO DISPONIBLES");
	    	if(this.as1!=null && this.as1.isEstado()==true) {
	    		System.out.println(as1.toString());
	    	}
	    	if(this.as2!=null && this.as2.isEstado()==true) {
	    		System.out.println(as2.toString());
	    }
	    	if(this.as3!=null && this.as3.isEstado()==true) {
	    		System.out.println(as3.toString());
              }
	    	if(this.as4!=null && this.as4.isEstado()==true) {
	    		System.out.println(as4.toString());
              }
	    	if(this.as5!=null && this.as5.isEstado()==true) {
	    		System.out.println(as5.toString());
              }
	    }
	    
	    public static void main(String[] args) {
			Avion obj = new Avion();
			obj.crearAsiento();
		}
	    
}



	      


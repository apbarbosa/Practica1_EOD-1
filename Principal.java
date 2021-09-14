package Unidad2.Practica11;

import java.util.Scanner;

public class Principal {
 
	
	public static void main(String[] args) {
		Avion av = new Avion();
		Scanner leer = new Scanner(System.in);
		int o;
		       
		        do {
		        	
		        	System.out.println("BIENVENIDOS A LA AEREOLINEA DEL MANY");
		        	System.out.println("___________________________________________________________________________");
		        	System.out.println("___________________________________________________________________________");
		        	System.out.println("¿Que es lo que decseas realizar?");
		        	System.out.println("                                                                               ");
			        System.out.println("1.- REGISTRAR ASIENTO Y ASIGNARLE UN PASAJERO ");
			        System.out.println("                                                                                ");
			        System.out.println("2.- MOSTRAR ASIENTOS LIBRES");
			        System.out.println("                                                                                 ");
			        System.out.println("3.- MOSTRAR ASIENTOS OCUPADOS");
			        System.out.println("                                                                                  ");
			        System.out.println("4.- SALIR");
			        o = leer.nextInt();
		        	switch(o) {
		        	
		        	case 1 :
		        	av.crearAsiento();
		        	break;
		        	case 2:
		        		av.mostrarAsientosDisponibles();
		        		break;
		        	case 3:
		        		av.mostrarAsientosNoDisponibles();
		        		break;
		     
		        		
		        	
		        	
		        	
		        	
		        	}
		        	
		        	
		        	
		        	
		        	
		        	
		        	
		        	
		        }while(o!=4);
		        
			
			}
			
			
			
			
			
		
		
	
		
	}


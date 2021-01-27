package main.java.liceosorolla;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class String2 {



		private static void longitudNombre(String nombre) {
			Scanner teclado1 = new Scanner (System.in);	

			System.out.println("Tu nombre tiene "+nombre.length()+" letras");
		}

		public static int contarCaracteres(String cadena, char caracter) {
	        int posicion, contador = 0;
	       
	        posicion = cadena.indexOf(caracter);
	        while (posicion != -1) { 
	            contador++;           
	                                           
	            posicion = cadena.indexOf(caracter, posicion +1 );
	        }
	        
	        return contador;
		}
		private static String repetirOcurrencia(String nombre){
			
			String resultado="";
			
			for(int i=0;i<nombre.length();i++) {
				
				resultado+=nombre.charAt(i);
				resultado+=nombre.charAt(i);
				

			}
			
				
			
			return resultado;
			}

		public static void main(java.lang.String[] args) throws IOException {
			// TODO Auto-generated method stub
			Scanner teclado1 = new Scanner (System.in);	
			
			String nombre = "";
			char caracter;
			int numeroDeVeces = 0;
			

			do {
				System.out.println("Dime tu nombre");
				longitudNombre(nombre = teclado1.nextLine()+nombre);
				System.out.print("Introduce un carácter: ");
			    caracter = (char) System.in.read();
			    numeroDeVeces = contarCaracteres(nombre, caracter);
			  
				
		    } while (nombre.isEmpty());
		   
		   
		    System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces"); 	
		   
		    System.out.println("Se ha convertido en: " + repetirOcurrencia(nombre));
			

		}

	}

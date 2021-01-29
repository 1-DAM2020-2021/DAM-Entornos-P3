package main.java.liceosorolla;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class String2 {



		private static void longitudNombre(String nombre) {

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
		private static void mayusMinus (String texto) {
			System.out.println(texto.toLowerCase());
			System.out.println(texto.toUpperCase());
		}
		
		private static void vecesRepite(int numVeces,String texto1,String texto2) {
			for (int i = 0; i < numVeces; i++) {
				System.out.print(texto1+" ");
				System.out.print(texto2+" "+"\n");
			}
		}
		
		private static String stringBorrar(String texto1,String borrar) {
			
			
			texto1=texto1.replace(borrar.toLowerCase(), "");
			texto1=texto1.replace(borrar.toUpperCase(), "");
			texto1=texto1.replace(borrar, "");
			
			
			
			return texto1;	
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
			

		    String texto2;
			String texto4;
			String texto4dos;
			int vecesRep=0;
			String texto6="";
			String borrar6="";
			
			teclado1.nextLine();
			
			
			System.out.println("Escribe algo aqui y se pondra en minuscula y mayuscula");
			texto2=teclado1.nextLine();
			mayusMinus(texto2);
			
			
			

			System.out.println("Escribe aqui y se repetira las veces que quieras");
			 texto4=teclado1.nextLine();
			
			System.out.println("Escribe aqui y se repetira las veces que quieras");
			 texto4dos=teclado1.nextLine();
			
			System.out.println("Cuantas veces quieres que se repita"+"\n");
			 vecesRep=teclado1.nextInt();
			 vecesRepite(vecesRep, texto4, texto4dos);

			//teclado1.nextLine();
			
			System.out.println("Escribe y se borra la palabra que quieras");
			texto6=teclado1.next();
			
			System.out.println("Introduce palabra a borrar");
			borrar6=teclado1.next();
			
			 System.out.println(stringBorrar(texto6,borrar6));
		    
		    teclado1.close();
		    
		    
		    
		}

	}

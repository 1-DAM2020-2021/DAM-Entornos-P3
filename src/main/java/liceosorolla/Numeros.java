package main.java.liceosorolla;

import java.util.Scanner;

public class Numeros {
	
	private static void calculaPrimo(int numero) {
		int divisores= 0;
		for(int i=1;i<=numero;i++) {
			if(numero % i == 0) 
				divisores++;
		}
		if(divisores>2) {
			System.out.println("No es primo");
		}else {
			System.out.println("Es primo");
		}
		}
	

	private static void segundos(int numero2) {
		int minutos;
		int horas;
		int resto;
		int segundos;
		
		horas=numero2/3600;
		resto=numero2%3600;
		minutos=resto/60;
		segundos=resto%60;
		
		
		System.out.println("El numero: " +numero2+ " son " +horas+ " horas " +minutos+ " minutos y " +segundos+ " segundos");
	}
	
	
	private static void Armstrong(int numero3) {
    	int digitos = 0;
    	int resto;
    	int suma = 0;
    	
    	while (numero3>0){
    	  numero3 = numero3/10;
    	  digitos++;
    	}
    			
    	System.out.println("Tiene " + digitos + " dígitos");
    	
    	while (numero3>0){
      	  numero3 = numero3/10;
      	resto=numero3%10;
    	suma=resto^digitos+suma;
      	}
    	
    	if(suma==numero3) {
    		System.out.println("El número es Armstrong");
    	}else {
    		System.out.println("No es número Armstrong");
    	}
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner (System.in);
		
		int numero = 0;
		int numero2;
		
		//Primer Ejercicio
		do {
			System.out.println("Introduce un numero: ");
			numero=teclado1.nextInt();
			if(numero>0)
			calculaPrimo(numero);
		}while(numero!=0);
		
		
		//Tercer Ejercicio
		System.out.println("Ponme el numero que quieras pasar a minutos y horas: ");
		numero2=teclado1.nextInt();
		
		segundos(numero2);
		
		
		//Quinto Ejercicio
		int numero3;
		System.out.println("Indica el numero que quiera escoger");
		numero3=teclado1.nextInt();
		
		Armstrong(numero3);
	}
}



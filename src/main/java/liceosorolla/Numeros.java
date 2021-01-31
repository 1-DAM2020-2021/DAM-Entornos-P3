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
	public static int factorial(int n) {
        int resultado = 1;
        
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        
        return resultado;
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
	public static boolean es_suerte(int num) {
		
		int contador = 2;
		int siguientePosicion = num;
		
		 while (contador < num){
			  
		  if(num % contador == 0){
			  return false;
			  
		  }
		  siguientePosicion -= siguientePosicion/contador;
		  		    
		  			contador++;
      	
		  }
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado1 = new Scanner (System.in);
		
		int numero = 0;
		int numero2;
		int n = 0;
		int num,a=1,b=0,c;
		String numero4 = "";
		
		do {
			System.out.println("Introduce un numero: ");
			numero=teclado1.nextInt();
			n=teclado1.nextInt();
			if(numero>0)
			calculaPrimo(numero);
		}while(numero!=0);
		
		System.out.println(factorial(5));
		
		
		System.out.println("Ponme el numero que quieras pasar a minutos y horas: ");
		numero2=teclado1.nextInt();
		
		segundos(numero2);
		
		
	    System.out.println("First 20 Pell numbers: ");
	    for(num=1; num<=20; num++)
	     {
	      c= a + 2*b;
	      System.out.print(c+" ");
	      a = b;
	      b = c;
	     }
		
		int numero3;
		System.out.println("Indica el numero que quiera escoger");
		numero3=teclado1.nextInt();
		
		Armstrong(numero3);
		
		System.out.println("Dime un numero: ");
			numero4 = teclado1.next();
		
		es_suerte(num);
	}
}



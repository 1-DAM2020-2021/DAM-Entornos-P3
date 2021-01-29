package main.java.liceosorolla;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	private static double mediana(int[] array) {
		int numero = array.length;
		double mediana = 0;
		if(numero % 2 == 0){
            int sumaMedios = array[numero/2] + array[numero/2 - 1]; 
            mediana = (double)sumaMedios / 2; 
        } else {
            mediana = array[numero/2];
        }
		System.out.println("La mediana es: " +mediana);
		return mediana;
		
	}
	private static int mayor(int[]array) {
		int mayor=0;
	
		for(int i=0;i<array.length;i++){
			
			if(array[i]>mayor) {
				mayor=array[i];
			
			}
		
		}
	
		
		return mayor;
		
	}
	private static int menor(int[]array) {
		int menor=50000;

		for(int i=0;i<array.length;i++){
			
			if(array[i]<menor) {
			menor=array[i];
			}
		}

		
		return menor;
	}
	
	private static int media(int[]array) {

		int total=0;
		
		for(int i=0;i<array.length;i++) {
			total = array[i]+total;
			}
			
		System.out.println("La nota media es: " + total/array.length);
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		System.out.println("Hola");
		
		Scanner teclado1 = new Scanner (System.in);
		System.out.println("Por favor, ¿cuántos números quiere introducir?");
		numero = teclado1.nextInt();
		
		int[] array = new int[numero];
		
		
		
		for(int i = 0; i<array.length;i++) {
			System.out.println("Introduce el siguiente numero: ");
			array[i]=teclado1.nextInt();
			
	}
		System.out.println("El numero mayor es : "+ mayor(array));
		System.out.println("El numero menor es: "+ menor(array));
		mediana(array);
		media(array);
		
		Arrays.sort(array);
		System.out.println( "Ordenados es:" );
		for (int i = 0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
		}	

		
		
	
	}

}

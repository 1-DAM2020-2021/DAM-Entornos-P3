package main.java.liceosorolla;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = null;
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
		
		mediana(array);
	}

}

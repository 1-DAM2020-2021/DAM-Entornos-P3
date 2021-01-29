package main.java.liceosorolla;

import java.util.Scanner;

public class Decimales {

		private static double calcula1(double A,double B, double C) {
			System.out.println(Math.sqrt((B*B)-(4*A*C)));
			double x1 = (-B + Math.sqrt((B*B)-(4*A*C)))/(2*A);
			
			return x1;  

		}
		
		private static double calcula2(double A,double B, double C) {
			
			double x2 = (-B - Math.sqrt((B*B)-(4*A*C)))/(2*A);  
			
			
			return x2;
		}
		private static double generanumero(double numero) {
			
			Scanner teclado = new Scanner(System.in);	
				
				double n = teclado.nextDouble();
				
				return n;		
				
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado = new Scanner(System.in);
		
		double A, B, C;
		double numero = 0;
		double numero2=0;
		
		System.out.println("Introduzca el valor A:");
		A = teclado.nextDouble();
		
		System.out.println("Introduzca el valor B:");
		B = teclado.nextDouble();
		
		System.out.println("Introduzca el valor C:");
		C = teclado.nextDouble();
		
		double x1 = calcula1(A, B, C);
		System.out.println("x1 es:" + x1);
		
		double x2 = calcula2(A, B, C);
		System.out.println("x2 es:" + x2);
		
		System.out.println("Introduzca un numero con decimales: ");
		numero = teclado.nextDouble();
		
		System.out.println("El numero sin decimales:" + Math.round(numero));
		
		System.out.println("Introduzca un numero con decimales: ");
		numero2 = teclado.nextDouble();
		System.out.println("al alza:" + Math.ceil(numero2));
	
		
	}

}


package Ejercicios;

import java.util.Scanner;

public class Ejercicio8b_1 {
	public static void main(String[] args) {
		int combinacion = 0;
		int intentos = 0;
		int pass = 1234;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca una combinacion de cuatro numeros");
			combinacion = sc.nextInt();
			intentos++;
		} while ((intentos < 4) && (pass !=combinacion));
		
		if(intentos>=4)
		System.out.println("Intentos excedidos");
		
		if(pass==combinacion)
			System.out.println("Acertaste la combin12acion");
	
	}
}

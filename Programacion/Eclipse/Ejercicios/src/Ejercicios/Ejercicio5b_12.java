package Ejercicios;

import java.util.Scanner;

public class Ejercicio5b_12 {
	public static void main(String[] args) {
		comparador();
	}

	private static void comparador() {
		int a;
		int b;
		int c;
		int mayor = 0;
		int mediano = 0;
		int menor = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		a = sc.nextInt();
		System.out.println("Dime un numero");
		b = sc.nextInt();
		System.out.println("Dime un numero");
		c = sc.nextInt();
		mayor = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
		menor = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
		mediano = (a > menor && a < mayor) ? a : (b > menor && b < mayor) ? b : c;

		System.out.println("El mayor es " + mayor);
		System.out.println("El mediano es " + mediano);
		System.out.println("El pequeño es " + menor);

	}
}

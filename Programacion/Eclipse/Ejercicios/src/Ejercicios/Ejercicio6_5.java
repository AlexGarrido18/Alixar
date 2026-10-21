package Ejercicios;

import java.util.Scanner;

public class Ejercicio6_5 {
	public static void main(String[] args) {
		radioCircunferencia();
	}

	private static void radioCircunferencia() {
		int radio;
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("BIENVENIDO AL PRGRAMA MATEMATICO DE CIRCUNFERENCIAS");
		System.out.println("INTRODUZCA EL RADIO DE SU CIRCUNFERENCIA");
		radio = sc.nextInt();

		do {
			System.out.println("1.Calcular diámetro");
			System.out.println("2.Calcular perímetro");
			System.out.println("3.Calcular área");
			System.out.println("Seleccine una opcion");
			opcion = sc.nextInt();
			if (opcion > 3)
				System.out.println("Introduzca una opcion válida");
		} while (opcion > 3);

		switch (opcion) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:

		}
	}
}

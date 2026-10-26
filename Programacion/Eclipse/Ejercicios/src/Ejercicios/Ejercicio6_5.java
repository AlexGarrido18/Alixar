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
			if (opcion < 1 || opcion > 3)
				System.out.println("Introduzca una opcion válida");
		} while (opcion < 1 || opcion > 3);

		switch (opcion) {
		case 1:
			System.out.println("Diámetro = " + (2 * radio));
			break;
		case 2:
			System.out.println("Perímetro = " + (2 * Math.PI * radio));
			break;
		case 3:
			System.out.println("Área = " + (Math.PI * radio * radio));
			break;
		default:

		}
	}
}

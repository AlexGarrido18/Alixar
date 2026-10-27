package Ejercicios;

import java.util.Scanner;

public class Ejercicio8_10 {
	public static void main(String[] args) {
		tablaMultiplicar();
	}

	private static void tablaMultiplicar() {
		int num;
		int total;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("INTRODUCE EL NUMERO A MULTIPLICAR");
			num = sc.nextInt();
			if (num > 10)
				System.out.println("Solo hasta el 10");
		} while (num < 0 || num > 10);
		for (int i = 1; i <= 10; i++) {

			total = num * i;
			System.out.println(i + (" X ") + num + (" = ") + total);

		}

	}
}

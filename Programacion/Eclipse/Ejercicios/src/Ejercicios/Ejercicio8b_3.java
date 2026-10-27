package Ejercicios;

import java.util.Scanner;

public class Ejercicio8b_3 {
	public static void main(String[] args) {
		fibonacci();
	}

	private static void fibonacci() {
		int fibo = 0;
		int anterior2 = 0;
		int anterior1 = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUCE CUANTOS NUMEROS DE FIBONACCI QUIERES");
		n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			fibo = anterior1 + anterior2;
			anterior2 = anterior1;
			anterior1 = fibo;
			System.out.print(fibo + " ");
		}
	}
}

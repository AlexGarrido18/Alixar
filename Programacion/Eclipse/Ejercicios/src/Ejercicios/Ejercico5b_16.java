package Ejercicios;

import java.util.Scanner;

public class Ejercico5b_16 {
	public static void main(String[] args) {
		ejercicio16();
	}

	private static void ejercicio16() {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("INTRODUCE UN NUMERO Y TE VOY A DECIR SIMPRE EL PRIMER NUMERO");	
		num = sc.nextInt();
		while (num >=10) {
			num /= 10; // IGUAL QUE PONER num=num/10
		}
		System.out.println("El primer numero numero "+num);

	}

}

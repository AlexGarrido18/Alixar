package Ejercicios;

import java.util.Scanner;

public class Ejercicio5b_17 {
	public static void main(String[] args) {
		ejercicio17();
	}

	private static void ejercicio17() {
		int num;
		int primerNum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("DIME UN NUMERO DE HASTA 5 CIFRAS Y TE DIGO EL PRIMERO CRACK MASTODONDE FIERA");
		num=sc.nextInt();
		primerNum=num;
		System.out.println("El primer num es "+primerNum);
	}
}

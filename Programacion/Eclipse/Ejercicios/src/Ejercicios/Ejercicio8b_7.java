package Ejercicios;

import java.util.Scanner;

public class Ejercicio8b_7 {
	public static void main(String[] args) {
		voltear();
	}

	private static void voltear() {
		int num;
		int invertido=0;
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Dime un numero y te lo digo al reves");
		num=sc.nextInt();
		sc.close();
		
		while(num!=0) {
			int ultimoDigito=num%10; //te coge la ultima cifra 
			invertido=(invertido*10)+ultimoDigito; // te añade la ultima cifra
			num=num/10;// te quita la ultima cifra 
		}
		System.out.println("Numero invertido "+invertido);
	}
}

package Martes06;

import java.util.Scanner;

public class Tres {
	public static void main(String[] args) {
		
		int primerNumero;
		int segundoNumero;
		int suma;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce primer número por teclado");
		primerNumero=sc.nextInt();
		System.out.println("El número introducido es el:"+primerNumero);
		       
		
		System.out.println("Introduce segundo número por teclado");
		
		segundoNumero=sc.nextInt();
		
		System.out.println("El número introducido es el:"+segundoNumero);
		
		suma=primerNumero+segundoNumero;
		
		System.out.println("La suma es:"+suma);
		
		if (primerNumero>segundoNumero)
			System.out.println("El primero es mayor");
		else if (primerNumero<segundoNumero)
			System.out.println("El primero es mayor");
			
	}

}

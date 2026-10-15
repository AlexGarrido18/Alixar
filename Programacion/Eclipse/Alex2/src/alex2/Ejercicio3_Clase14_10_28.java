package alex2;

import java.util.Scanner;

public class Ejercicio3_Clase14_10_28 {

	public static void main(String[] args) {
		
//		double nota;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Introduce la nota de tu examen");
//		nota=sc.nextDouble();
//		
//		sc.close();
//		
//		if(nota<0)
//			System.out.println("NOTA INCORRECTA");
//		else if(nota<5)
//			System.out.println("SUSPENSO");
//		else if (nota<6) 
//			System.out.println("APROBADO");
//		else if (nota<7)
//			System.out.println("BIEN");
//		else if (nota<9)
//			System.out.println("NOTABLE");
//		else
//			System.out.println("SOBRESALIENTE");
		
		
double nota;
String calificacion="Nota incorrecta";

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la nota de tu examen");
		nota=sc.nextDouble();
		
		sc.close();
		
		if(nota<0)
			System.out.println("NOTA INCORRECTA");
		else if(nota<5)
			calificacion="Suspenso";
		else if (nota<6) 
			calificacion="Aprobado";
		else if (nota<7)
			calificacion="Bien";
		else if (nota<9)
			calificacion="Notable";
		else
			calificacion="Sobresaliente";
		
		System.out.println(calificacion);
	}
}
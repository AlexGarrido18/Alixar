package alex2;

import java.util.Scanner;

public class Ejercicio5b_7 {
	public static void main(String[] args) {
		calcularmedia();
	}
	private static void calcularmedia(){
		float notas=0;
		float sumatorio=0;
		float notasTotales=0;
		float media;
		
		Scanner sc=new Scanner(System.in);
		for (int i = 1; i <=3; i++) {
			System.out.println("Introduce las notas");
			notas=sc.nextFloat();
			notasTotales++;
			sumatorio=sumatorio+notas;
		}
		sc.close();
		media=sumatorio/notasTotales;
		System.out.println("La media de las tres notas es "+media);
		if(media<5)
			System.out.println("INSUFICIENTE");
		else if (media<=6)
			System.out.println("BIEN");
		else if ((media>6)&&(media<=8))
			System.out.println("NOTABLE");
		else if ((media>=8)&&(media<=10))
			System.out.println("SOBRESALIENTE");
		else
			System.out.println("ERROR");
	}
	}	

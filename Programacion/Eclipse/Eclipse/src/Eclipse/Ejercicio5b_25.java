package Eclipse;

import java.util.Scanner;

public class Ejercicio5b_25 {
	public static void main(String[] args) {
		calcularDesayuno();

	}

	public static void calcularDesayuno() {
		String comida = "";
		String bebida = "";
		String complemento = "";
		double pcomida = 0;
		double pbebida = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Que ha tomado para comer: Palmera - Donut - Pitufo");
		comida = sc.next().toLowerCase();
		switch (comida) {
		case "palmera":
			pcomida = 1.40;
			break;
		case "donut":
			pcomida = 1;
			break;
		case "pitufo":
			System.out.println("¿Con aceite o con tortilla");
			complemento = sc.next().toLowerCase();
			switch (complemento) {
			case "aceite":
				pcomida = 1.20;
				break;
			case "tortilla":
				pcomida = 1.60;
				break;
			default:
				System.out.println("Elija una opcion correcta");

			}

		default:
			System.out.println("Elija una opcion correcta");
		}
		System.out.println("¿Qué ha tomado para beber café o zumo?");
		bebida = sc.next().toLowerCase();
		switch (bebida) {
		case "cafe":
			pbebida = 1.20;
			break;
		case "zumo":
			pbebida = 1.50;
			break;
		default:
			System.out.println("Introduzca una bebida correcta");
		}
		sc.close();
		double total = pcomida + pbebida;

		System.out.println(comida + ": " + pcomida + " euros");
		System.out.println(bebida + ": " + pbebida + " euros");
		System.out.println("Total " + total + " euros");
	}
}

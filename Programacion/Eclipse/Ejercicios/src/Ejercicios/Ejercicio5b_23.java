package Ejercicios;

import java.util.Scanner;

public class Ejercicio5b_23 {
	public static void main(String[] args) {
		comprarTarta();
	}

	private static void comprarTarta() {

		String tarta = "";
		String tipoChocolate = "";
		String opcionNata = "";
		String opcionNombre = "";

		double precio;
		final double TARTA_MANZANA = 18;
		final double TARTA_FRESA = 16;
		final double CHOCOLATE_BLANCO = 15;
		final double CHOCOLATE_NEGRO = 14;
		final double NATA = 2.50;
		final double PER_NOMBRE = 2.75;

		Scanner sc = new Scanner(System.in);
		System.out.println("Elige un sabor de tarta: MANZANA - FRESA - CHOCOLATE");
		tarta = sc.next().toLowerCase();
		switch (tarta) {
		case "manzana":
			System.out.println("¿Desea añadirle nata?");
			opcionNata = sc.next().toLowerCase();
			if (opcionNata.equals("si")) {
				System.out.println("¿Desea añadirle un nombre?");
				opcionNombre = sc.next().toLowerCase();
				if (opcionNombre.equals("si")) {
					precio = TARTA_MANZANA + NATA + PER_NOMBRE;
					System.out.println("Tarta de manzana: " + TARTA_MANZANA);
					System.out.println("Con nata: " + NATA);
					System.out.println("Con nombre: " + PER_NOMBRE);
					System.out.println("TOTAL: " + precio);
				} else if (opcionNombre.equals("no")) {
					precio = TARTA_MANZANA + NATA;
					System.out.println("Tarta de manzana: " + TARTA_MANZANA);
					System.out.println("Con nata: " + NATA);
					System.out.println("TOTAL: " + precio);
				} else
					System.out.println("Introduza si o no");
			} else if (opcionNata.equals("no")) {
				System.out.println("¿Desea añadirle un nombre?");
				opcionNombre = sc.next().toLowerCase();
				if (opcionNombre.equals("si")) {
					precio = TARTA_MANZANA + PER_NOMBRE;
					System.out.println("Tarta de manzana: " + TARTA_MANZANA);
					System.out.println("Con nombre: " + PER_NOMBRE);
					System.out.println("TOTAL: " + precio);
				} else if (opcionNombre.equals("no")) {
					precio = TARTA_MANZANA;
					System.out.println("Tarta de manzana: " + TARTA_MANZANA);
					System.out.println("TOTAL: " + precio);
				} else
					System.out.println("Introduza si o no");

			} else
				System.out.println("Introduzca si o no");
			break;
		case "fresa":
			System.out.println("¿Desea añadirle nata?");
			opcionNata = sc.next().toLowerCase();
			if (opcionNata.equals("si")) {
				System.out.println("¿Desea añadirle un nombre?");
				opcionNombre = sc.next().toLowerCase();
				if (opcionNombre.equals("si")) {
					precio = TARTA_FRESA + NATA + PER_NOMBRE;
					System.out.println("Tarta de fresa: " + TARTA_FRESA);
					System.out.println("Con nata: " + NATA);
					System.out.println("Con nombre: " + PER_NOMBRE);
					System.out.println("TOTAL: " + precio);
				} else if (opcionNombre.equals("no")) {
					precio = TARTA_FRESA + NATA;
					System.out.println("Tarta de fresa: " + TARTA_FRESA);
					System.out.println("Con nata: " + NATA);
					System.out.println("TOTAL: " + precio);
				} else
					System.out.println("Introduza si o no");
			} else if (opcionNata.equals("no")) {
				System.out.println("¿Desea añadirle un nombre?");
				opcionNombre = sc.next().toLowerCase();
				if (opcionNombre.equals("si")) {
					precio = TARTA_FRESA + PER_NOMBRE;
					System.out.println("Tarta de fresa: " + TARTA_FRESA);
					System.out.println("Con nombre: " + PER_NOMBRE);
					System.out.println("TOTAL: " + precio);
				} else if (opcionNombre.equals("no")) {
					precio = TARTA_FRESA;
					System.out.println("Tarta de fresa: " + TARTA_FRESA);
					System.out.println("TOTAL: " + precio);
				} else
					System.out.println("Introduza si o no");

			} else
				System.out.println("Introduzca si o no");
			break;
		case "chocolate":
			System.out.println("Desea chocolate blanco o chocolate negro");
			tipoChocolate = sc.next().toLowerCase();
			if (tipoChocolate.equals("blanco")) {
				System.out.println("¿Desea añadirle nata?");
				opcionNata = sc.next().toLowerCase();
				if (opcionNata.equals("si")) {
					System.out.println("¿Desea añadirle un nombre?");
					opcionNombre = sc.next().toLowerCase();
					if (opcionNombre.equals("si")) {
						precio = CHOCOLATE_BLANCO + NATA + PER_NOMBRE;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_BLANCO);
						System.out.println("Con nata: " + NATA);
						System.out.println("Con nombre: " + PER_NOMBRE);
						System.out.println("TOTAL: " + precio);
					} else if (opcionNombre.equals("no")) {
						precio = CHOCOLATE_BLANCO + NATA;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_BLANCO);
						System.out.println("Con nata: " + NATA);
						System.out.println("TOTAL: " + precio);
					} else
						System.out.println("Introduza si o no");
				} else if (opcionNata.equals("no")) {
					System.out.println("¿Desea añadirle un nombre?");
					opcionNombre = sc.next().toLowerCase();
					if (opcionNombre.equals("si")) {
						precio = CHOCOLATE_BLANCO + PER_NOMBRE;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_BLANCO);
						System.out.println("Con nombre: " + PER_NOMBRE);
						System.out.println("TOTAL: " + precio);
					} else if (opcionNombre.equals("no")) {
						precio = CHOCOLATE_BLANCO;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_BLANCO);
						System.out.println("TOTAL: " + precio);
					} else
						System.out.println("Introduza si o no");

				} else
					System.out.println("Introduzca si o no");
			} else if (tipoChocolate.equals("negro")) {
				System.out.println("¿Desea añadirle nata?");
				opcionNata = sc.next().toLowerCase();
				if (opcionNata.equals("si")) {
					System.out.println("¿Desea añadirle un nombre?");
					opcionNombre = sc.next().toLowerCase();
					if (opcionNombre.equals("si")) {
						precio = CHOCOLATE_NEGRO + NATA + PER_NOMBRE;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_NEGRO);
						System.out.println("Con nata: " + NATA);
						System.out.println("Con nombre: " + PER_NOMBRE);
						System.out.println("TOTAL: " + precio);
					} else if (opcionNombre.equals("no")) {
						precio = CHOCOLATE_NEGRO + NATA;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_BLANCO);
						System.out.println("Con nata: " + NATA);
						System.out.println("TOTAL: " + precio);
					} else
						System.out.println("Introduza si o no");
				} else if (opcionNata.equals("no")) {
					System.out.println("¿Desea añadirle un nombre?");
					opcionNombre = sc.next().toLowerCase();
					if (opcionNombre.equals("si")) {
						precio = CHOCOLATE_NEGRO + PER_NOMBRE;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_NEGRO);
						System.out.println("Con nombre: " + PER_NOMBRE);
						System.out.println("TOTAL: " + precio);
					} else if (opcionNombre.equals("no")) {
						precio = CHOCOLATE_NEGRO;
						System.out.println("Tarta de chocolate: " + CHOCOLATE_NEGRO);
						System.out.println("TOTAL: " + precio);
					} else
						System.out.println("Introduza si o no");

				} else
					System.out.println("Introduzca si o no");
			} else
				System.out.println("Introduzca un chocolate de las opciones");
		default:
			System.out.println("Introduzca un sabor de las opciones");
		}
		sc.close();
	}
}

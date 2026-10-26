package Ejercicios;

import java.util.Scanner;

public class Ejercicio5b_21 {
	public static void main(String[] args) {

		double sueldoBruto = calcularSueldoBruto();
		double Irpf = calcularIrpf();
		double sueldoNeto = calcularSueldoNeto();

	}

	private static double calcularSueldoBruto() {

		int cargo = 0;
		int sueldoBase;
		int dias;
		final int DIA_PAGADO = 30;

		Scanner sc = new Scanner(System.in);

		System.out.println("---------CALCULADOR NOMINA-------");
		System.out.println("INTRODUZCA SU CARGO");
		cargo = sc.nextInt();

		switch (cargo) {
		case 1:
			sueldoBase = 950;
			break;
		case 2:
			sueldoBase = 1200;
			break;
		case 3:
			sueldoBase = 1600;
			break;

		default:
			System.out.println("Introduzca el numero correcto");
		}

		System.out.println("Cuantos dias has estado de viaje");
		dias = sc.nextInt();

		int dietas = dias * DIA_PAGADO;

		double sueldoBruto = sueldoBase * dietas;
		return sueldoBruto;

	}
}

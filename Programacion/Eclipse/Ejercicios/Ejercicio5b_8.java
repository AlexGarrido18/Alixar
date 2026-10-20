package alex2;

import java.util.Scanner;

public class Ejercicio5b_8 {
	public static void main(String[] args) {
		ecuacionSegundoGrado();
	}

	private static void ecuacionSegundoGrado() {

		double a;
		double b;
		double c;
		double x;
		double discriminante;

		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa realiza ecuaciones de segundo grado");
		System.out.println("Introduzca el valor de a");
		a = sc.nextDouble();
		System.out.println("Introduzca el valor de b");
		b = sc.nextDouble();
		System.out.println("Introduzca el valor de c");
		c = sc.nextDouble();
		sc.close();

		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Infinitas soluciones");
				else
					System.out.println("Math EROR");
			} else {
				x = -c / b;
				System.out.println("x=" + x);
			}
		} else {
			discriminante = b * b - 4 * a * c;
			if (discriminante > 0) {
				System.out.println("x1=" + ((-b + Math.sqrt(discriminante)) / (2 * a)));
				System.out.println("x2=" + ((-b - Math.sqrt(discriminante)) / (2 * a)));
			} else if (discriminante == 0) {
				System.out.println("x=" + (-b) / (2 * a));
			} else if (discriminante < 0) {
				System.out.println("No tiene solucion real");
			}
		}
	}
}

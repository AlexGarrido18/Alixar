package alex2;

import java.util.Scanner;

public class Ejercicio_clase_20_10_26 {
	public static void main(String[] args) {
		int num;
		int suma = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num = sc.nextInt();
		suma=suma+num;
		while ((num != 0) && (suma <= 200)) {
			System.out.println("Dime un numero");
			num = sc.nextInt();
			suma = suma + num;
		}
		
	if (num==0)
		System.out.println("Fin del sumatorio "+suma);
	else
		System.out.println("Te pasaste del tope");
	}
}

package alex2;

import java.util.Scanner;

public class Ejercicio_Clase_15_10_26 {
	public static void main(String[] args) {
		
		int max=50;
		int numeroSecreto=(int)(Math.random()*max)+1;
		int numeroIntroducido;
		boolean adivinar=false;
		final int ADIVINAR_INTENTOS=10;
		boolean quedanIntentos=true;
		
		Scanner sc=new Scanner(System.in);
		
		while((!adivinar) && (quedanIntentos))
			System.out.println("Adivina el numero secreto");
				numeroIntroducido=sc.nextInt();
				if(numeroIntroducido<numeroSecreto)
					System.out.println("El numero introducido es menor");
				else
					System.out.println("El numero introducido es mayor");
				ADIVINAR_INTENTOS--;
					
	}
}

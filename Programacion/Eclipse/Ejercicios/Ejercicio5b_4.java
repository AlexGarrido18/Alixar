package alex2;

import java.util.Scanner;

public class Ejercicio5b_4 {
public static void main(String[] args) {
	final int HORAS_ORDINARIAS=12;
	final int HORAS_EXTRAORDINARIAS=16;
	int horas;
	int salario=0;
	String a="El sueldo semanal que le corresponde ponde es ";
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Introduzca las horas trabajadas esta semana");
	horas=sc.nextInt();
	sc.close();
	
	if(horas<=40)
		salario=horas*HORAS_ORDINARIAS;
	else
		salario=horas*HORAS_EXTRAORDINARIAS;
	
	System.out.println(a+salario+" euros");
	
}
}

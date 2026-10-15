package Martes06;

public class Uno {
public static void main(String[] args) {
	System.out.println("Hola Mundo");
	System.out.println("Me llamo Natalia");
	
	System.out.println("-----------------PARES-------------");
	for (int i=1;i<=100;i++)
		if ((i%2)==0)
			System.out.println(i);
	
	System.out.println("-----------------IMPARES-------------");
	
	int j=1;
	while(j<=100) {
		if ((j%2)==1)
			System.out.println(j);
		j++;
	}
	System.out.println("-----------------DECREMENTO PAR-------------");
	
	int k=100;
	while(k>=1) {
		if ((k%2)==0)
			System.out.println(k);
		k--;
	}
	System.out.println("-----------------DECREMENTO IMPAR-------------");
	for (int i=100;i>0;i--)
		if ((i%2)==1)
			System.out.println(i);
	
	}
}

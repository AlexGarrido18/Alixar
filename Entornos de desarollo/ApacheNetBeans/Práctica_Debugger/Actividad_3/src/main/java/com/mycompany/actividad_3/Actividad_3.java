/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_3;


import java.util.Scanner;

/**
 *
 * @author usuario_tarde
 */
public class Actividad_3 {

    public static void main(String[] args) {
        System.out.println("Vamos a sumar numeros");
        sumador();
    }
    private static void sumador(){
        int num1;
        int num2;
        int suma;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero a sumar");
        num1=sc.nextInt();
        System.out.println("Introduce el otro numero");
        num2=sc.nextInt();
        
       suma=num1+num2;
        
        System.out.println("El resultado de la suma es "+suma);
        
    }   
}


                                           //TABLAS CON WHILE.

package com.mycompany.r_ejerciciosenclase;

import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la tabla que deseas ver:");
        int n = scanner.nextInt(); //Numero de tabla
        
        System.out.println("La tabla de multiplicar del numero " + n + " es: ");
        System.out.println();
        
        int a = 1; //Multiplicador 
        
        while (a<=10) {
            int resultado = n*a ;
            System.out.println(n + "X" + a + "=" + resultado);
            a++;
        }
        scanner.close();
       
    }
    
}

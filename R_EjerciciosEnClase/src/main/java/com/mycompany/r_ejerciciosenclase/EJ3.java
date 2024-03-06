
                                       //CALCULADORA BASICA.

package com.mycompany.r_ejerciciosenclase;

import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
        char continuar = 's' ;
       
       
        
        while(continuar == 's'){

        System.out.println("Que operacion quiere realizar: \n1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n0.Salir");
        int op = scanner.nextInt();
    
            if (op == 0) {
                System.out.println("Saliendo del programa...");
                break;
            
            }
            
            System.out.println("Digite el primer valor:");
            Double n1 = scanner.nextDouble(); 
            
            double resultado = 0;
            System.out.println("Digite el segundo valor:");
            double n2 = scanner.nextDouble();
            
            if (op == 1) {
                resultado = n1 + n2;
            } else if (op == 2) {
                resultado = n1 - n2;
            } else if (op == 3) {
                resultado = n1 * n2;
            } else if (op == 4) {
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("No se puede dividir entre cero.");
                    continue;
                }
            } else {
                System.out.println("Operacion no valida");
                continue;
            }

            System.out.println("El resultado de su operacion es: " + resultado);
            System.out.println("¿Desea realizar otra operacion? ('s' para continuar, cualquier otra tecla para salir)");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Fin del programa");
        scanner.close();
       
    }
    
}

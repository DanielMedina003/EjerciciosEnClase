
                                         //SUMA DE NUMEROS PARES E IMPARES.

package com.mycompany.r_ejerciciosenclase;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int c = 0;
        int sumap = 0;
        int sumai = 0;
        
       ArrayList<Integer> np = new ArrayList<>();
       ArrayList<Integer> nip = new ArrayList<>();
    
        System.out.println("Digite la cantidad de numeros pares e impares que desea contar y sumar: ");
        int n = scanner.nextInt();
        
        for (int i = 1; c < n; i++) {
            if(i % 2 == 0) {
                np.add(i);
                sumap +=i;
                c++;
            }
            
            else{
                nip.add(i);
                sumai +=i;
            }
            
        }
        
        System.out.println("Los números pares son: " + np);
        System.out.println("La suma de los primeros " + n + " números pares es: " + sumap );
        System.out.println("\nLos numeros impares son: " + nip);
        System.out.println("La suma de los primeros " + n + " numeros impares es: " + sumai);
        
        scanner.close();
        
    }
    
}

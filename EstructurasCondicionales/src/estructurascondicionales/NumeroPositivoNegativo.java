/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class NumeroPositivoNegativo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("**Verificar si un número es positivo o negativo**");
        int numero;
        System.out.println("Ingrese un número:");
        numero = leer.nextInt();
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo.");
        }
    }

}

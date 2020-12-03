/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaparcial;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class MultiplosDelNumero {

    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, resultado = 0;

        System.out.println("Ingrese porfavor un numero: ");
        num = leer.nextInt();
        
        if (num % 4 == 0) {
            resultado = num / 2;
            System.out.println("El numero " + num + " es multiplo de 4");
            System.out.println(resultado);
        } else if (num % 5 == 0) {
            
            resultado = (int)Math.pow(num,2);
            System.out.println("El numero " + num + " es multiplo de 5" );
            System.out.println(resultado);
        } else if (num % 6 == 0) {
            resultado = num;
            System.out.println("El numero es multiplo de 6" );
            System.out.println(resultado);
        } 

        

    }
}

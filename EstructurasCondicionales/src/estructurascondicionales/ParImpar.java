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
public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declarar e incializar las variables
        int n = 0;
        String tipo = "";
        
        System.out.println("Programa para verificar si un numero es par o impar \n");
        
        //Ingreso de datos
        System.out.println("Ingrese el numero a verificar");
        n = leer.nextInt();
        
        //Proceso para verificar si un numero es par o impar
        if (n % 2 == 0) {
            tipo = "par";
        }
        else {
            tipo = "impar";
        }
        
        //Presentar la salida de datos
        System.out.println("El numero " +n +" es " +tipo);
    }
    
}

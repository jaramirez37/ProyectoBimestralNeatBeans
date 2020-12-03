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
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        //El numero a verificar si es par
        int n = 0;
        
        System.out.println("Programa para verificar si un numero es par \n");
        
        System.out.println("Ingrese el numero a verificar");
        
        n = leer.nextInt(); //Ingrese el numero 
        
        if ((n % 2) == 0) {
            System.out.println("El numero " +n  +" es par");
                
        }       
    }
    
}

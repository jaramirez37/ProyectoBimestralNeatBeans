
package clicorepetitivos;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Programa que permite obtener la potencia de un numero");
        //Declarar e incializar las variables 
        
        int base, pot, cont, result;
        base = 0; pot = 0; cont = 1; result = 1; 
        
        
        //Ingresar los datos
        System.out.println("Ingresar la base de la potencia: ");
        
        base = leer.nextInt();
        
        System.out.println("Ingresar la potencia: ");
        pot = leer.nextInt();
        
        //Ciclo repetitivo que obtiene la potencia de un numero 
        while (cont <= pot){
            result = result * base;
            cont = cont + 1;
        }
        
        //Presentar resultado
        System.out.println("La potencia de: " +base +" elevado a " +pot +" es: "+result);
        
        
        
        
        
    }
}

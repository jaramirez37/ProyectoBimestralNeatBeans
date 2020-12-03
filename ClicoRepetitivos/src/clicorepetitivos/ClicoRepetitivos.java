
package clicorepetitivos;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class ClicoRepetitivos {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        
        int i, n, suma;
        i = 1; n = 0; suma = 0;
        
        //Pedir que se ingrese el limite d elos numeros 
        System.out.println("Ingrese el limite de numeros a presentar");
        n = leer.nextInt();
        
        //Iniciamos el ciclo repetitivo While
        
        while (i <= n){
            System.out.println(i);
            suma = suma + i; 
            i = i + 1;
        }
        System.out.println("La suma de los numeros es: "+suma);
    }
    
}

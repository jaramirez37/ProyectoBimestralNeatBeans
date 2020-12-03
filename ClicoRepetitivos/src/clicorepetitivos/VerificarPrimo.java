
package clicorepetitivos;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class VerificarPrimo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        int cont, cont1, n, div, num;
        
        cont = 1; cont1 = 1; n = 0; div = 0; num = 0;
        
        System.out.println("Ingrese el limite de numeros a verificar si son primos");
        num = leer.nextInt();
        
        while (cont <= num){
            
            System.out.println("Ingrese el numero a verificar");
            num = leer.nextInt();
            
            while (cont1 <= num) {
               if (num % cont1 == 0){
            
                  div = div + 1;
                }
            
            cont1 = cont1 + 1;
        }
        
        if (div == 2){
            
            System.out.println(num +" es Primo");
            System.out.println("-------");
        }
        else{
            System.out.println(num +" no es Primo");
            System.out.println("-------");
        }
        
        cont1 = 1;
        div = 0;
        cont = cont + 1;
        }
    }
}

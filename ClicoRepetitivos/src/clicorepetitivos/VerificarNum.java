
package clicorepetitivos;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class VerificarNum {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declarar e inicializar las variables
        
        int cont, n, num, sumPar, sumImpar, sumNeg, sumPos;
        cont = 1; n = 1; num = 0; sumPar = 0; sumImpar = 0; sumNeg = 0; sumPos = 0;
        
        //Ingresar los datos de entrada: limite
        
        System.out.println("Ingrese el limite de numero a verificar");
        n = leer.nextInt();
        
        //Crear el ciclo para verificar los numeros
        
        while (cont <= n){
            
            System.out.println("Ingrese el numero 1 a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0){ //Verifica si un numero es par  
                sumPar = sumPar + num; //Suma de los numeros pares
            }
            else {                          //Suma los numeros impares
                sumImpar = sumImpar + num; 
            }
            
            if (num > 0){  //Verifica si un numero es positivo o negativos
                sumPos = sumPos + num; //Suma los positivos
            }
            else {
                sumNeg = sumNeg + num; //Suma los negativos 
            }
            
             cont = cont + 1;
            
             System.out.println("La suma de los pares es: " +sumPar);
             System.out.println("La suma de los impares es: " +sumImpar);
             System.out.println("La suma de los positivos es: " +sumPos);
             System.out.println("La suma de los negativos es: " +sumNeg);
        }
        
        System.out.println("Sumas totales \n");
        System.out.println("La suma de los pares es: " +sumPar);
        System.out.println("La suma de los impares es: " +sumImpar);
        System.out.println("La suma de los positivos es: " +sumPos);
        System.out.println("La suma de los negativos es: " +sumNeg);
        
    }
    
}

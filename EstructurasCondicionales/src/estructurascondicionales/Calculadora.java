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
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //Se declaran w inicializan las variables
        double num1, num2, respuesta;
        int opc;
        
        num1 = 0; num2 = 0; respuesta = 0; opc = 1;
        
        System.out.println("Calculadora de operaciones basicas \n");
        
        System.out.println("Ingrese el valor del numero 1");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del numero 2");
        num2 = leer.nextDouble();
        
        //Escribe el menu de opciones en pantalla
        
        System.out.println("Escoja una de las siguientes opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        
        //Se ingresa la opcion
        opc = leer.nextInt(); 
        
        //Se realiza la calculadora con las operaciones basicas
        
        switch (opc) {
            case 1:  {
                respuesta = num1 + num2;
                System.out.println("La suma es: " +respuesta);
            }
            break;
            case 2:  {
                respuesta = num1 - num2;
                System.out.println("La resta es: " +respuesta);
            }
            break;
            case 3:  {
                respuesta = num1 * num2;
                System.out.println("La multiplicacion es: " +respuesta);
            }
            break;
            case 4:  {
                respuesta = num1 / num2;
                System.out.println("La division es: " +respuesta);
            }
            break;
            default:
                System.out.println("Opcion invalida");
            break; 
        } 
    }
    
}

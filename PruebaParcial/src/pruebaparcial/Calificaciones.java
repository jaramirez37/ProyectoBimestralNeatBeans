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
public class Calificaciones {

    

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Double num;
        System.out.println("Ingrese un nÃºmero:");
        num = leer.nextDouble();

        
        if (num >= 3.0) {
            if ((num >= 4.6) && (num <= 5.0)) {
                System.out.println("Excelente");
            } else if ((num >= 4.1) && (num <= 4.5)) {
                System.out.println("Muy bueno");
            } else if ((num >= 3.6) && (num <= 4.0)) {
                System.out.println("Bueno");
            } else if ((num >= 3.3) && (num <= 3.5)) {
                System.out.println("Aceptable");
            } else if ((num >= 3.0) && (num <= 3.2)) {
                System.out.println("Aprobado");
            }else if ((num >= 2.6) && (num <= 2.9)) {
                System.out.println("Deficiente");
            }else if ((num >= 2.1) && (num <= 2.5)) {
                System.out.println("Malo");
            }  
        }else{
            System.out.println("CalificaciÃ³n no aprobatoria");
        }
    }
}

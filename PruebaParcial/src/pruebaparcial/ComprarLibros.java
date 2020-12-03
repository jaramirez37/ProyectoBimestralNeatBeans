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

public class ComprarLibros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Double subtotal = 0.0, total = 0.0;
        String nombre = "", tipoDescuento = "";
        int tipo, cantidad;

     
      
        System.out.println("Ingrese el tipo cliente");
        tipo = leer.nextInt();
        System.out.println("Ingrese la cantidad de libros:");
        cantidad = leer.nextInt();
        System.out.println("Ingrese su nombre:");
        nombre = leer.nextLine();
        leer.nextLine(); 
        System.out.println("Ingrese el subtotal de su compra:");
        subtotal = leer.nextDouble();

    
        if (tipo == 1) {
            tipoDescuento = "0.30";
            total = subtotal - (subtotal * 0.30);
            
        } else if (tipo == 2) {
            tipoDescuento = "0.20";
            total = subtotal - (subtotal * 0.20);

        } else if (tipo == 3) {
            tipoDescuento = "0.10";
            total = subtotal - (subtotal * 0.10);
        }

        if (cantidad > 5 && cantidad < 10) {
            total = total - (total * 0.4);
        } else if (cantidad > 10) {
            total = total - (total * 0.8);
        } else {
            total = total;
        }

        
     
        
        System.out.println("Nombre de usuario:" + nombre);
        System.out.printf("El usuario es de tipo " + tipo); 
        System.out.println("La cantidad de libros es: " + cantidad);
        System.out.println("El subtotal de su compra es: " + subtotal);
        System.out.println("Se le hizo descuento de: " + tipoDescuento);
        System.out.println("El total a cancelar es:" + total);
        
        

    }
}

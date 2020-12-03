
package areacostoterreno;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class AreaCostoTerreno {
    static double base, 
    
    //Altura
      Altura,
      
    //Altura del rectangulo o del triangulo
      Altura_Parcial,
      
    //Area del rectangulo
      AreaRectangulo, 
      
    //Area del triangulo 
      AreaTriangulo,
              
    //Area total del terreno
      AreaTotal; 
    
        public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la base:");
        base = leer.nextDouble();
        
        System.out.println("Ingrese el valor de la altura:");
        
        Altura = leer.nextDouble();
        Altura_Parcial = Altura/2;
        AreaRectangulo = base * AreaRectangulo;
        AreaTriangulo = (base * AreaTriangulo)/2;
        AreaTotal = AreaRectangulo + AreaTriangulo; 
        
        System.out.println("El area total del poligono es:\n" +AreaTotal);
        
    }
    
}


package ejercicioenclasepordos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Ejercicioenclasepordos {

    public static void main(String[] args) {
        
       //variables
        int num;
        int resultado;
        
    //creo objeto escaneable
        Scanner lector = new Scanner(System.in);
        
    //pido un dato en pantalla 
      System.out.println("Ingresar un numero ");
      //lo guardo
              num = lector.nextInt();
              
    //hago una operacion
        resultado = num * 2;
    // imprimo resultado en pantalla 
       System.out.println("El doble del numero ingresado es: " + resultado);
    }
    
}


package ejercicioenclase194;

import java.util.Scanner;

public class Ejercicioenclase194 {

 
    public static void main(String[] args) {
     
        //Defino variables 
            String letra;
            
        
       // creo objeto scanner
       Scanner leerletra = new Scanner(System.in);
       
       System.out.println(" -----------------------------");
       System.out.println("| Ingresa una letra minuscula |");
       System.out.println(" -----------------------------");
       
       letra = leerletra.nextLine();
       
       switch (letra){
       
       //grupo de vocales
       case "a":
       case "e":
       case "o":
            System.out.println(" Ingresaste una vocal abierta");
            break;
       case "i":
       case "u":
           System.out.println("ingresaste una vocal cerrada");
           break;
       default:
           System.out.println("Ingresaste una consonante. ");
           System.out.println("Si ingresaste una mayuscula, deja de hacerte el vivo");
       
       
       }
            
        
        
    }
    
}

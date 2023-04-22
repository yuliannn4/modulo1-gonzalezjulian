
package ejercicio8scanner;

import java.util.Scanner;


public class Ejercicio8Scanner {

    public static void main(String[] args) {
        
        //ingreso las variables
            String nombre;
            int temp;

        //doy linda presentacion
            System.out.println("------------------------------");
            System.out.println("|    Proyecto Temperatura    |");
            System.out.println("------------------------------");

            
        //pido los datos
            System.out.println(" ");
            System.out.print("Hola! Por favor ingrese su nombre: ");
                  Scanner leernombre = new Scanner (System.in);
                  nombre = leernombre.nextLine();
                  
            System.out.print("Ingrese la temperatura actual: ");
                Scanner leertemp = new Scanner (System.in);
                temp = leertemp.nextInt();
                
               
            System.out.print("La temperatura es de " + temp + "°, entonces podes ");
            
  
                
           
             if (temp >=30 ) {
         System.out.println("ir a la playa.");
      } 
       else if (temp <= 25 && temp > 11) {
         System.out.println("ir a caminar.");
      }
       else{
         System.out.println("abrigarte!");
       }
      
            
                  
            




    }
    
}

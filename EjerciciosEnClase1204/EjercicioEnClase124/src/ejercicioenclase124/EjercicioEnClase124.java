
package ejercicioenclase124;

import java.util.Scanner;
        
public class EjercicioEnClase124 {

    public static void main(String[] args) {
       
        //Variabres
        int nac;
        String nombre;
        String apellido;
        int año;
        int resultado;
       
                
        //creando el objeto scanner
        Scanner lector = new Scanner(System.in);
        
        //pidiendo datos
          //defino año
         año= 2023;
        
        System.out.println("Ingresar nombre: ");
                nombre = lector.nextLine();
        System.out.println("Ingresar apellido: ");
                apellido = lector.nextLine();
        System.out.println("Ingrese su año de nacimiento: ");
                nac = lector.nextInt();
        System.out.println("El año actual es: " + año);
        
        //calculando edad
        resultado = año - nac;
        
        //Saludando
        System.out.println("Hola " + nombre + " " + apellido+ "!");
        System.out.println("Tu edad es: " + resultado);
        
    }
    
}

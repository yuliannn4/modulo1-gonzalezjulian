
package ejercicio7scanner;

import java.util.Scanner;


public class Ejercicio7Scanner {

  
    public static void main(String[] args) {
     
        //ngresos las variables 
        String nombre;
        String apellido;
        int dni;
        int nacimiento;
        int año;
        int edad;
                
                
        //pido los datos
        
        System.out.print("Ingrese su nombre: ");
            Scanner leernombre = new Scanner (System.in);
            nombre = leernombre.nextLine();
            
        System.out.print("Ingrese su apellido: ");
            Scanner leerapellido = new Scanner(System.in);
            apellido = leerapellido.nextLine();
            
        System.out.print("Ingrese su DNI: ");
                Scanner leerdni = new Scanner(System.in);
                dni = leerdni.nextInt();
                
        System.out.print("ingresar año de nacimiento: ");
                Scanner leernacimiento = new Scanner(System.in);
                nacimiento = leernacimiento.nextInt();
                
        año = 2023;
                
        //calculando edad
        
        edad = año - nacimiento;
        
        //muestro en pantalla 
        System.out.println("--------------------------------");
        System.out.println( "Hola! " + nombre + " " + apellido + " |");
        System.out.println("Tu edad es de " + edad + " años");
        
        
        
       
      
            
            
            









    }
    
}

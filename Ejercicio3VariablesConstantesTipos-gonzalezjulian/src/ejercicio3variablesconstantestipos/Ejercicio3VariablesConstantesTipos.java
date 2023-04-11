
package ejercicio3variablesconstantestipos;

/**
 *
 * @author Julian
 */
public class Ejercicio3VariablesConstantesTipos {
     public static void main(String[] args) {
// inserto las variables
    int numero1;
    int numero2;
    int suma;
    int edad;
    String nombre;

//Valor de la constante
    final int numero3 = 4;

//ingresar los valores a variables numero1 y numero2 
numero1 = 30;
numero2 = 40;

//operacion sima
    suma = (numero1 + numero2);

//resultado en pantalla de la operacion
     System.out.println("----------------------------------------------");
     System.out.println("|      Valores de las variables               |");
     System.out.println("----------------------------------------------");
     System.out.println("Valor 1 = " +numero1);
     System.out.println("Valor 2 = " +numero2);
     System.out.println("El resultado de la suma de ambos valores es = " +suma);
     System.out.println("---------------------------------------------");
     
// Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
    numero1 = 100;
    numero2 = 10;
            
// suma de ambas
    suma = (numero1 + numero2);
            
//rsultado en pantalla de la 2da operacion
    System.out.println("------------------------------------------------");
    System.out.println("|       Valores de las variables cambiadas       |");
    System.out.println("------------------------------------------------");
    System.out.println("Valor 1 = " +numero1);
    System.out.println("Valor 2 = " +numero2);
    System.out.println("El resultado de la suma de ambos valores es = " +suma);
    System.out.println("---------------------------------------------");
    
// Instancio y muestro en pantalla la variable nombre y su edad
        edad = 25;
        nombre = "Julian";
    
        System.out.println("Nombre: " +nombre);
        System.out.println("edad: " +edad);

// Muestro en pantalla la constante
        System.out.println("Constante: " +numero3);
     
     
     
}
    
}


package ejercicio4variables;

/**
 *
 * @author Julian
 */
public class Ejercicio4Variables {

 
    public static void main(String[] args) {
      
    //declaro las variables
        int VariableN = 6;
        double VariableA = 7.5;
        char VariableC = 'a';
        double ResultadoSuma;
        double ResultadoResta;
        int ResultadoNumerico;
        
    //Hago las operaciones
        ResultadoSuma = VariableN + VariableA;
        ResultadoResta = VariableN - VariableA;
        ResultadoNumerico = VariableC;
        
    //Mostrando en pantalla 
        System.out.println(" --------------------------");
        System.out.println("| Valores de las variables |");
        System.out.println(" --------------------------");
        System.out.println("El valor de N es:  " +VariableN );
        System.out.println("El valor de A es: " +VariableA);
        System.out.println("El valor de C es: " +VariableC);
        
    //mostrando el valor de las operaciones
        System.out.println(" ---------------------------");
        System.out.println("| Valores de las operaciones |");
        System.out.println(" ---------------------------");
        System.out.println(+ VariableN + " + " + VariableA + " = " + ResultadoSuma);
        System.out.println(+ VariableA + " - " + VariableN + " = " + ResultadoResta);
        System.out.println("El valor numerico del caracter a es de: " + ResultadoNumerico);
    


    }
    
}

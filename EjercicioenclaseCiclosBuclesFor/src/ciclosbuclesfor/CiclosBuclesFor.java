
package ciclosbuclesfor;

import java.util.Scanner;


public class CiclosBuclesFor {

   
    public static void main(String[] args) {
        /*estructura del for 
        //for (inicialización; condición; actualización){ }
        */

        
        //escalera de numero de 1 a 100
        
        for (int i =1; i <= 100; i++ ){
            System.out.println(+i);
        }
        
        
        //Ingresar números  y clasificar si son pares o no
        int num=0;
        int par=0;
        int impar=0;
        
        System.out.print("Ingrese un numero: ");
        Scanner leernumero = new Scanner (System.in);
        num = leernumero.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
        
        //Recorrer un lote de números y determinar culés son números múltiples de 3
        
        for (int b =0; b <= 10; b++){
            if (b % 3 == 0){
                System.out.println(b + " es multiplo de 3");
        }
       }
       //4)Mostrar y calcular el factorial de un numero (5) esto sinceramente no entendi, lo copie de la presentacion 
       
        int num1 = 3;
        int resultado = 1;

        for (int c = 2; c < num1 + 1; c++){

        resultado *= c;

        }

        System.out.println(resultado);
        
        // 5)Crear un programa que recorra del 1 a100 y informe al final del la cantidad de números prares e impares del lote.
        
        for (int d = 1; d <= 100; d++) {
            if (d % 2 == 0) {
                System.out.println(d + " es par");
            } else {
                System.out.println(d + " es impar");
            }
        }
        
      }
    }



package ejercicio10switch;

import java.util.Scanner;


public class Ejercicio10Switch {


    public static void main(String[] args) {

        //presentacion 
            System.out.println(" ---------------------------------------------");
            System.out.println("|   Bienvenido a la calculadora de intereses  |");
            System.out.println(" ---------------------------------------------");
        
       //defino la variable  y creo el objeto scaner
             float monto;
             int forma;
             long tarjeta;
             float costofinal;
             float porcentaje;
             float valordecimal;
             int cuotas;
             
             Scanner leermonto = new Scanner(System.in);
             
       //pido que ingresen el monto
       
            System.out.print("Ingrese el importe: ");
            monto = leermonto.nextFloat();
            
       //Muestro en pantalla las opciones de pago
            System.out.println(" ---------------------------------------------");
            System.out.println("| Usted puede abonar con los siguientes metodos|");
            System.out.println("|                 1. Efectivo                  |");
            System.out.println("|           2. Tarjeta de credito              |");
            System.out.println("|            3. Tarjeta de debito              |");
            System.out.println(" ---------------------------------------------");
       
       //Pido la forma de pago
            Scanner leerpago = new Scanner(System.in);
            System.out.print("Ingrese la forma de pago: ");
            forma = leerpago.nextInt();
            
       //si es con tarjeta pido el numero
          
       switch (forma){
                case 1:
                    porcentaje = 10;
                    valordecimal = porcentaje / 100;
                    costofinal = monto - ( monto * valordecimal);
                    System.out.println("Por abonar en efectivo tenes un 10% de descuento!");
                    System.out.println("El monto total a abonar es de: $" + costofinal);
                break;
                    
                case 2:
                    System.out.println("Ingrese los numeros de la tarjeta");
                    Scanner leertarjeta = new Scanner(System.in);
                    tarjeta = leertarjeta.nextLong();
                    
                    Scanner leercuotas = new Scanner(System.in);
                    System.out.print("Ingrese la cantidad de cuotas (hasta 3): ");
                    cuotas = leercuotas.nextInt();
                   
                    porcentaje = 20;
                    valordecimal = porcentaje / 100;
                    costofinal = monto + ( monto * valordecimal);
                    System.out.println("Elegiste pagar en " + cuotas + " cuotas" );
                    System.out.println("El monto total a abonar es de: $" + costofinal);
                break;
                
                case 3:
                    System.out.println("Ingrese los numeros de la tarjeta");
                    //aca me tiro un error su volvia a utilizar Scanner leertarjeta
                    Scanner leertarjetadebit = new Scanner(System.in);
                    tarjeta = leertarjetadebit.nextLong();

                    porcentaje = 10;
                    valordecimal = porcentaje / 100;
                    costofinal = monto + ( monto * valordecimal);
                    System.out.println("Elegiste pagar con tarjeta de debito" );
                    System.out.println("El monto total a abonar es de: $" + costofinal);
                 break;
                 
                default:
                    System.out.println("Lo sentimos, ocurrio un error. Vuelva a intentarlo");
                  
       }       
            }
              


      
    
    
}

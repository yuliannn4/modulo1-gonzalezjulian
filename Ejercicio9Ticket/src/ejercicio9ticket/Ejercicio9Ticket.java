
package ejercicio9ticket;

import java.util.Scanner;

public class Ejercicio9Ticket {


    public static void main(String[] args) {
        
      
        
       //defino las variables 
        String mozo ="";
        double monto=0;
        int modo=0;
        long tarjeta=0;
        int cuotas=0;
        double porcentaje=0;
        double valorporcentaje;
        double total=0;
        double descuento=0;
        
        
        System.out.print("Ingrese el nombre del mozo: ");
        Scanner leermozo = new Scanner (System.in);
        mozo = leermozo.nextLine();
        
        System.out.print("Ingrese el monto: ");
        Scanner leermonto = new Scanner(System.in);
        monto = leermonto.nextDouble();
        
        System.out.println("Medios de pago disponibles");
        System.out.println("1.- Efectivo");
        System.out.println("2.- Tarjeta de credito");
        System.out.println("3.- Tarjeta de debito");
        
        System.out.print("Ingrese el modo de pago: ");
        Scanner leermodo = new Scanner(System.in);
        modo = leermodo.nextInt();
            
            if (modo ==1){
            }
            else if(modo==3){
                System.out.println("Ingrese el numero de tarjeta: ");
                    Scanner leertarjeta = new Scanner (System.in);
                    tarjeta = leertarjeta.nextLong();
                
            }
            else if (modo==2){
                System.out.println("Ingrese el numero de tarjeta: ");
                    Scanner leertarjeta = new Scanner (System.in);
                    tarjeta = leertarjeta.nextLong();
                System.out.println("Ingrese cantidad de cuotas: ");
                    Scanner leercuotas = new Scanner(System.in);
                    cuotas = leercuotas.nextInt();
            }
        
        
        System.out.println("===============================");
        System.out.println("             TICKET           ");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(" Usted fue atendido por: "+ mozo);
        System.out.println("25/04/2023 20:46");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(" Producto 1");
        System.out.println(" Producto 2");
        System.out.println(" Producto 3");
        System.out.println(" Producto 4");
        System.out.println("==============================");
        System.out.println(" SUBTOTAL: $ " +monto);
        
        if (modo==1){
                System.out.println("FORMA DE PAGO: Efectivo");
                    porcentaje = 30;
                    valorporcentaje = porcentaje / 100;
                    total = monto - (monto * valorporcentaje);
                    descuento = monto - total;
                System.out.println("DESCUENTO : $" +descuento  );
                System.out.println("TOTAL A PAGAR: $" +total);
                System.out.println("===============================");
                System.out.println("   TE ESPERAMOS PRONTO!      ");
                System.out.println("===============================");
        
        
        
        }else if(modo == 2){
                System.out.println("FORMA DE PAGO: Tarjeta de credito");
                    porcentaje = 10;
                    valorporcentaje = porcentaje / 100;
                    total = monto + (monto * valorporcentaje);
                    descuento = total - monto;
                System.out.println("RECARGO : $" +descuento  );
                System.out.println("N° de tarjeta: " +tarjeta);
                System.out.println("Cantidad de cuotas: " +cuotas );
                System.out.println("TOTAL A PAGAR: $" +total);
                System.out.println("===============================");
                System.out.println("   TE ESPERAMOS PRONTO!      ");
                System.out.println("===============================");
                
                
        }else if (modo ==3){
               System.out.println("FORMA DE PAGO: Tarjeta de debito");
                    porcentaje = 10;
                    valorporcentaje = porcentaje / 100;
                    total = monto - (monto * valorporcentaje);
                    descuento = monto - total;
                System.out.println("DESCUENTO : $" +descuento  );
                System.out.println("TOTAL A PAGAR: $" +total);
                System.out.println("===============================");
                System.out.println("   TE ESPERAMOS PRONTO!      ");
                System.out.println("===============================");
        
        }
                
        
        
        
        
        }
        
        
        
    }
    


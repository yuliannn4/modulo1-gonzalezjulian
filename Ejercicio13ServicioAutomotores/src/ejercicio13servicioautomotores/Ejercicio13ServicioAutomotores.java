
package ejercicio13servicioautomotores;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio13ServicioAutomotores {


    public static void main(String[] args) {
        String nombre ="";
        long dni=0;
        long telefono =0;
        String dominio="";
        Random rd = new Random ();
        int numerodeespera =rd.nextInt();
        String [] marcas = {"Renault","Ford","Toyota","Chevrolet"};
        String [][] servicios ;
        servicios = new String [2][4];
        String [] cont;
        cont = new String [4];//solo se pueden realizar 4 servicios 
        int cont2=0;
        String seleccionmarca="";
        boolean sino = true;
        
        
        
        //mensaje en pantalla 
        System.out.println("Hola! Gracias por elegirnos!");
        System.out.println("\n");
        System.out.println("Para continuar, vamos a necesitar algunos datos.");
        
        //pidiendo datos de contacto
        System.out.print("Por favor ingresa tu nombre: ");
            Scanner data = new Scanner(System.in);
                nombre = data.next();

        System.out.print("Ingresa tu DNI sin puntos: ");
           
                dni = data.nextLong();
        
        System.out.print("Ingresa tu telefono: ");
           
                telefono = data.nextLong();
        
        //Datos del Vehiculo
        System.out.print("Ingresa tu dominio: ");
            
                dominio = data.next();

        System.out.println("\n Trabajamos con las siguientas marcas: ");
        
        
        for (int i=0 ; i < marcas.length; i++){
                System.out.println(i + 1 +".-" + marcas[i]);
        }
        
        

                
        
                
        //muestro lo seleccionado  y repito hasta que siga si 
        while(sino){
                 System.out.print("Ingresa el numero que corresponda");
                  seleccionmarca = data.next();
                   data.nextLine(); // Consumir el carácter de nueva línea pendiente en el búfer (TENGO QUE CONSULTAR ESTO PORQUE NO ENTIENDO
            
         switch (seleccionmarca){
             case "1" : seleccionmarca ="Renault"; break;
             case "2" : seleccionmarca ="Ford"; break;
             case "3" : seleccionmarca = "Toyota"; break;
             case "4" : seleccionmarca = "Chevrolet"; break;
         }
         
        System.out.println("Elegiste: " +seleccionmarca );
        
            System.out.print("Continuar? Escribir Si o No: "); //Verifico si lo eligio bien
            
            String confirmacion = data.nextLine();
            
                if(confirmacion.equalsIgnoreCase("si")){
                sino = false;
                }
        
}
        
        //doy valor a las matrices
        servicios[0][0] = "Alineacion";
        servicios[0][1] = "Balanceo";
        servicios[0][2] = "Cambio de aceite";
        servicios[0][3] = "Cubiertas";

        servicios[1][1] = "";//en estas celdas voy a guardar la cantidad
        servicios[1][3] = "";
        
                
       
        
                for (int columna=0 ; columna < servicios[0].length; columna++){
                System.out.println(columna + 1 +".- " + servicios[0][columna]);}//con este bucle muestro los valores 
                
            for (int columna=0 ; columna < servicios[0].length; columna++){     
         System.out.println("Selecciona el numero correspondiente: ");
                String servicio1 = data.next();
            
         switch (servicio1){//desde aca doy nombre a los servicios 
             case "1" : servicio1 ="Alineacion"; break;
             case "2" : servicio1 ="Balanceo"; break;
             case "3" : servicio1 = "Cambio de aceite"; break;
             case "4" : servicio1 = "Cubiertas"; break;
         }
             
                    if(servicio1.equalsIgnoreCase("Balanceo") ){
                        System.out.println("Indicar cantidad ");
                        String cantidadcubiertas = data.next();
                         data.nextLine();// aca lo mismo, si no pongo esto no me corre
                        servicios[1][1] = cantidadcubiertas;
                      }
                    if(servicio1.equalsIgnoreCase("Cubiertas") ){
                        System.out.println("Indicar cantidad ");
                        String cantidadcubiertas = data.next();
                         data.nextLine();// otra vez...
                        servicios[1][3] = cantidadcubiertas;
                      }
         System.out.println("Elegiste: " + servicio1 );   // muestro el servicio
            cont[columna]=servicio1; //lo guardo en el vector para mostrarlo luego
            cont2++;
             
                
               
        System.out.print("Agregar mas servicios? Escribir Si o No: "); //Verifico si lo eligio bien
            String confirmacion = data.nextLine();
            if(confirmacion.equalsIgnoreCase("no")){
                    break; }
            
   
                }
    
            
            
            System.out.println("\n==================================");
        System.out.println("======== Bienvenido ==============");
        System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
        System.out.println("=====Nº ORDEN: " + numerodeespera + "===========================");
        System.out.println("Nombre del Cliente: " + nombre);
        System.out.println("DNI del cliente: " + dni);
        System.out.println("Marca del Vehiculo: " + seleccionmarca);
        System.out.println("Dominio del Vehiculo: " + dominio);
        System.out.println("==================================");
        System.out.println("Cantidad de servicios: " + cont2);
       
System.out.println("Los servicios son : " + cont[0] +", "+ cont[1] +", "+ cont[2] +", "+ cont[3] +". ");
        System.out.println("==================================");
    }
}
    
    

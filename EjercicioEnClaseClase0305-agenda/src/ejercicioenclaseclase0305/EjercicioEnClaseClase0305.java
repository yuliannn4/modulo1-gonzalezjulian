
package ejercicioenclaseclase0305;

import java.util.Scanner;


public class EjercicioEnClaseClase0305 {


    public static void main(String[] args) {
       
        /**
        /*
        INTRODUCCION A VECTORES
        */
        
        //Crear el vector de tipo entero
        //numero [] despues creo el vector que tiene 5 posiciones
        

//VECTORES ESTATICOS
       /*
        
        
        int numero[] = new int[5];
        
        //cargamos los vectores
        numero[0]=5;
        numero[1]=15;
        numero[2]=25;
        numero[3]=35;
        numero[4]=45;
        
        //recorriendo el vector
        System.out.println("Vector de la posicion 0 vale: " + numero[0]);
        System.out.println("Vector de la posicion 1 vale: " + numero[1]);
        System.out.println("Vector de la posicion 2 vale: " + numero[2]);
        System.out.println("Vector de la posicion 3 vale: " + numero[3]);
        System.out.println("Vector de la posicion 4 vale: " + numero[4]);
        System.out.println("//////////////////////////////////////////");
        
        */
        
        /*
VECTORES DINAMICOS 
        */
        //Creamos un vector
        /*
        int digitos [] = new int[5];
        
        //cargando los vectores
        
        for (int i=0; i< digitos.length; i++){
                digitos [i] = i+10;
                System.out.println("Vector de la posicion " +i+ " vale: " + digitos[i]);
                }
        
        //crear vectorr string donde guardar el listado de precio de utiles
            //los precios estan en otro vector de tipo entero
            
        
            String utiles [] = {"Lapicera","Cuaderno","Cartuchera","Mochila"};
            double precios [] = {40.5 , 139.99, 560.5, 1399.99 };
            
            //mostrando el listado con sus precios
            
            System.out.println("-------------------------");
            System.out.println("         LIBRERIA ");
            System.out.println("    Listado de ofertas ");
            System.out.println("-------------------------");
            
    for(int b=0; b<utiles.length; b++){
    System.out.println("- " + utiles[b] + "$" + precios[b] + ".-");
    }*/
            /*
            //bucador de vector
                //variable y objeto
                
            String nom ="";
            Scanner leer = new Scanner (System.in);
            
                //creo y cargo el vector 
            
            String []  nombres = new String [5];
            nombres[0] ="Juan";
            nombres[1] ="Pepe";
            nombres[2] ="Guido";
            nombres[3] ="Pablo";
        
            //ingrese nombre para 
            System.out.println("Ingrese un nombre para buscar en el vector: ");
            nom = leer.next();
            
            for(int n=0 ; n<nombres.length; n++){
                if(nom.equalsIgnoreCase(nombres[0])){
                    System.out.println("El dato esta en el vector y es el numero " +n);
                }else{
                    System.out.println("El dato ingresado no se encontró");
                }
            }
           
         */
            
            // crear vectorewa+cargarlo+buscarlo
            
            // creando los vectores
            String [] nombre =new String [5];
            String [] apellido = new String [5];
            long [] tel = new long [5];
            
            // creo un bucle para ingresar los nombres y apellidos 
            
                for (int i=0; i<5; i++){
                    System.out.print("ingresar nombre " + (i+1) + ":");
                    Scanner nom = new Scanner(System.in);
                    nombre[i] = nom.nextLine();
                    
                    System.out.print("ingresar apellido " + (i+1) + ":" );
                    Scanner app = new Scanner(System.in);
                    apellido[i] = app.nextLine();
                    
                    System.out.print("ingresar numero " + (i+1) + ":");
                    Scanner tele = new Scanner(System.in);
                    tel[i] = tele.nextLong();
                }
           /*  
                Esto es una prueba para ver si lo guardaba bien 
                
        System.out.println("1.- : " + nombre[0]+ " " + apellido[0] + ": " + tel[0] );
        System.out.println("2.- : " + nombre[1]+ " " + apellido[1] + ": " + tel[1] );
        System.out.println("3.- : " + nombre[2]+ " " + apellido[2] + ": " + tel[2] );
        System.out.println("4.- : " + nombre[3]+ " " + apellido[3] + ": " + tel[3] );
        System.out.println("5.- : " + nombre[4]+ " " + apellido[4] + ": " + tel[4] );
        
                */
           // ingreso variable para la busqueda
           
           String busqueda="";
           
           System.out.println("---------------------------------------------");
           System.out.println("                    BUSCADOR ");
           System.out.println("n/---------------------------------------------\n");
      
           //pido el ingreso del apellido para la busqueda
           System.out.println("Ingrese un apellido para buscar en el vector: ");
                Scanner busq = new Scanner (System.in);
                busqueda = busq.next();
            
                // pongo en 0 for y mientras sea menor a 5 va a sumar 1 y volver al bucle
                for(int a = 0; a < apellido.length; a++){
                    //con ignore case creo ignora las mayusculas y minusculas
                    if(busqueda.equalsIgnoreCase(apellido[a])){
                        System.out.println("Hubo una coincidencia!: " + nombre[a] + " " + apellido[a] + ": " + tel[a]);
                    break;
    }               //para que no siga el bucle y muestre 2 respuestas agrego un break
                    // muestro otro mensaje en caso de que no haya coicidencia
                    //como se inicia en 0 pero lenght cuenta 5 veces (contaria un paso por delante) pongo un -1 
                    if(a == apellido.length - 1) {
                        System.out.println("El dato ingresado no se encontró");
    }
}

    
}}

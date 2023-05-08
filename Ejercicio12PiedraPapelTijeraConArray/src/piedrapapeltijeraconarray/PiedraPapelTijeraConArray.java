
package piedrapapeltijeraconarray;

import java.util.Random;
import java.util.Scanner;


public class PiedraPapelTijeraConArray {

    
    public static void main(String[] args) {
       
        Scanner nombre = new Scanner (System.in);
        Random rd = new Random();
        String resp1="";
        String resp1min="";
        String resp2="";
        String jugador1="Arturito";
        String jugador2="";
        int numerorandom=0;
        
        
        
        
        System.out.println("************************************");
        System.out.println("Bienvenido a Piedra, Papel o Tijera!");
        System.out.println("************************************");
        
        System.out.println("\n");
        System.out.print(" Ingresa tu nombre: ");
        jugador2 = nombre.nextLine();
       System.out.println("\n");
       /*
        System.out.println("************************************");
        System.out.println("          INICIO DEL JUEGO          ");
        System.out.println("************************************");
        System.out.println("   La P es Piedra");
        System.out.println("   La L es Papel");
        System.out.println("   La T es Tijera");  
        System.out.println("************************************");
       */
        System.out.println("************************************");
        
        System.out.print("\nHola "+jugador2+"!!\n");
     
        System.out.print("Vas a jugar contra " +jugador1);
          System.out.println("\n");
        System.out.println("************************************");
          System.out.println("\n");
        
        //definiendo el numero random del 1 al 3 primero
        /*adentro del parentesis son la cantidad de nume
        Se comienza a contar de 0, por eso se agrega +1 
        apara ajustar el rango de números generados al rango de 
        1 a 3 en lugar de 0 a 2. 
        */
        numerorandom = rd.nextInt(3)+1;
        
        System.out.println("************************************");
        System.out.println("        FASE DE CALENTAMIENTO         ");
        System.out.println("************************************");
        System.out.println("\n");
        
        System.out.print("Elegis Piedra,Papel o Tijera?  ");
        
        //una vez ingresada la respuesta se prcede a convertir todo en minusculas
        
        Scanner eleccion = new Scanner(System.in);
        resp1=eleccion.nextLine();
        resp1min=resp1.toLowerCase();
        
        System.out.println("\n");
        
        
        
        
        //numero random alamacenado en resp2 y resp1 se convierte en letra 
        switch(numerorandom){
            case 1 : resp2="Piedra"; break;
            case 2 : resp2="Tijera"; break;
            case 3 : resp2= "Papel"; break;
            }
        switch(resp1min){
            case "piedra" : resp1min="Piedra"; break;
            case "papel" : resp1min="Tijera"; break;
            case "tijera" : resp1min= "Papel"; break;
        }
        
        System.out.println(jugador1+ " eligio: " + resp2);
        System.out.println("Vos elegiste:    "+resp1min);
        System.out.println("\n");
        
        /* comienza la parte logica
            en este caso uso IGNORECASE para que me tome mayuscula o minuscula por igual 
        */
        
        if (resp2 == resp1min){
            System.out.println("Hubo un empate!");
        }
         if(resp1min.equalsIgnoreCase("piedra") && resp2.equalsIgnoreCase("papel")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano.");
        }
         if(resp1min.equalsIgnoreCase("piedra") && resp2.equalsIgnoreCase("tijera")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");

         }
         if(resp1min.equalsIgnoreCase("papel") && resp2.equalsIgnoreCase("piedra")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");

         }
         if(resp1min.equalsIgnoreCase("papel") && resp2.equalsIgnoreCase("tijera")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano.");  
         }
         if(resp1min.equalsIgnoreCase("tijera") && resp2.equalsIgnoreCase("piedra")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano."); 
         }
         if(resp1min.equalsIgnoreCase("tijera") && resp2.equalsIgnoreCase("papel")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");
         }
         
         System.out.println("\n");
         
                 //CREO LAS VARIABLES QUE CREO CORRESPONDIENTES PARA QUE EL JUEGO CORRA
         int intentos=0;
         int puntos1=0;
         int puntos2=0;
         int [] suma1 = new int[3];
         int [] suma2 = new int[3];
         
         //iniicio el bucle 
         
        for(intentos=1; intentos <=3; intentos++){ 
        System.out.println("************************************");
        System.out.println("        INICIO DEL JUEGO Num. " + intentos);
        System.out.println("************************************");
        System.out.println("\n");
        
        //genero nuevamente un numero 
        numerorandom = rd.nextInt(3)+1;         
        
            
         System.out.print("Elegis Piedra,Papel o Tijera?  ");
        
        //una vez ingresada la respuesta se prcede a convertir todo en minusculas
        
        Scanner turno = new Scanner(System.in);
        resp1=turno.nextLine();
        resp1min=resp1.toLowerCase();
        
        System.out.println("\n");
        
        
        
        
        //numero random alamacenado en resp2 y resp1 se convierte en letra 
        switch(numerorandom){
            case 1 : resp2="Piedra"; break;
            case 2 : resp2="Tijera"; break;
            case 3 : resp2= "Papel"; break;
            }
        switch(resp1min){
            case "piedra" : resp1min="Piedra"; break;
            case "papel" : resp1min="Papel"; break;
            case "tijera" : resp1min= "Tijera"; break;
        }
        
        System.out.println(jugador1+ " eligio: " + resp2);
        System.out.println("Vos elegiste:    "+resp1min);
        System.out.println("\n");
        
        /* comienza la parte logica
             si gana suma 2 puntos
             si empata suma 1 punto
             si pierde suma 0 punto
        */
        
        if (resp2 == resp1min){
            System.out.println("Hubo un empate!");
            System.out.println("Suman 1 punto cada uno");
            puntos1++;
            puntos2++;
            suma1 [intentos-1] ++;
            suma2 [intentos-1] ++;
        }
         if(resp1min.equalsIgnoreCase("piedra") && resp2.equalsIgnoreCase("papel")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano.");
           System.out.println(jugador1 + " suma 2 puntos");
           puntos2+=2;
           suma2 [intentos-1] +=2;
           
        }
         if(resp1min.equalsIgnoreCase("piedra") && resp2.equalsIgnoreCase("tijera")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");
          System.out.println(jugador2 + " suma 2 puntos");
          puntos1+=2;
          suma1 [intentos-1] +=2;

         }
         if(resp1min.equalsIgnoreCase("papel") && resp2.equalsIgnoreCase("piedra")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");
          System.out.println(jugador2 + " suma 2 puntos");
          puntos1+=2;
          suma1 [intentos-1] +=2;

         }
         if(resp1min.equalsIgnoreCase("papel") && resp2.equalsIgnoreCase("tijera")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano."); 
           System.out.println(jugador1 + " suma 2 puntos");
           puntos2+=2;  
           suma2 [intentos-1] +=2;
         }
         if(resp1min.equalsIgnoreCase("tijera") && resp2.equalsIgnoreCase("piedra")){
           System.out.println("Uh! Esta vez " + jugador1 + " gano."); 
           System.out.println(jugador1 + " suma 2 puntos");
           puntos2+=2; 
           suma2 [intentos-1] +=2;
         }
         if(resp1min.equalsIgnoreCase("tijera") && resp2.equalsIgnoreCase("papel")){
          System.out.println(" Felicidades " + jugador2 + "!! Ganaste!");
          System.out.println(jugador2 + " suma 2 puntos");
          puntos1+=2;
          suma1 [intentos-1] +=2;

         }
            //RESULTADOS PARCIALES EN CADA BUCLE
         System.out.println("\n");
         System.out.println("************************************");
         System.out.println("Resultados parciales: ");
         System.out.println(jugador1 + ": " + puntos2 + " puntos");
         System.out.println(jugador2 + ": " + puntos1 + " puntos");
         System.out.println("************************************");
         System.out.println("\n");
        }
        
            
     
        System.out.println("\n");
         System.out.println("************************************");
         System.out.println("         FIN DEL JUEGO!!!");
         System.out.println("************************************");
         System.out.println("\n");
         
         //TABKA FINAL DE RESULTADOS
         System.out.println("\n");
         System.out.println("************************************");
         System.out.println("      TABLERO DE PUNTAJE FINAL ");
         System.out.println("************************************");
         System.out.println("Jugador***1era**2da***3era**********");
         System.out.println("          MANO**MANO**MANO**********");
         System.out.println(jugador1 + ": " + suma2[0] +"*****"+suma2[1]+"*****" +suma2[2] );
         System.out.println(jugador2 + ": " + suma1[0]+"*****" +suma1[1] +"*****"+suma1[2] );
         System.out.println("************************************");
         
         
         //COMPARO Y MUESTRO EL GANADOR
         
               if(puntos1<puntos2){
               System.out.println("\n");
               System.out.println("Esta vez, " +jugador1 + " es el ganador indiscutido");
               System.out.println ("sumando la cantidad de " +puntos2+ " puntos!!");
               System.out.println("Impresionante!!");
               System.out.println(jugador2 + ", segui intentandolo y la proxima quizas puedas ganar.");
               System.out.println("\n");
                       
               
               }
               if(puntos1>puntos2){
               System.out.println("\n");
               System.out.println(jugador2 + " es el ganador indiscutido");
               System.out.println ("sumando la cantidad de " +puntos1+ " puntos!!");
               System.out.println("Impresionante!!");
               System.out.println("Gracias por jugar! Te esperamos pronto! ");
               System.out.println("\n");
               }
               
               if(puntos1==puntos2){
               System.out.println("\n");
               System.out.println(jugador2 + " y " + jugador1);
               System.out.println ("sumando la cantidad de " +puntos1+ " puntos!!");
               System.out.println("Impresionante!!");
               System.out.println("Esta vez hubo un empate! ");
               System.out.println(jugador2 + ", segui intentandolo y la proxima quizas puedas ganar.");
               System.out.println("\n");
               }
         

     
         
    }
    
}

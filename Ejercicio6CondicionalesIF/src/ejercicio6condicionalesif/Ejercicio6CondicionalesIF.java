
package ejercicio6condicionalesif;

public class Ejercicio6CondicionalesIF {

   
    public static void main(String[] args) {
    //Declaro las variables
        double temperatura = 27;
        boolean hacesol = true;
        boolean nevado = true;
        
    //ejercicio 1
            System.out.println("La temperatura actual es de: " + temperatura + "°");
                if(temperatura>25){
                    System.out.println("Vamos rápido a la playa!");
            }
     
     //ejercicio 2
            System.out.println("Hay sol?");
                if(hacesol){
                    System.out.println("Usá sombrilla!");
            }
        
     //ejericio 3
            System.out.println("Nieva y hay sol?");
                if(hacesol || nevado){
                    System.out.println("Que bien!");
            }
        
     //ejercicio 4
        nevado = true;
        temperatura = 29;
             System.out.println("Nieva y hacen mas de 20° pero menos de 30°? ");
                if(nevado && temperatura >= 20 && temperatura <= 30){
                    System.out.println("No me lo creo!");
                }
                
    //ejercicio 5 
        temperatura = 32;
        hacesol = true;
                System.out.println("Hay entre 0° y 30° con sol?");
                 if (temperatura > 0 || temperatura < 30 && hacesol){
                    System.out.println("Mejor me quedo en casa");    
        }
                 
    //ejercicio 6
       temperatura = 32;
               System.out.println("Hacen mas de 25?");
               if (temperatura > 25) {
                   System.out.println("A la playa!");
               }
    
//ejercicio 7
        temperatura = 10;
               System.out.println("Hacen menos de 25°?");
               if (temperatura >= 25 ) {
                   System.out.println("Esperando al buen tiempo...");
               }
 
//ejercicio 8 
        temperatura = 10;
             System.out.println(" Hacen mas de 25°?");
             if (temperatura > 25){
                 System.out.println("A la playa!");
             }
             else {
                 System.out.println("Esperando al buen tiempo...");
             }
             
 //ejercicio 9 
        temperatura = 10;
            if (temperatura > 25){
            System.out.println("A la playa!");
            }
            else if(temperatura > 15){
            System.out.println("A la montaña");
            }
            else if(temperatura < 5 && nevado) {
            System.out.println("A esquiar!!");
            }
            else {
                  System.out.println("A dormir");
            } 
            
 //ejercicio 10
       temperatura = 10;
        if (temperatura < 15 ){
            if (temperatura < 5 ){
            System.out.println("A esquiar!");
            }
        
        else {
                System.out.println("A dormir! zZzZ");
        }
        }
        
        else if (temperatura > 25){
                System.out.println("A la playa!");
                }
            else {
            System.out.println("A la montaña!");
        }
    }
    
    
}

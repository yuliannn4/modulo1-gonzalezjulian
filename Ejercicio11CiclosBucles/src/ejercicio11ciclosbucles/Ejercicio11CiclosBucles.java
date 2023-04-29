
package ejercicio11ciclosbucles;

public class Ejercicio11CiclosBucles {

    
    public static void main(String[] args) {
        
        
        //contando hasta 100 usando for
        
        for (int i =1 ; i <= 100; i++){
                System.out.print( +i+ ", ");
    }System.out.print("\n");
        
        //contando hasta 100 usando while
        
        int i=1;
        while(i<=100){
               System.out.print(+i+ ", ");
               i++;
       }System.out.print("\n");
       
       
       //contando usando do while
       
       
      i = 1;
      do {
      System.out.print(+i+", ");
      i++;
      }while(i<=100);
      
        
    }
    
}

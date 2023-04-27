
package ejercicioenclase264whiledowhile;

import java.util.Scanner;


public class EjercicioEnClase264whiledowhile {

    
    public static void main(String[] args) {
     
        
            String usuario="pepe";
            String contraseña="";
            int contador=0;
            int maximo=3;
            
            Scanner leerusuario= new Scanner (System.in);
            Scanner leercontraseña = new Scanner (System.in);
            
            
            
               
                while(contador < maximo ){
                    System.out.print("Ingresar nombre de usuario: ");
                     usuario = leerusuario.nextLine();
                        
                     if(usuario.equals("pepe")){
                            System.out.println("ingreso de sesion correcto");
                            break;
                        }else{
                            System.out.println("USUARIO INCORRECTO");
                        }
                         contador++;
                        System.out.println("Cantidad de intentos: " +contador+ " el limite es: " +maximo);
                    }
                
                if (contador==maximo){
                        System.out.println("Cantidad de intentos agotada");
                       
                }
                }
            
            
        
        
    }
    


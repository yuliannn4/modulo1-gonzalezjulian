
package ejercicioenclase1705;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EjercicioEnClase1705 {


    public static void main(String[] args) {
        /* 
*       Estructura de la Clase JOPTIONPANE
        
*
*
*
*
*
*
*/
       /* 
        //mensaje informacion 
        JOptionPane.showMessageDialog(null,"Este es un mensaje de informacion", "Mensaje de informacion",JOptionPane.INFORMATION_MESSAGE);
        
        //estgructura de Warring
        JOptionPane.showMessageDialog(null,"Este es un mensaje de Alerta","Mensaje de alerta",JOptionPane.WARNING_MESSAGE);
        
        //Estructura Error
        JOptionPane.showMessageDialog(null, "Este es un mensaje de Error", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
      
        //Estructura pregunta
        JOptionPane.showMessageDialog(null,"Este es un mensaje de consulta","Mensaje de consulta", JOptionPane.QUESTION_MESSAGE);
       
        /////////////////////////////////////////////////////////////////////////////////////////
        
        String nombre;
        
        //input de JOption
        
        nombre = JOptionPane.showInputDialog(null,"Ingresá tu nombre","INPUT",JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null,"El nombre ingresado es " +nombre,"INPUT",JOptionPane.QUESTION_MESSAGE);
            
        ///////////////////////////////////////////////////////////////////////////////////////
        */
        
        //EJERCICIO 1
        
        String usuario = "julian";
        String contraseña = "123"; 
        String usuarioingresado="";
        String contraseñaingresada = "";
        
        //Pido los datos 
        usuarioingresado = JOptionPane.showInputDialog(null,"Ingresa tu usuario","LOGIN",JOptionPane.QUESTION_MESSAGE);
        contraseñaingresada = JOptionPane.showInputDialog(null,"Ingresa tu contraseña","LOGIN",JOptionPane.QUESTION_MESSAGE);
        
                if (usuario.equals(usuarioingresado) && contraseña.equals(contraseñaingresada)){
                  JOptionPane.showMessageDialog(null,"Usuario y contraseña correctos", "Genial!",JOptionPane.INFORMATION_MESSAGE);  
                }else{
                  JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
           
        ///////////////////////////////////////////////////////////////////////////////////////
        
        
        //int numero;
        
        //convirtiendo o PARSEANDO
        
        //numero=Integer.parseInt(JOptionPane.ShowInputDialog(null,"ingresa un numero","INPUT",JOptionPane.INFORMATION_MESSAGE));
        //JOptionPane.showMessageDialog(null,"El numero ingresado es "+numero,"INPUT",JOptionPane.INFORMATION_MESSAGE);
        
        ///////////////////////////////////////////////////////////////////////////////////////
        
        //mensaje con icono
       // ImageIcon bien = new ImageIcon("src/imagen/2343773.png");
       // JOptionPane.showMessageDialog(null,"MUY BIEN", "Posistivo",JOptionPane.INFORMATION_MESSAGE,bien);
        
        
        ///////////////////////////////////////////////////////////////////////////////////////
        /// EJERCICIO 2 
        
        
        
        String nombre = "";
        String apellido = ""; 
        String edad="";
        String tel = "";
        
        //Pido los datos 
        nombre = JOptionPane.showInputDialog(null,"Ingresa tu Nombre: ","CARGA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        apellido = JOptionPane.showInputDialog(null,"Ingresa tu apellido: ","CARGA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        edad = JOptionPane.showInputDialog(null,"Ingresa tu edad: ","CARGA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        tel = JOptionPane.showInputDialog(null,"Ingresa tu telefono: ","CARGA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        
        //muestro el mensaje
        ImageIcon directorio = new ImageIcon("src/imagen/2343773.png");
        JOptionPane.showMessageDialog(null,"NOMBRE: "+nombre + "\nAPELLIDO: "+apellido+ "\nEDAD: " +edad+ "\nTELEFONO: " +tel , "DATOS INGRESADOS",JOptionPane.INFORMATION_MESSAGE,directorio);
           
        
        
    }
    
}

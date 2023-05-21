
package ejercicio.n.pkg15.juego.del.vaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjercicioN15JuegoDelVaso {


    public static void main(String[] args) {
        
        //comparar random pelotita
        Random RD = new Random();
        int pelotita =RD.nextInt(3);
        
        
        // imagenes
        
        ImageIcon bien = new ImageIcon("src/sisi.png");
        ImageIcon mal = new ImageIcon("src/no.png");
        ImageIcon juego = new ImageIcon("src/portada.png");
        ImageIcon ganadores =new ImageIcon("src/ganadores.png");
        ImageIcon empate = new ImageIcon ("src/empate.png");
    
        //mostrar vasos
        int seleccion = JOptionPane.showOptionDialog(null,
                "Para calentar, te regalo un tiro",
                "Juego del vaso, calentamiento",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                juego,
                new Object []{"Vaso 1","Vaso 2","Vaso 3"},
                "Vaso 1");
        

//Logica del juego
    if (pelotita==seleccion){
    JOptionPane.showMessageDialog(null,"MUY BIEN","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE);
    }else{
     JOptionPane.showMessageDialog(null, "La pelota no estaba en este vaso\n Intentá de nuevo!", "PERDISTE!", JOptionPane.ERROR_MESSAGE);}
    
    //comenzando con el juego
    
    
    
   
    int puntos=0;
    String jugador1="";
    String jugador2="";
    int puntosj1=0;
    int puntosj2=0;

    
    //pido nombres de ambos jugadores 
    
    jugador1= JOptionPane.showInputDialog("Ingrese el nombre del primer jugador","");
    jugador2= JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador","");

            for(int rondas=1 ; rondas<=3 ; rondas++){
                pelotita = RD.nextInt (3);//establezco tiradas distintas para cada intento
                    int tiradaj1= JOptionPane.showOptionDialog(null,
                                             jugador1+ ", elige un vaso",
                                             "JUEGO DEL VASO, RONDA "+rondas,
                                             JOptionPane.YES_NO_CANCEL_OPTION,
                                             JOptionPane.QUESTION_MESSAGE,
                                             juego,
                                             new Object[]{"Vaso 1","Vaso 2","Vaso 3"},
                                             "Vaso 1");
                    
                    
                     if(pelotita == tiradaj1){
                            JOptionPane.showMessageDialog(null,
                                    "Encontraste la pelotita! \n Sumas 1 punto!",
                                    "Exelente!",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    bien);
                            puntosj1++;
                          
                            }else{JOptionPane.showMessageDialog(null, 
                                    "La pelota no estaba en este vaso!\n Intentá de nuevo \n No ganaste ningun punto", 
                                    "PERDISTE!", 
                                    JOptionPane.ERROR_MESSAGE,
                                    mal);}
                        
                    
                pelotita = RD.nextInt (3);
                    int tiradaj2= JOptionPane.showOptionDialog(null,
                                             jugador2+ ", elige un vaso",
                                             "JUEGO DEL VASO, RONDA "+rondas,
                                             JOptionPane.YES_NO_CANCEL_OPTION,
                                             JOptionPane.QUESTION_MESSAGE,
                                             juego,
                                             new Object[]{"Vaso 1","Vaso 2","Vaso 3"},
                                             "Vaso 1");    
                    
                       
                        
                        if(pelotita == tiradaj2){
                            JOptionPane.showMessageDialog(null,
                                    "Encontraste la pelotita! \nSumas 1 punto!",
                                    "Exelente!",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    bien);
                            puntosj2++;
                            
                            }else{JOptionPane.showMessageDialog(null, 
                                    "La pelota no estaba en este vaso!\n Intentá de nuevo \n No ganaste ningun punto", 
                                    "PERDISTE!", 
                                    JOptionPane.ERROR_MESSAGE,
                                    mal);}            
           
            }   
            if (puntosj1 < puntosj2) {
    JOptionPane.showMessageDialog(null, 
            jugador1 + " sumó " + puntosj1 + " puntos\n" + jugador2 + " sumó " + puntosj2 + " puntos\n" + jugador2 + " es el ganador!", 
            "Felicitaciones!",
            JOptionPane.INFORMATION_MESSAGE, 
            ganadores);
} else if (puntosj1 > puntosj2) {
    JOptionPane.showMessageDialog(null, 
            jugador1 + " sumó " + puntosj1 + " puntos\n" + jugador2 + " sumó " + puntosj2 + " puntos\n" + jugador1 + " es el ganador!",
            "Felicitaciones!",
            JOptionPane.INFORMATION_MESSAGE, 
            ganadores);
} else {
    JOptionPane.showMessageDialog(null, 
            jugador1 + " sumó " + puntosj1 + " puntos\n" + jugador2 + " sumó " + puntosj2 + " puntos\nEs un empate!",
            "Felicitaciones!",
            JOptionPane.INFORMATION_MESSAGE,
            empate);
}
            
            }
            }
           
    
    
    
    
    
    


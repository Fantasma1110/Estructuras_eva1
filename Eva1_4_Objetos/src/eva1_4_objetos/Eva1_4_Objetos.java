/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_objetos;

/**
 *
 * @author orteg
 */
public class Eva1_4_Objetos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
    Prueba prueba = new Prueba();
        System.out.println(prueba);
        
        //ELIMINAR prueba
        
        //Terminar el programa --> garbage collector (Libera memoria autimaticamente)
        //Eliminar "Directamente" el objeto:
        
        prueba = null;
    }
    
}
class Prueba{
    
}
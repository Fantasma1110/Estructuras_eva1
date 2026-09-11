/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author orteg
 */
public class Eva1_7_Arreglos_size {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] original = new int[10];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) {
            original[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println("[" + original[i] + "]");
        }
        
        System.out.println("");
        
        
        int []copia =  original;
        original = new int[5];
        //original = copia;
        for (int i = 0; i < original.length; i++) {
            original[i] = copia[i];
            System.out.println("[" + original[i] + "]");
        }
        
        System.out.println("");
        //Cambiar el tamaño(no se puede)
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) {
            System.out.println("[" + original[i] + "]");
        }
    }
    
}

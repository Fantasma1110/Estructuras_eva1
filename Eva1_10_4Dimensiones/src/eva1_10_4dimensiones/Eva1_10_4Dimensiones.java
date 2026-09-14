/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_4dimensiones;

/**
 *
 * @author orteg
 */
public class Eva1_10_4Dimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int[][][][] arreglo  = new int [2][2][2][2];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        arreglo[i][j][k][l] = (int)(Math.random()*100);
                        System.out.println("");
                    }
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[i][j].length; k++) {
                    for (int l = 0; l < arreglo[i][j][k].length; l++) {
                        arreglo[i][j][k][l] = (int)(Math.random()*100);
                        System.out.print("[" + arreglo[i][j][k][l] + "]");
                    }
                }
            }
        }
        
        
        
    }
    
}

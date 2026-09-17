/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_12_primos;

/**
 *
 * @author orteg
 */
public class Eva_1_12_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int n = 5;
        for (int i = 2; i <= n-1; i++) {
            float a = n/i;
            System.out.print(a +" ");
        }
        
        System.out.println("");

        

        for (int i = 2; i <= n - 1; i++) {
            double res = (double) n / i;
            System.out.println(n + " / " + i + " = " + res);
        }

        System.out.println("Executions: " + (n - 2));
    }
}
    
    


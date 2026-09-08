/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_parametros;

/**
 *
 * @author orteg
 */
public class Eva1_5_Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //paso por valor
       int i = 5;
        System.out.println("Valor de i = "+i);
        incrementar(i);
        System.out.println("Valor de i( despues de incrementar) -"+ i);
        //ahora por referencia
        Prueba prueba = new Prueba();
        System.out.println("Vlor de prueba.y = " + prueba);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (Despues de incrementar) = " + prueba);
    }
    public static void incrementar(int valor){
            valor++;
        
    }
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
    }
    }
    
    class Prueba{
        int y = 5;
    }
    


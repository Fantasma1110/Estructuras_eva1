package Scope;

import java.util.Iterator;

public class eva1 {

	public static void main(String[] args) {
		int x = 100; // Existe dentro del bloque del main
		for (int i = 0; i < 10; i++) { // existe solo en el for
			System.out.print("i = " + i);
			x++; // visible dentro del for
		}
		
		System.out.print(i);// ya no existe
		System.out.print(x);// ya no existe
	}
	public static void OtraFincion() {
		System.out.print("Valor de x " + x);//no existe
	}
}

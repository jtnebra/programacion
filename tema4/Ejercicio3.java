package tema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "";
			String palabra = "";
			int n=0;
		System.out.println("dime una frase");
		frase=teclado.nextLine();
		System.out.println("dime una palabra");
		palabra=teclado.nextLine();
		n=frase.indexOf(palabra);
		if(n>0)
		System.out.println(frase.indexOf(palabra));
		else
			System.out.println("0");
		
		
		
		
		}
	}

}
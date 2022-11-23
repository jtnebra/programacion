package tema4;

import java.util.Scanner;

public class Ejercicio131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasefinal="";
			char c=0,d=0;
				System.out.println("Dame una frase");
				frase = teclado.nextLine();
				System.out.println("Dame una letra");
				d= teclado.next().charAt(0);
			for( int i =0;i<frase.length();i++) {
				c=frase.charAt(i);
				if(c==d) {
					c = Character.toUpperCase(c);
				}
				frasefinal+=c;
			}
			System.out.println(frasefinal);
		}
	}
}
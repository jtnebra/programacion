package tema4;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "",frasefinal="";
			char c=0;
			boolean corto = false;
			while (!corto) {
				System.out.println("Dame una frase");
				frase = teclado.nextLine();
				frase = frase.toUpperCase();
				if (frase.length() <= 20)
					corto = true;
			}
			for( int i =0;i<frase.length();i++) {
				c=frase.charAt(frase.length()-1);
				frasefinal+=c;
				for(int k=0;k<frase.length()-1;k++) {
				c=frase.charAt(k);
				frasefinal+=c;
				}
				frase=frasefinal;
				System.out.println(frasefinal);
				frasefinal="";
			}
		}
	}

}
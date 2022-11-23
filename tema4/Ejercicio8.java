package tema4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "", cesar="";
			char c=0;
			System.out.println("Dame una frase");
			frase = teclado.nextLine();
			frase= frase.toUpperCase();
			for(int i=0;i<frase.length();i++) {
				c=0;
				c+=frase.charAt(i)+3;
				if(c>90)
					c+=-26;
				cesar+=c;
				
			}
			System.out.println(cesar);
		}
	}

}
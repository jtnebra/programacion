package tema4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "", cesar="";
			char c=0;
			int j=0;
			System.out.println("Dame una frase");
			frase = teclado.nextLine();
			frase= frase.toUpperCase();
			System.out.println("dime un numero");
			j=teclado.nextInt();
			for(int i=0;i<frase.length();i++) {
				c=0;
				c+=frase.charAt(i)+j;
				if(c>'Z')
					c+=-('Z'-'A');
				cesar+=c;
			}
			System.out.println(cesar);
		}
	}

}
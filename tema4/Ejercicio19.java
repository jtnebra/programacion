package tema4;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			/*
			 * Programa que calcula cual es la vocal que mas se repite y lo suelta por pantalla
			 */
			String frase = "";
			char c = 0;
			int a = 0, e = 0, i = 0, o = 0, u = 0, max = 0;
			System.out.println("Di una frase");
			frase = teclado.nextLine();
			frase = frase.toLowerCase();
			for (int ii = 0; ii < frase.length(); ii++) {
				c = frase.charAt(ii);
				switch (c) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				}

			}
			if (a > max) {
				max = a;
				c = 'a';
			}
			if (e > max) {
				max = e;
				c = 'e';
			}
			if (i > max) {
				max = i;
				c = 'i';
			}
			if (o > max) {
				max = o;
				c = 'o';
			}
			if (u > max) {
				max = u;
				c = 'u';
			}
			System.out.println("La vocal que mas se repite es " + c + " un total de " + max + " veces");
		}

	}
}
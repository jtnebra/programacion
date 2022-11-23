package tema4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase = "";
			int num = 0, vocales = 0, consonantes = 0;
			boolean largo = false;
			while (!largo) {
				System.out.println("Dame una frase");
				frase = teclado.nextLine();
				frase = frase.toLowerCase();
				if (frase.length() < 80) {
					largo = true;
				}
			}
			/*
			 * Bucle que primero diferencia si es un caracter numerico o no
			 *y despues comprueba si es una vocal o una consonante
			 *y al final mira si es una consonante
			 */
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9')
					num++;
				else if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
						|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
					vocales++;
				else if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z')
					consonantes++;
			}
			System.out.println(consonantes);
			System.out.println(vocales);
			System.out.println(num);
		}
	}

}
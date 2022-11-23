package tema4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int mayus = 0, minus = 0, num = 0;
			String frase = "";
			System.out.println("Dame una frase");
			frase = teclado.nextLine();
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9')
					num++;
				else if ('A' <= frase.charAt(i) && frase.charAt(i) <= 'Z')
					mayus++;
				else if ('a' <= frase.charAt(i) && frase.charAt(i) <= 'z')
					minus++;
			}

			System.out.println("Hay " + minus + " minusculas");
			System.out.println("Hay " + mayus + " mayusculas");
			System.out.println("Hay " + num + " numeros");
		}
	}

}
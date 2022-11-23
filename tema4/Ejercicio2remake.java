package tema4;

import java.util.Scanner;

public class Ejercicio2remake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			int mayus = 0, minus = 0;
			float x=(float) 4.378657656754;
			String frase = "";
			char c = 0;
			boolean largo = false;
			// Pide una frase y evalua que es mayor de 80 caracteres
			while (!largo) {
				System.out.println("Dame una frase");
				frase = teclado.nextLine();
				if (frase.length() < 80) {
					largo = true;
				}
			}
			// Bucle que evalua letra a letra si es mayuscula o minuscula
			for (int i = 0; i < frase.length(); i++) {
				c = frase.charAt(i);
				if (c>=65&&c<=90)
					mayus++;
				else if (c>=97&&c<=122)
					minus++;

			}
			System.out.println("Hay " + minus + " minusculas");
			System.out.println("Hay " + mayus + " mayusculas");
		}
	}

}
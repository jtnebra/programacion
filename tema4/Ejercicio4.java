package tema4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase="";
			int j=0;
			boolean largo=false;
			while(!largo) {
			System.out.println("Dame una frase");
			frase=teclado.nextLine();
			if(frase.length()<80) {
				largo=true;
			}
			}
			System.out.println("seleccione 1 mayusculas o 2 minusculas");
			j=teclado.nextInt();
			if (j==1)
				System.out.println(frase.toUpperCase());
			else if (j==2)
				System.out.println(frase.toLowerCase());
			else
				System.out.println("eres gilipollas pon un 1 o 2");
		
		
		
		
		}
	}

}
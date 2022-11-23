package tema4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			String frase="", frasepar="", fraseinpar="";
			boolean largo=false;
			while(!largo) {
			System.out.println("Dame una frase");
			frase=teclado.nextLine();
			if(frase.length()<80) {
				largo=true;
			}
			}
			for(int i=0;i<frase.length();i++) {
				if(frase.charAt(i)%2==0)
					frasepar=frasepar + frase.charAt(i);
				else
					fraseinpar=fraseinpar + frase.charAt(i);		
			}
			System.out.println(frasepar);
			System.out.println(fraseinpar);
		}
	}

}
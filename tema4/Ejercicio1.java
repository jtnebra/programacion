package tema4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
	String frase="";
	String c1="";
	boolean largo=false;
	while(!largo) {
	System.out.println("Dame una frase");
	frase=teclado.nextLine();
	if(frase.length()<80) {
		largo=true;
	}
	}

	
	for(int i=0;i<frase.length();i++) {
		c1=c1+frase.charAt(i);
		System.out.println(c1);
	}
}
	}

}

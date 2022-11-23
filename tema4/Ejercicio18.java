package tema4;

import java.util.Scanner;

public class Ejercicio18 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
String frase= "";
System.out.print("Dame una frase: ");
frase= teclado.nextLine();

System.out.println(frase.replace("si","no"));


		}
	}
}

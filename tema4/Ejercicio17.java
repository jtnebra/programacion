package tema4;

import java.util.Scanner;

public class Ejercicio17 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
String palabra= "", medio="";
char letra1=0,letra2=0;
System.out.print("Dame un nombre y apellido:");
palabra= teclado.nextLine();
letra1=palabra.charAt(0);
letra2=palabra.charAt(palabra.length()-1);
for(int i=1;i<palabra.length()-1;i++) {
	medio+=palabra.charAt(i);
}
System.out.println(letra2+medio+letra1);



		}
	}
}
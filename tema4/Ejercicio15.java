package tema4;

import java.util.Scanner;

public class Ejercicio15 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
String frase = "",fraseder="";
char c=0,d=0;
int contizq=0,contder=0;
System.out.print("Dame una palabra:");
frase = teclado.nextLine();
	for(int j=frase.length()-1;j>=0;j--){
		fraseder+=frase.charAt(j);	
	}

if(frase.equals(fraseder)) {
	System.out.println("la palabra es un palindromo: ");
}else {
	System.out.println("la palabra no es un palindromo: ");
}
System.out.println(frase);
System.out.println(fraseder);
		}
	}
}
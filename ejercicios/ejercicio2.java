package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
int numero, j, factor;
System.out.println("introduce un numero");
numero=teclado.nextInt();
System.out.println("la tabla del " + numero + " es:");
	for (int i=0;i<=10;i++) {
		factor=i*numero;
		System.out.println(numero + "x" + i + "=" + factor );
	}
		}
	}
}
package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
	int n1, n2, suma=0;
	System.out.println("introduce n1:");
	n1=teclado.nextInt();
	System.out.println("introduce n2:");
	n2=teclado.nextInt();
	for(int i=n1+1;i<n2;i++) {
		suma=i+suma;
	}
	System.out.println("la suma es:" + suma);
		
		}
	}

}

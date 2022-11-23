package repasoev1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int personas;
			double descuento, precio = 0;
			char dia, tarjeta;
			System.out.println("dime que dia de la semana es: L,M,X,J,V,S,D");
			dia = teclado.next().charAt(0);
			dia= Character.toUpperCase(dia);
			System.out.println("cuantas personas son:");
			personas = teclado.nextInt();
			System.out.println("tienes cinepas: S/N");
			tarjeta = teclado.next().charAt(0);
			tarjeta = Character.toUpperCase(tarjeta);

			switch (dia) {
			case 'L', 'M', 'V', 'S', 'D':
				precio = 8 * personas;
				break;
			case 'X':
				precio = 5 * personas;
				break;
			case 'J':
				precio = ((personas / 2) * 11) + ((personas % 2) * 8);
				break;
			}
			if(tarjeta=='S') {
			precio=precio*0.9;
			}
			System.out.println("el precio es " + precio);
		}
		// TODO Auto-generated method stub
	}

}
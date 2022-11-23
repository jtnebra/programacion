package repasoev1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int jug1, jug2;
			boolean funciona = false;
			System.out.print("el jugador 1 da su jugada:1 PIEDRA, 2 PAPEL o 3 TIJERA ");
			jug1 = teclado.nextInt();
			System.out.print("el jugador 2 da su jugada:1 PIEDRA, 2 PAPEL o 3 TIJERA ");
			jug2 = teclado.nextInt();

			switch (jug1) {
			case 1:
				if (jug2 == 1)
					System.out.println("EMPATE!!!");
				else if (jug2 == 2)
					System.out.println("jug1 ha perdido");
				else if (jug2 == 3)
					System.out.println("juga1 ha ganado");
				else
					System.out.println("erroooor");
				break;
			case 2:
				if (jug2 == 2)
					System.out.println("EMPATE!!!");
				else if (jug2 == 3)
					System.out.println("jug1 ha perdido");
				else if (jug2 == 1)
					System.out.println("juga1 ha ganado");
				else
					System.out.println("erroooor");
				break;
			case 3:
				if (jug2 == 3)
					System.out.println("EMPATE!!!");
				else if (jug2 == 1)
					System.out.println("jug1 ha perdido");
				else if (jug2 == 2)
					System.out.println("juga1 ha ganado");
				else
					System.out.println("erroooor");
				break;
			default:
				System.out.println("ERRORRRRRR");
			}
		}
		// TODO Auto-generated method stub

	}

}

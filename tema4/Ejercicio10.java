package tema4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner teclado = new Scanner(System.in)) {
			boolean codigo = false;
			int año = 0, primeroH = 0, primeroM = 0, segundoH = 0, segundoM = 0, fin = 0;
			char genero = 0, curso = 0;
			String frase = "", añito = "";
			while (!codigo) {
				añito = "";
				fin=0;
				System.out.println("Dame el codigo");
				frase = teclado.nextLine();
				if(frase.length()==8) {
				for (int i = 0; i < 4; i++) {
					añito += frase.charAt(i);
				}
				año = Integer.parseInt(añito);
				for(int j=0;j<frase.length();j++) {
					if(frase.charAt(j)=='0')
						fin++;
					if(fin==8)
						codigo=true;
				}
				if (año >= 1990 && año <= 1995) {
					genero = frase.charAt(4);
					Character.toUpperCase(genero);
				if(genero=='M'||genero=='H') {
					curso = frase.charAt(5);
					if(curso=='1'||curso=='2') { 
					
					if (curso == '1')
						if (genero == 'M')
							primeroM++;
						else if (genero == 'H')
							primeroH++;
						else if (curso == '2')
							if (genero == 'M')
								segundoM++;
							else if (genero == 'H')
								segundoH++;
				}
				else
					System.out.println("No has introducido un año correcto");
				}else
					System.out.println("No has introducido un genero correcto");
				}
				}else
					System.out.println("Codigo incorrecto numero de caracteres incorrecto");
			}
			System.out.println("Hay " + primeroM + " chicas en primero");
			System.out.println("Hay " + primeroH + " chicos en primero");
			System.out.println("Hay " + segundoM + " chicas en segundo");
			System.out.println("Hay " + segundoH + " chicos en segundo");
		}
	}

}
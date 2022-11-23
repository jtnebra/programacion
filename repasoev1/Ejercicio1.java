package repasoev1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
	int numero;
	double pesetas,conversion;
	System.out.print("dime la cantidad de dinero que quieres convertir a pesetas: ");
	numero=teclado.nextInt();
	
	pesetas=166.386;
	conversion= numero * pesetas;
	
	System.out.println("la cantidad que quieres convertir son " + conversion + " pesetas");
		}
		// TODO Auto-generated method stub

	}

}

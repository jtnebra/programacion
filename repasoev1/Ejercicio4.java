package repasoev1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int numero, numhoras, salariosem;
System.out.print("dime el numero de horas que has trabajado: ");
numero=teclado.nextInt();
numhoras=12;
salariosem=numero*numhoras;
System.out.println("el salario por semana es: " + salariosem);
			
		}
		// TODO Auto-generated method stub
	}

}
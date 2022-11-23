package repasoev1;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int base,lado, area;
System.out.println("dime la base del rectangulo: ");
base=teclado.nextInt();
System.out.println("dime el lado del rectangulo: ");
lado=teclado.nextInt();
area=base*lado;
System.out.println("el area del rectangulo es: " + area);
		}
		// TODO Auto-generated method stub
	}

}
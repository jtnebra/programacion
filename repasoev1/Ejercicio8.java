package repasoev1;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int altura;
double g, t;
System.out.print("dime la altura que quieres que tire el objeto: ");
altura=teclado.nextInt();
g=9.81;
t=Math.sqrt((2*altura)/g);
System.out.println("el tiempo que tarda en caer es: " + t);
		}
		// TODO Auto-generated method stub

	}

}
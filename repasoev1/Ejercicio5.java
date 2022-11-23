package repasoev1;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int notaexam1, notafinal;
double notaexam2;
System.out.print("dime la nota que sacaste en el primer examen: ");
notaexam1=teclado.nextInt();
System.out.print("dime la nota que quieres sacar en la segunda evaluacion");
notafinal=teclado.nextInt();
notaexam2=(notafinal-(0.3*notaexam1))/0.7;
System.out.println("la nota que tienes que sacar en el segundo examen es: " + notaexam2);
		}
		// TODO Auto-generated method stub

	}

}

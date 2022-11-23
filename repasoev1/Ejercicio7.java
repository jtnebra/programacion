package repasoev1;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int horastrabajadas,horasordinarias=40, horasextra, salario;
System.out.println("dime las horas tabajadas: ");
horastrabajadas=teclado.nextInt();
horasextra=horastrabajadas-40;
if(horastrabajadas<40) {
	salario=horastrabajadas*12;
	System.out.println("el salario es: " + salario);
}
if(horastrabajadas>40) {
	salario=(horasordinarias*12)+(horasextra*16);
	System.out.println("el salario es: " + salario);
}
		}
		// TODO Auto-generated method stub
	}

}
package repasoev1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int hora;
System.out.print("dime una hora: ");
hora=teclado.nextInt();
if (6<=hora&&hora<=12) {
	System.out.println("BUENOS DIAS BB");
}
if (13<=hora&&hora<=20) {
	System.out.println("BUENOS TARDES BB");
}
if ((21<=hora||hora<=6)) {
	System.out.println("BUENOS NOCHES BB");
}
		}
		// TODO Auto-generated method stub
	}

}
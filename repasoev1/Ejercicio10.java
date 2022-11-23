package repasoev1;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int hora,minuto, segundos;
System.out.println("dime la hora en la que estamos");
hora=teclado.nextInt();
System.out.println("dime los minutos de la hora que estamos");
minuto=teclado.nextInt();
segundos=(3600*(23-hora))+(60*(60-minuto));
System.out.println("los segundos que faltan para llegar a medianoche son; " + segundos);
		}
		// TODO Auto-generated method stub
	}

}
package repasoev1;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int num1, num2, operacion, suma, resta, producto, division;
System.out.print("dime un numero: ");
num1=teclado.nextInt();
System.out.print("dime otro numero: ");
num2=teclado.nextInt();
System.out.println("que operacion quieres realizar: 1 suma, 2 resta, 3 multiplicacion y 4 division: ");
operacion=teclado.nextInt();
switch (operacion) {
case 1:
	suma=num1 + num2;
	System.out.println("la suma de " + num1 + " y " + num2 + " es: " + suma);
	break;
case 2:
	resta=num1 - num2;
	System.out.println("la resta de " + num1 + " y " + num2 + " es: " + resta);
	break;
case 3:
	producto=num1 * num2;
	System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es: " + producto);
	break;
case 4:
	division=num1 / num2;
	System.out.println("la division de " + num1 + " y " + num2 + " es: " + division);
	break;
}
		}
		// TODO Auto-generated method stub
	}

}
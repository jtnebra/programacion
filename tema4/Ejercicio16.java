package tema4;

import java.util.Scanner;

public class Ejercicio16 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner teclado = new Scanner(System.in)) {
String nombreuno= "",nombredos="",nombre1="",nombre2="",apellido1="",apellido2="";
int espacio1,espacio2;
System.out.print("Dame un nombre y apellido:");
nombreuno = teclado.nextLine();
System.out.print("dame otro nombre y apellido: ");
nombredos = teclado.nextLine();
espacio1=nombreuno.indexOf(" ");
espacio2=nombredos.indexOf(" ");
for(int i=0;i<espacio1;i++) {
	nombre1+=nombreuno.charAt(i);
}
for(int i=espacio1+1;i<nombreuno.length();i++) {
	apellido1+=nombreuno.charAt(i);
}
for(int i=0;i<espacio2;i++) {
	nombre2+=nombredos.charAt(i);
}
for(int i=espacio2+1;i<nombredos.length();i++) {
	apellido2+=nombredos.charAt(i);
}

System.out.println(nombre1+" "+apellido2);
System.out.println(nombre2+" "+apellido1);
		}
	}
}
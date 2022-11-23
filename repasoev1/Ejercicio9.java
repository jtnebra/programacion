package repasoev1;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		try (Scanner teclado=new Scanner(System.in)) {
int dia, mes;
System.out.println("dime el dia en que naciste");
dia=teclado.nextInt();
System.out.println("dime el mes en que naciste");
mes=teclado.nextInt();
if(dia>31){
	System.out.println("ese dia no existe");
if(mes>12){
		System.out.println("ese mes no existe");
}
switch(mes) {
case 1:
	if(dia<21)
		System.out.println("eres capricornio");
	else
		System.out.println("eres acuario");
	break;
case 2:
	if(dia<20)
		System.out.println("eres acuario");
	else
		System.out.println("eres piscis");
	break;
case 3:
	if(dia<21)
		System.out.println("eres piscis");
	else
		System.out.println("eres aries");
	break;
case 4:
	if(dia<22)
		System.out.println("eres aries");
	else
		System.out.println("eres tauro");
	break;
case 5:
	if(dia<22)
		System.out.println("eres tauro");
	else
		System.out.println("eres geminis");
	break;
case 6:
	if(dia<22)
		System.out.println("eres geminis");
	else
		System.out.println("eres cancer");
	break;
case 7:
	if(dia<24)
		System.out.println("eres cancer");
	else
		System.out.println("eres leo");
	break;
case 8:
	if(dia<23)
		System.out.println("eres leo");
	else
		System.out.println("eres virgo");
	break;
case 9:
	if(dia<23)
		System.out.println("eres virgo");
	else
		System.out.println("eres libra");
	break;
case 10:
	if(dia<23)
		System.out.println("eres libra");
	else
		System.out.println("eres escorpio");
	break;
case 11:
	if(dia<23)
		System.out.println("eres escorpio");
	else
		System.out.println("eres sagitario");
	break;
case 12:
	if(dia<22)
		System.out.println("eres sagitario");
	else
		System.out.println("eres capricornio");
	break;
}
		}
		// TODO Auto-generated method stub
	}
}
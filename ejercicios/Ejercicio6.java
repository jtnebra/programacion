package ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero, sumapar=0,sumaimpar=0,contador=1;
       boolean comprueba=false;
       while(!comprueba) {
    	   System.out.println("Di un numero");
           numero=teclado.nextInt();
           if(numero==0) {
        	   comprueba=true;
           }
           if(contador%2==0) {
        	sumapar=sumapar+numero;
        	contador++;
           }else {
        	 sumaimpar=sumaimpar+numero;
        	 contador++;
           }
       }
       System.out.println("La suma par da "+sumapar);
       System.out.println("La suma impar da "+sumaimpar);
       }
    }
}
package ejercicios;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero, suma=0,contador=0;
       boolean comprueba=false;
       while(!comprueba) {
    	   System.out.println("Di un numero");
           numero=teclado.nextInt();
           if(numero==0) {
        	   comprueba=true;
           }
    	   suma=suma+numero;
    	   contador++;
       }
       System.out.println("La suma da "+suma);
       System.out.println("Se han introducido "+contador);
       }
    }
}
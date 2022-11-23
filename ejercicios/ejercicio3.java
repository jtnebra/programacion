package ejercicios;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero;
           System.out.println("Di un numero");
           numero=teclado.nextInt();
           for(int i=2;i<numero;i++) {
        	   
        	   if(numero%i==0) {
        		   System.out.println("El "+i+" es divisor");
        	   }
        	   
           }
       }
    }
}
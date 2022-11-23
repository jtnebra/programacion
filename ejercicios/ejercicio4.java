package ejercicios;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero,contador=0;
           System.out.println("Di un numero");
           numero=teclado.nextInt();
           for(int i=numero;i==0;i--) {
        	   
        	   if(numero%i==0) {
        		   contador++;
        	   }
        	   
           }
           if(contador>2) {
        	   System.out.println("No es primo");
           }else {
        	   System.out.println("Es primo");
           }
       }
    }
}
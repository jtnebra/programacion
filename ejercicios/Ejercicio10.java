package ejercicios;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        boolean correcto=false;
       int numero=0,divisor=0,primo=0,contador=0;
       System.out.println("Di un numero");
       numero=teclado.nextInt();
    	  
       while(!correcto) {
    	   numero++;
    	   for(int i=1;i<=numero;i++) {
        	   
        	   if(numero%i==0) {
        		   contador++;
        	   }
        	   
           }
           if(contador>2) {
        	   System.out.println("No es primo");
        	   contador=0;
           }else {
        	   System.out.println("Es primo");
        	   primo=numero;
        	   System.out.println(numero);
        	   correcto=true;
        		   
           }
       }
       
       }
    }
}
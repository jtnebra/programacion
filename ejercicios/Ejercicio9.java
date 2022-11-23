package ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        boolean correcto=false;
       int numero=0,divisor=0,perfecto=0;
       System.out.println("Di un numero");
       numero=teclado.nextInt();
        for(int i=1;i<numero;i++){
           if(numero%i==0)
        	perfecto=perfecto+i;           
        }
        if(perfecto==numero)
        System.out.println("es perfecto");
        else
        System.out.println("no");
       }
    }
}
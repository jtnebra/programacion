package ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero,contador=0;
           System.out.println("Di un numero");
           numero=teclado.nextInt();
           for(int j=2;j<=numero;j++){
               contador=0;
           for(int i=1;i<=j;i++) {
          if(j%i==0) {
          contador++;
          }
           }
           if(contador>2) {
         
           }else {
          System.out.print(j+", ");
           }
           }
       }
    }
}
	

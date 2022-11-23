package ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        boolean correcto=false;
       int numero=0,factorial=1;
           while(!correcto){
           System.out.println("Di un numero");
           numero=teclado.nextInt();
           if(numero>=0){
              correcto=true;
           }
           }
        for(int i=1;i<=numero;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
       }
    }
}
package ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero,media=0,menor=0,mayor=0,contador=0;
       boolean comprueba=false;
       while(!comprueba) {
    	   System.out.println("Di un numero");
           numero=teclado.nextInt();
           if(numero==0) {
        	   comprueba=true;
           }else{
           media=media+numero;
           contador++;
           if(numero>mayor)
        	   mayor=numero;
           if(numero<menor) 
        	   menor=numero;
           }
       }
       media=media/contador;
       System.out.println("El menor es "+menor);
       System.out.println("El mayor es "+mayor);
       System.out.println("La media es "+media);
       }
    }
}
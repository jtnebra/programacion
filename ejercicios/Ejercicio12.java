package ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
       int numero,base=0,altura=0,area=0;
    	   System.out.println("1 triangulo 2 cuadrado 3 rectangulo");
           numero=teclado.nextInt();
         switch(numero) {
         case 1:
        	 System.out.println("Dame la altura del triangulo");
        	 altura=teclado.nextInt();
        	 System.out.println("Dame la base del triangulo");
        	 base=teclado.nextInt();
        	 area=base*altura/2;
        	 break;
         case 2:
        	 System.out.println("Dame el lado del triangulo");
        	 altura=teclado.nextInt();
        	 area=altura*altura;
        	 break;
         case 3:
        	 System.out.println("Dame la altura del rectangulo");
        	 altura=teclado.nextInt();
        	 System.out.println("Dame la base del rectangulo");
        	 base=teclado.nextInt();
        	 area=base*altura;
        	 break;
         }
         System.out.println("El area de la figura es "+area);
       }
    }
}
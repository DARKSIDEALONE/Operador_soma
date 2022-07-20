import java.util.Scanner;
public class Soma {
     public static void main (String [] args){

          int a , b ,c = 0;
          Scanner Scanner = new Scanner(System.in);
          System.out.println("Introduza os numeros: ");

          a = Scanner.nextInt();
          b = Scanner.nextInt();
          c = a + b;

          System.out.println("A soma dos numeros e : " + c);
     }
}

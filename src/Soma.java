import java.util.Scanner;
public class Soma {
     public static void main (String [] args){

          int a , b ,c = 0;
          Scanner Scanner = new Scanner(System.in);

          System.out.println("Insira o primeiro numero: ");
          a = Scanner.nextInt();
          System.out.println("Insira o segundo numero: ");
          b = Scanner.nextInt();
          c = a + b;

          System.out.println("A soma dos numeros e : " + c);
     }
}

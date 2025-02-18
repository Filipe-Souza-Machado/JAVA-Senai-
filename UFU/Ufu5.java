//Leia um vetor de 10 posiçoes. Contar e escrever quantos valores pares ele possui.
import java.util.Scanner;

public class Ufu5 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A[] = new int[10];
            int pares = 0;

            for(int i = 0; i < 10; i++) {
                  System.out.print("dIGITE O VALOR DA " + (i + 1) + "º POSICAO : ");
                  A[i] = sc.nextInt();
                  
                  pares = (A[i] % 2 == 0) ? pares + 1 : pares;
            }

            System.out.println("Quantidade de pares: " + pares);
            sc.close();
      }
}
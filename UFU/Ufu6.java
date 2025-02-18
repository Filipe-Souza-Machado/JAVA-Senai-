//Faça um programa que receba do usuario um vetor com 10 posições. Em seguida deverá a ser impresso o maior e o menor elemento do vetor.

import java.util.Scanner;
public class Ufu6 {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int A[] = new int[10];
      int maior = 0;

      for(int i =0; i<A.length; i++){
            System.out.print("Digite o "+(i +1)+"º valor: ");
            A[i] = sc.nextInt();

            maior = Math.max(maior, A[i]);//O método Math.max(x,y) pode ser usado para encontrar o valor mais alto de x e y.
      }
      System.out.print("Maior numero: "+maior);
      sc.close();
     } 
}
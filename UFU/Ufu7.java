//Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima o vetor, o maior elemento e a posição que ele se encontra.

import java.util.Scanner;
public class Ufu7 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A[] = new int[10];
            int maior = 0;
            int POSICAO = 0;

            for(int i=0;i<A.length;i++){
                  System.out.print("Digite o "+(i +1)+"º valor: ");
                  A[i] = sc.nextInt();  

                  if ((A[i ] > maior)) {
                        maior = A[i];
                        POSICAO = i;
                  }
            }
            System.out.print("Maior valor: " + maior);
            System.out.print("\n");
            System.out.print("Posição: "+POSICAO);
            sc.close();
      }
}
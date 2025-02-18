//Faça um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa deve executar os seguintes passos:

import java.util.Scanner;
public class Ufu1 {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int[] A = {1,0,5,-2,-5,7};
      int soma = A[0] + A[1] + A[5];
      A[4] = 100;

      System.out.println("Soma = " + soma);
      for(int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
      }
      sc.close();
  }    
}
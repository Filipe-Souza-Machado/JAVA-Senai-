//Faça um programa que leia um vetor de 8 posiçoes e, em seguida, leia tambem dois valores X e Y quaisquer correspondentes a duas posiçoes no vetor. Ao final seu programa devera escrever a soma dos valores encontrados nas respectivas posções X e Y .

import java.util.Scanner;

public class Ufu4 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] A = new int[8];

            for(int i = 0; i <A.length; i++) {
                  System.out.print("Digite o "+(i+1)+"° numero: ");
                  A[i] = sc.nextInt();     
            } 

            System.out.print("Digite um numero de 1 a 8: ");
            int x = sc.nextInt();
            System.out.print("Digite um numero de 1 a 8: ");
            int y = sc.nextInt();

            System.out.print(A[x]+" + "+A[y]+" = "+(A[x] + A[y]));
            sc.close();
      }
}
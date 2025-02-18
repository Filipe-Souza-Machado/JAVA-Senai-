//. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.

import java.util.Scanner;
import java.util.Arrays;//Biblioteca

public class Ufu2 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] A = new int[6];

            for(int i = 0; i <A.length; i++) {
                  System.out.print("Digite o "+(i+1)+"° numero: ");
                  A[i] = sc.nextInt();
            }
            System.out.println("Os números digitados foram: " + Arrays.toString(A));//O método Arrays.toString() em Java é uma maneira conveniente de converter um array em uma representação de string legível. 
            sc.close();
      }
}
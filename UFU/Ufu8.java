//Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos na ordem inversa.

import java.util.Scanner;
public class Ufu8 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A[] = new int[10];

            for(int i=0;i<A.length;i++){
                  System.out.print("Digite o "+(i +1)+"º valor: ");
                  A[i] = sc.nextInt();
            }

            for (int i=A.length;i > 0;i--){
                  System.out.println("Posição "+i+" = "+A[i-1]);
            }
            sc.close();
      }
}
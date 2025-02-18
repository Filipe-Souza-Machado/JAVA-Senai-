//Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos.

import java.util.Scanner;
import java.util.Arrays;

public class Ufu3 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            float[] A = new float[10];
            float[] resultados = new float[10];

            for(int i = 0; i <A.length; i++) {
                  System.out.print("Digite o "+(i+1)+"° numero: ");
                  A[i] = sc.nextFloat();
                  resultados [i] = (float) Math.pow(A[i], 2);//(Float) converte o valor para float.
            }

            System.out.println("Os resultados são: "+Arrays.toString(resultados));
            sc.close();
      }
}
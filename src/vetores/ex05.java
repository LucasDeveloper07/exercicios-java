package vetores;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maiorValor = 0;
        int posicaoValor = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicaoValor = i;
            }
        }

        System.out.printf("\nMaior valor = %.2f\n", maiorValor);
        System.out.printf("Posiçao do maior valor = %d\n", posicaoValor);

        sc.close();
    }
}

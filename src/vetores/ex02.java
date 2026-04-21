package vetores;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        double media = soma / vect.length;

        System.out.print("\nValores = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f ",vect[i]);
        }

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Media = %.2f\n", media);

        sc.close();
    }
}

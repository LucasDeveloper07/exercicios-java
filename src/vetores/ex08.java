package vetores;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor vai ter: ");
        int n = sc.nextInt();

        double vet[] = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double somaVet = 0.0;
        double mediaVet;

        for (int i = 0; i < vet.length; i++) {
            somaVet += vet[i];
        }

        mediaVet = somaVet / vet.length;
        System.out.printf("\nMedia do vetor = %.3f\n", mediaVet);

        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < mediaVet) {
                System.out.printf("%.1f\n", vet[i]);
            }
        }

        sc.close();
    }
}

package vetores;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();

        double vet[] = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        int quantPar = 0;
        double somaPar = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                somaPar += vet[i];
                quantPar++;
            }
        }

        if (quantPar > 0) {
            double mediaPar = somaPar / quantPar;
            System.out.printf("Media dos pares = %.1f\n", mediaPar);
        } else {
            System.out.println("Nenhum numero par!");
        }

        sc.close();
    }
}

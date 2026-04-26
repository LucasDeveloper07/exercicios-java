package vetores;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor: ");
        int n = sc.nextInt();

        int vetA[] = new int[n];
        int vetB[] = new int[n];
        int vetC[] = new int[n];

        for (int i = 0; i < vetA.length; i++) {
            if (i == 0) {
                System.out.println("Valores do vetor A:");
                System.out.print("Digite um numero: ");
                vetA[i] = sc.nextInt();
            } else {
                System.out.print("Digite um numero: ");
                vetA[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < vetB.length; i++) {
            if (i == 0) {
                System.out.println("\nValores do vetor B:");
                System.out.print("Digite um numero: ");
                vetB[i] = sc.nextInt();
            } else {
                System.out.print("Digite um numero: ");
                vetB[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < vetC.length; i++) {
            vetC[i] = (vetA[i] + vetB[i]);
        }

        for (int i = 0; i < vetC.length; i++) {
            if (i == 0) {
                System.out.println("\nResultado do vetor C: ");
                System.out.println(vetC[i]);
            } else {
                System.out.println(vetC[i]);
            }
        }

        sc.close();
    }
}

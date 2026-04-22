package vetores;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        int quantPares = 0;
        System.out.println("\nNúmeros pares:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i]+ " ");
                quantPares += 1;
            }
        }

        if (quantPares > 0) {
            System.out.println("\nQuantidade de pares = "+ quantPares);
        } else {
            System.out.println("Não houve numeros pares!");
        }

        sc.close();
    }
}

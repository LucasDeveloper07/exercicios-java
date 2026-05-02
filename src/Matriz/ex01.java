package Matriz;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Digite os numeros que irao compor a matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDiagonal principal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int numNegativos = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    numNegativos++;
                }
            }
        }

        if (numNegativos == 0) {
            System.out.println("Nao ha nenhum numero negativo na matriz");
        } else {
            System.out.println("Numeros negativos = " + numNegativos);
        }

        sc.close();
    }
}

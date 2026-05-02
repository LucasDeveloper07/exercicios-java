package Matriz;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da quantidade de linhas e colunas: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nInforme um numero que esteja na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("\nPosicao: [" + i + ", " + j + "]");

                    if ((j - 1) >= 0) {
                        System.out.println("Esquerda: " + mat[i][(j - 1)]);
                    }
                    if ((j + 1) < mat[i].length) {
                        System.out.println("Direita: " + mat[i][(j + 1)]);                    
                    } 
                    if ((i - 1) >= 0) {
                        System.out.println("Acima: " + mat[i - 1][j]);                        
                    }
                    if ((i + 1) < mat.length) {
                        System.out.println("Abaixo: " + mat[i + 1][j]);                        
                    }
                }
            }
        }

        sc.close();
    }
}

package Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex02 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        
        System.out.print("Quantos nomes serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        for (String x : nomes) {
            System.out.println();
            System.out.println(x);
        }

        sc.close();
    }
}

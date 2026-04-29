package Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.print("Quantos nomes serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.println();
        for (String x : nomes) {
            System.out.println(x);
        }

        int opcao;

        do {
            System.out.println("\nDeseja remover algum nome? 1-Sim/2-Nao");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Qual nome voce deseja remover? ");
                    String nomeRemoved = sc.nextLine();

                    boolean removed = nomes.remove(nomeRemoved);
                    if (removed ==  false) {
                        System.out.println("Este nome nao existe na lista!");
                    } 
                    break;
            }
        } while (opcao != 2);

        System.out.println();

        for (String x : nomes) {
            System.out.println(x);
        }

        sc.close();
    }
}

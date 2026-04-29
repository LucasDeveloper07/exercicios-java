package Listas.Ex06.Application;

import java.util.Scanner;
import java.util.stream.Collectors;
import Listas.Ex06.Entities.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios serao digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionario " + (i + 1) + ":");
            System.out.print("Digite o ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            
            funcionarios.add(new Funcionario(id, nome));
        }

        System.out.println("\nDigite o ID do funcionario que deseja buscar: ");
        int idBusca = sc.nextInt();

        List<Funcionario> nomeBusca = funcionarios.stream().filter(nome -> nome.getId() == idBusca).collect(Collectors.toList());

        if (nomeBusca.isEmpty()) {
            System.out.println("\nEste funcionario nao existe!");
        } else {
            System.out.println();
            System.out.println(nomeBusca.get(0));
        }

        sc.close();
    }
}

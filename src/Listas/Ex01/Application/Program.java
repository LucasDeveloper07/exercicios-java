package Listas.Ex01.Application;

import java.util.Scanner;
import Listas.Ex01.Entities.Funcionario;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionarios serao registrados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nFuncionario " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            // Instanciação do objeto funcionario e adição dele na lista
            Funcionario funcionarioObj = new Funcionario(id, nome, salario);
            funcionarios.add(funcionarioObj);
        }

        System.out.print("\nDigite o ID do funcionario que tera um aumento de salario: ");
        int idBusca = sc.nextInt();
        
        /*Filtro para buscar o funcionario correspondente com o ID e se encontrado, 
        realizar a chamada do metodo de aumentoSalario(), se nao for encontrado, ele retorna que o ID
        informado nao exite*/
        funcionarios.stream().filter(x -> x.getId() == idBusca).findFirst().ifPresentOrElse(
            x -> {
                System.out.print("Digite a porcentagem: ");
                double porcent = sc.nextDouble();
                x.aumentoSalario(porcent);
            }, 
            () -> System.out.println("Este ID nao existe!")
        );

        // Impressao da lista de funcionario com for each que retorna o toString() de cada funcionario
        System.out.println("\nLista de funcionarios:");
        
        for (Funcionario x : funcionarios) {
            System.out.println(x);
            System.out.println();
        }

        sc.close();
    }
}

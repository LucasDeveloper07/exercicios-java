package vetores.Ex10.Application;

import java.util.Scanner;
import vetores.Ex10.Entities.Pessoa;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa vet[] = new Pessoa[n]; // Vetor com o tamanho que o usuário digitar
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Dados da "+ (i + 1) +"a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            vet[i] = new Pessoa(nome, idade); 
            /* Instanciação do objeto com construtor para inicar os atributos 
            e armazena-los na posição i do vetor */ 
        }

        int pessoaVelha = 0;

        // Loop para encontrar a pessoa mais velha e armazenar a idade em uma variavel
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() > pessoaVelha) {
                pessoaVelha = vet[i].getIdade();
            }
        }

        // Loop para encontrar e imprimir o nome da pessoa mais velha
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getIdade() == pessoaVelha) {
                System.out.println("Pessoa mais velha: "+ vet[i].getNome());
            }
        }

        sc.close();
    }
}

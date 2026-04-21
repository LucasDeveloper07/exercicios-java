package POO.Ex07.Application;

import java.util.Scanner;
import POO.Ex07.Entities.Conta;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        String nome;
        int numero, opcao;
        double deposito, saque;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Deseja fazer um depósito inicial? 1 - Sim/2 - Não");
        opcao = sc.nextInt();


        // Validação para decidir como o objeto será instanciado
        if (opcao == 1) {
            do {
                System.out.print("\nDigite o valor do depósito: ");
                deposito = sc.nextDouble();

                if (deposito < 0) {
                    System.out.println("Valor Inválido");
                }
            } while (deposito < 0);

            conta = new Conta(nome, numero, deposito);
        } else {
            conta = new Conta(nome, numero);
        }

        System.out.println(conta);

        // Menu de interação com o usuário
        do {
            System.out.println("\n=====MENU=====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Exibir dados");
            System.out.println("5 - Sair\n");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consome o "\n" deixado no buffer pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o valor a ser depositado: ");
                    deposito = sc.nextDouble();
                    conta.depositar(deposito);

                    if (deposito >= 0) {
                        System.out.println(conta);
                    }
                    break;
                case 2:
                    System.out.println("\nTaxa de saque: R$5,00");
                    System.out.print("Informe o valor a ser sacado: ");
                    saque = sc.nextDouble();
                    
                    if ((saque + 5) <= conta.getSaldo()) {
                        conta.sacar(saque);
                        System.out.println(conta);
                    }
                    break;
                case 3:
                    System.out.print("\nDigite o nome desejado: ");
                    nome = sc.nextLine();
                    conta.setNome(nome);

                    System.out.println(conta);
                    break;
                case 4:
                    System.out.println(conta);
                    break;
            }
        } while (opcao != 5);

        System.out.println("Saindo...");

        sc.close();
    }
}

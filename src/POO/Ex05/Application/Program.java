package POO.Ex05.Application;

import java.util.Scanner;
import POO.Ex05.Entities.Conta;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        int opcao;
        
        do {
            System.out.println("=====BANCO=====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Mostrar dados");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");
            
            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    conta = new Conta();
                    
                    System.out.print("\nInforme o seu nome completo: ");
                    conta.titular = sc.nextLine();

                    System.out.print("Informe seu CPF: ");
                    conta.cpf = sc.nextLine();

                    System.out.println(conta);
                    break;

                case 2: 
                    if (conta == null) {
                            System.out.println("Você não possui uma conta!\n");
                        }
                        else {
                            System.out.println(conta);
                        }
                        break;
                        
                case 3:
                    if (conta == null) {
                        System.out.println("Você não possui uma conta!\n");
                    }
                    else {
                        System.out.println("\nInforme o valor a ser depositado: ");
                        double valor = sc.nextDouble();
                        conta.deposito(valor);
                    }
                    break;
                    
                case 4:
                    if (conta == null) {
                        System.out.println("Você não possui uma conta!\n");
                    }
                    else {
                        System.out.println("\nInforme o valor a ser sacado: ");
                        double valor = sc.nextDouble();
                        conta.saque(valor);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        System.out.println("Saindo...");

        sc.close();
    }
}

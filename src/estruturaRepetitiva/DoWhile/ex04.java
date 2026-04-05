package estruturaRepetitiva.DoWhile;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao;
        double saldo = 0.0;
        double deposito, saque;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair\n");

            System.out.println("Escolha opção desejada: ");
            opcao = sc.nextInt();

            if (opcao <1 || opcao >4) {
                System.out.println("Opção inválida!");
                System.out.println("Escolha novamente");
            } else {
                if (opcao == 1) {
                    System.out.printf("Saldo: R$%.2f\n\n", saldo);
                } else if (opcao == 2) {
                    System.out.println("Qual o valor a ser depositado: ");
                    deposito = sc.nextDouble();

                    if (deposito <0) {
                        System.out.println("Não é possível realizar este depósito!\n");
                    } else {
                        saldo += deposito;

                        System.out.printf("Valor depositado: R$%.2f\n", deposito);
                        System.out.printf("Novo saldo: R$%.2f\n\n", saldo);
                    }
                } else if (opcao == 3) {
                    if (saldo == 0) {
                        System.out.println("Você não tem saldo disponível para sacar!\n");
                    } else {
                        System.out.println("Qual o valor a ser sacado: ");
                        saque = sc.nextDouble();

                        if (saque <0) {
                            System.out.println("Valor inválido!\n");
                        } else if (saque > saldo) {
                            System.out.println("Não é possível sacar este valor! Seu saldo é insuficiente!\n");
                        } else {
                            saldo -= saque;

                            System.out.printf("Valor sacado: R$%.2f\n", saque);
                            System.out.printf("Novo saldo: R$%.2f\n\n", saldo);
                        }
                    }
                }
            }
        } while (opcao != 4);

        System.out.println("Encerrando o programa...");

        sc.close();
    }
}

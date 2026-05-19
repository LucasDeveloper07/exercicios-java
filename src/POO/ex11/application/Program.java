package POO.ex11.application;

import java.util.Scanner;

import POO.ex11.modelEntities.Account;
import POO.ex11.modelException.ErrorException;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os dados da conta:");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Titular: ");
            String holder = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double balance = sc.nextDouble();

            System.out.print("Limite de saque: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nDigite o valor para saque: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Saldo: " + String.format("R$%.2f", account.getBalance()));

        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

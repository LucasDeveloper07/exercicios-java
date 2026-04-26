package vetores.Ex06.Application;

import java.util.Scanner;

import vetores.Ex06.Entities.Aluguel;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluguel vet[] = new Aluguel[10];

        for (int i = 0; i < n; i++) {
            System.out.println("\n"+ (i + 1) +" - Aluguel");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            sc.nextLine();

            vet[quarto] = new Aluguel(nome, email);
        }

        System.out.println("\nQuartos alugados: ");

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != null) {
                System.out.println(i + " - " + vet[i]);
            }
        }

        sc.close();
    }
}

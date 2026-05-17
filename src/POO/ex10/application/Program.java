package POO.ex10.application;

import java.util.ArrayList;
import java.util.Scanner;

import POO.ex10.entities.LegalEntity;
import POO.ex10.entities.NaturalPerson;
import POO.ex10.entities.PersonTaxPayer;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Lista do tipo PersonTaxPayer para armazenar todos os tipos de contribuintes (Polimorfismo)
        ArrayList<PersonTaxPayer> taxPayers = new ArrayList<>(); 

        System.out.print("Quantos contribuintes serao informados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nContribuinte " + (i + 1) + ":");
            System.out.print("Pessoa fisica ou juridica (f/j)? ");
            char typePerson = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Renda anual: ");
            double annualIncome = sc.nextDouble();

            if (typePerson == 'f') {
                System.out.print("Gastos de saude: ");
                double expenseHealth = sc.nextDouble();

                taxPayers.add(new NaturalPerson(name, annualIncome, expenseHealth));
            } else {
                System.out.print("Numero de funcionarios: ");
                int numberEmployees = sc.nextInt();

                taxPayers.add(new LegalEntity(name, annualIncome, numberEmployees));
            }
        }

        System.out.println("\nValor impostos:");

        double sumTax = 0.0;

        for (PersonTaxPayer person : taxPayers) {
            System.out.printf("%s: R$%.2f\n", person.getName(), person.tax());
            sumTax += person.tax();
        }

        System.out.printf("\nImpostos totais: R$%.2f\n", sumTax);

        sc.close();
    }
}

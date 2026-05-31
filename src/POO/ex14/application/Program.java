package POO.ex14.application;

import java.time.LocalDate;
import java.util.Scanner;

import POO.ex14.entities.Subscription;
import POO.ex14.services.PagaFacilGateway;
import POO.ex14.services.SubscriptionService;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=====STREAMING=====");
        System.out.println("Digite seus dados para a assinatura:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Plano: ");
        double valuePlan = sc.nextDouble();

        LocalDate dateStart = LocalDate.now();

        Subscription subs = new Subscription(name, dateStart, valuePlan);

        System.out.print("Quantos meses deseja de assinatura? ");
        int months = sc.nextInt();

        SubscriptionService subsService = new SubscriptionService(new PagaFacilGateway());
        subsService.processSubscription(subs, months);

        System.out.println("\n" + subs);

        sc.close();
    }
}

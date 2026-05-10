package Composicao.Ex03.Application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Composicao.Ex03.Entities.Client;
import Composicao.Ex03.Entities.Order;
import Composicao.Ex03.Entities.OrderItem;
import Composicao.Ex03.Entities.Product;
import Composicao.Ex03.EntitiesEnum.OrderStatus;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        String clientBirthy = sc.nextLine();
        LocalDate ldt = LocalDate.parse(clientBirthy, fmt);

        Client client = new Client(clientName, clientEmail, ldt);

        System.out.println("\nDigite os dados do pedido:");
        System.out.print("Status: ");
        String statusOrder = sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(statusOrder);

        System.out.print("Quantos itens tem no pedido: ");
        int n = sc.nextInt();
        sc.nextLine();

        LocalDateTime momentOrder = LocalDateTime.now();
        Order orderClient = new Order(momentOrder, orderStatus, client);

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite os dados do " + (i + 1) + "o item:");
            System.out.print("Produto: ");
            String productName = sc.nextLine();

            System.out.print("Preco: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantidade: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            Product productOrder = new Product(productName, productPrice);
            OrderItem itemOr = new OrderItem(productQuantity, productOrder);
            orderClient.addItem(itemOr);
        }

        System.out.println(orderClient);

        sc.close();
    }
}
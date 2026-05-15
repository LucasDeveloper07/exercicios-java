package POO.ex09.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import POO.ex09.entities.ImportedProduct;
import POO.ex09.entities.Product;
import POO.ex09.entities.UsedProduct;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Product> products = new ArrayList<>(); // Lista do tipo Product para guardar os produtos

        System.out.print("Quantos produtos serao cadastrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDados do " + (i + 1) + "o produto:");
            System.out.print("Produto comum, usado ou importado (c/u/i)? ");
            char productType = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nameProduct = sc.nextLine();

            System.out.print("Preço: ");
            double priceProduct = sc.nextDouble();
            sc.nextLine();

            if (productType == 'i') {
                System.out.print("Custo de importaçao: ");
                double customFeeProduct = sc.nextDouble();

                products.add(new ImportedProduct(nameProduct, priceProduct, customFeeProduct));
            } else if (productType == 'u') {
                System.out.print("Data de fabricaçao (DD/MM/YYYY): ");
                LocalDate manufactureDateProduct = LocalDate.parse(sc.nextLine(), fmt);

                products.add(new UsedProduct(nameProduct, priceProduct, manufactureDateProduct));
            } else {
                products.add(new Product(nameProduct, priceProduct));
            }
        }

        System.out.println("\nEtiquetas de preço:");

        // Impressão das etiquetas de preço dos produtos usando for each para percorrer todos os objetos da lista
        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}

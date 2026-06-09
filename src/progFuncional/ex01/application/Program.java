package progFuncional.ex01.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import progFuncional.ex01.entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");
        String patch = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {

            String line = br.readLine();

            while (line != null) {
                
                String[] fields = line.split(",");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);

                products.add(new Product(name, price));

                line = br.readLine();
            }

            double average = products.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / products.size();

            System.out.printf("Media de preço dos produtos: R$%.2f\n", average);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> prodAvg = products.stream().filter(p -> p.getPrice() < average).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            prodAvg.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

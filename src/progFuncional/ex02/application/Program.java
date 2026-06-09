package progFuncional.ex02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import progFuncional.ex02.entities.Employee;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");
        String patch = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.print("Digite um salario referencia: ");
            double salarySearch = sc.nextDouble();

            System.out.printf("Email dos funcionarios com salario maior que R$%.2f:\n", salarySearch);

            Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            List<String> emails = employees.stream()
                .filter(e -> e.getSalary() > salarySearch)
                .map(e -> e.getEmail())
                .sorted(comp)
                .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double sumSalary = employees.stream()
                .filter(e -> e.getName().charAt(0) == 'M')
                .map(e -> e.getSalary())
                .reduce(0.0, (x, y) -> x + y);

            System.out.printf("\nSoma dos salarios de funcionarios que começam com a letra 'M': R$%.2f\n", sumSalary);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

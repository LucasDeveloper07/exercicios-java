package POO.Ex08.application;

import java.util.ArrayList;
import java.util.Scanner;

import POO.Ex08.entities.Employee;
import POO.Ex08.entities.OutsourcedEmployee;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(); // Lista do tipo funcionario comum (super classe)

        System.out.print("Quantos funcionarios vao ser digitados: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nFuncionario " + (i + 1) + (":"));
            System.out.print("O funcionario é terceirizado (1-Sim/2-Nao)? ");
            int optionEmployee = sc.nextInt();
            sc.nextLine();

            if (optionEmployee == 1) {
                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Horas trabalhadas: ");
                int hours = sc.nextInt();

                System.out.print("Valor por hora: ");
                double valuePerHour = sc.nextDouble();

                System.out.print("Custo adicional: ");
                double additionalCharge = sc.nextDouble();

                // Instância e adição do funcionario terceirizado na lista
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                System.out.print("Nome: ");
                String name = sc.nextLine();

                System.out.print("Horas trabalhadas: ");
                int hours = sc.nextInt();

                System.out.print("Valor por hora: ");
                double valuePerHour = sc.nextDouble();

                // Instância e adição do funcionário comum na lista
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPagamentos: ");

        // Impressão dos pagamentos de cada funcionário utilizando for each
        for (Employee emp : employees) {
            System.out.printf("%s - R$%.2f\n", emp.getName(), emp.payment());
        }

        sc.close();
    }
}

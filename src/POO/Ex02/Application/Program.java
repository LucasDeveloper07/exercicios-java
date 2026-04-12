package POO.Ex02.Application;

import java.util.Scanner;
import POO.Ex02.Entities.Funcionario;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Informe o nome do funcionário: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Informe o salário bruto dele: ");
        funcionario.salario = sc.nextDouble();

        System.out.print("Informe o imposto do funcionário: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("\nFuncionário: "+ funcionario);

        System.out.println("\nInforme a porcentagem de aumento do salario: ");
        double aumento = sc.nextDouble();
        funcionario.aumentoSalario(aumento);

        System.out.println("\nFuncionário: "+ funcionario);
        
        sc.close();
    }
}

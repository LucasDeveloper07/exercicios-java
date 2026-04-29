package Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();
        
        System.out.print("Quantos salarios serao digitados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o salario: ");
            double salario = sc.nextDouble();
            salarios.add(salario);
        }

        double somaSalario = 0.0;
        double mediaSalario;

        for (int i = 0; i < salarios.size(); i++) {
            somaSalario += salarios.get(i);
        }

        mediaSalario = somaSalario / salarios.size();

        System.out.printf("\nSoma dos salarios: R$%.2f\n", somaSalario);
        System.out.printf("Media dos salarios: R$%.2f\n", mediaSalario);

        sc.close();
    }
}

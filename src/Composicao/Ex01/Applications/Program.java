package Composicao.Ex01.Applications;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Composicao.Ex01.Entities.ContratoHoras;
import Composicao.Ex01.Entities.Departamento;
import Composicao.Ex01.Entities.Trabalhador;
import Composicao.Ex01.EntitiesEnum.NivelTrabalhador;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departamento = sc.nextLine();

        System.out.println("Digite os dados do funcionario:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Nivel: ");
        String nivel = sc.nextLine();
        
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salarioBase, new Departamento(departamento));

        System.out.print("\nQuantos contratos este funcionario possui? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDigite os dados do " + (i + 1) + "o contrato:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            System.out.print("Duracao (horas): ");
            int horas = sc.nextInt();
            sc.nextLine();
            ContratoHoras contrato = new ContratoHoras(dataContrato, valorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.print("\nDigite um mes e ano (MM/YYYY): ");
        String mesAno = sc.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("\nNome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Salario (" + mesAno + "): R$" + String.format("%.2f", trabalhador.renda(ano, mes)));

        sc.close();
    }
}

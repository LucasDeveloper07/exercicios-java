package POO.Ex03.Application;

import java.util.Scanner;
import POO.Ex03.Entities.Aluno;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Informe a nota da P1: ");
        aluno.p1 = sc.nextDouble();

        System.out.print("Informe a nota da P2: ");
        aluno.p2 = sc.nextDouble();

        System.out.print("Informe a nota da P3: ");
        aluno.p3 = sc.nextDouble();

        System.out.println("\n" + aluno);

        sc.close();
    }
}

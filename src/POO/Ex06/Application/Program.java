package POO.Ex06.Application;

import java.util.Scanner;
import POO.Ex06.Entities.Aluno;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome, curso;
        double p1, p2, p3;

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.print("Digite o curso do aluno: ");
        curso = sc.nextLine();

        Aluno aluno = new Aluno(nome, curso);

        while (true) {
            
            System.out.println("\nInsira a nota da P1: ");
            p1 = sc.nextDouble();

            if (p1 >= 0 && p1 <= 10) {

                aluno.setP1(p1);
                break;
            } else {
                System.out.println("Nota inválida! Tente novamente.");
            }
        }

        while (true) {

            System.out.println("Insira a nota da P2: ");
            p2 = sc.nextDouble();

            if (p2 >= 0 && p2 <= 10) {
                
                aluno.setP2(p2);
                break;
            } else {
                System.out.println("Nota inválida! Tente novamante.");
            }
        }

        while (true) {
            
            System.out.println("Insira a nota da P3: ");
            p3 = sc.nextDouble();

            if (p3 >= 0 && p3 <= 10) {
                
                aluno.setP3(p3);
                break;
            } else {
                System.out.println("Nota inválida! Tente novamente.");
            }
        }

        System.out.println(aluno);

        sc.close();
    }
}
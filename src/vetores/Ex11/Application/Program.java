package vetores.Ex11.Application;

import vetores.Ex11.Entities.Aluno;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno vet[] = new Aluno[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o nome do "+ (i + 1) +"o aluno: ");
            String nome = sc.nextLine();

            System.out.print("Digite a P1: ");
            double p1 = sc.nextDouble();

            System.out.print("Digite a P2: ");
            double p2 = sc.nextDouble();
            sc.nextLine();

            vet[i] = new Aluno(nome, p1, p2);
        }

        double mediaAluno;
        int alunoAprovado = 0;

        for (int i = 0; i < vet.length; i++) {
            mediaAluno = (vet[i].getP1() + vet[i].getP2()) / 2;
            
            if (mediaAluno >= 6) {
                alunoAprovado += 1;
            }
        }
        
        if (alunoAprovado > 0) {
            System.out.println("Alunos aprovados:");
            for (int i = 0; i < vet.length; i++) {
                mediaAluno = (vet[i].getP1() + vet[i].getP2()) / 2;

                if (mediaAluno >= 6) {
                    System.out.println(vet[i].getNome());
                }
            }
        } else {
            System.out.println("Nenhum aluno foi aprovado!");
        }

        sc.close();
    }
}

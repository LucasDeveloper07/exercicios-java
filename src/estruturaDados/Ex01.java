package estruturaDados;

import java.util.HashSet;
import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> alunos = new HashSet<>();

        System.out.print("Quantos alunos estão matriculados no curso A? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o codigo de matricula do aluno: ");
            int codAluno = sc.nextInt();

            alunos.add(codAluno);
        }

        
        System.out.print("\nQuantos alunos estão matriculados no curso B? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o codigo de matricula do aluno: ");
            int codAluno = sc.nextInt();

            alunos.add(codAluno);
        }

        System.out.print("\nQuantos alunos estão matriculados no curso C? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o codigo de matricula do aluno: ");
            int codAluno = sc.nextInt();

            alunos.add(codAluno);
        }

        System.out.println("Total de alunos: " + alunos.size());

        sc.close();
    }
}

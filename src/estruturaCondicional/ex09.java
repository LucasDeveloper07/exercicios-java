package estruturaCondicional;
import java.util.Scanner;

public class ex09 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        double p1, p2, media, quantFaltas, percenFaltas;
        double aulas = 20.0;
        double p3 = 0.0;

        System.out.println("Digite a nota da P1 e P2: ");
        p1 = sc.nextDouble();
        p2 = sc.nextDouble();

        System.out.println("Digite o número de faltas do aluno: ");
        quantFaltas = sc.nextDouble();

        media = (p1 + p2) / 2;
        percenFaltas = quantFaltas / aulas;

        if (percenFaltas >0.30) {
            System.out.println("Reprovado!");
        }
        else if (media >=6) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Informe a nota da P3: ");
            p3 = sc.nextDouble();

            media = (p1 + p2 + p3) / 3;

            if (media >=6) {
                System.out.println("Aprovado!");
            }
            else {
                System.out.println("Reprovado por nota!");
            }
        }

        sc.close();
    }
}

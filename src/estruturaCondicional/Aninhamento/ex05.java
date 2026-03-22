package estruturaCondicional.Aninhamento;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        int score;
        double salario, emprestimo;
        double juros = 0.0;

        System.out.println("Insira seu nome: ");
        nome = sc.nextLine();

        System.out.println("Insira o seu salário: ");
        salario = sc.nextDouble();

        System.out.println("Insira o valor do empréstimo desejado: ");
        emprestimo = sc.nextDouble();

        System.out.println("Insira o seu score de crédito: ");
        score = sc.nextInt();

        if (score <0 || score >1000) {
            System.out.println("Score inválido!");
        }
        else if (score <500) {
            System.out.println("Empréstimo não concedido por score baixo!");
        }
        else if (emprestimo > salario * 5) {
            System.out.println("Empréstimo não concedido! Seu empréstimo é 5x maior que o seu salário.");
        }
        else if (salario <=3000) {
            System.out.println("Empréstimo em análise!");
        }
        else {
            if (score <700) {
                juros = 0.10 * 100;
                System.out.println("Parábens "+ nome +", seu empréstimo foi concedido, com uma taxa de juros de "+ juros +"%");
            }
            else if (score <850) {
                juros = 0.05 * 100;
                System.out.println("Parábens "+ nome +", seu empréstimo foi concedido, com uma taxa de juros de "+ juros +"%");
            }
            else {
                juros = 0.02 * 100;
                System.out.println("Parábens "+ nome +", seu empréstimo foi concedido, com uma taxa de juros de "+ juros +"%");
            }
        }

        sc.close();
    }
}

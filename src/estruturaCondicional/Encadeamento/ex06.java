package estruturaCondicional.Encadeamento;
import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade <13) {
            System.out.println("Você é uma criança");
        }
        else if (idade <18) {
            System.out.println("Você é um adolescente");
        }
        else if (idade <60) {
            System.out.println("Você é adulto");
        }
        else {
            System.out.println("Você é idoso");
        }

        sc.close();
    }
}

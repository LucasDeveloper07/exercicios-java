package estruturaRepetitiva.DoWhile;
import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num1, soma = 0.0;
        
        System.out.println("=====SOMA=====");
        System.out.println("0 - Encerrar o programa\n");

        do {
            System.out.println("Digite um número: ");
            num1 = sc.nextDouble();

            soma += num1;
        } while (num1 != 0);

        System.out.printf("O resultado da soma desses números é: %.2f\n", soma);

        sc.close();
    }
}

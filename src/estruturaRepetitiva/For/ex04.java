package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        double a, b;
        double divisao;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        System.out.println("Agora, digite "+ num1 +" pares de números inteiros");

        for (int i=0; i<num1; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (b !=0) {
                divisao = a / b;
                System.out.printf("%.1f\n", divisao);
            }
            else {
                System.out.println("Não é possível realizar esta divisão!");
            }
        }

        sc.close();
    }
}

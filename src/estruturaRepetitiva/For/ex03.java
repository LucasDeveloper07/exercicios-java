package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        double a, b, c, media;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        System.out.println("Agora digite "+ num1 +" vezes uma sequência de 3 numeros reais com uma casa decimal: ");

        for (int i=0; i <num1; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5);

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}

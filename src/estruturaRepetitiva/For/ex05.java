package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("Informe um número inteiro (o número deve ser maior ou igual a 1 e menor ou igual a 1000): ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (i %2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

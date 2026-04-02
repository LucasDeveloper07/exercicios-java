package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, mult;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            mult = num1 * i;

            System.out.printf("%d x %d = %d\n", num1, i, mult);
        }

        sc.close();
    }
}

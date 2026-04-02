package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, mult;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            
            System.out.println("Tabuada de "+ i);
            
            for (int a = 1; a <= 10; a++) {

                mult = i * a;

                System.out.printf("%d x %d = %d\n", i, a, mult);
            }

            System.out.println();
        }

        sc.close();
    }
}

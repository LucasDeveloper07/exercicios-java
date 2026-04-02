package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, quadrado, cubo;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);

            System.out.println(i + " " + quadrado + " " + cubo);
        }

        sc.close();
    }
}

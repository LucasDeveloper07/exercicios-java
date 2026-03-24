package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int fatorial = 1;
        
        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        for (int i = 1; i <=num1; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de "+ num1 +" é: "+ fatorial);

        sc.close();
    }
}

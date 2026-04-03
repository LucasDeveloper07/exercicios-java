package estruturaRepetitiva.DoWhile;
import java.util.Scanner;


public class ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int menu;
        double num1, num2;
        double soma, sub;

        do {
            System.out.println("=====MENU=====");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Sair");
            System.out.println("Escolha um número com a opção desejada: ");
            menu = sc.nextInt();

            if (menu <1 || menu >3) {
                System.out.printf("Opção inválida!\n\n");

            } else if (menu == 1) {
                System.out.println("=====SOMA=====");
                System.out.println("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = sc.nextDouble();
                
                soma = num1 + num2;

                System.out.printf("O resultado da soma é: %.2f\n\n", soma);
                
            } else if (menu == 2) {
                System.out.println("=====SUBTRAÇÃO=====");
                System.out.println("Digite o primeiro número: ");
                num1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = sc.nextDouble();
                
                sub = num1 - num2;
                
                System.out.printf("O resultado da subtração é: %.2f\n\n", sub);
            }
        } while (menu != 3);

        sc.close();
    }
}

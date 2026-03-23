package estruturaRepetitiva.While;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int filme;

        int acao = 0;
        int comedia = 0;
        int drama = 0;

        System.out.println("Digite o número referente ao filme escolhido: ");
        filme = sc.nextInt();

        while (filme !=4) {
            if (filme == 1) {
                acao += 1;
            }
            else if (filme == 2) {
                comedia += 1;
            }
            else if (filme == 3) {
                drama += 1;
            }
            else {
                System.out.println("Código invalido! Digite novamente: ");
            }

            filme = sc.nextInt();
        }

        System.out.println("Muito obrigado");
        System.out.printf("Ação: %d\nComédia: %d\nDrama: %d\n", acao, comedia, drama);

        sc.close();

    }
}

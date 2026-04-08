package estruturaRepetitiva.DoWhile;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numSecreto = 9;
        int tentativas = 5;
        int numDigitado;

        do {
            System.out.println("=====JOGO DE ADIVINHAÇÃO=====");
            System.out.println("Tente adivinhar o número inteiro gerado pelo programa");
            System.out.println("Você tem "+ tentativas +" tentativas");
            System.out.println("Digite -1 quando quiser encerrar o jogo");
            numDigitado = sc.nextInt();
            System.out.println();

            if (numDigitado == -1) {
                System.out.println("Encerrando o jogo...");
            } else {
                if (numDigitado == numSecreto) {
                    System.out.println("Parabéns! Você adivinhou o número secreto");

                    numDigitado = -1;
                } else {
                    if (numDigitado < numSecreto) {
                        System.out.println("O número secreto é maior!");

                        tentativas -= 1;
                        
                        System.out.printf("Número de tentativas: %d\n\n", tentativas);
                    } else {
                        System.out.println("O número secreto é menor!");
                        
                        tentativas -= 1;

                        System.out.printf("Número de tentativas: %d\n\n", tentativas);
                    } 
                }
            }
        } while (numDigitado != -1 && tentativas > 0);
        
        if (tentativas == 0) {
            System.out.println("Você perdeu! O número secreto era: "+ numSecreto);
        }

        sc.close();
    }
}

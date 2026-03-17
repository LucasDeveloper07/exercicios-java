package estruturaCondicional;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }
        
        teclado.close();
    }
}
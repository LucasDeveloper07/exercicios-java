package estruturaCondicional.IfElse;

import java.util.Scanner;

public class ex01 {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número interio: ");
        numero = teclado.nextInt();

        if (numero >=0) {
            System.out.println("O número "+ numero +" é positivo");
        }
        else {
            System.out.println("O número "+ numero +" é negativo");
        }

        teclado.close();
    }
}
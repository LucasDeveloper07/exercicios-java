package estruturaCondicional.IfElse;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.println("Digite dois números inteiros: ");
        a = teclado.nextInt();
        b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Estes números são múltiplos");
        }
        else {
            System.out.println("Estes números não são múltiplos");
        }

        teclado.close();
    }
}

package estruturaSequencial;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite quatros números inteiros: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("A diferença destes números é: "+ diferenca);

        teclado.close();
    }
}

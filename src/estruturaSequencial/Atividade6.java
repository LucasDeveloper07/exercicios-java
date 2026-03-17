package estruturaSequencial;
import java.util.Scanner;

public class Atividade6 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codigo1, quant1, codigo2, quant2;
        double valorP1, valorP2, total;

        System.out.println("Informe o código da peça 1, a quantidade de peças e o valor unitário: ");
        codigo1 = teclado.nextInt();
        quant1 = teclado.nextInt();
        valorP1 = teclado.nextDouble();

        System.out.println("Informe o código da peça 2, a quantidade de peças e o valor unitário: ");
        codigo2 = teclado.nextInt();
        quant2 = teclado.nextInt();
        valorP2 = teclado.nextDouble();

        total = (valorP1 * quant1) + (valorP2 * quant2);

        System.out.printf("Valor total a pagar: R$%.2f\n", total);

        teclado.close();
    }
}

